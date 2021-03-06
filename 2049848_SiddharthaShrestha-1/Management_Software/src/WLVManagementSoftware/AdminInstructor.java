/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVManagementSoftware;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Vector;

/**
 *
 * @author dell
 */
public class AdminInstructor extends javax.swing.JFrame {

    /**
     * Creates new form AdminInstructor
     */
    public AdminInstructor() {
        initComponents();
        dis_table2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        assignbtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        removebtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tutor_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Admin");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setText("Instructor");

        jLabel3.setText("Name of instructor:");

        jLabel4.setText("Assign Module: ");

        jTextField1.setText("Name");

        jTextField2.setText("Moduel");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        assignbtn.setText("Assign");
        assignbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignbtnActionPerformed(evt);
            }
        });

        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        removebtn.setText("Remove");
        removebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removebtnActionPerformed(evt);
            }
        });

        tutor_table.setModel(new javax.swing.table.DefaultTableModel(
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
        tutor_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tutor_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tutor_table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(41, 41, 41)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jTextField1)
                                                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(assignbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(removebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 99, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(jLabel2)
                                .addGap(227, 227, 227)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(32, 32, 32)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(assignbtn)
                                                        .addComponent(updatebtn)
                                                        .addComponent(removebtn))
                                                .addGap(201, 201, 201))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>
    Connection con2;
    PreparedStatement insert;
    private void dis_table2(){
        int call;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con2= DriverManager.getConnection( "jdbc:mysql://localhost/final_assesment","root","");
            insert=con2.prepareStatement("select  * from record2");
            ResultSet rs= insert.executeQuery();
            ResultSetMetaData Rss= rs.getMetaData();
            call=Rss.getColumnCount();
            DefaultTableModel dt= (DefaultTableModel)tutor_table.getModel();
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
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void assignbtnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (jTextField1.getText().isEmpty()|| jTextField2.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Fill in the detail");
        }

        else {
            try {
                String name = jTextField1.getText();
                String module = jTextField2.getText();
                Class.forName("com.mysql.jdbc.Driver");
                con2= DriverManager.getConnection( "jdbc:mysql://localhost/final_assesment","root","");
                insert=con2.prepareStatement("INSERT INTO record2(tutor, Module_assigned) VALUES (?,?)");
                insert.setString(1,name);
                insert.setString(2,module);


                insert.executeUpdate();
                JOptionPane.showMessageDialog(this,"Your Record is Added");
                dis_table2();

                jTextField1.setText("");
                jTextField2.setText("");

                jTextField1.requestFocus();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        DefaultTableModel dt= (DefaultTableModel)tutor_table.getModel();
        int  select_index= tutor_table.getSelectedRow();

        try {

            int id=Integer.parseInt(dt.getValueAt(select_index,0).toString());

            String upname = jTextField1.getText();
            String upmod = jTextField2.getText();


            Class.forName("com.mysql.jdbc.Driver");
            con2= DriverManager.getConnection( "jdbc:mysql://localhost/final_assesment","root","");
            insert=con2.prepareStatement(" update record2 set tutor =?, Module_assigned=? where id=?");
            insert.setString(1,upname);
            insert.setString(2,upmod);
            insert.setInt(3, id);


            insert.executeUpdate();
            dis_table2();
            JOptionPane.showMessageDialog(this,"Your Record is Updated");

            jTextField1.setText("");
            jTextField2.setText("");

            jTextField1.requestFocus();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private void removebtnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        DefaultTableModel dt= (DefaultTableModel)tutor_table.getModel();
        int  select_index= tutor_table.getSelectedRow();

        try {

            int id=Integer.parseInt(dt.getValueAt(select_index,0).toString());
            int diag_confirm=JOptionPane.showConfirmDialog(null,"Confirm to delet the record",null,JOptionPane.YES_NO_CANCEL_OPTION);

            if(diag_confirm==JOptionPane.YES_OPTION){

                Class.forName("com.mysql.jdbc.Driver");
                con2= DriverManager.getConnection( "jdbc:mysql://localhost/final_assesment","root","");
                insert=con2.prepareStatement("delete from record2 where id=?");
                insert.setInt(1,id);
                JOptionPane.showMessageDialog(null,"Record will be Deleted");

                insert.executeUpdate();
                dis_table2();


            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void tutor_tableMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        DefaultTableModel dt= (DefaultTableModel)tutor_table.getModel();
        int  select_index= tutor_table.getSelectedRow();
        jTextField1.setText(dt.getValueAt(select_index, 1).toString());
        jTextField2.setText(dt.getValueAt(select_index, 2).toString());

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
            java.util.logging.Logger.getLogger(AdminInstructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminInstructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminInstructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminInstructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminInstructor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton assignbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton removebtn;
    private javax.swing.JTable tutor_table;
    private javax.swing.JButton updatebtn;
    // End of variables declaration
}
