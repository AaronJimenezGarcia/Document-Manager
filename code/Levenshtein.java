package PROP;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

public class Levenshtein {
    
    /*Mètode privat*/

    private int distancia(String s1, String s2) {
        if (s1.length() == 0) return s2.length();
        if (s2.length() == 0) return s1.length();
        if (Math.abs(s2.length() - s1.length()) > 3) return 100;

        int [][]dist = new int[s1.length()+1][s2.length()+1];
        int i;
        for(i = 0; i <= s1.length(); i++) dist[i][0]=i;
        for(i = 0; i <= s2.length(); i++) dist[0][i]=i;
        
        for(i = 1; i <= s1.length(); i++) {
            for(int j = 1; j <= s2.length(); j++) { 
                  int aux = (s1.charAt(i-1) == s2.charAt(j-1)) ? 0 : 1;
                  dist[i][j]= Math.min(dist[i-1][j] + 1,
                                       Math.min(dist[i][j-1] + 1,
                                       dist[i-1][j-1] + aux));
            }
        }
        return dist[s1.length()][s2.length()];
    }
    
    /*Mètode consultar*/

    public String correccio (Map<String, ArrayList<String> > llista, String s, boolean b) {
        String nom = new String();
        int aux;
        int dist = 1000000000;
        for (Entry<String, ArrayList<String> > e: llista.entrySet()) {
            String autor = e.getKey();
            if (b) {
                aux = distancia(autor, s);
                if (aux == 0) return null;
                if (aux == 1) {
                    dist = aux;
                    nom = autor;
                    break;
                }
                if (aux < dist) {
                    dist = aux;
                    nom = autor;
                }
            }
            else {
                for (int i = 0; i < e.getValue().size(); i++) {
                    aux = distancia(e.getValue().get(i), s);
                    if (aux == 0) return null;
                    if (aux == 1) {
                        dist = aux;
                        nom = e.getValue().get(i);
                        break;
                    }
                    if (aux < dist) {
                        dist = aux;
                        nom = e.getValue().get(i);
                    }     
                }
            }
        }
        if (dist <= 3) return nom;
        else return null;
    }

}