
package PROP;

import java.util.*;
import java.util.Map.Entry;

public class TF {
    
    /*Atributs*/
    
    private Map<String, Map<String, Double> > tf; //(id, (palabra, tf))
      
    /*Mètode privat*/
    
    private static HashMap sortByValues(Map map) { 
       List list = new LinkedList(map.entrySet());
       Collections.sort(list, new Comparator() {
            @Override
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
    
    private double semblanca_cosinus(Map<String, Double> v1, Map<String, Double> v2) {
        if (v1.isEmpty() || v2.isEmpty()) return 0.0;
        double dotProduct = 0.0;
        double magnitude1 = 0.0;
        double magnitude2 = 0.0;
        double cosineSimilarity;
        for (Map.Entry<String, Double> entry: v1.entrySet()) {
            if (v2.containsKey(entry.getKey())) {
                dotProduct += entry.getValue()*v2.get(entry.getKey());
                magnitude2 += v2.get(entry.getKey())*v2.get(entry.getKey());
            }
            magnitude1 += Math.pow(entry.getValue(), 2);
        }
        magnitude1 = Math.sqrt(magnitude1);//sqrt(a^2)
        magnitude2 = Math.sqrt(magnitude2);
        if (magnitude1 != 0.0 && magnitude2 != 0.0) {
            cosineSimilarity = dotProduct / (magnitude1 * magnitude2);
        } else {
            return 0.0;
        }
        return cosineSimilarity;
    }
    
    /*Mètode Constructor*/
    
    public TF() {
        super();
        tf = new HashMap<String, Map<String, Double> >();
    }
    
    /*Mètode Getter*/
    
    public Map<String, Map<String, Double> > gettf() {
        return tf;
    }
     
    /*Mètode Setter*/
    
    public void settf(Map<String, Map<String, Double> > tf) {
        this.tf = tf;
    }
    
    /*Mètodes Públics*/
     
    public Map<String, Double> prepararTF(ArrayList<String> paraules) {
        String[] paraules_separades = paraules.toArray(new String[paraules.size()]);
        double result;
        Map<String, Double> valor_tf = new HashMap<String, Double>();
        for (int i = 0; i < paraules_separades.length; i++) {
            result = 0;
            if (!valor_tf.containsKey(paraules_separades[i])) {
                for (int j = i; j < paraules_separades.length; j++) {
                    if (paraules_separades[i].equalsIgnoreCase(paraules_separades[j])) {
                        result++;
                    }
                    valor_tf.put(paraules_separades[i], result/paraules_separades.length);
                }
            }
        }
        return valor_tf;
    }
    
    public void afegir_matriu(String id, ArrayList<String> paraules_doc) throws Excepcio_propia {
        if (tf.containsKey(id)) throw new Excepcio_propia("Aquest fila ja està a la matriu tf");
        tf.put(id, prepararTF(paraules_doc));
    }
    
    public void treure_matriu(String id) throws Excepcio_propia {
         if (!tf.containsKey(id)) throw new Excepcio_propia("Aquesta fila no esta a la matriu tf");
         tf.remove(id);
     }
   
    
     
    public Map<String, ArrayList<String> > getSimilars() {
        Map<String, ArrayList<String> > similars = new HashMap<String, ArrayList<String> >(); //id, ids de + a -
        ArrayList<String> consulta;
        Map<String, Double> doc_interesat; //doc que miro
        Map<String, Double> docs = new HashMap<String, Double>(); //documentos similares
        for (Entry<String, Map<String, Double> > doc: tf.entrySet()) {
            doc_interesat = doc.getValue();
            for (Entry<String, Map<String, Double> > entry: tf.entrySet()) {
                if (!entry.getKey().equals(doc.getKey())){
                    docs.put(entry.getKey(), semblanca_cosinus(doc_interesat, entry.getValue()));
                }
            }
            Map<String, Double> resultat = sortByValues(docs);
            consulta = new ArrayList<String>();
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
    }
}
