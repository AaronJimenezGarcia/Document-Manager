
package PROP;

import java.util.*;


public class Document {
    
    /*Atributs*/
    
    private String titol;
    private String autor;
    private ArrayList<String> contingut;
    private String id;
        
    /*Metodes constructors*/
    
    public Document() {
        titol = new String();
        autor = new String();
        contingut = new ArrayList<>();
        id = new String();
    }
    
    public Document(String titol, String autor, ArrayList<String> contingut) {
        this.titol = titol;
        this.autor = autor;
        this.contingut = contingut;
        id = UUID.randomUUID().toString();
    }
    
    public Document(String id, String titol, String autor, ArrayList<String> contingut) {
        this.titol = titol;
        this.autor = autor;
        this.contingut = contingut;
        this.id = id;
    }
    
    public Document(String titol, String autor) {
        this.titol = titol;
        this.autor = autor;
        id = UUID.randomUUID().toString();
    }
    
    /*Metodes consulta*/
    
    public String getTitol() {
        return titol;
    }

    public String getAutor() {
        return autor;
    }

    public ArrayList<String> getContingut() {
        return contingut;
    }
    
    public String getId() {
        return id;
    }
    
    /*Metodes modificar*/
    
    public void setTitol(String titol) {
        this.titol = titol;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void setContingut(ArrayList<String> contingut) {
        this.contingut = contingut;
    } 
}