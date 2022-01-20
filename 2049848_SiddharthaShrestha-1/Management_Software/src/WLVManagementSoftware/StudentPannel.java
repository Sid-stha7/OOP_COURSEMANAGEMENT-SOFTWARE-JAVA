/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVManagementSoftware;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.sql.*;
import java.util.Vector;


public class StudentPannel extends javax.swing.JFrame {

    public StudentPannel() {
        initComponents();
        showIns1();
        showIns2();
    }


    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bitPane6 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        l4c1 = new javax.swing.JCheckBox();
        l4c2 = new javax.swing.JCheckBox();
        l4c3 = new javax.swing.JCheckBox();
        l4c4 = new javax.swing.JCheckBox();
        l4c5 = new javax.swing.JCheckBox();
        l4c6 = new javax.swing.JCheckBox();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        bl4Feild1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        bl4Field2 = new javax.swing.JTextField();
        bl4Button = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        l5c1 = new javax.swing.JCheckBox();
        l5c2 = new javax.swing.JCheckBox();
        l5c3 = new javax.swing.JCheckBox();
        l5c4 = new javax.swing.JCheckBox();
        l5c5 = new javax.swing.JCheckBox();
        l5c6 = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        bl5Button = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        bl5Field1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        bl5Field2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        l6c1 = new javax.swing.JCheckBox();
        l6c3 = new javax.swing.JCheckBox();
        l6c2 = new javax.swing.JCheckBox();
        l6c4 = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        l6c5 = new javax.swing.JCheckBox();
        l6c6 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        bl6Button = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        bl6Field1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bl6Field2 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bbaPane = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        b4c1 = new javax.swing.JCheckBox();
        b4c2 = new javax.swing.JCheckBox();
        b4c3 = new javax.swing.JCheckBox();
        b4c4 = new javax.swing.JCheckBox();
        bl4c5 = new javax.swing.JCheckBox();
        bl4c6 = new javax.swing.JCheckBox();
        bba4Button = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        bba4Field1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        bba4Field2 = new javax.swing.JTextField();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTable14 = new javax.swing.JTable();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTable15 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        bl5c1 = new javax.swing.JCheckBox();
        bl5c2 = new javax.swing.JCheckBox();
        bl5c3 = new javax.swing.JCheckBox();
        bl5c4 = new javax.swing.JCheckBox();
        bl5c5 = new javax.swing.JCheckBox();
        bl5c6 = new javax.swing.JCheckBox();
        bba5Button = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        bba5Field1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        bbaField2 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        bl6c1 = new javax.swing.JCheckBox();
        bl6c2 = new javax.swing.JCheckBox();
        bl6c3 = new javax.swing.JCheckBox();
        bl6c4 = new javax.swing.JCheckBox();
        bl6c5 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        bba6Button = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        bba6Field1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        bba6Field2 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable13 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enrollment");

        l4c1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        l4c1.setText("4CI018: Academic Skills and Team Based Learning");





        l4c2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        l4c2.setText("4CS001: Introductory Programming and Problem Solving");

        l4c3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        l4c3.setText("4CS015: Fundamentals of Computing");

        l4c4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        l4c4.setText("4CS016: Embedded System Programming");
//        l4c4.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                l4c4ActionPerformed(evt);
//            }
//        });

        l4c5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        l4c5.setText("4CS017: Internet Software Architecture");
//        l4c5.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                l4c5ActionPerformed(evt);
//            }
//        });

        l4c6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        l4c6.setText("4MM013: Computational Mathematics");
//        l4c6.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                l4c6ActionPerformed(evt);
//            }
//        });

