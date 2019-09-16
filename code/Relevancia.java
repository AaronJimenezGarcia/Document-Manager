
package PROP;

import java.util.*;
import java.util.Map.Entry;

public class Relevancia {
    
    /*Atributs*/
    
    private TFIDF tfidf;
    private ArrayList<String> similars_query;
    
    /*Mètode constructor*/
    
    public Relevancia() {
        tfidf = new TFIDF();
        similars_query = new ArrayList();
    }
    
    /*Mètode Setter*/
    
    public void setTFidf(TFIDF tfidf) {
        this.tfidf = tfidf;
    }

    /*Mètode Getter*/
    
    public ArrayList<String> getSimilars_query() {
        return similars_query;
    }
    
    /*Mètode consulta*/
    
    public void getRellevants(String id) {

        Map<String, Map<String, Double> > tf_idf = tfidf.getTfidf();
        Map<String, Double > doc_interesat;
        Map<String, Double> docs = new HashMap<>();
        Map<String, Double> query = tf_idf.get(id);
        for (Entry<String, Map<String, Double> > doc: tf_idf.entrySet()) {
            doc_interesat = doc.getValue();
            if (!doc.getKey().equals(id)) docs.put(doc.getKey(), tfidf.semblanca_cosinus(doc_interesat, query));
        }
        Map<String, Double> resultat = tfidf.sortByValues(docs);
        ArrayList<String> consulta = new ArrayList<>();
        for (Map.Entry entry : resultat.entrySet()) {
            consulta.add((String) entry.getKey());
        }
        this.similars_query = consulta;
    
    }
}
    

