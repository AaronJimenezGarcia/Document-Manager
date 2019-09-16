
package PROP;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

public class VistaModificacions extends javax.swing.JDialog {

    String titol_ant;
    String autor_ant;
    String contingut_ant;
    CtrlPresentacio controladorPresentacio;
    
    private void bloquear() {
        titol.setEditable(false);
        autor.setEditable(false);
        jTextArea1.setEditable(false);
        jButton2.setEnabled(false);
        guardar.setEnabled(false);
        jButton4.setEnabled(false);
        jRadioButton1.setEnabled(false);
        jRadioButton2.setEnabled(false);
        jRadioButton3.setEnabled(false);
    }
    
    private void inici() {
        icon1.setVisible(false);
        icon2.setVisible(false);
        titol.setEnabled(true);
        autor.setEnabled(true);
        jTextArea1.setEditable(false);
        jRadioButton1.setEnabled(true);
        jRadioButton1.setSelected(true);
        jRadioButton2.setEnabled(true);
        jRadioButton3.setEnabled(true);
        guardar.setEnabled(false);
        jButton4.setEnabled(false);
        jButton2.setEnabled(true);
    }
    
    public VistaModificacions(CtrlPresentacio controlador) {
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
        jButton1 = new javax.swing.JButton();
        icon1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        titol = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        autor = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        icon2 = new javax.swing.JLabel();
        fuente = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
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

        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PROP/carga.gif"))); // NOI18N

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
                        .addComponent(icon1)
                        .addGap(0, 73, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icon1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jLabel3.setText("Introdueix el títol");

        jLabel4.setText("Introdueix l'autor");

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea1);

        jButton2.setText("Canviar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        guardar.setText("Guardar canvis");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PROP/carga.gif"))); // NOI18N

        fuente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12", "14", "16", "18", "20" }));
        fuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuenteActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Canviar títol");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Canviar autor");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Canviar contingut");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titol, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(autor))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton1)
                            .addComponent(fuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(icon2)))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {guardar, jButton2, jButton4});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(titol, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addComponent(jLabel4))
                            .addComponent(icon2))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(autor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(fuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {guardar, jButton2, jButton4});

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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(null, "- Modificar títol: Primer s’haurà de seleccionar l’opció Canviar títol,\n"
                                          + "posar el títol i l’autor del document i a continuació clicar al botó Canviar.\n"
                                          + "Una vegada fet això, només serà possible escriure al camp de títol on s’haurà\n"
                                          + "de posar el nou títol que es vol que tingui el document. Finalment, s’ha de\n"
                                          + "polsar al botó Guardar canvis i s’haurà realitzat la modificació.\n"
                                          + "- Modificar autor: Primer s’haurà de seleccionar l’opció Canviar autor, posar\n"
                                          + " el títol i l’autor del document i a continuació clicar al botó Canviar. Una\n"
                                          + "vegada fet això, només serà possible escriure al camp de l’autor, on s’haurà de\n"
                                          + "posar el nou autor que es vol que tingui el document. Finalment, s’ha de polsar\n"
                                          + "al botó de Guardar canvis i s’haurà realitzat la modificació.\n"
                                          + "- Modificar contingut: Primer s’haurà de seleccionar l’opció Canviar contingut,\n"
                                          + "posar el títol i l’autor del document i a continuació clicar al botó Canviar. Una\n"
                                          + "vegada fet això, només serà possible escriure al camp del contingut, on s’haurà\n"
                                          + "de posar el nou contingut que es vol que tingui el document. Finalment, s’ha de\n"
                                          + "polsar al botó de Guardar canvis i s’haurà realitzat la modificació.\n" 
                                          + "Com a facilitat per a l’usuari s’ha afegit una mida de la font per poder veure\n"
                                          + "millor el contingut que es vol escriure i el que hi havia abans.", "Ajuda", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        final SwingWorker worker = new SwingWorker() {
            @Override
            protected Void doInBackground() throws Exception {
                try {
                    icon1.setVisible(true);
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
                    icon1.setVisible(false);
                }
                return null;
            }
        };
        worker.execute();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (autor.getText().isEmpty() || titol.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Omple els camps necessaris.\n"
                    + "Pots consultar l'ajuda pulsant F12", "Error", JOptionPane.WARNING_MESSAGE);
            autor.setText("");
            titol.setText("");
            jTextArea1.setText("");
        }
        else {
            final SwingWorker worker = new SwingWorker() {
                @Override
                protected Void doInBackground() throws Exception {
                    try {
                        icon2.setVisible(true);
                        bloquear();
                        if (jRadioButton3.isSelected()){
                            ArrayList<String> contingut = controladorPresentacio.mostrarContingut(titol.getText(), autor.getText());
                            jTextArea1.setText("");
                            for (int i = 0; i < contingut.size(); i++) {
                                jTextArea1.append(contingut.get(i));
                            }
                            jTextArea1.setCaretPosition(0);
                            contingut_ant = jTextArea1.getText();
                        }
                        
                        titol_ant = titol.getText();
                        autor_ant = autor.getText();
                        if (jRadioButton1.isSelected()) titol.setEditable(true);
                        else if (jRadioButton2.isSelected()) autor.setEditable(true);
                        else jTextArea1.setEditable(true);
                        jButton4.setEnabled(true);
                        guardar.setEnabled(true);
                    }
                    catch (Excepcio_propia e) {
                        JOptionPane.showMessageDialog(null, e.toString().substring(22), "Error", JOptionPane.ERROR_MESSAGE);
                        jButton2.setEnabled(true);
                        titol.setEditable(true);
                        autor.setEditable(true);
                        jTextArea1.setText("");
                        titol.setText("");
                        autor.setText("");
                    }
                    finally {
                        icon2.setVisible(false);
                    }
                    return null;
                }
            };
            worker.execute();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        final SwingWorker worker = new SwingWorker() {
            @Override
            protected Void doInBackground() throws Exception {
                try {
                    bloquear();
                    icon2.setVisible(true);
                    if (jRadioButton1.isSelected()) {
                        controladorPresentacio.canviarTitol(titol_ant, autor_ant, titol.getText());
                    }
                    else if (jRadioButton2.isSelected()) {
                        controladorPresentacio.canviarAutor(titol_ant, autor_ant, autor.getText());
                    }
                    else {
                        controladorPresentacio.canviarContingut(titol_ant, autor_ant, jTextArea1.getText());
                    }
                    JOptionPane.showMessageDialog(null, "S'ha canviat correctament", "Confirmacio", JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Excepcio_propia e) {
                    JOptionPane.showMessageDialog(null, e.toString().substring(22), "Error", JOptionPane.ERROR_MESSAGE);
                }
                catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error inesperat", "Error", JOptionPane.ERROR_MESSAGE);
                }
                finally {
                    jButton2.setEnabled(true);
                    titol.setEditable(true);
                    autor.setEditable(true);
                    jTextArea1.setText("");
                    titol.setText("");
                    autor.setText("");
                    icon2.setVisible(false);
                    jRadioButton1.setEnabled(true);
                    jRadioButton2.setEnabled(true);
                    jRadioButton3.setEnabled(true);
                    jRadioButton1.setSelected(false);
                    jRadioButton2.setSelected(false);
                    jRadioButton3.setSelected(false);
                }
                return null;
            }
        };
        worker.execute();
    }//GEN-LAST:event_guardarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        titol.setText("");
        autor.setText("");
        jTextArea1.setText("");
        titol.setEditable(true);
        autor.setEditable(true);
        jRadioButton1.setEnabled(true);
        jRadioButton2.setEnabled(true);
        jRadioButton3.setEnabled(true);
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jTextArea1.setEditable(false);
        guardar.setEnabled(false);
        jButton2.setEnabled(true);
        jButton4.setEnabled(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseClicked
        if (evt.getClickCount() == 2) // Se mira si es doble click
        {
            int posicion = lista.locationToIndex(evt.getPoint());
            String s = lista.getModel().getElementAt(posicion);
            try {
                ArrayList<String> titols = controladorPresentacio.mostrarTitols(s);
                Object[] aux = titols.toArray();
                String s2 = (String) JOptionPane.showInputDialog(null, "Titols del autor", "Selecciona el títol", JOptionPane.PLAIN_MESSAGE, null, aux, titols.get(0));
                if (s2 != null){
                    titol.setText(s2);
                    autor.setText(s);
                }
            }
            catch (Excepcio_propia e) {
                JOptionPane.showMessageDialog(null, e.toString().substring(22), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_listaMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        controladorPresentacio.sincronitzacio_VistaModificacio_a_VistaPrincipal();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void fuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuenteActionPerformed
        if (fuente.getSelectedItem() == "12") jTextArea1.setFont(jTextArea1.getFont().deriveFont(12f));
        else if (fuente.getSelectedItem() == "14") jTextArea1.setFont(jTextArea1.getFont().deriveFont(14f));
        else if (fuente.getSelectedItem() == "16") jTextArea1.setFont(jTextArea1.getFont().deriveFont(16f));
        else if (fuente.getSelectedItem() == "18") jTextArea1.setFont(jTextArea1.getFont().deriveFont(18f));
        else if (fuente.getSelectedItem() == "20") jTextArea1.setFont(jTextArea1.getFont().deriveFont(20f));
    }//GEN-LAST:event_fuenteActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jButton2.setEnabled(true);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jButton2.setEnabled(true);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        jButton2.setEnabled(true);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField autor;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> fuente;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JList<String> lista;
    private javax.swing.JTextField titol;
    // End of variables declaration//GEN-END:variables
}
