
package PROP;

import java.util.*;

public class ConjuntDocuments {
    
    /*Atributs*/
    
    private Trie trie_autors;
    
    private ArrayList<String> paraulesfuncionals;
    private TF tf;
    private TFIDF tfidf;
    private Map<String, ArrayList<String> > similars_tf;
    private Map<String, ArrayList<String> > similars_tfidf;
    private Map<String, Double> paraules_docs; //(palabra, documentos en los que esta)
    
    private Levenshtein lev;
    private ConsultesAnteriors anterior;
    private Relevancia rel;
    private ArrayList<Pair<String, String> > id_contingut;
    
    private Map<String, ArrayList<String> > llista; // (autor, titols)
    private Map<String, Document> conjunt; // (id, document)
    private Map<String, String> ref; // (autor + titol, id)
    
    
    /*Metodes privats*/
        
    private ArrayList<String> treure_paraules_funcionals(String paraules) {
        String contingut = paraules.toLowerCase();
        String delim = "()[]\"\n!,?¿¡._'@ ";
        StringTokenizer st  = new StringTokenizer(contingut, delim);

        ArrayList<String> aux = new ArrayList<>();
        
        while (st.hasMoreTokens()) {
            aux.add(st.nextToken());
        }
        aux.removeAll(paraulesfuncionals);
        return aux;
    }
    
    private void actualitzar_paraules(boolean incrementar, Set<String> hs) {
        if (incrementar) {
            for (String terme: hs) {
                if (paraules_docs.containsKey(terme)) paraules_docs.put(terme, paraules_docs.get(terme) + 1);
                else paraules_docs.put(terme, 1.0);
            }
        }
        else {
            for (String terme: hs) {
                if (paraules_docs.containsKey(terme)) {
                    if (paraules_docs.get(terme) >= 2) paraules_docs.put(terme, paraules_docs.get(terme) - 1);
                    else paraules_docs.remove(terme);
                }
            }
        }
    }
   
    private void actualitzar_matrius(String id, String contingut, boolean b) throws Excepcio_propia {
        ArrayList<String> paraules = treure_paraules_funcionals(contingut);
        if (b) {
            actualitzar_paraules(true, new HashSet<>(paraules));
            tf.afegir_matriu(id, paraules);
        }
        else {
            actualitzar_paraules(false, new HashSet<>(paraules));
            tf.treure_matriu(id);
        }
    }
    
    private void actualitzar_matrius_total() {
        similars_tf = tf.getSimilars();
        tfidf.settf(tf.gettf());
        tfidf.fer_idf(conjunt.size(), paraules_docs);
        similars_tfidf = tfidf.getSimilars();
    }
    
    private boolean valida(String e) {
        
        /*StringTokenizer st = new StringTokenizer(e, "&|!(){}", true);
        ArrayList<String> vector = new ArrayList<>();
        
        while (st.hasMoreTokens()) {
            vector.add(st.nextToken());
        }
        if (vector.size() > 0) {
            if (vector.get(0).equals("&") || vector.get(0).equals("|")) return false;
        }
        for (int i = 1; i < vector.size(); i++) {
            if (vector.get(i).equals("&") || vector.get(i).equals("|")) {
                if (i == vector.size() - 1) {
                    return false;
                }
                else if (vector.get(i - 1).equals("&") || vector.get(i - 1).equals("|") 
                        || vector.get(i - 1).equals("!") || vector.get(i - 1).equals("(") 
                        || vector.get(i - 1).equals("{") || 
                        vector.get(i + 1).equals("&") || vector.get(i + 1).equals("|") ||
                        vector.get(i + 1).equals(")") || vector.get(i + 1).equals("}")) {
                    return false;
                }
            } else if (vector.get(i).equals("!")) {
                if (i == vector.size() - 1) return false;
                else if (vector.get(i - 1).equals("!") || vector.get(i - 1).equals(")") ||
                        vector.get(i - 1).equals("{") || vector.get(i - 1).equals("}") || 
                        vector.get(i - 1).equals("\"") || vector.get(i + 1).equals("&") ||
                        vector.get(i + 1).equals("|") || vector.get(i + 1).equals("!") ||
                        vector.get(i + 1).equals(")") || vector.get(i + 1).equals("{") ||
                        vector.get(i + 1).equals("}")) {
                    return false;
                }
            } 
        }*/
        Stack pila;  
    	pila = new Stack ();    
    	String expressio = e;
    	for (int f = 0 ; f < expressio.length() ; f++)
    	{
    	    if (expressio.charAt(f) == '(' || expressio.charAt(f) == '{') {
    	    	pila.push(expressio.charAt(f));
    	    } 
            else if (expressio.charAt(f)==')') {
                    if (pila.isEmpty()) return false;
                    else {
                        if (pila.peek().equals('(')) {
                            pila.pop();
                        } else {
                            return false;
                        }
                    }
    	    } 
            else if (expressio.charAt(f)=='}') {
    	        if (pila.isEmpty()) return false;
                else {
                    if (pila.peek().equals('{')) {
                        pila.pop();
                    } else {
                        return false;
                    }
                }
   	    }   
        }

    	return pila.isEmpty();
    }
    
