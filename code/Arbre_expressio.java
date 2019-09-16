
package PROP;

import static java.lang.Double.min;
import java.util.*;

public class Arbre_expressio {
    
    /*Atributs*/
    
    private Node_expressio root;
    private HashMap<String, Integer> map_prioritat;
    
    /*Mètodes privats*/
    
    private ArrayList<Pair<String, String> > interseccio (ArrayList<Pair<String, String> > e, ArrayList<Pair<String, String> > d) {
        ArrayList<Pair<String, String> > m = new ArrayList<>();

        for (Pair p: e) {
            if (d.contains(p)) {
                m.add(p);
            }            
        }
        
        return m;
    }
    
    private ArrayList<Pair<String, String> > unio (ArrayList<Pair<String, String> > e, ArrayList<Pair<String, String> > d) {
        Set<Pair<String, String> > set = new HashSet<>();
        set.addAll(e);
        set.addAll(d);
        ArrayList<Pair<String, String> > m = new ArrayList<Pair<String, String> >(set);
        return m;
    }
    
    private ArrayList<Pair<String, String> > negacio (ArrayList<Pair<String, String> > e, ArrayList<Pair<String, String> > id_contingut) {
        ArrayList<Pair<String, String> > m = new ArrayList<>();   
        for (Pair p: id_contingut) {
            if (!e.contains(p)) {
                m.add(p);
            }
        }
        return m;
    }

    private ArrayList<Pair<String, String> > buscar(String s, ArrayList<Pair<String, String> > id_contingut) {
        ArrayList<Pair<String, String> > frases = (ArrayList<Pair<String, String> >) id_contingut.clone();
        String[] splitedValue = s.split("\\b+");
        int aux = 0;
        if (Arrays.asList(splitedValue).size() > 1) {
            for (int i = 0; i < id_contingut.size(); i++) {
                if (!id_contingut.get(i).getR().toLowerCase().contains(s)) {
                    frases.remove(i - aux);
                    aux++;
                }
            }
        } else {
            for (int i = 0; i < id_contingut.size(); i++) {
                if (!Arrays.asList(id_contingut.get(i).getR().toLowerCase().split("\\b+")).contains(s)) {
                    frases.remove(i - aux);
                    aux++;
                }
            }
        }
        return frases;
    }
    
    private Node_expressio construirArbre_imm(ArrayList<String> inordre, ArrayList<String> postordre, int inordre_inici, int inordre_fi, int postordre_inici, int postordre_fi, ArrayList<Integer> ref) {
        
        if (inordre_inici > inordre_fi || postordre_inici > postordre_fi) return null;

        String valor_root = postordre.get(postordre_fi);
        
        Node_expressio root = new Node_expressio(valor_root);
        
        if (inordre_inici == inordre_fi) return root;
                
        int index_in = ref.get(postordre_fi);
        
        root.setFill_esq(construirArbre_imm(inordre, postordre, inordre_inici, index_in - 1, postordre_inici, postordre_inici + index_in - (inordre_inici + 1), ref));
        
        root.setFill_dret(construirArbre_imm(inordre, postordre, index_in + 1, inordre_fi, postordre_inici + index_in - inordre_inici, postordre_fi - 1, ref));
        
        return root;
        
    }
    
    private Node_expressio construirArbre(ArrayList<String> inordre, ArrayList<String> postordre, ArrayList<Integer> ref) {
        return construirArbre_imm(inordre, postordre, 0, inordre.size() - 1, 0, postordre.size() - 1, ref);
    }
    
    private String iniciar_expressio(String expressio) {
        for (int i = 0; i < expressio.length(); i++) {
            if (expressio.charAt(i) == '{') {
                ++i;
                int pos_inicial = i;
                while (expressio.charAt(i) != '}') ++i;
                String s = expressio.substring(pos_inicial, i);
                s = s.replace(" ", " & ");
                String ant = expressio.substring(0, pos_inicial - 1);
                String pos = expressio.substring((int) min(i+1, expressio.length()), expressio.length());
                expressio = ant + s + pos;
            }
            else if (expressio.charAt(i) == '"') {
                ++i;
                while (expressio.charAt(i) != '"') {
                    if (expressio.charAt(i) == ' ') {
                        String act = expressio.substring(0, i) + '\0' + expressio.substring(i + 1);
                        expressio = act;
                    }
                    ++i;
                } 
            }
        }
        expressio = expressio.replace(" ", "");
        expressio = expressio.replace('\0', ' ');
        expressio = expressio.replace("\"" , "");
        return expressio;
    }
    
