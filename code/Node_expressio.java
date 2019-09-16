
package PROP;

public class Node_expressio {
    
    /*Atributs*/
    
    private String contingut;
    private Node_expressio fill_esq;
    private Node_expressio fill_dret;

    /*Mètodes constructors*/
    
    public Node_expressio() {
	contingut = new String();
	fill_esq = null;
	fill_dret = null;
    }
	
    public Node_expressio(String s) {
	contingut = s;
	fill_esq = null;
	fill_dret = null;
    }
	
    /*Mètodes Getters*/
    
    public String getContingut() {
	return contingut;
    }
	
    public Node_expressio getFill_esq() {
        return fill_esq;
    }
    
    public Node_expressio getFill_dret() {
        return fill_dret;
    }
    
    /*Mètodes Setters*/
    
    public void setFill_esq(Node_expressio n) {
        fill_esq = n;
    }
    
    public void setFill_dret(Node_expressio n) {
	fill_dret = n;
    }
    
    /*Mètdes consulta*/
    
    public Boolean fill_esq_es_buit() {
        return fill_esq == null;
    }
    
    public Boolean fill_dret_es_buit() {
        return fill_dret == null;
    }
    
}
