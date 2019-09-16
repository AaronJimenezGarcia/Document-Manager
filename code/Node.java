
package PROP;

import java.util.*;

public class Node {
    private char contingut;
    private boolean fi;
    private boolean fulla;
    private Node pare;
    Map<String, Node> fills;
    
    //Pre: Han d'arribar un caracter c i un Node.
    //Post: Crea un Node amb els parametres que disposa
    
    public Node() {
        fills = new TreeMap<String, Node>();
        pare = null;
        contingut = '\0';
        fi = fulla;
    }
    
    public Node(char c, Node pi) {
        pare = pi;
        fills = new TreeMap<String, Node>();
        contingut = c;
        fi = fulla = false;
    }
    
    public Map<String, Node> fills() throws Excepcio_propia {
        if (fills != null && !fills.isEmpty()) return fills;
        else throw new Excepcio_propia("Aquest node no té fills");
    }
    
    public boolean te_fills() {
        if (fills == null) return false;
        else return !fills.isEmpty();
    }
    
    public boolean conte_fill(char c) {
        if (fills != null && fills.containsKey(Character.toString(c))) return true;
        else return false;
    }
    
    public void treure_pare() throws Excepcio_propia {
        if (pare != null) pare = null;
        else throw new Excepcio_propia("Aquest node no té pare");
    }
    
    public void treure_fill(char c) throws Excepcio_propia {
        if (fills != null && fills.containsKey(Character.toString(c)))
            fills.remove(Character.toString(c));
        else throw new Excepcio_propia("Aquest node no té aquest fill");
    }
    
    //Pre: Arriba un caracter
    //Post: Donat un caracter c obtenim el Node fill corresponent 
    public Node getFill(char c) throws Excepcio_propia {
        if (fills.containsKey(Character.toString(c)))
            return fills.get(Character.toString(c));
        else throw new Excepcio_propia("Aquest node no té aquest fill");
    }
    //Pre: Ariba un Node que ha de ser fill del parametre implicit
    //Post: Posem el node a a llista de fills
    public void addFill(Node nodo) {
        fills.put(Character.toString(nodo.contingut), nodo);
    }
    
    //Pre:
    //Post: Retorna el contingut del parametre implicit
    public char getcontingut() throws Excepcio_propia {
        if (contingut == '\0') throw new Excepcio_propia("Aquest node no té contingut");
        else return contingut;
    }
 
    
    //Pre:
    //Post: Determina que el parametre implicit es fi de paraula
    public void canviar_fi(boolean b) {
        fi = b;
    }
    
    //Pre:
    //Post: Retorn true si el parametre implicit es fi de paraula
    //      i fals si no ho es.
    public boolean es_fi() {
        return fi;
    }
    
    //Pre:
    //Post: Retorna el pare del parametre implicit
    public Node getPare() throws Excepcio_propia {
        if (pare == null) throw new Excepcio_propia("Aquest node no té pare");
        else return pare;
    }
    
    public boolean te_pare() {
        if (pare == null) return false;
        else return true;
    }
    
    //Pre:
    //Post: Retorna si el parametre implcicit es fulla de l'arbre
    public boolean es_fulla() {
        return fulla;
    }
    
    //Pre:
    //Post: Determina que el parametre implicit es fulla si abans no ho era
    //      o a l'inreves
    public void canviar_fulla(boolean b) {
        fulla = b;
    }
}