package PROP;

import java.util.*;

public class ConsultesAnteriors {
    
    /*Atributs*/
    ArrayList<String> consultes;

    /*Metodes constructors*/
    public ConsultesAnteriors() {
        this.consultes = new ArrayList<>();
    }

    /*Metodes getters*/
    
    public ArrayList<String> getConsultes() { 
        return consultes;
    }
    
    /*Metodes per consultar*/
    
    public boolean es_buida() {
        return consultes.isEmpty();
    }
    
    public int size_consultes() {
        return consultes.size();
    }
    
    /*Metodes per afegir*/
    
    public void afegirConsulta(String s) {
        boolean trobat = false;
        for (int i = 0; i < consultes.size(); i++) {
            if (s.equals(consultes.get(i))) trobat = true; 
        }
        if (!trobat) {
            if (consultes.size() >= 20) consultes.remove(0);
            consultes.add(s);            
        }
        
    }
    
}