    /*Metodes constructors*/
    
     public ConjuntDocuments() {
        tf = new TF();
        tfidf = new TFIDF();
        similars_tf = new HashMap<>();
        similars_tfidf = new HashMap<> ();
        paraules_docs = new HashMap<>();
        paraulesfuncionals = new ArrayList<>();
        //Expressio = new Expressio();
        anterior = new ConsultesAnteriors();
        id_contingut = new ArrayList<>();
        lev = new Levenshtein();
        rel = new Relevancia();
        trie_autors = new Trie();
        conjunt = new HashMap<>();
        ref = new HashMap<>();
        llista = new HashMap<>();
    }
    
    /*Metodes getters*/

    public Map<String, ArrayList<String>> getSimilars_tf() {
        return similars_tf;
    }

    public Map<String, ArrayList<String>> getSimilars_tfidf() {
        return similars_tfidf;
    }

    public Map<String, Double> getParaules_docs() {
        return paraules_docs;
    }
    
    public ArrayList<Pair<String, String>> getId_contingut() {
        return id_contingut;
    }
    
    public Map<String, Map<String, Double> > getTf() {
        return tf.gettf();
    }
    
    public Map<String, Double> getIdf() {
        return tfidf.getIdf();
    }

    /*Metodes per insertar*/
    
    public void SetParaulesFuncionals(ArrayList<String> paraules) {
         paraulesfuncionals = new ArrayList<>(paraules);
    }
    
    public String registrar_doc(String titol, String autor, ArrayList<String> contingut) throws Excepcio_propia {
        Document doc;     
        if (ref.containsKey(autor + " " + titol)) {
            throw new Excepcio_propia("Aquest document ja existeix");
        } else {
            doc = new Document(titol, autor, contingut);
            if (llista.containsKey(autor)) {
                llista.get(autor).add(titol);
            } else {
                ArrayList<String> al = new ArrayList();
                al.add(titol);
                llista.put(autor, al);
                trie_autors.insert(autor);
            }
            
            conjunt.put(doc.getId(), doc);
            ref.put(autor + " " + titol, doc.getId());
            
            actualitzar_matrius(doc.getId(), contingut.toString(), true);
            actualitzar_matrius_total();
            for (int i = 0; i < contingut.size(); i++) {
                StringTokenizer st = new StringTokenizer(contingut.get(i), "\n");
                if (st.hasMoreTokens()) {
                    Pair<String, String> p = new Pair(doc.getId(), st.nextToken());
                    id_contingut.add(p);
                }
            }
        }
        return doc.getId();
    }
    
    public String registrar_doc_query(ArrayList<String> contingut) throws Excepcio_propia {
        Document doc = new Document("query", "query", contingut);
        actualitzar_matrius(doc.getId(), contingut.toString(), true);
        tfidf.settf(tf.gettf());
        tfidf.fer_idf(conjunt.size()+1, paraules_docs);
        rel.setTFidf(tfidf);
        rel.getRellevants(doc.getId());
        return doc.getId();
    }
    
