/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package apartease;
import java.sql.ResultSetMetaData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Θεοδόσης
 */
public class Profile extends javax.swing.JFrame implements DBConnection{

    /**
     * Creates new form Customer_Account
     */
    public Profile() {
        initComponents();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        try
        {
            
            Connection con=DBConnection.getConnection();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select user_id from LOGIN_STATUS where id = 1");

            rs.next();
            int user_id = Integer.valueOf(rs.getString(1));
            rs=st.executeQuery("select user.id AS 'ID',user.name AS 'Name',user.surname AS 'Surname',user.email AS 'E-mail',user.user_type AS 'Type',user.birth_date AS 'Birth Date',user.description AS 'Description',user.wallet AS 'wallet',building.address AS 'Address',apartment.number AS 'Number' ,apartment.floor AS 'Floor' from user,user_has_apartment,apartment,building where user.id='"+user_id+"' AND user.id=user_has_apartment.user_id AND user_has_apartment.apartment_id=apartment.id AND apartment.Building_id=building.id");
            ResultSetMetaData rsmd=rs.getMetaData();

            int cols=rsmd.getColumnCount();
            String[] colName= new String[cols];
            for (int i=0;i<cols;i++)
            colName[i]=rsmd.getColumnName(i+1);
            model.setColumnIdentifiers(colName);
            String no,f_name,l_name,email,u_type,date,description,wallet,address,apart_num,apart_floor;
            while(rs.next()){
                no=rs.getString(1);
                f_name=rs.getString(2);
                l_name=rs.getString(3);
                email=rs.getString(4);
                u_type=rs.getString(5);
                date=rs.getString(6);
                description=rs.getString(7);
                wallet=rs.getString(8);
                address=rs.getString(9);
                apart_num=rs.getString(10);
                apart_floor=rs.getString(11);
                
                String[] row={no,f_name,l_name,email,u_type, date, description,wallet,address,apart_num,apart_floor};
                model.addRow(row);
            }
            st.close();
            con.close();

        }

        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Πληροφορίες Λογαριασμού");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Όνομα", "Επώνυμο", "E-mail","Περιγραφή"}));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton6.setText("Αποθήκευση");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextField1.setText("Πληκτρολογείστε..");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jButton7.setText("Αποσύνδεση");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Πίσω");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(272, 272, 272)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jComboBox2, 0, 115, Short.MAX_VALUE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(41, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addGap(0, 100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         try
            {
                
                String new_value=jTextField1.getText();
                Connection con=DBConnection.getConnection();
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("Select user_id from login_status where id=1");
                rs.next();
                int user_id = Integer.valueOf(rs.getString(1));
                String column=jComboBox2.getSelectedItem().toString();
                if(column.equals("Όνομα")){
                    Statement stmt = connectdata();
                    if (new_value.length()<45){
                        int result = JOptionPane.showConfirmDialog(this, "Θέλετε σίγουρα να πραγματοποιήσετε αυτή την αλλαγή;");
                            if (result == 0){
                                stmt.executeUpdate("update user set name='"+new_value+"' where id='"+user_id+"'");
                                JOptionPane.showMessageDialog(this,"Αλλάξατε επιτυχώς το όνομα σας σε "+new_value+"!");
                                this.dispose();
                                Profile ob = new Profile();
                                ob.setVisible(true);}
                            else if (result == 1){
                                JOptionPane.showMessageDialog(this,"Ακύρωση ενέργειας");
                            }
                            else{
                               JOptionPane.showMessageDialog(this,"Ακύρωση ενέργειας");
                            }
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Το όριο χαρακτήρων είναι 45. Προσπαθήστε ξανά!");
                    }
                }else if(column.equals("Επώνυμο")){
                    Statement stmt = connectdata();
                    if (new_value.length()<45){
                        int result = JOptionPane.showConfirmDialog(this, "Θέλετε σίγουρα να πραγματοποιήσετε αυτή την αλλαγή;");
                            if (result == 0){
                                stmt.executeUpdate("update user set surname='"+new_value+"' where id='"+user_id+"'");
                                JOptionPane.showMessageDialog(this,"Αλλάξατε επιτυχώς το επώνυμο σας σε "+new_value+"!");
                                this.dispose();
                                Profile ob = new Profile();
                                ob.setVisible(true);}
                            
                            else if (result == 1){
                                JOptionPane.showMessageDialog(this,"Ακύρωση ενέργειας");
                            }
                            else{
                               JOptionPane.showMessageDialog(this,"Ακύρωση ενέργειας");
                            }
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Το όριο χαρακτήρων είναι 45. Προσπαθήστε ξανά!");
                    }
                }else if(column.equals("E-mail")){
                    Statement stmt = connectdata();
                    if (new_value.length()<45){
                        int result = JOptionPane.showConfirmDialog(this, "Θέλετε σίγουρα να πραγματοποιήσετε αυτή την αλλαγή;");
                            if (result == 0){
                                stmt.executeUpdate("update user set email='"+new_value+"' where id='"+user_id+"'");
                                JOptionPane.showMessageDialog(this,"Αλλάξατε επιτυχώς το E-mail σας σε "+new_value+"!");
                                this.dispose();
                                Profile ob = new Profile();
                                ob.setVisible(true);}
                            
                            else if (result == 1){
                                JOptionPane.showMessageDialog(this,"Ακύρωση ενέργειας");
                            }
                            else{
                               JOptionPane.showMessageDialog(this,"Ακύρωση ενέργειας");
                            }
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Το όριο χαρακτήρων είναι 45. Προσπαθήστε ξανά!");
                    }
                }else if(column.equals("Περιγραφή")){
                    Statement stmt = connectdata();
                    if (new_value.length()<100){
                        int result = JOptionPane.showConfirmDialog(this, "Θέλετε σίγουρα να πραγματοποιήσετε αυτή την αλλαγή;");
                            if (result == 0){
                                stmt.executeUpdate("update user set description='"+new_value+"' where id='"+user_id+"'");
                                JOptionPane.showMessageDialog(this,"Αλλάξατε επιτυχώς την περιγραφή σας σε "+new_value+"!");
                                this.dispose();
                                Profile ob = new Profile();
                                ob.setVisible(true);}
                            
                            else if (result == 1){
                                JOptionPane.showMessageDialog(this,"Ακύρωση ενέργειας");
                            }
                            else{
                               JOptionPane.showMessageDialog(this,"Ακύρωση ενέργειας");
                            }
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Το όριο χαρακτήρων είναι 45. Προσπαθήστε ξανά!");
                    }
                }
                
                
                
                    
                
            }
            
            
        catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);
            }
    
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try
        {
            Statement stmt = connectdata();
            stmt.execute("delete from LOGIN_STATUS where id = 1");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
        this.dispose();
        Welcome_Page ob = new Welcome_Page();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
                        this.dispose();
                        HomePage ob = new HomePage();
                        ob.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
