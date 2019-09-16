
package PROP;
import java.util.*;

public class Trie {
    
    /*Atributs*/
    
    private Node root = new Node('\0', null);
    
    /*Metodes privats*/
    
    private Node buscar(String paraula) throws Excepcio_propia {
        Node actual = root;
        for (int i = 0; i < paraula.length(); i++) {
            char c = paraula.charAt(i);
            if (actual.conte_fill(c)) actual = actual.getFill(c);
            else return null;
        }
        return actual;
    }
    
    private void posar_autors_imm(Node actual, StringBuilder strbuf, ArrayList<String> autors) throws Excepcio_propia {
        boolean ya = false;
        if (actual.te_fills()) {
            Map<String, Node> fills = actual.fills();
            for (Node value : fills.values()) {
                strbuf.append(actual.getcontingut());
                if (actual.es_fi() && !ya) {
                    ya = true;
                    autors.add(strbuf.toString());
                }
                posar_autors_imm(value, strbuf, autors);
                strbuf.deleteCharAt(strbuf.length() - 1);
            }
        }
        if (!ya && actual.es_fi()) {
            strbuf.append(actual.getcontingut());
            autors.add(strbuf.toString());
            strbuf.deleteCharAt(strbuf.length() - 1);
        }
    }
    
    private void posar_autors(Node actual, StringBuilder strbuf, ArrayList<String> autors) throws Excepcio_propia {
        if (actual.te_fills()) {
            Map<String, Node> fills = actual.fills();
            for (Node value : fills.values()) {
                posar_autors_imm(value, strbuf, autors);
            }
        }
    }
    
    /*Metodes creadors*/
    
    public Trie() {
        root = new Node();
    }

    /*Metodes per insertar*/
    
    public void insert(String paraula) throws Excepcio_propia {
        Node actual = root;
        for (int i = 0; i < paraula.length(); i++) {
            char c = paraula.charAt(i);
            if (actual.conte_fill(c)) {
                actual = actual.getFill(c);
            }
            else {
                actual.addFill(new Node(c, actual));
                actual = actual.getFill(c);
                actual.canviar_fulla(true);
                actual.getPare().canviar_fulla(false);
            }
            if (i == paraula.length() - 1) actual.canviar_fi(true);
        }
    }
    
    /*Metodes de consulta*/
    
    public ArrayList<String> autors(String paraula) throws Excepcio_propia {
        Node actual = root;
        StringBuilder strbuf = new StringBuilder();
        ArrayList<String> autors = new ArrayList<String>();
        //Mirem si el prefix es troba a l'arbre
        int i;
        char c;
        for (i = 0; i < paraula.length(); i++) {
            c = paraula.charAt(i);
            if (!actual.conte_fill(c))throw new Excepcio_propia("No s'ha trobat cap autor amb aquest prefix");
            else {
                actual = actual.getFill(c);
                strbuf.append(c);
            }
        }
        //Si ens donen com a prefix el nom del autor l'escribim
        if (i == paraula.length() && actual.es_fi()) 
            autors.add(strbuf.toString());
        //Si ens dona part hem de treure tots els que deriven
        posar_autors(actual, strbuf, autors);
        return autors;
        
    }
    
    /*Metodes per eliminar*/
    
    public boolean eliminar(String paraula) throws Excepcio_propia {
        //paraula = paraula.toLowerCase();
        Node actual = buscar(paraula);
        if (actual == null) throw new Excepcio_propia("Aquest autor no es troba");
        else {
            Node pare;
            while(actual != root) {
                pare = actual.getPare();
                //mira si té fills, si no té pot borrar
                if (!actual.te_fills()) {
                    pare.treure_fill(actual.getcontingut());
                    actual.canviar_fulla(false);
                    if (!pare.te_fills()) pare.canviar_fulla(true);
                    actual.treure_pare();
                }
                //si té fills només cal dir que el node no sera fi de paraula
                else {
                    actual.canviar_fi(false);
                    break;
                }
                //si hem borrat i el pare era fi de paraula no es pot borrar més
                if (pare.es_fi()) break;
                actual = pare;
            }
        }
        return true;
    }
}