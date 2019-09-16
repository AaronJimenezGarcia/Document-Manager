
package PROP;

import java.io.*;
import java.util.*;

public class CtrlDomini {
    
    /*Atributs*/
    
    private CtrlPersistencia controladorPersistencia;
    private ConjuntDocuments conjunt;
    
    /*Mètodes privats*/
    
    private ArrayList<ArrayList<String> > Array_to_Matriu(ArrayList<String> al) {
        ArrayList<ArrayList<String> > mat = new ArrayList<>();
        ArrayList<String> array;
        for (int i = 0; i < al.size(); i+=4) {
            array = new ArrayList<>();
            array.add(al.get(i));
            array.add(al.get(i+1));
            array.add(al.get(i+2));
            array.addAll(String_to_Array(al.get(i+3)));
            mat.add(array);
        }
        
        return mat;
    }
    
    private ArrayList<String> String_to_Array(String text) {
        ArrayList<String> array = new  ArrayList<>();
        StringTokenizer st = new StringTokenizer(text, ".!?", true);
        String aux;
        while(st.hasMoreTokens()) {
            StringBuilder sb = new StringBuilder();
            String s;
            aux = st.nextToken();
            sb.append(aux);
            if (st.hasMoreTokens()) {
                s = st.nextToken();
                if (!s.startsWith(" ")) {
                    sb.append(s);
                }
                array.add(sb.toString());
            }
            else array.add(aux);
        }
        return array;
    }
    
    private void pasar_estructures(ArrayList<String> al) {
        Map<String, ArrayList<String> > map_tf = new HashMap<>();
        Map<String, ArrayList<String> > map_tfidf = new HashMap<>();
        Map<String, Double> map_paraules = new HashMap<>();
        ArrayList<Pair<String, String> > array_contingut = new ArrayList<>();
        Map<String, Double> idf = new HashMap<>();
        Map<String, Map<String, Double> > tf = new HashMap<>();   
        
        StringTokenizer st;
        String key;
        ArrayList<String> array;
        int i = 0;
        while (al.get(i) != null) {
            st = new StringTokenizer(al.get(i));
            key = new String();
            array = new ArrayList<>();
            if (st.hasMoreTokens()) key = st.nextToken();
            while (st.hasMoreTokens()) {
                array.add(st.nextToken());
            } 
            map_tf.put(key, array);
            i++;
        }
        i++;
        while (al.get(i) != null) {
            st = new StringTokenizer(al.get(i));
            key = new String();
            array = new ArrayList<>();
            if (st.hasMoreTokens()) key = st.nextToken();
            while (st.hasMoreTokens()) {
                array.add(st.nextToken());
            } 
            map_tfidf.put(key, array);
            i++;
        }
        i++;
        while (al.get(i) != null) {
            st = new StringTokenizer(al.get(i));
            key = new String();
            if (st.hasMoreTokens()) key = st.nextToken();
            if (st.hasMoreTokens()) map_paraules.put(key, Double.parseDouble(st.nextToken()));
            i++;
        }
        i++;
        while (al.get(i) != null) {
            st = new StringTokenizer(al.get(i));
            key = new String();
            StringBuilder sb = new StringBuilder();
            if (st.hasMoreTokens()) key = st.nextToken();
            while (st.hasMoreTokens()) {
                sb.append(st.nextToken() + " ");
            } 
            Pair<String, String> p = new Pair(key, sb.toString());
            array_contingut.add(p);
            i++;
        }
        i++;
        while (al.get(i) != null) {
            Map<String, Double> tf_valor = new HashMap<>();
            st = new StringTokenizer(al.get(i));
            key = new String();
            if (st.hasMoreTokens()) key = st.nextToken();
            while (st.hasMoreTokens()) {
                String s = st.nextToken();
                Double d = Double.parseDouble(st.nextToken());
                tf_valor.put(s, d);
            } 
            tf.put(key, tf_valor);
            i++;
        }
        i++;
        while (i < al.size()) {
            st = new StringTokenizer(al.get(i));
            key = new String();
            if (st.hasMoreTokens()) key = st.nextToken();
            if (st.hasMoreTokens()) idf.put(key, Double.parseDouble(st.nextToken()));
            i++;
        }
       
        conjunt.registrar_estructures(map_tf, map_tfidf, map_paraules, array_contingut, tf, idf);
    }
    
