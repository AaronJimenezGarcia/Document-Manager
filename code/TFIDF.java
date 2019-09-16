
package PROP;

import static java.lang.Math.log10;
import java.util.*;
import java.util.Map.Entry;

public class TFIDF {

    /*Atributs*/
    
    private Map<String, Double> idf; //(palabra, idf)
    private Map<String, Map<String, Double> > tf;

    /*Mètode privat*/
    
    private Map<String, Map<String, Double> > calcul_tfidf() {
        Map<String, Map<String, Double> > tfidf = new HashMap<>();
        Map<String, Double> tfidf_aux;
        Map<String, Double> valor_tf;
        for (Entry<String, Map<String, Double> > entry: tf.entrySet()) {
            valor_tf = entry.getValue();
            tfidf_aux = new HashMap<>();
            for (Entry<String, Double> idfentry: idf.entrySet()) {
                if (valor_tf.containsKey(idfentry.getKey())) tfidf_aux.put(idfentry.getKey(), idfentry.getValue()*valor_tf.get(idfentry.getKey()));
                else tfidf_aux.put(idfentry.getKey(), 0.0);
                tfidf.put(entry.getKey(), tfidf_aux);
            }
        }
        return tfidf;
        
    }

    /*Mètode Constructor*/
    
    public TFIDF() {
        super();
        idf = new HashMap<>();
    }
    
    /*Mètodes Getters*/
    
    public Map<String, Double> getIdf() {
        return idf;
    }

    public Map<String, Map<String, Double>> getTfidf() {
        return calcul_tfidf();
    }
    
    /*Mètodes Setters*/
    
    public void settf(Map<String, Map<String, Double> > tf) {
        this.tf = tf;
    }
    
    public void setidf(Map<String, Double> idf) {
        this.idf = idf;
    }
    
    /*Mètodes Públics*/
    
    public double semblanca_cosinus(Map<String, Double> v1, Map<String, Double> v2) {
        double dotProduct = 0.0;
        double magnitude1 = 0.0;
        double magnitude2 = 0.0;
        double cosineSimilarity;
        
        for (Map.Entry<String, Double> entry: v1.entrySet()) {
            dotProduct += entry.getValue()*v2.get(entry.getKey());
            magnitude1 += Math.pow(entry.getValue(), 2);
            magnitude2 += v2.get(entry.getKey())*v2.get(entry.getKey());
        }
        magnitude1 = Math.sqrt(magnitude1);//sqrt(a^2)
        magnitude2 = Math.sqrt(magnitude2);//sqrt(b^2)

        if (magnitude1 != 0.0 && magnitude2 != 0.0) {
            cosineSimilarity = dotProduct / (magnitude1 * magnitude2);
        } else {
            return 0.0;
        }
        return cosineSimilarity;
    }
    
    public static HashMap sortByValues(Map map) { 
       List list = new LinkedList(map.entrySet());
       Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
               return ((Comparable) ((Map.Entry) (o2)).getValue())
                  .compareTo(((Map.Entry) (o1)).getValue());
            }
       });

       HashMap sortedHashMap = new LinkedHashMap();
       for (Iterator it = list.iterator(); it.hasNext();) {
              Map.Entry entry = (Map.Entry) it.next();
              sortedHashMap.put(entry.getKey(), entry.getValue());
       } 
       return sortedHashMap;
    }
    
    public void fer_idf(int mida, Map<String, Double> paraules_docs) {
        if (!idf.isEmpty()) idf.clear();
        for (Map.Entry<String, Double> entry: paraules_docs.entrySet()) 
            idf.put(entry.getKey(), log10(mida/entry.getValue()) + 1);
    }
   
    public Map<String, ArrayList<String> > getSimilars() {
        Map<String, Map<String, Double> > tfidf = calcul_tfidf();
        Map<String, ArrayList<String> > similars = new HashMap<String, ArrayList<String> >(); //id, ids de + a -
        ArrayList<String> consulta;
        Map<String, Double > doc_interesat;
        Map<String, Double> docs = new HashMap<String, Double>();
        for (Entry<String, Map<String, Double> > doc: tfidf.entrySet()) {
            doc_interesat = doc.getValue();
            for (Entry<String, Map<String, Double> > entry: tfidf.entrySet()) 
                if (!entry.getKey().equals(doc.getKey())) docs.put(entry.getKey(), semblanca_cosinus(doc_interesat, entry.getValue()));

            Map<String, Double> resultat = sortByValues(docs);
            consulta = new ArrayList<>();
            for (Map.Entry entry : resultat.entrySet()) {
                consulta.add((String) entry.getKey());
            }
            similars.put(doc.getKey(), consulta);
            docs.clear();
        }
        return similars;
    }
   
    public void reset() {
        tf.clear();
        idf.clear();
    }
}