    public ArrayList<String> registrar_col(ArrayList<ArrayList<String> > docs) throws Excepcio_propia {
        ArrayList<String> ids = new ArrayList<>();
        Document doc;
        int docs_registrats = 0;
        boolean directori = false;
        for (int i = 0; i < docs.size(); i++) {
            if (!ref.containsKey(docs.get(i).get(1) + " " + docs.get(i).get(0))) {
                ArrayList<String> al = new ArrayList<>();
                if (docs.get(i).get(2) == null) {
                    if (i == 0) directori = true;
                    doc = new Document(docs.get(i).get(0), docs.get(i).get(1));
                    for (int j = 3; j < docs.get(i).size(); j++) {
                        al.add(docs.get(i).get(j));
                        StringTokenizer st = new StringTokenizer(docs.get(i).get(j), "\n");
                        if (st.hasMoreTokens()) {
                            Pair<String, String> p = new Pair(doc.getId(), st.nextToken());
                            id_contingut.add(p);
                        }
                    }
                    doc.setContingut(al);
                    ids.add(doc.getId());
                    
                    actualitzar_matrius(doc.getId(), doc.getContingut().toString(), true);
                }
                else {
                    for (int j = 3; j < docs.get(i).size(); j++) {
                        al.add(docs.get(i).get(j));
                    }
                    doc = new Document(docs.get(i).get(2), docs.get(i).get(0), docs.get(i).get(1), al);
                }
                                
                if (llista.containsKey(doc.getAutor())) {
                    llista.get(doc.getAutor()).add(doc.getTitol());
                } else {
                    al = new ArrayList<>();
                    al.add(doc.getTitol());
                    llista.put(doc.getAutor(), al);
                    trie_autors.insert(doc.getAutor());
                }
                conjunt.put(doc.getId(), doc);
                ref.put(doc.getAutor() + " " + doc.getTitol(), doc.getId());
                
            }
            else {
                docs_registrats++;
                ids.add(null);
            }   
        }
        if (directori) {
            actualitzar_matrius_total();
        }
        if (docs_registrats == docs.size()) throw new Excepcio_propia("Aquests documents ja existeixen");   
        return ids;
    }
    
    public void registrar_estructures(Map<String, ArrayList<String> > map_similars_tf, Map<String, ArrayList<String> > map_similars_tfidf,
                                      Map<String, Double> map_paraules, ArrayList<Pair<String, String> > array_contingut,
                                      Map<String, Map<String, Double> > map_tf, Map<String, Double> map_idf) {
        similars_tf = map_similars_tf;
        similars_tfidf = map_similars_tfidf;
        paraules_docs = map_paraules;
        id_contingut = array_contingut;
        tf.settf(map_tf);
        tfidf.setidf(map_idf);
        tfidf.settf(map_tf);
        
    }
    
    /*Metodes per esborrar*/
    
    public ArrayList<String> eliminar_doc(ArrayList<String> al) throws Excepcio_propia {   
        ArrayList<String> ids = new ArrayList<>();
        int docs_eliminats = 0;
        for (int i = 0; i < al.size(); i+=2) {
            String autor = al.get(i);
            String titol = al.get(i+1);
            if (ref.containsKey(autor + " " + titol)) {
                String id = ref.get(autor + " " + titol);
                ids.add(id);
                actualitzar_matrius(id, conjunt.get(id).getContingut().toString(), false);
                ref.remove(autor + " " + titol);
                conjunt.remove(id);
                llista.get(autor).remove(titol); //lineal
                if (llista.get(autor).isEmpty()) {
                    llista.remove(autor);
                    trie_autors.eliminar(autor);
                }
                
                for (int j = 0; j < id_contingut.size(); j++) {
                    if (id_contingut.get(j).getL().equals(id)) {
                        id_contingut.remove(j);
                        j--;
                    }
                }
                
            } else {
                if (al.size() == 2) throw new Excepcio_propia("Aquest document no existeix");
                docs_eliminats++;
            }
        }
        actualitzar_matrius_total();
        if (docs_eliminats == al.size()) throw new Excepcio_propia("Aquests documents no existeixen");    
        return ids;
    }
    
    public void eliminar_doc_query(String id, ArrayList<String> contingut) throws Excepcio_propia {  
        actualitzar_matrius(id, contingut.toString(), false);
        tfidf.settf(tf.gettf());
        tfidf.fer_idf(conjunt.size(), paraules_docs);
    }
    
    public ArrayList<String> eliminar_titols_autor(String autor) throws Excepcio_propia {
        ArrayList<String> ids = new ArrayList<>();
        if (llista.containsKey(autor)) {
            while (!llista.get(autor).isEmpty()) {
                String autor_titol = autor+" "+llista.get(autor).get(0);
                String id = ref.get(autor_titol);
                for (int j = 0; j < id_contingut.size(); j++) {
                    if (id_contingut.get(j).getL().equals(id)) {
                        id_contingut.remove(j);
                        j--;
                    }
                }
                ids.add(id);
                actualitzar_matrius(id, conjunt.get(id).getContingut().toString(), false);
                llista.get(autor).remove(0);
                conjunt.remove(id);
                ref.remove(autor_titol);
                
            }  
            llista.remove(autor);
            trie_autors.eliminar(autor);    
            actualitzar_matrius_total();
        } 
        else {
            String correcte = lev.correccio(llista, autor, true);
            if (correcte != null) throw new Excepcio_propia("Volia escriure: "+correcte+ "?");
            else throw new Excepcio_propia("Aquest autor no està registrat");
        }
        return ids;
    }
    
