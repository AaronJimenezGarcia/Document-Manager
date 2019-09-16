
package PROP;

import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

public class VistaAlta extends javax.swing.JDialog {

    CtrlPresentacio controladorPresentacio;
    
    private void inici() {
        icon1.setVisible(false);
        icon2.setVisible(false);
        desde_manual.setSelected(true);
        desde_path.setEnabled(true);
        afegir2.setEnabled(true);
        afegir1.setEnabled(false);
        path.setEnabled(false);
        seleccionar.setEnabled(false);
        titol.setEnabled(true);
        autor.setEnabled(true);
        contingut.setEnabled(true);
    }
    
    private void bloquear() {
        desde_path.setEnabled(false);
        desde_manual.setEnabled(false);
        afegir2.setEnabled(false);
        afegir1.setEnabled(false);
        if (desde_path.isSelected()) path.setEditable(false);
        seleccionar.setEnabled(false);
        if (desde_manual.isSelected()) {
            titol.setEditable(false);
            autor.setEditable(false);
            contingut.setEditable(false);
        }
    }
    
    public VistaAlta(CtrlPresentacio controlador) {
        controladorPresentacio = controlador;
        initComponents();
        setLocationRelativeTo(null);
        inici();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        desde_path = new javax.swing.JRadioButton();
        path = new javax.swing.JTextField();
        seleccionar = new javax.swing.JButton();
        afegir1 = new javax.swing.JButton();
        icon1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        desde_manual = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        titol = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        autor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        contingut = new javax.swing.JTextArea();
        afegir2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        icon2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jSplitPane1.setDividerLocation(120);
        jSplitPane1.setDividerSize(10);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane1.setOneTouchExpandable(true);

        buttonGroup1.add(desde_path);
        desde_path.setText("Afegir documents desde una carpeta");
        desde_path.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desde_pathActionPerformed(evt);
            }
        });

        seleccionar.setText("Seleccionar");
        seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarActionPerformed(evt);
            }
        });

        afegir1.setText("Afegir");
        afegir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afegir1ActionPerformed(evt);
            }
        });

        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PROP/carga.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(desde_path)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(seleccionar, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(afegir1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(icon1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {afegir1, seleccionar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desde_path)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(afegir1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {afegir1, seleccionar});

        jSplitPane1.setTopComponent(jPanel1);

        buttonGroup1.add(desde_manual);
        desde_manual.setText("Crear document");
        desde_manual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desde_manualActionPerformed(evt);
            }
        });

        jLabel2.setText("Titol");

        jLabel3.setText("Autor");

        contingut.setColumns(20);
        contingut.setRows(5);
        jScrollPane1.setViewportView(contingut);

        afegir2.setText("Afegir");
        afegir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afegir2ActionPerformed(evt);
            }
        });

        jButton4.setText("Esborrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PROP/carga.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(desde_manual)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(titol)
                            .addComponent(autor, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(afegir2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(icon2)
                        .addGap(0, 281, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {autor, titol});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {afegir2, jButton4});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desde_manual)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(titol, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addComponent(afegir2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(autor, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {autor, titol});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {afegir2, jButton4});

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

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        controladorPresentacio.sincronitzacio_VistaAlta_a_VistaPrincipal();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(null, "- L’usuari pot crear un document des de inici. Per fer-ho primer s’ha de\n"
                                          + "seleccionar la opció Crear document que per defecte ja està activada.\n"
                                          + "Una vegada fet això l’usuari ha d’introduir el títol, l’autor i el contingut\n"
                                          + "del document que vol crear. Fet això ha de fer clic al botó Afegir per a\n"
                                          + "registrar el document. Com a afegit, l’usuari pot esborrar títol, autor i\n"
                                          + "contingut clicant el botó Esborrar.\n"
                                          + "- Una altre forma de registrar documents es seleccionant aquells que ja\n"
                                          + "existeixen mitjançant la busqueda de una carpeta. Les extensions de fitxers\n"
                                          + "que s’admeten son tan sols són .txt. Per fer-ho s’ha de seleccionar a l’opció\n"
                                          + "Afegir documents des de una carpeta i a continuació clicar al botó Seleccionar\n"
                                          + "on s’ha de buscar la carpeta que conté els fitxers amb extensió .txt2. Aquests\n"
                                          + "documents, han de tenir una línia per títol, una per autor i les necessàries\n"
                                          + "per el contingut en aquest ordre. Una vegada fet això s’ha de clicar al botó Afegir.", "Ajuda", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void seleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(null);
        fc.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        int seleccio = fc.showDialog(null, "Seleccionar");
        switch(seleccio) {
            case JFileChooser.APPROVE_OPTION:
                path.setText(fc.getSelectedFile().getPath());
                break;
            case JFileChooser.CANCEL_OPTION:
                break;
        }
    }//GEN-LAST:event_seleccionarActionPerformed

    private void afegir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afegir1ActionPerformed
        if (!path.getText().isEmpty()) {
            final SwingWorker worker = new SwingWorker() {
                @Override
                protected Void doInBackground() throws Exception {
                    try {
                        bloquear();
                        icon1.setVisible(true);
                        controladorPresentacio.cargarcoleccio(path.getText());
                        JOptionPane.showMessageDialog(null, "S'han guardat correctament", "Confirmacio", JOptionPane.INFORMATION_MESSAGE);
                        
                    }
                    catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Error inesperat", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    catch (Excepcio_propia e) {
                        JOptionPane.showMessageDialog(null, e.toString().substring(22), "Informacio", JOptionPane.INFORMATION_MESSAGE);
                    }
                    finally {
                        icon1.setVisible(false);
                        seleccionar.setEnabled(true);
                        afegir1.setEnabled(true);
                        desde_manual.setEnabled(true);
                        path.setEditable(true);
                        desde_path.setEnabled(true);
                    }
                    return null;
                }    
            };
            worker.execute();
        }
        else JOptionPane.showMessageDialog(null, "Omple els camps necessaris.\n"
                + "Pots consultar l'ajuda pulsant F12", "Error", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_afegir1ActionPerformed

    private void afegir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afegir2ActionPerformed
        if (titol.getText().isEmpty() || autor.getText().isEmpty() || contingut.getText().isEmpty())
            JOptionPane.showMessageDialog(null, "Omple els camps necessaris.\n"
                + "Pots consultar l'ajuda pulsant F12", "Error", JOptionPane.WARNING_MESSAGE);
        else {
            final SwingWorker worker = new SwingWorker() {
                @Override
                protected Void doInBackground() throws Exception {
                    try {
                        bloquear();
                        icon2.setVisible(true);
                        controladorPresentacio.cargardocument(titol.getText(),
                            autor.getText(), contingut.getText());
                        JOptionPane.showMessageDialog(null, "S'ha guardat correctament", "Confirmacio", JOptionPane.INFORMATION_MESSAGE);
                    }
                    catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Error inesperat", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    catch (Excepcio_propia e) {
                        JOptionPane.showMessageDialog(null, e.toString().substring(22), "Informacio", JOptionPane.INFORMATION_MESSAGE);
                    }
                    finally {
                        icon2.setVisible(false);
                        afegir2.setEnabled(true);
                        desde_manual.setEnabled(true);
                        desde_path.setEnabled(true);
                        titol.setEditable(true);
                        autor.setEditable(true);
                        contingut.setEditable(true);
                    }
                    return null;
                }    
            };
            worker.execute();
        }
    }//GEN-LAST:event_afegir2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        titol.setText("");
        autor.setText("");
        contingut.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void desde_pathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desde_pathActionPerformed
        afegir1.setEnabled(true);
        afegir2.setEnabled(false);
        path.setEnabled(true);
        seleccionar.setEnabled(true);
        jButton4.setEnabled(false);
        titol.setEnabled(false);
        autor.setEnabled(false);
        contingut.setEnabled(false);
    }//GEN-LAST:event_desde_pathActionPerformed

    private void desde_manualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desde_manualActionPerformed
        afegir2.setEnabled(true);
        afegir1.setEnabled(false);
        jButton4.setEnabled(true);
        path.setEnabled(false);
        seleccionar.setEnabled(false);
        titol.setEnabled(true);
        autor.setEnabled(true);
        contingut.setEnabled(true);
    }//GEN-LAST:event_desde_manualActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton afegir1;
    private javax.swing.JButton afegir2;
    private javax.swing.JTextField autor;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea contingut;
    private javax.swing.JRadioButton desde_manual;
    private javax.swing.JRadioButton desde_path;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField path;
    private javax.swing.JButton seleccionar;
    private javax.swing.JTextField titol;
    // End of variables declaration//GEN-END:variables
}