    private void tractar_expressio(String e) {
        String expressio = iniciar_expressio(e);
        StringTokenizer st = new StringTokenizer(expressio, "&|!()", true);
            ArrayList<String> inorder = new ArrayList<>();
            Stack opstack = new Stack();
            Stack position = new Stack();
            ArrayList<String> postorder = new ArrayList<>();

            ArrayList<Integer> ref = new ArrayList<>();
            int k = 0;
            while (st.hasMoreTokens()) {
                String t = st.nextToken();
                if (t.equals("&") || t.equals("|") || t.equals("!")) {
                    inorder.add(t);
                    while (!opstack.isEmpty() && ((int) map_prioritat.get(opstack.peek()) >= (int) map_prioritat.get(t))) {
                        if (!opstack.peek().equals("(")) {
                            postorder.add((String) opstack.pop());
                            if (!position.isEmpty()) ref.add((Integer) position.pop());
                        }
                    }
                    opstack.push(t);
                    position.push(k);
                } 
                else if (t.equals("(")) {
                    opstack.push(t);
                    k--;
                }
                else if (t.equals(")")) {
                    String aux;
                    while (!opstack.isEmpty() && !opstack.peek().equals("(")) {
                        aux = (String) opstack.peek();
                        if (!aux.equals("(")) {
                            postorder.add(aux);
                            if (!position.isEmpty()) ref.add((Integer) position.pop());
                        }
                        opstack.pop();
                    }
                    if (opstack.peek().equals("(")) opstack.pop();
                    k--;
                } 
                else {
                    postorder.add(t);
                    inorder.add(t);
                    ref.add(k);
                }
                k++;  
            }

            while (!opstack.isEmpty()) {
                if (!opstack.peek().equals("(")) {
                    postorder.add((String) opstack.peek());
                    if (!position.isEmpty()) ref.add((Integer) position.pop());
                }
                opstack.pop();
            }
            this.root = construirArbre(inorder, postorder, ref);
    }
    
    /*Mètodes constructors*/
    
    public Arbre_expressio() {
        this.root = new Node_expressio();
        this.map_prioritat = new HashMap<>();
        map_prioritat.put("!", 3);
        map_prioritat.put("&", 2);
        map_prioritat.put("|", 1);
        map_prioritat.put("(", 0);
    }
    
    public Arbre_expressio(String e) {
        this.root = new Node_expressio();
        this.map_prioritat = new HashMap<>();
        map_prioritat.put("!", 3);
        map_prioritat.put("&", 2);
        map_prioritat.put("|", 1);
        map_prioritat.put("(", 0);
        tractar_expressio(e);
    }
    
    /*Mètodes getters*/
    
    public Node_expressio getRoot() {
        return this.root;
    }
	
    /*Mètodes consulta*/
    
    public ArrayList<Pair<String, String> > evaluar_arbre(Node_expressio n, ArrayList<Pair<String, String> > id_contingut) {
        
        if (n.fill_esq_es_buit() && n.fill_dret_es_buit()) {
            String valor = n.getContingut();
            
            return buscar(valor, id_contingut);
        
        } else {
            ArrayList<Pair<String, String> > e = new ArrayList<>();
            ArrayList<Pair<String, String> > d = new ArrayList<>();
            if (!n.fill_esq_es_buit()) {
                e = evaluar_arbre(n.getFill_esq(), id_contingut);
            }
            if (!n.fill_dret_es_buit()) {
                d = evaluar_arbre(n.getFill_dret(), id_contingut);
            }
            
            
            ArrayList<Pair<String, String> > m = new ArrayList<>();
            if (n.getContingut().equals("&")) {
                m = interseccio(e, d);
            }
            else if (n.getContingut().equals("!")) {
                if (!n.fill_esq_es_buit()) {
                    m = negacio(e, id_contingut);
                }
                else {
                    m = negacio(d, id_contingut);
                }
            }
            else if (n.getContingut().equals("|")) {
                m = unio(e, d);
            }
            return m;
        } 
    }
    
}
