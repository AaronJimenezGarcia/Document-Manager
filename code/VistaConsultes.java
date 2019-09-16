
package PROP;

import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

public class VistaConsultes extends javax.swing.JDialog {

   CtrlPresentacio controladorPresentacio;
    String tipus;

    private void inici() {
        TFIDF.setSelected(true);
        tipus = "1";
        icon1.setVisible(false);
        icon2.setVisible(false);
        icon3.setVisible(false);
        icon4.setVisible(false);
        icon5.setVisible(false);
        icon6.setVisible(false);
        iconbool.setVisible(false);
    }
    
    private void bloqueig_contingut() {
        titol.setEditable(false);
        autor.setEditable(false);
        jButton2.setEnabled(false);
    }
    
    private void bloqueig_similars() {
        titol1.setEditable(false);
        autor2.setEditable(false);
        nombrek.setEditable(false);
        TF.setEnabled(false);
        TFIDF.setEnabled(false);
        jButton7.setEnabled(false);
    }
    
    private void bloqueig_expressio() {
        
    }
    
    private void bloqueig_rellevancia() {
        
    }
    
    private void bloqueig_anteriors() {
        
    }
    
    public VistaConsultes(CtrlPresentacio controlador) {
        controladorPresentacio = controlador;
        initComponents();
        setLocationRelativeTo(null);
        inici();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        icon1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista1 = new javax.swing.JList<>();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        titol = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        autor = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        fuente = new javax.swing.JComboBox<>();
        icon4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel8 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        icon2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lista4 = new javax.swing.JList<>();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        titol1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        autor2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        nombrek = new javax.swing.JTextField();
        TF = new javax.swing.JRadioButton();
        TFIDF = new javax.swing.JRadioButton();
        jButton7 = new javax.swing.JButton();
        icon5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jSplitPane3 = new javax.swing.JSplitPane();
        jPanel10 = new javax.swing.JPanel();
        frase = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        and = new javax.swing.JButton();
        or = new javax.swing.JButton();
        not = new javax.swing.JButton();
        consultarbool = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        iconbool = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        listabool = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSplitPane6 = new javax.swing.JSplitPane();
        jPanel16 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jPanel17 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        consultarrell = new javax.swing.JButton();
        icon6 = new javax.swing.JLabel();
        k = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        query = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        icon3 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        lista5 = new javax.swing.JList<>();
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

        lista1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lista1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lista1);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(icon1)
                        .addGap(0, 65, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icon1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(jPanel6);

        jLabel3.setText("Introdueix el títol");

        jLabel4.setText("Introdueix l'autor");

        textarea.setEditable(false);
        textarea.setColumns(20);
        textarea.setLineWrap(true);
        textarea.setRows(5);
        textarea.setWrapStyleWord(true);
        jScrollPane2.setViewportView(textarea);

        jButton2.setText("Consultar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        fuente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12", "14", "16", "18", "20" }));
        fuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuenteActionPerformed(evt);
            }
        });

        icon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prop/carga.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(titol, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                            .addComponent(autor))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(icon4))
                            .addComponent(fuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 141, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titol, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fuente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(autor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(icon4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jSplitPane1.setRightComponent(jPanel7);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Consultar contingut", jPanel1);

        jSplitPane2.setDividerLocation(250);
        jSplitPane2.setDividerSize(10);
        jSplitPane2.setOneTouchExpandable(true);

        jButton3.setText("Cerca");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PROP/carga.gif"))); // NOI18N

        lista4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lista4MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(lista4);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(icon2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icon2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane2.setLeftComponent(jPanel8);

        jLabel7.setText("Introdueix el títol");

        jLabel9.setText("Introdueix l'autor");

        jLabel10.setText("Introdueix el número de documents que vols que sortin");

        buttonGroup1.add(TF);
        TF.setText("Mètode TF");
        TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFActionPerformed(evt);
            }
        });

        buttonGroup1.add(TFIDF);
        TFIDF.setText("Mètode TFIDF");
        TFIDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFIDFActionPerformed(evt);
            }
        });

        jButton7.setText("Consultar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        icon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prop/carga.gif"))); // NOI18N

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jList1);

        jLabel1.setText("Documents similars");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7)
                        .addComponent(jLabel9)
                        .addComponent(autor2, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                        .addComponent(titol1))
                    .addComponent(TF)
                    .addComponent(TFIDF)
                    .addComponent(jLabel10)
                    .addComponent(nombrek, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(icon5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(titol1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(autor2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombrek, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TFIDF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icon5))
                        .addGap(100, 100, 100))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jScrollPane5)
                        .addGap(4, 4, 4))))
        );

        jSplitPane2.setRightComponent(jPanel9);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Consultar semblants", jPanel3);

        jSplitPane3.setDividerLocation(450);
        jSplitPane3.setDividerSize(10);

        frase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fraseKeyReleased(evt);
            }
        });

        jLabel5.setText("Introdueix la expressió");

        and.setText("AND (&)");
        and.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andActionPerformed(evt);
            }
        });

        or.setText("OR (|)");
        or.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orActionPerformed(evt);
            }
        });

        not.setText("NOT (!)");
        not.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notActionPerformed(evt);
            }
        });

        consultarbool.setText("Consultar");
        consultarbool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarboolActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        iconbool.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prop/carga.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(frase)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(not, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(and, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(or, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(consultarbool, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(iconbool)))
                        .addGap(0, 27, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel10Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {and, cancelar, not, or});

        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(frase, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(consultarbool, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(and, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(iconbool))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(or, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(not, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        jPanel10Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {and, cancelar, consultarbool, not, or});

        jSplitPane3.setLeftComponent(jPanel10);

        listabool.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaboolMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(listabool);

        jLabel6.setText("Documents que compleixen la expressió");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(244, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(95, Short.MAX_VALUE)))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(430, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                    .addContainerGap(48, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jSplitPane3.setRightComponent(jPanel11);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane3)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Consultar per expressió", jPanel4);

        jSplitPane6.setDividerSize(10);

        jPanel16.setPreferredSize(new java.awt.Dimension(444, 455));

        jLabel2.setText("Documents rellevants");

        jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList2MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jList2);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSplitPane6.setRightComponent(jPanel16);

        jPanel17.setPreferredSize(new java.awt.Dimension(449, 455));

        jLabel8.setText("Introdueix la query");

        consultarrell.setText("Consultar");
        consultarrell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarrellActionPerformed(evt);
            }
        });

        icon6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prop/carga.gif"))); // NOI18N

        k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kActionPerformed(evt);
            }
        });

        jLabel11.setText("Introdueix el número de documents que vols que sortin");

        query.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                queryKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(query)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)
                            .addComponent(k, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(consultarrell, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(icon6)))
                        .addGap(0, 165, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(query, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(k, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(consultarrell, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addContainerGap(232, Short.MAX_VALUE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(icon6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jSplitPane6.setLeftComponent(jPanel17);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane6)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane6)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Consultar per rellevància", jPanel2);

        jButton5.setText("Mostra");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PROP/carga.gif"))); // NOI18N

        lista5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lista5MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(lista5);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(icon3)
                        .addGap(0, 741, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon3)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Consultar anteriors", jPanel12);

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
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(null, "- Contingut: Primer ha d’introduir els camps de  títol i autor amb el\n"
                                          + "títol i l’autor del document que vol consultar i després clicar al botó\n"
                                          + "Consultar. D’aquesta manera sortirà el contingut del document.\n"
                                          + "- Semblants: Primer ha de escriure els camps de títol i autor amb el\n"
                                          + "títol i l’autor del document que vol consultar juntament amb el nombre\n"
                                          + "de documents màxim que vol que sortin en el camp del nombre.\n" 
                                          + "Una vegada fet això ha de seleccionar el mètode que vol utilitzar TFIDF\n"
                                          + "o TF i finalment clicar al botó Consultar.\n" 
                                          + "Com a funcionalitat addicional si es fa doble clic a un dels documents\n"
                                          + "semblants es podrà consultar el contingut d’aquest.\n"
                                          + "- Expressió booleana: L’usuari pot consultar els documents que han estat\n"
                                          + "donats d’alta i que contenen en una frase una expressió booleana que\n"
                                          + "indica l’usuari.\n" 
                                          + "Aquesta frase ha de ser d’una determinada forma:\n" 
                                          + "   - Només es poden fer servir els operadors &, | i ! (and, or i not\n"
                                          + "     respectivament) que s’han de posar mitjançant els respectius botons\n"
                                          + "     que s’ofereixen.\n" 
                                          + "   - Pot haver-hi una seqüencia de paraules posant “seqüencia” però no\n"
                                          + "     pot haver-hi els operadors dins.\n" 
                                          + "   - Pot haver-hi {} on dins hi ha d’haver un conjunt de paraules però no\n"
                                          + "     operadors.\n" 
                                          + "   - Pot haver-hi paraules soles.\n" 
                                          + "   - Pot haver-hi () amb expressions booleanes.\n" 
                                          + "Per poder fer ús d’aquesta funcionalitat, l’usuari ha de escriure al camp\n"
                                          + "de la expressió booleana la expressió mitjançant els botons AND OR i NOT.\n"
                                          + "Una vegada fet això, ha de clicar al botó Consultar i sortiran els documents.\n" 
                                          + "Com a funcionalitat addicional si es fa doble clic a un dels documents\n"
                                          + "semblants es podrà consultar el contingut d’aquest.", "Ajuda", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        controladorPresentacio.sincronitzacio_VistaConsultes_a_VistaPrincipal();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void lista5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lista5MouseClicked
        if (evt.getClickCount() == 2) // Se mira si es doble click
        {
            int posicion = lista5.locationToIndex(evt.getPoint());
            String s = lista5.getModel().getElementAt(posicion);
            StringTokenizer st = new StringTokenizer(s, "-");
            if (st.hasMoreTokens()) {
                String token = st.nextToken();
                switch(token.substring(2, 3)) {
                    case "S":
                        StringTokenizer stk = new StringTokenizer(token);
                        String aux = new String();
                        while (stk.hasMoreTokens()) {
                            if (stk.nextToken().equals("els")) {
                                aux = stk.nextToken();
                                break;
                            }
                        }
                        nombrek.setText(aux);
                        s = st.nextToken();
                        titol1.setText(s.substring(1 , s.length() - 1));
                        s = st.nextToken();
                        autor2.setText(s.substring(1, s.length()-5));
                        if (st.nextToken().equals("TF")) TF.setSelected(true);
                        else TFIDF.setSelected(true);
                        jTabbedPane1.setSelectedIndex(1);
                        java.awt.event.ActionEvent evt1 = null;
                        jButton7ActionPerformed(evt1);
                        break;
                    case "C":
                        s = st.nextToken();
                        titol.setText(s.substring(1 , s.length() - 1));
                        s = st.nextToken();
                        autor.setText(s.substring(1, s.length()));
                        jTabbedPane1.setSelectedIndex(0);
                        java.awt.event.ActionEvent evt2 = null;
                        jButton2ActionPerformed(evt2);
                        break;
                    case "R":
                        StringTokenizer stk2 = new StringTokenizer(token);
                        String aux2 = new String();
                        while (stk2.hasMoreTokens()) {
                            if (stk2.nextToken().equals("els")) {
                                aux2 = stk2.nextToken();
                                break;
                            }
                        }
                        k.setText(aux2);
                        query.setText(st.nextToken());
                        jTabbedPane1.setSelectedIndex(3);
                        java.awt.event.ActionEvent evt3 = null;
                        consultarrellActionPerformed(evt3);
                        break;
                    case "E":
                        frase.setText(st.nextToken());
                        jTabbedPane1.setSelectedIndex(2);
                        java.awt.event.ActionEvent evt4 = null;
                        consultarboolActionPerformed(evt4);
                        break;
                } 
            }
            
        }
    }//GEN-LAST:event_lista5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        final SwingWorker worker = new SwingWorker() {
            @Override
            protected Void doInBackground() throws Exception {
                try {
                    lista5.clearSelection();
                    jButton5.setEnabled(false);
                    icon3.setVisible(true);
                    ArrayList<String> consultes = controladorPresentacio.mostrarConsultesAnteriors();
                    DefaultListModel l = new DefaultListModel();
                    for (int i = 0; i < consultes.size(); i++)
                    l.addElement("+ "+consultes.get(i));
                    lista5.setModel(l);
                }
                catch (Excepcio_propia e) {
                    JOptionPane.showMessageDialog(null, e.toString().substring(22), "Informacio", JOptionPane.INFORMATION_MESSAGE);
                }
                finally {
                    jButton5.setEnabled(true);
                    icon3.setVisible(false);
                }
                return null;
            }
        };
        worker.execute();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void listaboolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaboolMouseClicked
        if (evt.getClickCount() == 2) // Se mira si es doble click
        {
            int posicion = listabool.locationToIndex(evt.getPoint());
            String s = listabool.getModel().getElementAt(posicion);
            StringTokenizer st = new StringTokenizer(s, "-");
            while(st.hasMoreTokens()) {
                s = st.nextToken();
                titol.setText(s.substring(0 , s.length() - 1));
                s = st.nextToken();
                autor.setText(s.substring(1, s.length()));
            }
            jTabbedPane1.setSelectedIndex(0);
            java.awt.event.ActionEvent evt1 = null;
            jButton2ActionPerformed(evt1);
        }
    }//GEN-LAST:event_listaboolMouseClicked

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        frase.setText("");
    }//GEN-LAST:event_cancelarActionPerformed

    private void consultarboolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarboolActionPerformed
        if (frase.getText().isEmpty()) JOptionPane.showMessageDialog(null, "Omple els camps necessaris.\n"
            + "Pots consultar l'ajuda pulsant F12", "Error", JOptionPane.WARNING_MESSAGE);
        else {
            final SwingWorker worker = new SwingWorker() {
                @Override
                protected Void doInBackground() throws Exception {
                    try {
                        iconbool.setVisible(true);

                        ArrayList<String> docs = controladorPresentacio.mostrarExpressio(frase.getText());
                        DefaultListModel l = new DefaultListModel();
                        for (int i = 0; i < docs.size(); i++)  {
                            l.addElement(docs.get(i));
                        }
                        listabool.setModel(l);

                    } catch (Excepcio_propia e) {
                        JOptionPane.showMessageDialog(null, e.toString().substring(22), "Error", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        frase.setText("");
                        iconbool.setVisible(false);
                    }
                    return null;
                }
            };
            worker.execute();
        }
    }//GEN-LAST:event_consultarboolActionPerformed

    private void notActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notActionPerformed
        frase.setText(frase.getText() + "!");
    }//GEN-LAST:event_notActionPerformed

    private void orActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orActionPerformed
        frase.setText(frase.getText() + "|");
    }//GEN-LAST:event_orActionPerformed

    private void andActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andActionPerformed
        frase.setText(frase.getText() + "&");
    }//GEN-LAST:event_andActionPerformed

    private void fraseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fraseKeyReleased
        if (evt.getKeyChar() == '&' || evt.getKeyChar() == '|' || evt.getKeyChar() == '!') {
            String s = frase.getText();
            frase.setText("");
            frase.setText(s.substring(0, s.length() - 1));
        }
    }//GEN-LAST:event_fraseKeyReleased

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        if (evt.getClickCount() == 2) // Se mira si es doble click
        {
            int posicion = jList1.locationToIndex(evt.getPoint());
            String s = jList1.getModel().getElementAt(posicion);
            StringTokenizer st = new StringTokenizer(s, "-");
            while(st.hasMoreTokens()) {
                s = st.nextToken();
                titol.setText(s.substring(0 , s.length() - 1));
                s = st.nextToken();
                autor.setText(s.substring(1, s.length()));
            }
            jTabbedPane1.setSelectedIndex(0);
            java.awt.event.ActionEvent evt1 = null;
            jButton2ActionPerformed(evt1);
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (autor2.getText().isEmpty() || nombrek.getText().isEmpty() || titol1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Omple els camps necessaris.\n"
                + "Pots consultar l'ajuda pulsant F12", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else {
            final SwingWorker worker = new SwingWorker() {
                @Override
                protected Void doInBackground() throws Exception {
                    try {
                        icon5.setVisible(true);
                        ArrayList<String> docs = controladorPresentacio.mostrarSimilars(titol1.getText(), autor2.getText(), nombrek.getText(), tipus);
                        DefaultListModel l = new DefaultListModel();
                        for (int i = 0; i < docs.size(); i++) {
                            l.addElement(docs.get(i));
                        }
                        jList1.setModel(l);
                    }
                    catch (Excepcio_propia e) {
                        JOptionPane.showMessageDialog(null, e.toString().substring(22), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    finally {
                        icon5.setVisible(false);
                        titol1.setEditable(true);
                        autor2.setEditable(true);
                        nombrek.setEditable(true);
                        TF.setEnabled(true);
                        TFIDF.setEnabled(true);
                        jButton7.setEnabled(true);
                    }
                    return null;
                }
            };
            worker.execute();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void TFIDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFIDFActionPerformed
        tipus = "1";
    }//GEN-LAST:event_TFIDFActionPerformed

    private void TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFActionPerformed
        tipus = "0";
    }//GEN-LAST:event_TFActionPerformed

    private void lista4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lista4MouseClicked
        if (evt.getClickCount() == 2) // Se mira si es doble click
        {
            int posicion = lista4.locationToIndex(evt.getPoint());
            String s = lista4.getModel().getElementAt(posicion);
            try {
                ArrayList<String> titols = controladorPresentacio.mostrarTitols(s);
                Object[] aux = titols.toArray();
                String s2 = (String) JOptionPane.showInputDialog(null, "Titols del autor", "Selecciona el títol", JOptionPane.PLAIN_MESSAGE, null, aux, titols.get(0));
                if (s2 != null){
                    titol1.setText(s2);
                    autor2.setText(s);
                }
            }
            catch (Excepcio_propia e) {
                JOptionPane.showMessageDialog(null, e.toString().substring(22), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_lista4MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        final SwingWorker worker = new SwingWorker() {
            @Override
            protected Void doInBackground() throws Exception {
                try {
                    icon2.setVisible(true);
                    ArrayList<String> autors;
                    if (autor2.getText().isEmpty()) autors = controladorPresentacio.mostrarAutors("");
                    else autors = controladorPresentacio.mostrarAutors(autor2.getText());
                    DefaultListModel l = new DefaultListModel();
                    for (int i = 0; i < autors.size(); i++)
                    l.addElement(autors.get(i));
                    lista4.setModel(l);
                }
                catch (Excepcio_propia e) {
                    JOptionPane.showMessageDialog(null, e.toString().substring(22), "Informacio", JOptionPane.INFORMATION_MESSAGE);
                }
                finally {
                    icon2.setVisible(false);
                }
                return null;
            }
        };
        worker.execute();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void fuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuenteActionPerformed
        if (fuente.getSelectedItem() == "12") textarea.setFont(textarea.getFont().deriveFont(12f));
        else if (fuente.getSelectedItem() == "14") textarea.setFont(textarea.getFont().deriveFont(14f));
        else if (fuente.getSelectedItem() == "16") textarea.setFont(textarea.getFont().deriveFont(16f));
        else if (fuente.getSelectedItem() == "18") textarea.setFont(textarea.getFont().deriveFont(18f));
        else if (fuente.getSelectedItem() == "20") textarea.setFont(textarea.getFont().deriveFont(20f));
    }//GEN-LAST:event_fuenteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (autor.getText().isEmpty() || titol.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Omple els camps necessaris.\n"
                + "Pots consultar l'ajuda pulsant F12", "Error", JOptionPane.WARNING_MESSAGE);
            autor.setText("");
            titol.setText("");
            textarea.setText("");
        }
        else {
            final SwingWorker worker = new SwingWorker() {
                @Override
                protected Void doInBackground() throws Exception {
                    try {
                        icon4.setVisible(true);
                        bloqueig_contingut();
                        ArrayList<String> contingut = controladorPresentacio.mostrarContingut(titol.getText(), autor.getText());
                        textarea.setText("");
                        for (int i = 0; i < contingut.size(); i++) {
                            textarea.append(contingut.get(i));
                        }
                        textarea.setCaretPosition(0);
                    }
                    catch (Excepcio_propia e) {
                        JOptionPane.showMessageDialog(null, e.toString().substring(22), "Error", JOptionPane.ERROR_MESSAGE);
                        titol.setText("");
                        autor.setText("");
                        textarea.setText("");
                    }
                    finally {
                        titol.setEditable(true);
                        autor.setEditable(true);
                        icon4.setVisible(false);
                        jButton2.setEnabled(true);
                        fuente.setEnabled(true);
                    }
                    return null;
                }
            };
            worker.execute();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void lista1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lista1MouseClicked
        if (evt.getClickCount() == 2) // Se mira si es doble click
        {
            int posicion = lista1.locationToIndex(evt.getPoint());
            String s = lista1.getModel().getElementAt(posicion);
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
    }//GEN-LAST:event_lista1MouseClicked

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
                    lista1.setModel(l);
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

    private void consultarrellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarrellActionPerformed
        if (query.getText().isEmpty() || k.getText().isEmpty()) JOptionPane.showMessageDialog(null, "Omple els camps necessaris.\n"
            + "Pots consultar l'ajuda pulsant F12", "Error", JOptionPane.WARNING_MESSAGE);
        else {
            final SwingWorker worker = new SwingWorker() {
                @Override
                protected Void doInBackground() throws Exception {
                    try {
                        query.setEditable(false);
                        k.setEditable(false);
                        consultarrell.setEnabled(false);
                        jList2.clearSelection();
                        icon6.setVisible(true);

                        ArrayList<String> docs = controladorPresentacio.mostrarRellevants(query.getText(), k.getText());
                        DefaultListModel l = new DefaultListModel();
                        for (int i = 0; i < docs.size(); i++)  {
                            l.addElement(docs.get(i));
                        }
                        jList2.setModel(l);

                    } catch (Excepcio_propia e) {
                        JOptionPane.showMessageDialog(null, e.toString().substring(22), "Error", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        query.setText("");
                        query.setEditable(true);
                        k.setEditable(true);
                        consultarrell.setEnabled(true);
                        icon6.setVisible(false);
                    }
                    return null;
                }
            };
            worker.execute();
        }
    }//GEN-LAST:event_consultarrellActionPerformed

    private void jList2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MouseClicked
        if (evt.getClickCount() == 2) // Se mira si es doble click
        {
            int posicion = jList2.locationToIndex(evt.getPoint());
            String s = jList2.getModel().getElementAt(posicion);
            StringTokenizer st = new StringTokenizer(s, "-");
            while(st.hasMoreTokens()) {
                s = st.nextToken();
                titol.setText(s.substring(0 , s.length() - 1));
                s = st.nextToken();
                autor.setText(s.substring(1, s.length()));
            }
            jTabbedPane1.setSelectedIndex(0);
            java.awt.event.ActionEvent evt1 = null;
            jButton2ActionPerformed(evt1);
        }
    }//GEN-LAST:event_jList2MouseClicked

    private void kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kActionPerformed

    private void queryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_queryKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_queryKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton TF;
    private javax.swing.JRadioButton TFIDF;
    private javax.swing.JButton and;
    private javax.swing.JTextField autor;
    private javax.swing.JTextField autor2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton consultarbool;
    private javax.swing.JButton consultarrell;
    private javax.swing.JTextField frase;
    private javax.swing.JComboBox<String> fuente;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel icon4;
    private javax.swing.JLabel icon5;
    private javax.swing.JLabel icon6;
    private javax.swing.JLabel iconbool;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JSplitPane jSplitPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField k;
    private javax.swing.JList<String> lista1;
    private javax.swing.JList<String> lista4;
    private javax.swing.JList<String> lista5;
    private javax.swing.JList<String> listabool;
    private javax.swing.JTextField nombrek;
    private javax.swing.JButton not;
    private javax.swing.JButton or;
    private javax.swing.JTextField query;
    private javax.swing.JTextArea textarea;
    private javax.swing.JTextField titol;
    private javax.swing.JTextField titol1;
    // End of variables declaration//GEN-END:variables
}
