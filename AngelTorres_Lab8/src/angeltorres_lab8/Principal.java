package angeltorres_lab8;

import java.util.ArrayList;
import java.util.InputMismatchException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author angel
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        ppm_tree = new javax.swing.JPopupMenu();
        jmi_ppm_edit = new javax.swing.JMenuItem();
        jmi_ppm_delete = new javax.swing.JMenuItem();
        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cb_proyectos = new javax.swing.JComboBox<>();
        tf_proyecto_nombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cb_actividades_proy = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_actividad_nombre = new javax.swing.JTextField();
        tf_actividad_duracion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtree = new javax.swing.JTree();
        bt_actividad_add = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_temp = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        tf_actividad_retraso = new javax.swing.JTextField();
        cb_actividad_act = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        rb_pre = new javax.swing.JRadioButton();
        rb_post = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        rb_actual = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jmi_ppm_edit.setText("Modificar");
        ppm_tree.add(jmi_ppm_edit);

        jmi_ppm_delete.setText("Eliminar");
        ppm_tree.add(jmi_ppm_delete);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabs.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabsStateChanged(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jButton1.setText("Agregar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Eliminar");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tipo", "Duración", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabla);

        jButton4.setText("Ejecución Proyecto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton4)
                        .addComponent(cb_proyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(tf_proyecto_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jButton1))
                            .addGap(304, 304, 304)
                            .addComponent(jButton2)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_proyecto_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(cb_proyectos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(28, 28, 28))
        );

        tabs.addTab("Proyectos", jPanel1);

        cb_actividades_proy.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_actividades_proyItemStateChanged(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel3.setText("Duración:");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Proyecto");
        jtree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jtree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtreeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtree);

        bt_actividad_add.setText("Agregar Actividad");
        bt_actividad_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_actividad_addMouseClicked(evt);
            }
        });

        jl_temp.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(jl_temp);

        jLabel4.setText("Retraso:");

        jLabel5.setText("Tipo:");

        buttonGroup1.add(rb_pre);
        rb_pre.setText("Pre");

        buttonGroup1.add(rb_post);
        rb_post.setText("Post");

        jButton3.setText("jButton3");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        buttonGroup1.add(rb_actual);
        rb_actual.setText("Actual");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_actividad_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_actividad_add)
                            .addComponent(tf_actividad_retraso, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_actividad_act, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rb_pre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_post)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_actual))
                            .addComponent(tf_actividad_nombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(102, 102, 102)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(cb_actividades_proy, 0, 158, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_actividades_proy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(tf_actividad_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tf_actividad_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tf_actividad_retraso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(rb_pre)
                                    .addComponent(rb_post)
                                    .addComponent(rb_actual))
                                .addGap(32, 32, 32)
                                .addComponent(bt_actividad_add)
                                .addGap(38, 38, 38)
                                .addComponent(cb_actividad_act, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jButton3)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        tabs.addTab("Actividades", jPanel2);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabsStateChanged

        if (tabs.getSelectedIndex() == 0) {
            flag = 1;
        }
        if (tabs.getSelectedIndex() == 1) {
            flag = 2;
        }
    }//GEN-LAST:event_tabsStateChanged

    private void bt_actividad_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_actividad_addMouseClicked
        String nombre;
        int duracion, retraso;
        try {
            nombre = tf_actividad_nombre.getText();
            duracion = Integer.parseInt(tf_actividad_duracion.getText());
            retraso = Integer.parseInt(tf_actividad_retraso.getText());

            //Actividad a = new Actividad(nombre, duracion, 0, duracion, retraso);
            proyecto_seleccionado = (Proyecto) cb_actividades_proy.getSelectedItem();

            if (rb_pre.isSelected()) {
                proyecto_seleccionado.agregarPre(new Predecesora(nombre, duracion, 0, duracion, retraso));
                //listaPredecesora.add(new Predecesora(nombre, duracion, 0, duracion, retraso));
            }
            if (rb_post.isSelected()) {
                proyecto_seleccionado.agregarPos(new Sucesora(nombre, duracion, 0, duracion, retraso));
                //listaSucesora.add(new Sucesora(nombre, duracion, 0, duracion, retraso));

            }

            //JOptionPane.showMessageDialog(this, "Actividad agregada con éxito");
            tf_actividad_retraso.setText("");
            tf_actividad_duracion.setText("");
            tf_actividad_nombre.setText("");

        } catch (InputMismatchException e) {
            JOptionPane.showMessageDialog(this, "Ingrese sólo enteros!");
            tf_actividad_retraso.setText("");
            tf_actividad_duracion.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese sólo enteros!");
            tf_actividad_retraso.setText("");
            tf_actividad_duracion.setText("");
        }
    }//GEN-LAST:event_bt_actividad_addMouseClicked

    private void cb_actividades_proyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_actividades_proyItemStateChanged

        String tipo = "";

        if (rb_pre.isSelected()) {
            tipo = "Pre";
        }
        if (rb_post.isSelected()) {
            tipo = "Post";
        }
        if (rb_actual.isSelected()) {
            tipo = "Actual";
        }

        if (flag == 2) {

            if (evt.getStateChange() == 2) {

                proyecto_seleccionado = (Proyecto) cb_actividades_proy.getSelectedItem();

                DefaultComboBoxModel modCB = new DefaultComboBoxModel();
                //modCB = (DefaultComboBoxModel)cb_actividad_act.getModel();
                int posAct = -1;
                for (int i = 0; i < proyecto_seleccionado.getListaActividades().size(); i++) {
                    modCB.addElement(proyecto_seleccionado.getListaActividades().get(i).getNombre());
                    posAct = i;
                }
                
                cb_actividad_act.setModel(modCB);

                DefaultTreeModel m = (DefaultTreeModel) jtree.getModel();

                DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();

                raiz.removeAllChildren();

                /*
                
                if (tipo.equals("Pre")) {
                    for (int i = 0; i < raiz.getChildCount(); i++) {
                        if (raiz.getChildAt(i).toString().equals("Pre")) {
                            DefaultMutableTreeNode pre = new DefaultMutableTreeNode("Test Pre");
                            ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(pre);
                        }
                    }
                }

                if (tipo.equals("Post")) {
                    for (int i = 0; i < raiz.getChildCount(); i++) {
                        if (raiz.getChildAt(i).toString().equals("Post")) {
                            DefaultMutableTreeNode post = new DefaultMutableTreeNode("Test Post");
                            ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(post);
                        }
                    }
                }
                m.reload();
                
                int ct = 0;

                for (Actividad su : listaProyectos.get(ct).getListaActividades()) {

                    if (su instanceof Sucesora) {
                        for (int i = 0; i < raiz.getChildCount(); i++) {
                            DefaultMutableTreeNode n
                                    = new DefaultMutableTreeNode();
                            ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(n);
                            System.out.println("hola");
                        }

                    }

                    m.reload();
                    ct++;
                }
                 */
                for (int i = 0; i < 1; i++) {
                    //DefaultMutableTreeNode proyectos = new DefaultMutableTreeNode(proyecto_seleccionado.getNombre());
                    DefaultMutableTreeNode ss = new DefaultMutableTreeNode("Sucesora");
                    DefaultMutableTreeNode pp = new DefaultMutableTreeNode("Predecesora");

                    for (int j = 0; j < proyecto_seleccionado.getListaActividades().size(); j++) {
                        //DefaultMutableTreeNode n = new DefaultMutableTreeNode("Sucesora");
                        
                        for (Actividad ac : proyecto_seleccionado.getListaActividades()) {
                            if(ac instanceof Predecesora){
                                DefaultMutableTreeNode ll = new DefaultMutableTreeNode(proyecto_seleccionado.getListaActividades().get(j));
                                ss.add(ll);
                                System.out.println("pros");
                            }
                            if(ac instanceof Sucesora){
                                DefaultMutableTreeNode ll = new DefaultMutableTreeNode(proyecto_seleccionado.getListaActividades().get(j));
                                pp.add(ll);
                                System.out.println("Sus");
                            }
                            
                            
                        }
                        //DefaultMutableTreeNode pre = new DefaultMutableTreeNode("Predecesora");
                        //n.add(sus);
                        //n.add(pre);
                        
                        /*
                        for (int jj = 0; jj < raiz.getChildCount(); jj++) {
                            if (raiz.getChildAt(jj).toString().equals("Sucesora")) {
                                for (int k = 0; k < proyecto_seleccionado.getListaActividades().get(j).getPreActividad().size(); k++) {
                                    //DefaultMutableTreeNode pre1 = new DefaultMutableTreeNode();
                                    //pre1.add(new DefaultMutableTreeNode(proyecto_seleccionado.getListaActividades().get(k).getPreActividad().get(k)));
                                    //pre.add(pre1);
                                    //((DefaultMutableTreeNode) raiz.getChildAt(i)).add(new DefaultMutableTreeNode(proyecto_seleccionado.getListaActividades().get(k).getPreActividad().get(k)));
                                    //ss.add(ll);
                                }

                                for (int kk = 0; kk < proyecto_seleccionado.getListaActividades().get(j).getPostActividad().size(); kk++) {
                                    ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(new DefaultMutableTreeNode(proyecto_seleccionado.getListaActividades().get(kk).getPostActividad().get(kk)));

                                }
                            }
                        }
                        */

                        

                        //proyectos.add(n);
                    }
                    raiz.add(ss);
                    raiz.add(pp);
                }

                /*
                for (Actividad a : proyecto_seleccionado.getListaActividades()) {
                    

                    if (a instanceof Sucesora) {
                        for (int i = 0; i < raiz.getChildCount(); i++) {
                            if (raiz.getChildAt(i).toString().equals("Sucesora")) {
                                DefaultMutableTreeNode p = new DefaultMutableTreeNode(a.getNombre());
                                ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(p);
                                centinela = 1;
                                raiz.add(p);
                            }
                        }
                    }

                }*/
                m.reload();

                DefaultListModel l = new DefaultListModel();
                l.addElement(proyecto_seleccionado.getNombre());
                jl_temp.setModel(l);
            }
        }
    }//GEN-LAST:event_cb_actividades_proyItemStateChanged

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        String nombre;

        try {
            nombre = tf_proyecto_nombre.getText();
            Proyecto p = new Proyecto(nombre, 0);

            listaProyectos.add(p);

            DefaultComboBoxModel modeloCB_p = (DefaultComboBoxModel) cb_proyectos.getModel();
            modeloCB_p.addElement(p);
            DefaultComboBoxModel modeloCB_p2 = (DefaultComboBoxModel) cb_actividades_proy.getModel();
            modeloCB_p2.addElement(p);

            //JOptionPane.showMessageDialog(this, "Agregado con éxito");
            tf_proyecto_nombre.setText("");

        } catch (InputMismatchException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un valor correcto!");
            tf_proyecto_nombre.setText("");
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jtreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtreeMouseClicked
        if (evt.isMetaDown()) {

            int row = jtree.getClosestRowForLocation(evt.getX(), evt.getY());

            jtree.setSelectionRow(row);

            Object v1 = jtree.getSelectionPath().getLastPathComponent();
            nodo_seleccionado = (DefaultMutableTreeNode) v1;
            System.out.println("siii");

            if (nodo_seleccionado.getUserObject() instanceof Actividad) {

                actividad_pre = (Predecesora) nodo_seleccionado.getUserObject();
                ppm_tree.show(evt.getComponent(), evt.getX(), evt.getY());
            }
            if (nodo_seleccionado.getUserObject() instanceof Sucesora) {
                System.out.println("nooo");
                actividad_pos = (Sucesora) nodo_seleccionado.getUserObject();
                ppm_tree.show(evt.getComponent(), evt.getX(), evt.getY());
            }

        }
    }//GEN-LAST:event_jtreeMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        DefaultComboBoxModel m2 = (DefaultComboBoxModel) cb_actividad_act.getModel();
        Actividad act = ((Actividad) m2.getSelectedItem());

        if (act.getPreActividad().isEmpty()) {
            act.setInicio(1);
            act.setFinalTemprano(act.getInicio() + act.getDuracion());
        } else {
            int m = -1;
            for (int i = 0; i < act.getPreActividad().size(); i++) {
                for (int j = 0; j < act.getPreActividad().size(); j++) {
                    if (act.getPreActividad().get(i).getRetraso() > act.getPreActividad().get(j).getRetraso()) {
                        m = act.getPreActividad().get(i).getRetraso();
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_actividad_add;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb_actividad_act;
    private javax.swing.JComboBox<String> cb_actividades_proy;
    private javax.swing.JComboBox<String> cb_proyectos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> jl_temp;
    private javax.swing.JMenuItem jmi_ppm_delete;
    private javax.swing.JMenuItem jmi_ppm_edit;
    private javax.swing.JTree jtree;
    private javax.swing.JPopupMenu ppm_tree;
    private javax.swing.JRadioButton rb_actual;
    private javax.swing.JRadioButton rb_post;
    private javax.swing.JRadioButton rb_pre;
    private javax.swing.JTable tabla;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTextField tf_actividad_duracion;
    private javax.swing.JTextField tf_actividad_nombre;
    private javax.swing.JTextField tf_actividad_retraso;
    private javax.swing.JTextField tf_proyecto_nombre;
    // End of variables declaration//GEN-END:variables

    int posi = 0;

    int flag = 0;
    ArrayList<Proyecto> listaProyectos = new ArrayList();

    ArrayList<Sucesora> listaSucesora = new ArrayList();
    ArrayList<Predecesora> listaPredecesora = new ArrayList();

    Proyecto proyecto_seleccionado;
    DefaultMutableTreeNode nodo_seleccionado;
    Actividad actividad_selected;
    Predecesora actividad_pre;
    Sucesora actividad_pos;
}