    public void eliminar_tots_docs() throws Excepcio_propia {
        if (ref.isEmpty()) throw new Excepcio_propia("No hi ha cap document a la base de dades");
        for (Map.Entry<String, ArrayList<String> > e: llista.entrySet()) {
            trie_autors.eliminar(e.getKey());
        }
        conjunt.clear();
        ref.clear();
        llista.clear();
        id_contingut.clear();
        similars_tf.clear();
        similars_tfidf.clear();
        paraules_docs.clear();
        tf.reset();
        tfidf.reset();
        rel.setTFidf(tfidf);
    }
    
    /*Metodes per modificar*/
    
    public String canviar_titol_doc(String titol, String autor, String nou_titol) throws Excepcio_propia {
        String id = new String();
        if (llista.get(autor).contains(nou_titol)) throw new Excepcio_propia("Aquest autor ja conté aquest títol");
        if (ref.containsKey(autor + " " + titol)) {
            id = ref.get(autor + " " + titol);
            ref.remove(autor + " " + titol);
            ref.put(autor + " " + nou_titol, id);
            llista.get(autor).remove(titol);
            llista.get(autor).add(nou_titol);
            conjunt.get(id).setTitol(nou_titol);
        } else {
            String correcte = lev.correccio(llista, autor, true);
            if (correcte != null) throw new Excepcio_propia("Volia escriure: "+correcte+ "?");
            else {
                correcte = lev.correccio(llista, titol, false);
                if (correcte != null) throw new Excepcio_propia("Volia escriure: "+correcte+ "?");
            }
            throw new Excepcio_propia("Aquest document no existeix");
        }
        return id;
    }
    
    public String canviar_autor_doc(String titol, String autor, String nou_autor) throws Excepcio_propia {
        String id = new String();  
        if (llista.containsKey(nou_autor)) {
            if (llista.get(nou_autor).contains(titol)) throw new Excepcio_propia("Aquest títol ja el conté l'autor");
        }
        if (ref.containsKey(autor + " " + titol)) {
            id = ref.get(autor + " " + titol);
            conjunt.get(id).setAutor(nou_autor);
            ref.remove(autor + " " + titol);
            ref.put(nou_autor + " " + titol, id);
            llista.get(autor).remove(titol);
            if (llista.get(autor).isEmpty()) {
                llista.remove(autor);
                trie_autors.eliminar(autor);
            }
            if (llista.containsKey(nou_autor)) {
                llista.get(autor).add(titol);
            } else {
                ArrayList al = new ArrayList<>();
                al.add(titol);
                llista.put(nou_autor, al);
                trie_autors.insert(nou_autor);
            }
            
        } else {
            String correcte = lev.correccio(llista, autor, true);
            if (correcte != null) throw new Excepcio_propia("Volia escriure: "+correcte+ "?");
            else {
                correcte = lev.correccio(llista, titol, false);
                if (correcte != null) throw new Excepcio_propia("Volia escriure: "+correcte+ "?");
            }
            throw new Excepcio_propia("Aquest document no existeix");
        }

        return id;
    }
    
    public String canviar_contingut_doc(String titol, String autor, ArrayList<String> nou_contingut) throws Excepcio_propia {
        String id = new String();
        
        if (ref.containsKey(autor + " " + titol)) {
            id = ref.get(autor + " " + titol);
            
            for (int j = 0; j < id_contingut.size(); j++) {
                if (id_contingut.get(j).getL().equals(id)) {
                    id_contingut.remove(j);
                    j--;
                }
            }

            for (int i = 0; i < nou_contingut.size(); i++) {
                StringTokenizer st = new StringTokenizer(nou_contingut.get(i), "\n");
                if (st.hasMoreTokens()) {
                    Pair<String, String> p = new Pair(id, st.nextToken());
                    id_contingut.add(p);
                }
            }
            
            actualitzar_matrius(id, conjunt.get(id).getContingut().toString(), false);
            actualitzar_matrius(id, nou_contingut.toString(), true);
            actualitzar_matrius_total();
                    
            conjunt.get(id).setContingut(nou_contingut);
            
        } else {
            String correcte = lev.correccio(llista, autor, true);
            if (correcte != null) throw new Excepcio_propia("Volia escriure: "+correcte+ "?");
            else {
                correcte = lev.correccio(llista, titol, false);
                if (correcte != null) throw new Excepcio_propia("Volia escriure: "+correcte+ "?");
            }
            throw new Excepcio_propia("Aquest document no existeix");
        }
        
        return id;
    }
      