    private ArrayList<String> convertirSimilars_tf() {
        ArrayList<String> al = new ArrayList<>();
        ArrayList<String> valor;
        StringBuilder sb;
        for (Map.Entry<String, ArrayList<String> > e: conjunt.getSimilars_tf().entrySet()) {
            sb = new StringBuilder();
            sb.append(e.getKey());
            valor = e.getValue();
            for (int i = 0; i < valor.size(); i++) {
                sb.append(" ");
                sb.append(valor.get(i));
            }
            al.add(sb.toString());
        }
        return al;
    }

    private ArrayList<String> convertirSimilars_tfidf() {
        ArrayList<String> al = new ArrayList<>();
        ArrayList<String> valor;
        StringBuilder sb;
        for (Map.Entry<String, ArrayList<String> > e: conjunt.getSimilars_tfidf().entrySet()) {
            sb = new StringBuilder();
            sb.append(e.getKey());
            valor = e.getValue();
            for (int i = 0; i < valor.size(); i++) {
                sb.append(" ");
                sb.append(valor.get(i));
            }
            al.add(sb.toString());
        }
        return al;
    }
    
    private ArrayList<String> convertirParaules_docs() {
        ArrayList<String> al = new ArrayList<>();
        StringBuilder sb;
        for (Map.Entry<String, Double > e: conjunt.getParaules_docs().entrySet()) {
            sb = new StringBuilder();
            sb.append(e.getKey());
            sb.append(" ");
            sb.append(e.getValue());
            al.add(sb.toString());
        }
        return al;
    }
    
    private ArrayList<String> convertirId_contingut() {
        ArrayList<String> al = new ArrayList<>();
        ArrayList<Pair<String, String> > id_contingut = conjunt.getId_contingut();
        StringBuilder sb;
        for (int i = 0; i < id_contingut.size(); i++) {
            sb = new StringBuilder();
            sb.append(id_contingut.get(i).getL());
            sb.append(" ");
            sb.append(id_contingut.get(i).getR());
            al.add(sb.toString());
        }
        return al;
    }
    
    private ArrayList<String> convertir_tf() {
        ArrayList<String> al = new ArrayList<>();
        Map<String, Double> valor;
        StringBuilder sb;
        for (Map.Entry<String, Map<String, Double> > e: conjunt.getTf().entrySet()) {
            sb = new StringBuilder();
            sb.append(e.getKey());
            valor = e.getValue();
            for (Map.Entry<String, Double> e2: valor.entrySet()) {
                sb.append(" ");
                sb.append(e2.getKey());
                sb.append(" ");
                sb.append(e2.getValue());
            }
            al.add(sb.toString());
        }
        return al;
    }
    
    private ArrayList<String> convertir_idf() {
        ArrayList<String> al = new ArrayList<>();
        StringBuilder sb;
        for (Map.Entry<String, Double> e: conjunt.getIdf().entrySet()) {
            sb = new StringBuilder();
            sb.append(e.getKey());
            sb.append(" ");
            sb.append(e.getValue());
            al.add(sb.toString());
        }
        return al;
    }
    
    /*Mètode constructor*/
    
    public CtrlDomini() {
        controladorPersistencia = new CtrlPersistencia();
        conjunt = new ConjuntDocuments();
    }
    
    /*Mètode per inicialitzar*/
    
    public void inicialitzarCtrlDomini() throws IOException, FileNotFoundException, Excepcio_propia  {
        conjunt.SetParaulesFuncionals(controladorPersistencia.inicialitzarParaules());
        conjunt.registrar_col(Array_to_Matriu(controladorPersistencia.inicialitzarCtrlPersistencia()));
        pasar_estructures(controladorPersistencia.inicialitzarEstructures());       
        
    }
    
    /*Metodes d'alta*/
    
    public void alta_un_document(String titol, String autor, String contingut) throws Excepcio_propia, IOException {
        String id = conjunt.registrar_doc(titol, autor, String_to_Array(contingut));
        ArrayList<String> al = new ArrayList<>();
        al.add(titol);
        al.add(autor);
        al.add(id);
        al.add(contingut);
        controladorPersistencia.save_fitxer(al);
        controladorPersistencia.save_estructures(convertirSimilars_tf(), convertirSimilars_tfidf(), convertirParaules_docs(), convertirId_contingut(), convertir_tf(), convertir_idf());
    }
    
