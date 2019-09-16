
package PROP;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public class CtrlPresentacio {
    
    /*Atributs*/
    
    private CtrlDomini controladorDomini;
    private VistaPrincipal vp;
    private VistaAlta va;
    private VistaBaixa vb;
    private VistaConsultes vc;
    private VistaModificacions vm;
    private VistaInicial vi;
    
    /*Mètode constructor*/
    
    public CtrlPresentacio() {
        controladorDomini = new CtrlDomini();
        vi = new VistaInicial();
        va = new VistaAlta(this);
        vb = new VistaBaixa(this);
        vc = new VistaConsultes(this);
        vi.setVisible(true);
    }
    
    /*Mètodes sincronització*/
    
    public void encendrevistaPrincipal() {
        vi.setVisible(false);
        vp.setVisible(true);
    }
    
    public void sincronitzacio_VistaPrincipal_a_VistaAlta() {
        va = new VistaAlta(this);
        vp.setEnabled(false);
        va.setVisible(true);
    }
    public void sincronitzacio_VistaAlta_a_VistaPrincipal() {
        va.setVisible(false);
        vp.setEnabled(true);
    }
    
    public void sincronitzacio_VistaPrincipal_a_VistaBaixa() {
        vb = new VistaBaixa(this);
        vp.setEnabled(false);
        vb.setVisible(true);
    }
    public void sincronitzacio_VistaBaixa_a_VistaPrincipal() {
        vb.setVisible(false);
        vp.setEnabled(true);
    }
    
    public void sincronitzacio_VistaPrincipal_a_VistaConsultes() {
        vc = new VistaConsultes(this);
        vp.setEnabled(false);
        vc.setVisible(true);
    }
    
    public void sincronitzacio_VistaConsultes_a_VistaPrincipal() {
        vc.setVisible(false);
        vp.setEnabled(true);
    }
    
    public void sincronitzacio_VistaPrincipal_a_VistaModificacions() {
        vm = new VistaModificacions(this);
        vp.setEnabled(false);
        vm.setVisible(true);
    }
    
    public void sincronitzacio_VistaModificacio_a_VistaPrincipal() {
        vm.setVisible(false);
        vp.setEnabled(true);
    }
    
    /*Mètodes inicialització*/
    
    public void carrega_inicial() throws FileNotFoundException, IOException, Excepcio_propia {
        controladorDomini.inicialitzarCtrlDomini();
    }
    
    public void inicialitzarPresentacio() {
        vp = new VistaPrincipal(this);
    }
    
    /*Mètodes eliminació*/
    
    public void eliminardocument(ArrayList<String> docs) throws Excepcio_propia, IOException {
        controladorDomini.baixa_un_document(docs);
    }
    
    public void eliminardocsautors(String autor) throws Excepcio_propia, IOException {
        controladorDomini.baixa_titols_autor(autor);
    }
    
    public void eliminartots() throws Excepcio_propia, IOException {
        controladorDomini.baixa_tots_documents();
    }
    
    /*Mètodes consultar*/
    
    public ArrayList<String> mostrarAutors(String prefix) throws Excepcio_propia {
        return controladorDomini.consultar_autors_prefix(prefix);
    }
    
    public ArrayList<String> mostrarExpressio(String expressio)throws Excepcio_propia {
        return controladorDomini.consultar_expressio(expressio);
    }
    
    public ArrayList<String> mostrarTitols(String autor) throws Excepcio_propia {
        return controladorDomini.consultar_titols(autor);
    }
    
    public ArrayList<String> mostrarContingut(String titol, String autor) throws Excepcio_propia {
        return controladorDomini.consultar_contingut(titol, autor);
    }
    
    public ArrayList<String> mostrarConsultesAnteriors() throws Excepcio_propia {
        return controladorDomini.consultar_anteriors();
    }
    
    public ArrayList<String> mostrarSimilars(String titol, String autor, String nombrek, String tipus) throws Excepcio_propia {
        return controladorDomini.consultar_ksemblants(titol, autor, nombrek, tipus);
    }
    
    public ArrayList<String> mostrarRellevants(String e, String k) throws Excepcio_propia {
        return controladorDomini.consultar_rellevants(e, k);
    }
    
    /*Mètodes modificació*/
    
    public void canviarTitol(String titol, String autor, String nou_titol) throws Excepcio_propia, IOException {
        controladorDomini.modificar_titol(titol, autor, nou_titol);
    }
    
    public void canviarAutor(String titol, String autor, String nou_autor) throws Excepcio_propia, IOException {
        controladorDomini.modificar_autor(titol, autor, nou_autor);
    }
    
    public void canviarContingut(String titol, String autor, String nou_contingut) throws Excepcio_propia, IOException {
        controladorDomini.modificar_contingut(titol, autor, nou_contingut);
    }
    
    /*Mètodes alta*/
    
    public void cargarcoleccio(String path) throws IOException, Excepcio_propia {
        controladorDomini.alta_una_coleccio(path);
    }
    
    public void cargardocument(String titol, String autor, String contingut) throws IOException, Excepcio_propia {
        controladorDomini.alta_un_document(titol, autor, contingut);
    }
    
}