    /*Metodes per consultar*/
    
    public ArrayList<String> consultar_contingut_doc(String titol, String autor) throws Excepcio_propia {
        
        if (ref.containsKey(autor + " " + titol)) {
            String id = ref.get(autor + " " + titol);
            anterior.afegirConsulta("Contingut: del document: - "+titol+" - "+autor);
            return conjunt.get(id).getContingut();
        } else {
            String correcte = lev.correccio(llista, autor, true);
            if (correcte != null) throw new Excepcio_propia("Volia escriure: "+correcte+ "?");
            else {
                correcte = lev.correccio(llista, titol, false);
                if (correcte != null) throw new Excepcio_propia("Volia escriure: "+correcte+ "?");
            }
            throw new Excepcio_propia("Aquest document no existeix");
        }

    }
    
    public ArrayList<String> consultar_titols_autor(String autor) throws Excepcio_propia {
        if (llista.containsKey(autor)) {
            return llista.get(autor);
        } else {
            String correcte = lev.correccio(llista, autor, true);
            if (correcte != null) throw new Excepcio_propia("Volia escriure: "+correcte+ "?");
            else throw new Excepcio_propia("Aquest autor no existeix");
        }
        
    }

    public ArrayList<String> consultar_documents_similars(String titol, String autor, int k, String num) throws Excepcio_propia {

        if (ref.containsKey(autor + " " + titol)) {
            ArrayList<String> resultat = new ArrayList<>();
            ArrayList<String> aux;
            if (num.equals("1")) aux = similars_tfidf.get(ref.get(autor + " " + titol));
            else aux = similars_tf.get(ref.get(autor + " " + titol));
            
            String tf = (num.equals("1"))?"TFIDF" : "TF";
            anterior.afegirConsulta("Similitud: els "+k+" documents més similars a: - "+titol+" - "+autor+" amb -"+tf);
            
            int i = 0;
            while(i < aux.size() && k > 0) {
                resultat.add(conjunt.get(aux.get(i)).getTitol() + " - " + conjunt.get(aux.get(i)).getAutor());
                i++;
                k--;
            }
            return resultat;
        }
        else {
            String correcte = lev.correccio(llista, autor, true);
            if (correcte != null) throw new Excepcio_propia("Volia escriure: "+correcte+ "?");
            else {
                correcte = lev.correccio(llista, titol, false);
                if (correcte != null) throw new Excepcio_propia("Volia escriure: "+correcte+ "?");
            }
            throw new Excepcio_propia("Aquest document no existeix");
        }

    }
    
    public ArrayList<String> consultar_autors_prefix(String prefix) throws Excepcio_propia {
        if (ref.isEmpty()) throw new Excepcio_propia("No hi ha cap document a la base de dades");
        return trie_autors.autors(prefix);
    }
    
    public ArrayList<String> consultar_expressio(String e) throws Excepcio_propia {
        if (valida(e)) {
            
            Arbre_expressio arbre = new Arbre_expressio(e);
            
            ArrayList<Pair<String, String> > frases = arbre.evaluar_arbre(arbre.getRoot(), id_contingut);
            
            Set<String> set = new HashSet<>();

            for (int i = 0; i < frases.size(); i++) {
                set.add(frases.get(i).getL());
            }

            ArrayList<String> al = new ArrayList<String>();
            for (String s : set) {
                al.add(conjunt.get(s).getTitol() + " - " + conjunt.get(s).getAutor());
            }
            anterior.afegirConsulta("Expressió: els documents que contenen l'expressió: -"+e);
            return al;
        }
        else {
            throw new Excepcio_propia("La expressió no és vàlida");
        }
    }
    
    public ArrayList<String> consultar_rellevants(String id, int k, String e) throws Excepcio_propia {
        anterior.afegirConsulta("Rellevància: els "+k+" documents més rellevants a: -"+e);
        ArrayList<String> aux = rel.getSimilars_query();
        ArrayList<String> resultat = new ArrayList<>();
        int i = 0;
        while(i < aux.size() && k > 0) {
            resultat.add(conjunt.get(aux.get(i)).getTitol() + " - " + conjunt.get(aux.get(i)).getAutor());
            i++;
            k--;
        }
        return resultat;
    }
   
    public ArrayList<String> consultar_anteriors() throws Excepcio_propia {
        if (!anterior.es_buida()) {
            return anterior.getConsultes();
        }
        else throw new Excepcio_propia("No ha realitzat cap consulta anteriorment");
    }
}