        jTable5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"4CI018: Academic Skills and Team Based Learning"},
                        {"4CS001: Introductory Programming and Problem Solving"},
                        {"4CS015: Fundamentals of Computing"},
                        {"4CS016: Embedded System Programming"},
                        {"4CS017: Internet Software Architecture"},
                        {"4MM013: Computational Mathematics"},
                        {null},
                        {null}
                },
                new String [] {
                        "Modules"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable5);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(0).setResizable(false);
        }

        jTable6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"DR Raj Pd Shrestha"},
                        {"DR Raj Pd Shrestha"},
                        {"DR Raj Pd Shrestha"},
                        {"DR Raj Pd Shrestha"},
                        {"DR Raj Pd Shrestha"},
                        {"DR Raj Pd Shrestha"},
                        {null},
                        {null},
                        {null},
                        {null}
                },
                new String [] {
                        "Tutors"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable6);
        if (jTable6.getColumnModel().getColumnCount() > 0) {
            jTable6.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Full name: ");

        bl4Feild1.setText("Full Name");
//        bl4Feild1.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                bl4Feild1ActionPerformed(evt);
//            }
//        });

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("Id:");

        bl4Field2.setText("id");

        bl4Button.setText("Enroll");
        bl4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bl4ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(l4c3, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(jLabel10)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(bl4Feild1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(71, 71, 71)
                                                                                .addComponent(jLabel11))
                                                                        .addComponent(l4c1))
                                                                .addGap(30, 30, 30)
                                                                .addComponent(bl4Field2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(l4c2, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(l4c6)
                                                        .addComponent(l4c4)
                                                        .addComponent(l4c5))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(66, 66, 66))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(bl4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(262, 262, 262))))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(bl4Feild1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11)
                                        .addComponent(bl4Field2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addComponent(l4c1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l4c2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l4c3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l4c4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l4c5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l4c6)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(bl4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(868, Short.MAX_VALUE))
        );

        bitPane6.addTab("Level 4", jPanel2);

        l5c1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        l5c1.setText("5CS037: Concepts and Technologies of AI");

        l5c2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        l5c2.setText("5CS019: Object-Oriented Design and Programming");

        l5c3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        l5c3.setText("5CS021: Numerical Methods and Concurrency");

        l5c4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        l5c4.setText("5CS022: Distributed and Cloud System Programming");

        l5c5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        l5c5.setText("5CS024: Collaborative Development");

        l5c6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        l5c6.setText("5CS020: Human Computer Interaction");

        jTable3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"5CS037: Concepts and Technologies of AI"},
                        {"5CS019: Object-Oriented Design and Programming"},
                        {"5CS021: Numerical Methods and Concurrency"},
                        {"5CS022: Distributed and Cloud System Programming"},
                        {"5CS024: Collaborative Development"},
                        {" 5CS020: Human Computer Interaction"},
                        {null}
                },
                new String [] {
                        "Modules"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
        }

        jTable4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"ER Deepson Shrestha"},
                        {"ER Deepson Shrestha"},
                        {"ER Deepson Shrestha"},
                        {"ER Deepson Shrestha"},
                        {"ER Deepson Shrestha"},
                        {"ER Deepson Shrestha"},
                        {null},
                        {null}
                },
                new String [] {
                        "Tutors"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setResizable(false);
        }

        bl5Button.setText("Enroll");
        bl5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bl5ButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Full Name:");

        bl5Field1.setText("Full Name");

        jLabel9.setText("Id:");

        bl5Field2.setText("Id");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(l5c2)
                                                                .addComponent(l5c1)
                                                                .addComponent(l5c3)
                                                                .addComponent(l5c4)
                                                                .addComponent(l5c5)
                                                                .addComponent(l5c6)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(56, 56, 56)
                                                .addComponent(jLabel8)
                                                .addGap(37, 37, 37)
                                                .addComponent(bl5Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(93, 93, 93)
                                                .addComponent(jLabel9)
                                                .addGap(18, 18, 18)
                                                .addComponent(bl5Field2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bl5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(262, 262, 262))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(bl5Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9)
                                        .addComponent(bl5Field2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addComponent(l5c1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l5c2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l5c3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l5c4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l5c5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l5c6)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(bl5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(885, Short.MAX_VALUE))
        );

        bitPane6.addTab("Level 5", jPanel1);

        l6c1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        l6c1.setText("6CS014: Complex System ");

        l6c3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        l6c3.setText("6CS005: High Performance Computing ");

        l6c2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        l6c2.setText("6CS012: Artificial Intelligence and Machine Learning");

        l6c4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        l6c4.setText("6CS030: Big Data ");
//        l6c4.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                l6c4ActionPerformed(evt);
//            }
//        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Optional Modules");

        l6c5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        l6c5.setText("Robotic engineering");
//        l6c5.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                l6c5ActionPerformed(evt);
//            }
//        });

        l6c6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        l6c6.setText("6CS007: Project and Professionalism");
//        l6c6.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                l6c6ActionPerformed(evt);
//            }
//        });

        jTable1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"6CS014: Complex System"},
                        {"6CS005: High Performance Computing"},
                        {"6CS007: Project and Professionalism"},
                        {"6CS012: Artificial Intelligence and Machine Learning"},
                        {"6CS030: Big Data"},
                        {"6CS077: Robotics"},
                        {null}
                },
                new String [] {
                        "Modules"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        jTable2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"ER Hemanga Gautam"},
                        {"ER Hemanga Gautam"},
                        {"ER Hemanga Gautam"},
                        {"ER Hemanga Gautam"},
                        {"ER Hemanga Gautam"},
                        {"ER Hemanga Gautam"},
                        {null}
                },
                new String [] {
                        "Tutors"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
        }

        bl6Button.setText("Enroll");
        bl6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bl6ButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Full name :");

        bl6Field1.setText("Full Name");
