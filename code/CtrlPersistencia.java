
package PROP;

import java.io.*;
import java.util.*;


public class CtrlPersistencia {
    
    /*Atributs*/
    
    private File folder;
    private String pathfolder;
    private File palabras;
    static private String noms_fitxers[] = {"similarstf", "similarstfidf", "paraulesdocs", "id_contingut", "tf", "idf"};
    
    /*Metodes privats*/
    
    private File[] array_documents_data() {
        File[] allfiles = folder.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File carpeta, String name) {
                return name.endsWith(".txt") && !name.equals("similarstf.txt") && !name.equals("similarstfidf.txt") &&
                       !name.equals("paraulesdocs.txt") && !name.equals("id_contingut.txt") && !name.equals("tf.txt") && !name.equals("idf.txt");
            }
        });
        return allfiles;
    }
    
    private File[] array_documents(File f) {
        File[] allfiles = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File carpeta, String name) {
                return name.endsWith(".txt");
            }
        });
        return allfiles;
    }
    
    private ArrayList<String> agafar_documents(File carpeta, boolean b) throws IOException, Excepcio_propia {
                
        ArrayList<String> documents = new ArrayList();
        File[] allfiles;
        if (!b) allfiles = array_documents_data();
        else allfiles = array_documents(carpeta);
        if (allfiles.length > 0) {
            for (File file : allfiles) {
                
                BufferedReader bf = new BufferedReader(new FileReader(file));
                documents.add(bf.readLine());
                documents.add(bf.readLine());
                if (!b) documents.add(file.getName().substring(0,36));
                else documents.add(null);
                StringBuilder sb = new StringBuilder();
                String s;
                while ((s = bf.readLine()) != null) {
                    String contingut = s + "\n";
                    sb.append(contingut);
                }
                //sb.delete(sb.length()-1, sb.length());
                sb.deleteCharAt(sb.length()-1);
                documents.add(sb.toString());
                bf.close();
            }
        }
        else {
            if (b)throw new Excepcio_propia("No hi ha cap document en aquest directori.");
            else throw new Excepcio_propia("No hi ha cap document a la base de dades.");
        } 
        return documents;
    }
    
    /*Metode creador*/
    
    public CtrlPersistencia() {
        pathfolder = "DATA";
	folder = new File(pathfolder);
        palabras = new File("PALABRAS", "palabras_funcionales.txt");
        if (!folder.isDirectory()) folder.mkdir();
    }
    
    /*Metodes d'inicialitzacio*/
    
    public ArrayList<String> inicialitzarCtrlPersistencia() throws IOException, Excepcio_propia{
        ArrayList<String> al = agafar_documents(folder, false);
        return al;
    }
    
    public ArrayList<String> inicialitzarParaules() throws FileNotFoundException, IOException{
        ArrayList<String> paraules = new ArrayList();
        BufferedReader bf = new BufferedReader(new FileReader(palabras));
        String s;
        while ((s = bf.readLine()) != null) {
            paraules.add(s);
        }
        bf.close();
        return paraules;
    }

    public ArrayList<String> inicialitzarEstructures() throws IOException{
        ArrayList<String> similars = new ArrayList<>();
        BufferedReader  bf;
        String s;
        int n = noms_fitxers.length;
        for (int i = 0; i < n; i++) {
            File f = new File(pathfolder, noms_fitxers[i]+".txt");  
            if (f.exists()) {
                bf = new BufferedReader(new FileReader(f));
                while ((s = bf.readLine()) != null) {
                    similars.add(s);
                }
                bf.close();
            }
            if (i != n-1) similars.add(null);
        }
        return similars;
    }
        
    /*Metodes de recuperació*/
    
    public  ArrayList<String> llegir_docs(String lloc) throws IOException, Excepcio_propia {
        ArrayList<String> al = agafar_documents(new File(lloc), true);
        return al;
    }
    
    /*Metodes per guardar fitxers*/
    
    public void save_fitxer(ArrayList<String> al) throws IOException {
        
        if (!al.isEmpty()) {
            File f = new File(pathfolder, al.get(2)+".txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            bw.write(al.get(0) + "\r\n");
            bw.write(al.get(1) + "\r\n");
            bw.write(al.get(3));
            /*StringTokenizer st = new StringTokenizer(al.get(3), "\n");
            if (st.hasMoreTokens()) {
                bw.write(st.nextToken());
            }
            while(st.hasMoreTokens()) {
                bw.newLine();
                bw.write("\n");
                bw.write(st.nextToken());
                
            }*/
            bw.close();
        }
    }
    
    public void save_fitxer_modif(ArrayList<String> al) throws IOException {
        
        if (!al.isEmpty()) {
            File f = new File(pathfolder, al.get(2)+".txt");
            BufferedReader bf = new BufferedReader(new FileReader(f));
            bf.readLine();
            bf.readLine();
            String s;
            StringBuilder sb = new StringBuilder();
            while ((s = bf.readLine()) != null) {
                String contingut = s + "\n";
                sb.append(contingut);
            }
            sb.deleteCharAt(sb.length()-1);
            bf.close();
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            bw.write(al.get(0) + "\r\n");
            bw.write(al.get(1) + "\r\n");
            bw.write(sb.toString());
            bw.close();
        }
    }
    
    public void save_coleccio (ArrayList<String> al) throws IOException{
        if (!al.isEmpty()) {
            ArrayList<String> array;
            for (int i = 0; i < al.size(); i += 4) {
                array = new ArrayList();
                array.add(al.get(i));
                array.add(al.get(i+1));
                array.add(al.get(i+2));
                array.add(al.get(i+3));
                save_fitxer(array);
            }
        }
    }
    
    public void save_estructures(ArrayList<String> similars_tf, ArrayList<String> similars_tfidf, ArrayList<String> paraules_docs, ArrayList<String> id_contingut, ArrayList<String> tf, ArrayList<String> idf) throws IOException {
        ArrayList<ArrayList<String> > al = new ArrayList<>();
        al.add(similars_tf);
        al.add(similars_tfidf);
        al.add(paraules_docs);
        al.add(id_contingut);
        al.add(tf);
        al.add(idf);
        BufferedWriter bw;
        int n = noms_fitxers.length;
        for (int i = 0; i < n; i++) {
            if (!al.get(i).isEmpty()) {
                File f = new File(pathfolder, noms_fitxers[i]+".txt");
                bw = new BufferedWriter(new FileWriter(f));
                for (int j = 0; j < al.get(i).size(); j++) {
                    bw.write(al.get(i).get(j));
                    bw.newLine();
                }
                bw.close();
            }  
        } 
    }
        
    /*Metodes per eliminar fitxers*/
    
    public void delete_fitxers(ArrayList<String> al) throws IOException {
        if (!al.isEmpty()) {
            for (int i = 0; i < al.size(); i++) {
                delete_fitxer(al.get(i));
            }
        }
    }
    
    public void delete_all_fitxers() throws IOException, Excepcio_propia {
        File[] allfiles = array_documents_data();
        if (allfiles.length > 0) {
            for (File file : allfiles) file.delete();//delete_fitxer(file.getName().substring(0,36));
        }
        else throw new Excepcio_propia("No hi ha cap document a la base de dades");
        File f;
        for (int i = 0; i < noms_fitxers.length; i++) delete_fitxer(noms_fitxers[i]);
    }
    
    public void delete_fitxer(String id) throws IOException {
        File f = new File(pathfolder, id + ".txt");
        if (f.exists()) f.delete();
    }
    
      
}