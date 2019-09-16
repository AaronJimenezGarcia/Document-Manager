
package PROP;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

public class VistaBaixa extends javax.swing.JDialog {

    CtrlPresentacio controladorPresentacio;
    DefaultListModel listaafegir;
    ArrayList<String> docs;
    
    private void bloquear() {
        jRadioButton1.setEnabled(false);
        jRadioButton2.setEnabled(false);
        jRadioButton3.setEnabled(false);
        afegir.setEnabled(false);
        treure.setEnabled(false);
        eliminar.setEnabled(false);
        if (jRadioButton1.isSelected())titol.setEditable(false);
        else if (jRadioButton1.isSelected() || jRadioButton2.isSelected()) autor.setEditable(false); 
    }
    
    private void enables_and_visibles() {
        icon1.setVisible(false);
        icon2.setVisible(false);
        icon3.setVisible(false);
        icon4.setVisible(false);
        jRadioButton1.setSelected(true);
        titol.setEnabled(true);
        autor.setEnabled(true);
        afegir.setEnabled(true);
        treure.setEnabled(false);
    }
    
    public VistaBaixa(CtrlPresentacio controlador) {
        controladorPresentacio = controlador;
        docs = new ArrayList<>();
        listaafegir = new DefaultListModel();
        initComponents();
        setLocationRelativeTo(null);
        enables_and_visibles();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        icon4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        titol = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        autor = new javax.swing.JTextField();
        afegir = new javax.swing.JButton();
        treure = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaelim = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();
        icon2 = new javax.swing.JLabel();
        icon3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jSplitPane1.setDividerLocation(250);
        jSplitPane1.setDividerSize(10);
        jSplitPane1.setOneTouchExpandable(true);

        jButton1.setText("Cerca");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        icon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PROP/carga.gif"))); // NOI18N

        lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lista);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(icon4)
                        .addGap(0, 73, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icon4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jLabel3.setText("Introdueix el títol");

        jLabel4.setText("Introdueix l'autor");

        afegir.setText("Afegir a la llista");
        afegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afegirActionPerformed(evt);
            }
        });

        treure.setText("Treure de la llista");
        treure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treureActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Eliminar documents");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Eliminar documents per autor");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Eliminar tots");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(listaelim);

        jLabel5.setText("Documents a eliminar");

        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PROP/carga.gif"))); // NOI18N

        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PROP/carga.gif"))); // NOI18N

        icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PROP/carga.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton3)
                        .addGap(18, 18, 18)
                        .addComponent(icon3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(icon1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton2)
                        .addGap(18, 18, 18)
                        .addComponent(icon2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(afegir, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(treure, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(autor, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(titol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {afegir, eliminar, treure});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(titol, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(autor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(afegir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(treure, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(icon1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton2)
                            .addComponent(icon2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton3)
                            .addComponent(icon3))
                        .addGap(0, 63, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {afegir, eliminar, treure});

        jSplitPane1.setRightComponent(jPanel2);

        jMenu1.setText("Opcions");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PROP/Interrogacion.png"))); // NOI18N
        jMenuItem1.setText("Ajuda");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PROP/salida.png"))); // NOI18N
        jMenuItem2.setText("Sortir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        titol.setText("");
        autor.setText("");
        titol.setEnabled(false);
        autor.setEnabled(false);
        afegir.setEnabled(false);
        treure.setEnabled(false);
        eliminar.setEnabled(true);
        listaelim.setModel(new DefaultListModel());
        listaafegir.clear();
        docs.clear();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        final SwingWorker worker = new SwingWorker() {
            @Override
            protected Void doInBackground() throws Exception {
                try {
                    icon4.setVisible(true);
                    ArrayList<String> autors;
                    if (autor.getText().isEmpty()) autors = controladorPresentacio.mostrarAutors("");
                    else autors = controladorPresentacio.mostrarAutors(autor.getText());
                    DefaultListModel l = new DefaultListModel();
                    for (int i = 0; i < autors.size(); i++)
                        l.addElement(autors.get(i));
                    lista.setModel(l);
                }
                catch (Excepcio_propia e) {
                    JOptionPane.showMessageDialog(null, e.toString().substring(22), "Informacio", JOptionPane.INFORMATION_MESSAGE);
                    autor.setText("");
                }
                finally {
                    icon4.setVisible(false);
                }
                return null;
            }
        };
        worker.execute();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void afegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afegirActionPerformed
        if (!autor.getText().isEmpty() && !titol.getText().isEmpty()) {
            if (!docs.contains(autor.getText()) || !docs.contains(titol.getText())) {
                docs.add(autor.getText());
                docs.add(titol.getText());
                listaafegir.addElement("+ " + autor.getText());
                listaafegir.addElement("      - "+titol.getText());
                eliminar.setEnabled(true);
                treure.setEnabled(true);
                listaelim.setModel(listaafegir);
            }
        }
    }//GEN-LAST:event_afegirActionPerformed

    private void treureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treureActionPerformed
        int index = listaelim.getSelectedIndex();
        if (!docs.isEmpty() && index != -1) { 
            if (index%2 == 0) {
                DefaultListModel modelo = (DefaultListModel) listaelim.getModel();
                modelo.remove(index + 1);
                modelo.remove(index);
                listaelim.setModel(modelo);
                docs.remove(index + 1);
                docs.remove(index);
                if (docs.isEmpty()) {
                    treure.setEnabled(false);
                }
            }
        }
    }//GEN-LAST:event_treureActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        final SwingWorker worker = new SwingWorker() {
            @Override
            protected Void doInBackground() throws Exception {
                try {
                    bloquear();
                    if (jRadioButton1.isSelected()) {
                        if (docs.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "La llista de documents es buida. Has d'afegir-los.\n"
                                + "Pots consultar l'ajuda pulsant F12", "Error", JOptionPane.WARNING_MESSAGE);
                        }
                        else {
                            icon1.setVisible(true);
                            controladorPresentacio.eliminardocument(docs);
                            JOptionPane.showMessageDialog(null, "S'ha(n) eliminat correctament", "Informacio", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    else if (jRadioButton2.isSelected()) {
                        if (autor.getText().isEmpty()) JOptionPane.showMessageDialog(null, "Omple els camps necessaris.\n"
                                                            + "Pots consultar l'ajuda pulsant F12", "Error", JOptionPane.WARNING_MESSAGE);
                        else {
                            icon2.setVisible(true);
                            controladorPresentacio.eliminardocsautors(autor.getText());
                            JOptionPane.showMessageDialog(null, "S'ha(n) eliminat correctament", "Informacio", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    else if (jRadioButton3.isSelected()) {
                        int reply = JOptionPane.showConfirmDialog(null, "S'eliminaran tots els documents guardats\n"
                            + "Estas segur de que vols continuar?", "Advertencia", JOptionPane.YES_NO_OPTION);
                        if (reply == JOptionPane.YES_OPTION) {
                            icon3.setVisible(true);
                            controladorPresentacio.eliminartots();
                            JOptionPane.showMessageDialog(null, "S'ha(n) eliminat correctament", "Informacio", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
                catch (Excepcio_propia e) {
                    JOptionPane.showMessageDialog(null, e.toString().substring(22), "Error", JOptionPane.ERROR_MESSAGE);
                }
                catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Error inesperat", "Error", JOptionPane.ERROR_MESSAGE);
                }
                finally {
                    if (jRadioButton1.isSelected()) {
                        icon1.setVisible(false);
                        docs.clear();
                        listaelim.setModel(new DefaultListModel());
                        afegir.setEnabled(true);
                        treure.setEnabled(true);
                        titol.setEditable(true);
                        autor.setEditable(true);
                        autor.setText("");
                        titol.setText("");
                        listaafegir.clear();
                        eliminar.setEnabled(true);
                    }
                    else if (jRadioButton2.isSelected()) {
                        icon2.setVisible(false);
                        autor.setEditable(true);
                        autor.setText("");
                        eliminar.setEnabled(true);
                    }
                    else {
                        icon3.setVisible(false);
                        eliminar.setEnabled(true);
                    }
                    jRadioButton1.setEnabled(true);
                    jRadioButton2.setEnabled(true);
                    jRadioButton3.setEnabled(true);
                }
                return null;
            }
        };
        worker.execute();
    }//GEN-LAST:event_eliminarActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        titol.setText("");
        autor.setText("");
        titol.setEnabled(true);
        autor.setEnabled(true);
        afegir.setEnabled(true);
        treure.setEnabled(true);
        eliminar.setEnabled(true);
        listaelim.setModel(new DefaultListModel());
        listaafegir.clear();
        docs.clear();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        titol.setText("");
        autor.setText("");
        titol.setEnabled(false);
        autor.setEnabled(true);
        afegir.setEnabled(false);
        treure.setEnabled(false);
        eliminar.setEnabled(true);
        listaelim.setModel(new DefaultListModel());
        listaafegir.clear();
        docs.clear();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseClicked
        if (evt.getClickCount() == 2) // Se mira si es doble click
        {
            int posicion = lista.locationToIndex(evt.getPoint());
            String s = lista.getModel().getElementAt(posicion);
            try {
                String s2;
                if (jRadioButton1.isSelected()) {
                    ArrayList<String> titols = controladorPresentacio.mostrarTitols(s);
                    Object[] aux = titols.toArray();
                    s2 = (String) JOptionPane.showInputDialog(null, "Titols del autor", "Selecciona el títol", JOptionPane.PLAIN_MESSAGE, null, aux, titols.get(0));
                    if (s2 != null) {
                        titol.setText(s2);
                        autor.setText(s);
                    }
                }
                if (jRadioButton2.isSelected()) autor.setText(s);
            }
            catch (Excepcio_propia e) {
                JOptionPane.showMessageDialog(null, e.toString().substring(22), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_listaMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(null, "- L’usuari pot eliminar un o més documents que estan guardats\n"
                                          + "a la base de dades a la vegada. Per fer-ho, s’ha de seleccionar\n"
                                          + "l’opció Eliminar documents que per defecte està activada quan\n"
                                          + "s’obre la finestra. Per poder utilitzar aquesta funcionalitat,\n"
                                          + "s’hauran d’introduir els títols i els autors dels documents que\n"
                                          + "es volen eliminar  i un per un afegir-los a la llista de documents\n"
                                          + "a eliminar amb el botó Afegir a la llista. Si en algun moment\n"
                                          + "s’afegís un document que no es volia es podria treure l’últim\n"
                                          + "mitjançant el botó Treure últim llista. Finalment, s’ha de prémer\n"
                                          + "el botó Eliminar.\n"
                                          + "- L’usuari pot eliminar tots els documents que tenen el mateix autor\n"
                                          + "d’una vegada. Per fer-ho cal que es seleccioni l’opció Eliminar\n"
                                          + "documents per autor. Per utilitzar aquesta funcionalitat primer\n"
                                          + "s’ha d’introduir l’autor i després clicar al botó Eliminar.\n"
                                          + "L’usuari pot eliminar tots els documents del sistema. Per fer-ho\n"
                                          + "ha de seleccionar l’opció Eliminar tots i a continuació clicar al\n"
                                          + "botó Eliminar.", "Ajuda", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        controladorPresentacio.sincronitzacio_VistaBaixa_a_VistaPrincipal();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton afegir;
    private javax.swing.JTextField autor;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel icon4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JList<String> lista;
    private javax.swing.JList<String> listaelim;
    private javax.swing.JTextField titol;
    private javax.swing.JButton treure;
    // End of variables declaration//GEN-END:variables
}