//        bl6Field1.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                bl6Field1ActionPerformed(evt);
//            }
//        });

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("ID:");

        bl6Field2.setText("Id");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(l6c1)
                                        .addComponent(l6c3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(l6c4)
                                        .addComponent(l6c2)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(36, 36, 36)
                                                .addComponent(bl6Field2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(l6c5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(l6c6)
                                .addGap(84, 84, 84))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(bl6Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(292, 292, 292))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(29, 29, 29))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(bl6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(230, 230, 230))))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(bl6Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7)
                                        .addComponent(bl6Field2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(l6c1)
                                        .addComponent(l6c2))
                                .addGap(7, 7, 7)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(l6c3)
                                        .addComponent(l6c4))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(l6c5)
                                        .addComponent(l6c6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(47, 47, 47)
                                .addComponent(bl6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(870, Short.MAX_VALUE))
        );

        bitPane6.addTab("Level 6", jPanel3);

        jLabel18.setText("Full Name:");

        jLabel19.setText("ID");

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel20.setText("Module 1");

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel21.setText("Module 2");

        jLabel22.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel22.setText("Moduel3");

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel23.setText("Module 4");

        jLabel24.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel24.setText("Module5");

        jLabel25.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel25.setText("Module6");

        jTextField1.setText("Name");


        jTextField2.setText("id");

        jTextField3.setText("Module ");

        jTextField4.setText("Module ");

        jTextField6.setText("Module ");

        jTextField7.setText("Module ");

        jButton3.setText("Enroll");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jTextField8.setText("Module ");

        jTextField5.setText("Module ");

        jButton4.setText("View Updated Courses");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane10.setViewportView(jTable10);

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("View the courses and then add accordingly");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGap(261, 261, 261)
                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel18)
                                                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabel24)
                                                                                .addComponent(jLabel21)
                                                                                .addComponent(jLabel20)))
                                                                .addGap(36, 36, 36)
                                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(47, 47, 47)
                                                                                .addComponent(jLabel19)
                                                                                .addGap(35, 35, 35)
                                                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(36, 36, 36)
                                                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(33, 33, 33)
                                                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                        .addComponent(jLabel22)
                                                                                                        .addComponent(jLabel23))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                                                                .addComponent(jLabel25)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel19)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel22)
                                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel20)))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel21)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel23))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel24)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel25))
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 761, Short.MAX_VALUE)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
        );

        bitPane6.addTab("Updated Courses", jPanel7);

        jButton5.setText("Refresh");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTable12.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Id", "Instructor", "Module Assigned"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane12.setViewportView(jTable12);
        if (jTable12.getColumnModel().getColumnCount() > 0) {
            jTable12.getColumnModel().getColumn(0).setResizable(false);
            jTable12.getColumnModel().getColumn(1).setResizable(false);
            jTable12.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGap(227, 227, 227)
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(834, Short.MAX_VALUE))
        );

        bitPane6.addTab("Instructors", jPanel8);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("BIT");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("BBA");

        b4c1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        b4c1.setText("4IB004: Business in a Global Context");


        b4c2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        b4c2.setText("4MK007: Principles of Marketing");
        b4c3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        b4c3.setText("4MK006: Introduction to Brand Communication");
        b4c4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        b4c4.setText("4HR002: Introduction to People at work");
        bl4c5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        bl4c5.setText("4AC013: Financial Management");
        bl4c6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18Nbl4c6.setText("4HR017: Diversity Management in a Global Context");

        bba4Button.setText("Enroll");
        bba4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bba4ButtonActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setText("Full name:");

        bba4Field1.setText("Full Name");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setText("Id:");

        bba4Field2.setText("id");

        jTable14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable14.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"4IB004: Business in a Global Context"},
                        {"4MK007: Principles of Marketing"},
                        {"4MK006: Introduction to Brand Communication"},
                        {"4HR002: Introduction to People at work"},
                        {"4AC013: Financial Management"},
                        {null},
                        {null}
                },
                new String [] {
                        "Modules"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane14.setViewportView(jTable14);

        jTable15.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable15.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"Hariram Chaudhary"},
                        {"Hariram Chaudhary"},
                        {"Hariram Chaudhary"},
                        {"Hariram Chaudhary"},
                        {"Hariram Chaudhary"},
                        {"Hariram Chaudhary"},
                        {null},
                        {null}
                },
                new String [] {
                        "Tutors"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane15.setViewportView(jTable15);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(35, 35, 35)
                                                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(b4c3)
                                        .addComponent(b4c2)
                                        .addComponent(b4c1)
                                        .addComponent(bl4c5)
                                        .addComponent(bl4c6)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(bba4Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(76, 76, 76)
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(bba4Field2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(b4c4))
                                .addContainerGap(183, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bba4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(296, 296, 296))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(bba4Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13)
                                        .addComponent(bba4Field2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addComponent(b4c1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b4c2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b4c3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b4c4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bl4c5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bl4c6)
                                .addGap(34, 34, 34)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(bba4Button)
                                .addContainerGap(290, Short.MAX_VALUE))
        );

        bbaPane.addTab("Level 4", jPanel5);

        bl5c1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        bl5c1.setText("5FC003: International Financial Institutions and Market");



        bl5c2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        bl5c2.setText("5IB004: Economics of Managerial Decision-Making");

        bl5c3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        bl5c3.setText("5IB005: Contemporary Issues in IBM");

        bl5c4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        bl5c4.setText("5BU010: Digital Business and Innovation");

        bl5c5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        bl5c5.setText("5BU012: Operations and Supply Management");

        bl5c6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        bl5c6.setText("5HR006: International Human Resources – The Key Issues");

        bba5Button.setText("Enroll");
        bba5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bba5ButtonActionPerformed(evt);
            }
        });

        jTable7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable7.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"5FC003: International Financial Institutions and Market"},
                        {"5IB004: Economics of Managerial Decision-Making"},
                        {"5IB005: Contemporary Issues in IBM"},
                        {"5BU010: Digital Business and Innovation"},
                        {"5BU012: Operations and Supply Management"},
                        {"5HR006: International Human Resources – The Key Issues"},
                        {null},
                        {null}
                },
                new String [] {
                        "Modules"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jTable7);
        if (jTable7.getColumnModel().getColumnCount() > 0) {
            jTable7.getColumnModel().getColumn(0).setResizable(false);
        }

        jTable8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable8.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"Sachit Man Serchan"},
                        {"Sachit Man Sercha"},
                        {"Sachit Man Serchan"},
                        {"Sachit Man Serchan"},
                        {"Sachit Man Serchan "},
                        {"Sachit Man Serchan "},
                        {null},
                        {null}
                },
                new String [] {
                        "Tutors"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(jTable8);
        if (jTable8.getColumnModel().getColumnCount() > 0) {
            jTable8.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel16.setText("Full Name: ");

        bba5Field1.setText("Full Name");

        jLabel17.setText("Id:");

        bbaField2.setText("id");
//        bbaField2.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                bbaField2ActionPerformed(evt);
//            }
//        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(bl5c6)
                                                        .addComponent(bl5c5)
                                                        .addComponent(bl5c4)
                                                        .addComponent(bl5c3)
                                                        .addComponent(bl5c2)
                                                        .addComponent(bl5c1))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(bba5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(100, 100, 100))))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bba5Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(bbaField2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel16)
                                                        .addComponent(bba5Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(bbaField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel17)))
                                .addGap(18, 18, 18)
                                .addComponent(bl5c1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bl5c2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bl5c3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bl5c4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bl5c5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bl5c6)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(bba5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(328, Short.MAX_VALUE))
        );

        bbaPane.addTab("Level 5", jPanel6);

        bl6c1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        bl6c1.setText("6IB003: Dynamics of Multinational Companies");

        bl6c2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        bl6c2.setText("6BU013: Independent Project");

        bl6c3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        bl6c3.setText("6IB011: Business Research Methods");

        bl6c4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        bl6c4.setText("6BE003: Strategic Management");

        bl6c5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        bl6c5.setText("6MK001: International Marketing");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Optional Modules");

        bba6Button.setText("Enroll");
        bba6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bba6ButtonActionPerformed(evt);
            }
        });

        jLabel14.setText("Full Name:");

        bba6Field1.setText("Full Name");

        jLabel15.setText("Id:");

        jTable9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable9.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"6IB003: Dynamics of Multinational Companies"},
                        {"6IB006: Debating Globalisation"},
                        {"6IB011: Business Research Methods"},
                        {"6MK001: International Marketing"},
                        {"6BE003: Strategic Management"},
                        {"6BU013: Independent Project"},
                        {null},
                        {null}
                },
                new String [] {
                        "Modules"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(jTable9);

        jTable11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable11.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"Junu Hada"},
                        {"Junu Hada"},
                        {"Junu Hada"},
                        {"Junu Hada"},
                        {"Junu Hada"},
                        {"Junu Hada"},
                        {null},
                        {null}
                },
                new String [] {
                        "Modules"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(jTable11);

        bba6Field2.setText("id");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(46, 46, 46)
                                                .addComponent(jLabel14)
                                                .addGap(2, 2, 2)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(bl6c5)
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addComponent(bba6Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(33, 33, 33)
                                                                .addComponent(jLabel15)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(bba6Field2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(293, 293, 293)
                                                .addComponent(bba6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(bl6c2)
                                                        .addComponent(bl6c1)
                                                        .addComponent(bl6c3)
                                                        .addComponent(bl6c4)
                                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(54, 54, 54)
                                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(183, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel14)
                                        .addComponent(bba6Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15)
                                        .addComponent(bba6Field2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bl6c1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bl6c2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bl6c3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bl6c4)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bl6c5)
                                .addGap(21, 21, 21)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addComponent(bba6Button)
                                .addContainerGap(275, Short.MAX_VALUE))
        );

        bbaPane.addTab("Level 6", jPanel4);

        jLabel26.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel26.setText("Name:");

        jLabel27.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel27.setText("Module 1:");

        jLabel28.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel28.setText("Modul 2");

        jLabel29.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel29.setText("Modul 3");

        jLabel30.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel30.setText("Modul 4");

        jLabel31.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel31.setText("Modul 5");

        jLabel32.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel32.setText("Modul 6");

        jTextField9.setText("Name");

        jTextField10.setText("Module");

        jTextField11.setText("Module");
//        jTextField11.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jTextField11ActionPerformed(evt);
//            }
//        });

        jTextField12.setText("Module");

        jTextField13.setText("Module");

        jTextField14.setText("Module");


        jTextField15.setText("Module");

        jButton6.setText("View Updated courses");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Enroll");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel33.setText("id:");

        jTextField16.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField16.setText("id");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel26)
                                                        .addComponent(jLabel27)
                                                        .addComponent(jLabel28)
                                                        .addComponent(jLabel29)
                                                        .addComponent(jLabel30)
                                                        .addComponent(jLabel31)
                                                        .addComponent(jLabel32))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jTextField9)
                                                        .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                                        .addComponent(jTextField11)
                                                        .addComponent(jTextField12)
                                                        .addComponent(jTextField13)
                                                        .addComponent(jTextField14)
                                                        .addComponent(jTextField15))
                                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                                                .addGap(81, 81, 81)
                                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                                                .addGap(69, 69, 69)
                                                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addGap(201, 201, 201)
                                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(278, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel26)
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel33)
                                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel27)
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel28)
                                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(7, 7, 7)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel29)
                                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel30)
                                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel31))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel32))
                                .addGap(43, 43, 43)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(306, Short.MAX_VALUE))
        );

        bbaPane.addTab("Updated Courses", jPanel9);

        jButton8.setText("Refresh");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTable13.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Id", "instructor", "Module Assigned"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane13.setViewportView(jTable13);
        if (jTable13.getColumnModel().getColumnCount() > 0) {
            jTable13.getColumnModel().getColumn(0).setResizable(false);
            jTable13.getColumnModel().getColumn(1).setResizable(false);
            jTable13.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel10Layout.createSequentialGroup()
                                                .addGap(258, 258, 258)
                                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel10Layout.createSequentialGroup()
                                                .addGap(96, 96, 96)
                                                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(224, Short.MAX_VALUE))
        );

        bbaPane.addTab("Instructors", jPanel10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(306, 306, 306)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(550, 550, 550)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(332, 332, 332)
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(66, 66, 66))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(bitPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                .addComponent(bbaPane, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bbaPane, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bitPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1379, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(333, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void bba5ButtonActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
        //Bba lvl5 sumbit
        String Fullname=bba5Field1.getText();
        String id=bbaField2.getText();
        String m1=bl5c1.getText().toString();
        String m2=bl5c2.getText().toString();
        String m3=bl5c3.getText().toString();
        String m4=bl5c4.getText().toString();
        String m5=bl5c5.getText().toString();
        String m6=bl5c6.getText().toString();
        if(bba5Field1.getText().isEmpty()
            ||bba6Field2.getText().isEmpty()
            ||bl5c1.isSelected()==false
            ||bl5c2.isSelected()==false
            ||bl5c3.isSelected()==false
            ||bl5c4.isSelected()==false
            ||bl5c5.isSelected()==false
            ||bl5c6.isSelected()==false
        )
        {
            System.out.println("error");
            JOptionPane.showMessageDialog(null,"Please provide correct information");
        }

    else {
            try {
                File file = new File("StudentsRecord.txt");
                FileWriter W = new FileWriter("StudentsRecord.txt", true);
                W.write("\n" + "Full Name:" + Fullname + "\n" + "ID: " + id +"\n"+ "Modules:" + " \n" + m1 + "\n " + m2 + "\n" + m3 + " \n" + m4 + "\n" + m5 + "\n" + m6 + "\n" + "(BBAlevel5)" + "\n" + "\t\t\t____________________________________________________________________" + "\n" + "\n" + "\n");
                W.write(System.getProperty("line.separator"));
                W.close();
                JOptionPane.showMessageDialog(null, "Success record stored in StudentRecord.txt");
                setVisible(true);
            }
            catch (Exception e) {
                System.out.println("Error");
            }
    }

    clearField5();
}


    private void clearField5(){
        bba5Field1.requestFocus();
        bba5Field1.setText("");
        bbaField2.setText("");
        bl5c1.setSelected(false);
        bl5c2.setSelected(false);
        bl5c3.setSelected(false);
        bl5c4.setSelected(false);
        bl5c5.setSelected(false);
        bl5c6.setSelected(false);

    }

    private void bba6ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        //submit bba lvl6
        String Fullname=bba6Field1.getText();
        String id=bba6Field2.getText();
        String m1=bl6c1.getText().toString();
        String m2=bl6c2.getText().toString();
        String m3=bl6c3.getText().toString();
        String m4=bl6c4.getText().toString();
        String m5=bl6c5.getText().toString();

        if(bba6Field2.getText().isEmpty()
                ||bba6Field2.getText().isEmpty()
                ||bl6c1.isSelected()==false
                ||bl6c2.isSelected()==false
                ||bl6c3.isSelected()==false
                ||bl6c4.isSelected()==false
                ||bl6c5.isSelected()==false
        )

        {
            System.out.println("error");
            JOptionPane.showMessageDialog(null,"Please provide correct information");
        }
        else {
            try {
                File file = new File("StudentsRecord.txt");
                FileWriter W = new FileWriter("StudentsRecord.txt", true);
                W.write("\n" + "Full Name:" + Fullname + "\n" + "ID: " + id +"\n"+ "Modules:" + " \n" + m1 + "\n " + m2 + "\n" + m3 + " \n" + m4 + "(Optional)" + m5 + "\n" + "\n" + "\n" + "(BBAlevel6)" + "\n" + "\t\t\t____________________________________________________________________" + "\n" + "\n" + "\n");
                W.write(System.getProperty("line.separator"));
                W.close();
                JOptionPane.showMessageDialog(null, "Success record stored in StudentRecord.txt");
                setVisible(true);


            } catch (Exception e) {
                System.out.println("Error");
            }
        }

        clearField6();
    }

    private void clearField6(){
        bba6Field1.requestFocus();
        bba6Field1.setText("");
        bba6Field2.setText("");
        bl6c1.setSelected(false);
        bl5c2.setSelected(false);
        bl6c3.setSelected(false);
        bl6c4.setSelected(false);
        bl6c5.setSelected(false);
        bl4c6.setSelected(false);

    }
    private void bba4ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        //submit bba lvl4
        String Fullname = bba4Field1.getText();
        String id = bba4Field2.getText();
        String m1 = b4c1.getText().toString();
        String m2 = b4c2.getText().toString();
        String m3 = b4c3.getText().toString();
        String m4 = b4c4.getText().toString();
        String m5 = bl4c5.getText().toString();
        String m6 = bl4c6.getText().toString();

        if (bba6Field2.getText().isEmpty()
                || bba4Field2.getText().isEmpty()
                || b4c1.isSelected() == false
                || b4c2.isSelected() == false
                || b4c3.isSelected() == false
                || b4c4.isSelected() == false
                || bl4c5.isSelected() == false
                || bl4c6.isSelected() == false)
        { JOptionPane.showMessageDialog(null, "Please provide correct information"); }
        else {
            try {
                File file = new File("StudentsRecord.txt");
                FileWriter W = new FileWriter("StudentsRecord.txt", true);
                W.write("\n" + "Full Name:" + Fullname + "\n" + "ID: " + id +"\n"+ "Modules:" + " \n" + m1 + "\n " + m2 + "\n" + m3 + " \n" + m4 + "\n" + m5 + "\n" + m6 + "\n" + "(BBAlevel4)" + "\n" + "\t\t\t____________________________________________________________________" + "\n" + "\n" + "\n");
                W.write(System.getProperty("line.separator"));
                W.close();
                JOptionPane.showMessageDialog(null, "Success record stored in StudentRecord.txt");
                setVisible(true);


            } catch (Exception e) {
                System.out.println("Error");
            }

            clearField4();
        }
    }

    private void clearField4(){
        bba4Field1.requestFocus();
        bba4Field1.setText("");
        bba4Field2.setText("");
        b4c1.setSelected(false);
        b4c2.setSelected(false);
        b4c3.setSelected(false);
        b4c4.setSelected(false);
        bl4c5.setSelected(false);
        bl4c6.setSelected(false);

    }

    private void bl6ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //submit bit lvl6
        // TODO add your handling code here:
        String Fullname=bl6Field1.getText();
        String id=bl6Field2.getText();
        String m1=l6c1.getText().toString();
        String m2=l6c2.getText().toString();
        String m3=l6c3.getText().toString();
        String m4=l6c4.getText().toString();
        String m5=l6c5.getText().toString();
        String m6=l6c6.getText().toString();

        if(
                bl6Field1.getText().isEmpty()
                ||bl6Field2.getText().isEmpty()
                ||l6c1.isSelected()==false
                ||l6c2.isSelected()==false
                ||l6c3.isSelected()==false
                ||l6c4.isSelected()==false
                ||l6c5.isSelected()==false
                ||l6c6.isSelected()==false
        ){JOptionPane.showMessageDialog(null,"Please fill in the information");}
        else {
            try {
                File file = new File("StudentsRecord.txt");
                FileWriter W = new FileWriter("StudentsRecord.txt", true);
                W.write("\n" + "Full Name:" + Fullname + "\n" + "ID: " + id + "\n"+"Modules:" + " \n" + m1 + "\n " + m2 + "\n" + m3 + " \n" + m4 + "\n" + m5 + "(optional)" + "\n" + m6 + "(optional)" + "\n" + "(BSCLevel6)" + "\n" + "\t\t\t____________________________________________________________________" + "\n" + "\n" + "\n");
                W.write(System.getProperty("line.separator"));
                W.close();
                JOptionPane.showMessageDialog(null, "Success record stored in StudentRecord.txt");
                setVisible(true);


            } catch (Exception e) {
                System.out.println("Error");
            }
        }
        clearField3();
    }
    private void clearField3(){
        bl6Field1.requestFocus();
        bl6Field1.setText("");
        bl6Field2.setText("");
        l6c1.setSelected(false);
        l6c2.setSelected(false);
        l6c3.setSelected(false);
        l6c4.setSelected(false);
        l6c5.setSelected(false);
        l6c6.setSelected(false);
    }

    private void bl5ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //submit bit lvl5
        // TODO add your handling code here:
        String Fullname=bl5Field1.getText();
        String id=bl5Field2.getText();
        String m1=l5c1.getText().toString();
        String m2=l5c2.getText().toString();
        String m3=l5c3.getText().toString();
        String m4=l5c4.getText().toString();
        String m5=l5c5.getText().toString();
        String m6=l5c6.getText().toString();

        if(
                bl5Field1.getText().isEmpty()
                ||bl5Field2.getText().isEmpty()
                ||l5c1.isSelected()==false
                ||l5c2.isSelected()==false
                ||l5c3.isSelected()==false
                ||l5c4.isSelected()==false
                ||l5c5.isSelected()==false
                ||l5c6.isSelected()==false
        )
        {
            JOptionPane.showMessageDialog(null,"Please provide correct information");
        }
        else {
            try {
                File file = new File("StudentsRecord.txt");
                FileWriter W = new FileWriter("StudentsRecord.txt", true);
                W.write("\n" + "Full Name:" + Fullname + "\n" + "ID: " + id +"\n"+ "Modules:" + " \n" + m1 + "\n " + m2 + "\n" + m3 + " \n" + m4 + "\n" + m5 + "\n" + m6 + "\n" + "(BSClevel5)" + "\n" + "\t\t\t____________________________________________________________________" + "\n" + "\n" + "\n");
                W.write(System.getProperty("line.separator"));
                W.close();
                JOptionPane.showMessageDialog(null, "Success record stored in StudentRecord.txt");
                setVisible(true);


            } catch (Exception e) {
                System.out.println("Error");
            }
        }

        clearField2();

    }
    private void clearField2(){
        bl5Field1.requestFocus();
        bl5Field1.setText("");
        bl5Field2.setText("");
        l5c1.setSelected(false);
        l5c2.setSelected(false);
        l5c3.setSelected(false);
        l5c4.setSelected(false);
        l5c5.setSelected(false);
        l5c6.setSelected(false);
    }

    private void bl4ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        //submit bit lvl4

        String Fullname=bl4Feild1.getText();
        String id=bl4Field2.getText();
        String m1=l4c1.getText().toString();
        String m2=l4c2.getText().toString();
        String m3=l4c3.getText().toString();
        String m4=l4c4.getText().toString();
        String m5=l4c5.getText().toString();
        String m6=l4c6.getText().toString();

        if(bl4Feild1.getText().isEmpty()
                ||bl4Field2.getText().isEmpty()
                ||l4c1.isSelected()==false
                ||l4c2.isSelected()==false
                ||l4c3.isSelected()==false
                ||l4c4.isSelected()==false
                ||l4c5.isSelected()==false
                ||l4c6.isSelected()==false
        )
        {
            JOptionPane.showMessageDialog(null,"Please Fill in the information");
            System.out.println();
        }
        else {
            try {
                File file = new File("StudentsRecord.txt");
                FileWriter W = new FileWriter("StudentsRecord.txt", true);
                W.write("\n" + "Full Name:" + Fullname + "\n" + "ID: " + id + "\n"+"Modules:" + " \n" +
                        m1 + "\n " + m2 + "\n" + m3 + " \n" + m4 + "\n" + m5 + "\n" + m6 + "\n" + "(BSClevel4)" + "\n" + "\t\t\t____________________________________________________________________" + "\n" + "\n" + "\n");
                W.write(System.getProperty("line.separator"));
                W.close();
                JOptionPane.showMessageDialog(null, "Success record stored in StudentRecord.txt");
                setVisible(true);


            } catch (Exception e) {
                System.out.println("Error");
            }
        }

        clearField();
    }
    private void clearField(){
        bl4Feild1.requestFocus();
        bl4Feild1.setText("");
        bl4Field2.setText("");
        l4c1.setSelected(false);
        l4c2.setSelected(false);
        l4c3.setSelected(false);
        l4c4.setSelected(false);
        l4c5.setSelected(false);
        l4c6.setSelected(false);

    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.setVisible(true);
        UpdatedCourses up=new UpdatedCourses();
        up.show();
        System.out.println("Course Displayed");

    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String Fullname=jTextField1.getText();
        String id=jTextField2.getText();
        String m1=jTextField3.getText().toString();
        String m2=jTextField4.getText().toString();
        String m3=jTextField5.getText().toString();
        String m4=jTextField6.getText().toString();
        String m5=jTextField7.getText().toString();
        String m6=jTextField8.getText().toString();

        if(jTextField1.getText().isEmpty()|| jTextField2.getText().isEmpty()||jTextField3.getText().isEmpty()||jTextField4.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"\"please provide correct information\"");
        }

        else {
            try {
                File file = new File("StudentsRecord.txt");
                FileWriter W = new FileWriter("StudentsRecord.txt", true);
                W.write("\n" + "Full Name:" + Fullname + "\n" + "ID: " + id +"\n"+ "Modules:" + " \n" +
                        m1 + "\n " + m2 + "\n" + m3 + " \n" + m4 + "\n" + m5 + "\n" + m6 + "\n"  + "\n" + "\t\t\t____________________________________________________________________" + "\n" + "\n" + "\n");
                W.write(System.getProperty("line.separator"));
                W.close();
                JOptionPane.showMessageDialog(null, "Success record stored in StudentRecord.txt");
                setVisible(true);


            } catch (Exception e) {
                System.out.println("Error");
            }
        }
        clearFieldup();
        }
    private void clearFieldup(){
        bl4Feild1.requestFocus();
        bl4Feild1.setText("");
        bl4Field2.setText("");
        l4c1.setSelected(false);
        l4c2.setSelected(false);
        l4c3.setSelected(false);
        l4c4.setSelected(false);
        l4c5.setSelected(false);
        l4c6.setSelected(false);

    }



    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        int call;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con2= DriverManager.getConnection( "jdbc:mysql://localhost/final_assesment","root","");
            insert=con2.prepareStatement("select  * from record2");
            ResultSet rs= insert.executeQuery();
            ResultSetMetaData Rss= rs.getMetaData();
            call=Rss.getColumnCount();
            DefaultTableModel dt= (DefaultTableModel)jTable13.getModel();
            dt.setRowCount(0);

            while(rs.next())
            {
                Vector v2= new Vector();

                for (int a=1;a<=call;a++){
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("tutor"));
                    v2.add(rs.getString("Module_assigned"));

                }
                dt.addRow(v2);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void showIns1(){
        int call;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con2= DriverManager.getConnection( "jdbc:mysql://localhost/final_assesment","root","");
            insert=con2.prepareStatement("select  * from record2");
            ResultSet rs= insert.executeQuery();
            ResultSetMetaData Rss= rs.getMetaData();
            call=Rss.getColumnCount();
            DefaultTableModel dt= (DefaultTableModel)jTable13.getModel();
            dt.setRowCount(0);

            while(rs.next())
            {
                Vector v2= new Vector();

                for (int a=1;a<=call;a++){
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("tutor"));
                    v2.add(rs.getString("Module_assigned"));

                }
                dt.addRow(v2);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void showIns2(){
        int call;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con2= DriverManager.getConnection( "jdbc:mysql://localhost/final_assesment","root","");
            insert=con2.prepareStatement("select  * from record2");
            ResultSet rs= insert.executeQuery();
            ResultSetMetaData Rss= rs.getMetaData();
            call=Rss.getColumnCount();
            DefaultTableModel dt= (DefaultTableModel)jTable12.getModel();
            dt.setRowCount(0);

            while(rs.next())
            {
                Vector v2= new Vector();

                for (int a=1;a<=call;a++){
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("tutor"));
                    v2.add(rs.getString("Module_assigned"));

                }
                dt.addRow(v2);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        this.setVisible(true);
        UpdatedCourses up=new UpdatedCourses();
        up.show();
        System.out.println("Course Displayed");
        System.out.println("Course Displayed");
    }
    Connection con2;
    PreparedStatement insert;
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        int call;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con2= DriverManager.getConnection( "jdbc:mysql://localhost/final_assesment","root","");
            insert=con2.prepareStatement("select  * from record2");
            ResultSet rs= insert.executeQuery();
            ResultSetMetaData Rss= rs.getMetaData();
            call=Rss.getColumnCount();
            DefaultTableModel dt= (DefaultTableModel)jTable12.getModel();
            dt.setRowCount(0);

            while(rs.next())
            {
                Vector v2= new Vector();

                for (int a=1;a<=call;a++){
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("tutor"));
                    v2.add(rs.getString("Module_assigned"));

                }
                dt.addRow(v2);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String Fullname=jTextField9.getText();
        String id=jTextField16.getText();
        String m1=jTextField10.getText().toString();
        String m2=jTextField11.getText().toString();
        String m3=jTextField12.getText().toString();
        String m4=jTextField13.getText().toString();
        String m5=jTextField14.getText().toString();
        String m6=jTextField15.getText().toString();

        if(
                jTextField9.getText().isEmpty()||
                jTextField10.getText().isEmpty()||
                jTextField11.getText().isEmpty()||
                jTextField12.getText().isEmpty()||
                jTextField13.getText().isEmpty()||
                jTextField14.getText().isEmpty()||
                jTextField15.getText().isEmpty()||
                jTextField16.getText().isEmpty())
        {
        JOptionPane.showMessageDialog(null,"Please Provide correct information");
        }
        else {
            try {
                File file = new File("StudentsRecord.txt");
                FileWriter W = new FileWriter("StudentsRecord.txt", true);
                W.write(" \n" + Fullname + "\n " + id + "\n"+"Modules:"+"\n" + m1  +"\n" + m2 + " \n" + m3 + "\n " + m4 + " \n" + m5 + "\n " + m6);
                W.write(System.getProperty("line.separator"));
                W.close();
                JOptionPane.showMessageDialog(null, "Success record stored in StudentRecord.txt");
                setVisible(true);


            } catch (Exception e) {
                System.out.println("Error");
            }
        }
        clearFielduu();
    }
    private void clearFielduu(){
        jTextField9.requestFocus();
        jTextField16.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
        jTextField15.setText("");

    }

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
            java.util.logging.Logger.getLogger(StudentPannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentPannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentPannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentPannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentPannel().setVisible(true);
                StudentPannel obj1=new StudentPannel();
               

            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JCheckBox b4c1;
    private javax.swing.JCheckBox b4c2;
    private javax.swing.JCheckBox b4c3;
    private javax.swing.JCheckBox b4c4;
    private javax.swing.JButton bba4Button;
    private javax.swing.JTextField bba4Field1;
    private javax.swing.JTextField bba4Field2;
    private javax.swing.JButton bba5Button;
    private javax.swing.JTextField bba5Field1;
    private javax.swing.JButton bba6Button;
    private javax.swing.JTextField bba6Field1;
    private javax.swing.JTextField bba6Field2;
    private javax.swing.JTextField bbaField2;
    private javax.swing.JTabbedPane bbaPane;
    private javax.swing.JTabbedPane bitPane6;
    private javax.swing.JButton bl4Button;
    private javax.swing.JTextField bl4Feild1;
    private javax.swing.JTextField bl4Field2;
    private javax.swing.JCheckBox bl4c5;
    private javax.swing.JCheckBox bl4c6;
    private javax.swing.JButton bl5Button;
    private javax.swing.JTextField bl5Field1;
    private javax.swing.JTextField bl5Field2;
    private javax.swing.JCheckBox bl5c1;
    private javax.swing.JCheckBox bl5c2;
    private javax.swing.JCheckBox bl5c3;
    private javax.swing.JCheckBox bl5c4;
    private javax.swing.JCheckBox bl5c5;
    private javax.swing.JCheckBox bl5c6;
    private javax.swing.JButton bl6Button;
    private javax.swing.JTextField bl6Field1;
    private javax.swing.JTextField bl6Field2;
    private javax.swing.JCheckBox bl6c1;
    private javax.swing.JCheckBox bl6c2;
    private javax.swing.JCheckBox bl6c3;
    private javax.swing.JCheckBox bl6c4;
    private javax.swing.JCheckBox bl6c5;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable12;
    private javax.swing.JTable jTable13;
    private javax.swing.JTable jTable14;
    private javax.swing.JTable jTable15;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JCheckBox l4c1;
    private javax.swing.JCheckBox l4c2;
    private javax.swing.JCheckBox l4c3;
    private javax.swing.JCheckBox l4c4;
    private javax.swing.JCheckBox l4c5;
    private javax.swing.JCheckBox l4c6;
    private javax.swing.JCheckBox l5c1;
    private javax.swing.JCheckBox l5c2;
    private javax.swing.JCheckBox l5c3;
    private javax.swing.JCheckBox l5c4;
    private javax.swing.JCheckBox l5c5;
    private javax.swing.JCheckBox l5c6;
    private javax.swing.JCheckBox l6c1;
    private javax.swing.JCheckBox l6c2;
    private javax.swing.JCheckBox l6c3;
    private javax.swing.JCheckBox l6c4;
    private javax.swing.JCheckBox l6c5;
    private javax.swing.JCheckBox l6c6;
    // End of variables declaration
}