    public void alta_una_coleccio(String path) throws IOException, Excepcio_propia {
        ArrayList<String> atributs_docs = controladorPersistencia.llegir_docs(path);
        ArrayList<ArrayList<String> > mat = Array_to_Matriu(atributs_docs);
        ArrayList<String> ids = conjunt.registrar_col(mat);
        ArrayList<String> al = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < atributs_docs.size(); i+=4) {
            if (ids.get(j) != null) {
                al.add(atributs_docs.get(i));
                al.add(atributs_docs.get(i+1));
                al.add(ids.get(j));
                al.add(atributs_docs.get(i+3));
            }
            j++;
            
        }
        controladorPersistencia.save_coleccio(al);
        controladorPersistencia.save_estructures(convertirSimilars_tf(), convertirSimilars_tfidf(), convertirParaules_docs(), convertirId_contingut(), convertir_tf(), convertir_idf());
    }
    
    /*Metodes de baixa*/
    
    public void baixa_un_document(ArrayList<String> al) throws Excepcio_propia, IOException {
        controladorPersistencia.delete_fitxers(conjunt.eliminar_doc(al));
        controladorPersistencia.save_estructures(convertirSimilars_tf(), convertirSimilars_tfidf(), convertirParaules_docs(), convertirId_contingut(), convertir_tf(), convertir_idf());
    }
    
    public void baixa_titols_autor(String autor) throws Excepcio_propia, IOException {
        controladorPersistencia.delete_fitxers(conjunt.eliminar_titols_autor(autor));
        controladorPersistencia.save_estructures(convertirSimilars_tf(), convertirSimilars_tfidf(), convertirParaules_docs(), convertirId_contingut(), convertir_tf(), convertir_idf());
    }
    
    public void baixa_tots_documents() throws Excepcio_propia, IOException {
        conjunt.eliminar_tots_docs();
        controladorPersistencia.delete_all_fitxers();
    }
    
    /*Metodes de modificacio*/
    
    public void modificar_titol(String titol, String autor, String nou_titol) throws Excepcio_propia, IOException {
        String id = conjunt.canviar_titol_doc(titol, autor, nou_titol);
        ArrayList<String> al = new ArrayList<>();
        al.add(nou_titol);
        al.add(autor);
        al.add(id);
        controladorPersistencia.save_fitxer_modif(al);
    }
    
    public void modificar_autor(String titol, String autor, String nou_autor) throws Excepcio_propia, IOException {
        String id = conjunt.canviar_autor_doc(titol, autor, nou_autor);
        ArrayList<String> al = new ArrayList<>();
        al.add(titol);
        al.add(nou_autor);
        al.add(id);
        controladorPersistencia.save_fitxer_modif(al);
    }
    
    public void modificar_contingut(String titol, String autor, String nou_contingut) throws Excepcio_propia, IOException {
        String id = conjunt.canviar_contingut_doc(titol, autor, String_to_Array(nou_contingut));
        ArrayList<String> al = new ArrayList<>();
        al.add(titol);
        al.add(autor);
        al.add(id);
        al.add(nou_contingut);
        controladorPersistencia.save_fitxer(al);
        controladorPersistencia.save_estructures(convertirSimilars_tf(), convertirSimilars_tfidf(), convertirParaules_docs(), convertirId_contingut(), convertir_tf(), convertir_idf());
    }
    
    /*Metodes consulta*/
    
    public ArrayList<String> consultar_contingut(String titol, String autor) throws Excepcio_propia {
        return conjunt.consultar_contingut_doc(titol, autor);
    }
    
     public ArrayList<String> consultar_ksemblants(String titol, String autor, String k, String num) throws Excepcio_propia {
        int aux = Integer.parseInt(k);
        return conjunt.consultar_documents_similars(titol, autor, aux, num);
    }
    
    public ArrayList<String> consultar_titols(String autor) throws Excepcio_propia {
        return conjunt.consultar_titols_autor(autor);
    }
    
    public ArrayList<String> consultar_autors_prefix(String prefix) throws Excepcio_propia {
        return conjunt.consultar_autors_prefix(prefix);
    }
    
    public ArrayList<String> consultar_expressio(String e) throws Excepcio_propia {        
        return conjunt.consultar_expressio(e.toLowerCase());
    }
    
    public ArrayList<String> consultar_rellevants(String e, String k) throws Excepcio_propia {
        ArrayList<String> al = String_to_Array(e.toLowerCase());
        String id = conjunt.registrar_doc_query(al);
        int aux = Integer.parseInt(k);
        ArrayList<String> result = conjunt.consultar_rellevants(id, aux, e);
        conjunt.eliminar_doc_query(id, al);
        return result;
    }
    
    public ArrayList<String> consultar_anteriors() throws Excepcio_propia {
        return conjunt.consultar_anteriors();
    }
    
    
}

