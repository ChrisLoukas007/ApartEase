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
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
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
        jLabel1.setText("ACCOUNT DETAILS TABLE");

        jButton4.setText("View Account Info");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Movies", "Series", "Movies and Series"}));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton5.setText("Save");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Name", "Last Name", "Address","District","Postal Code","Phone Number","City","Country"}));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton6.setText("Save");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextField1.setText("Insert Value");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jButton7.setText("Logout");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Main Menu");
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(146, 146, 146)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jComboBox2, 0, 115, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton5)
                                        .addGap(18, 18, 18)))))))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(331, 331, 331))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jButton6)
                .addGap(0, 294, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
         model.setRowCount(0);
        try
            {
                
                
                Connection con=DBConnection.getConnection();
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("Select user_id from login_status where Login_Status_id=1");
                
                rs.next();
                int user_id = Integer.valueOf(rs.getString(1));
                rs=st.executeQuery("select user.id,user.first_name,user.last_name,user.email,user.create_date,user.user_type,user.discount,address.address,address.district,address.postal_code,address.phone,city.city,country.country from user, address,city,country where user.id='"+user_id+"' AND user.address_id=address.id AND address.city_id=city.id AND city.country_id=country.id");
                ResultSetMetaData rsmd=rs.getMetaData();
                
                
                int cols=rsmd.getColumnCount();
                String[] colName= new String[cols];
                for (int i=0;i<cols;i++)
                    colName[i]=rsmd.getColumnName(i+1);
                model.setColumnIdentifiers(colName);
                String no,f_name,l_name,email,date,type,discount,address,district,postal,phone,city,country;
                while(rs.next()){
                    no=rs.getString(1);
                    f_name=rs.getString(2);
                    l_name=rs.getString(3);
                    email=rs.getString(4);
                    date=rs.getString(5);
                    type=rs.getString(6);
                    discount=rs.getString(7);
                    address=rs.getString(8);
                    district=rs.getString(9);
                    postal=rs.getString(10);
                    phone=rs.getString(11);
                    city=rs.getString(12);
                    country=rs.getString(13);
                    String[] row={no,f_name,l_name,email,date,type,discount,address,district,postal,phone,city,country};
                    model.addRow(row);
                }
                st.close();
                con.close();
                    
                
            }
            
            
        catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);
            }
     
    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        try
            {
                
                
                Connection con=DBConnection.getConnection();
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("Select user_id from login_status where Login_Status_id=1");
                rs.next();
                int user_id = Integer.valueOf(rs.getString(1));
                rs=st.executeQuery("Select plan_type from login_status where Login_Status_id=1");
                rs.next();
                int newplan1=0;
                int oldplan = Integer.valueOf(rs.getString(1));
                String newplan=jComboBox1.getSelectedItem().toString();
                if(newplan.equals("Movies")){
                    newplan1=1;
                }else if(newplan.equals("Series")){
                    newplan1=2;
                }else if(newplan.equals("Movies and Series")){
                    newplan1=3;
                }
                if (newplan1==oldplan){
                    JOptionPane.showMessageDialog(this,"Your selected plan type must not match with your current plan type!");
                } else {
                    Statement stmt = connectdata();
                    stmt.executeUpdate("update plan set plan_type_id='"+newplan1+"' where user_id='"+user_id+"'");
                    stmt.executeUpdate("update login_status set plan_type='"+newplan1+"' where user_id='"+user_id+"'");
                    JOptionPane.showMessageDialog(this,"You have succesfully changed your plan type to "+newplan+"!");
                }
                
                
                    
                
            }
            
            
        catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);
            }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         try
            {
                
                String new_value=jTextField1.getText();
                Connection con=DBConnection.getConnection();
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("Select user_id from login_status where Login_Status_id=1");
                rs.next();
                int user_id = Integer.valueOf(rs.getString(1));
                String column=jComboBox2.getSelectedItem().toString();
                if(column.equals("First Name")){
                    Statement stmt = connectdata();
                    stmt.executeUpdate("update user set first_name='"+new_value+"' where id='"+user_id+"'");
                    JOptionPane.showMessageDialog(this,"You have succesfully changed your first name to "+new_value+"!");
                }else if(column.equals("Last Name")){
                    Statement stmt = connectdata();
                    stmt.executeUpdate("update user set last_name='"+new_value+"' where id='"+user_id+"'");
                    JOptionPane.showMessageDialog(this,"You have succesfully changed your last name to "+new_value+"!");
                }else if(column.equals("Address")){
                    rs=st.executeQuery("Select address_id from user where id='"+user_id+"'");
                    rs.next();
                    int address_id=Integer.valueOf(rs.getString(1));
                    Statement stmt = connectdata();
                    stmt.executeUpdate("update address set address='"+new_value+"' where id='"+address_id+"'");
                    JOptionPane.showMessageDialog(this,"You have succesfully changed your address to "+new_value+"!");
                }else if(column.equals("District")){
                    rs=st.executeQuery("Select address_id from user where id='"+user_id+"'");
                    rs.next();
                    int address_id=Integer.valueOf(rs.getString(1));
                    Statement stmt = connectdata();
                    stmt.executeUpdate("update address set district='"+new_value+"' where id='"+address_id+"'");
                    JOptionPane.showMessageDialog(this,"You have succesfully changed your district to "+new_value+"!");
                }else if(column.equals("Postal Code")){
                    rs=st.executeQuery("Select address_id from user where id='"+user_id+"'");
                    rs.next();
                    int address_id=Integer.valueOf(rs.getString(1));
                    Statement stmt = connectdata();
                    stmt.executeUpdate("update address set postal_code='"+new_value+"' where id='"+address_id+"'");
                    JOptionPane.showMessageDialog(this,"You have succesfully changed your postal code to "+new_value+"!");
                }else if(column.equals("Phone Number")){
                    rs=st.executeQuery("Select address_id from user where id='"+user_id+"'");
                    rs.next();
                    int address_id=Integer.valueOf(rs.getString(1));
                    Statement stmt = connectdata();
                    stmt.executeUpdate("update address set phone='"+new_value+"' where id='"+address_id+"'");
                    JOptionPane.showMessageDialog(this,"You have succesfully changed your phone number to "+new_value+"!");
                }else if(column.equals("City")){
                    rs=st.executeQuery("Select address_id from user where id='"+user_id+"'");
                    rs.next();
                    int address_id=Integer.valueOf(rs.getString(1));
                    rs=st.executeQuery("Select city_id from address where id='"+address_id+"'");
                    rs.next();
                    int city_id=Integer.valueOf(rs.getString(1));
                    Statement stmt = connectdata();
                    stmt.executeUpdate("update city set city='"+new_value+"' where id='"+city_id+"'");
                    JOptionPane.showMessageDialog(this,"You have succesfully changed your city to "+new_value+"!");
                }else if(column.equals("Country")){
                    rs=st.executeQuery("Select address_id from user where id='"+user_id+"'");
                    rs.next();
                    int address_id=Integer.valueOf(rs.getString(1));
                    rs=st.executeQuery("Select city_id from address where id='"+address_id+"'");
                    rs.next();
                    int city_id=Integer.valueOf(rs.getString(1));
                    rs=st.executeQuery("Select country_id from city where id='"+city_id+"'");
                    rs.next();
                    int country_id=Integer.valueOf(rs.getString(1));
                    Statement stmt = connectdata();
                    stmt.executeUpdate("update country set country='"+new_value+"' where id='"+country_id+"'");
                    JOptionPane.showMessageDialog(this,"You have succesfully changed your country to "+new_value+"!");
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
            stmt.execute("delete from LOGIN_STATUS where login_status_id = 1");
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
            java.util.logging.Logger.getLogger(Customer_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}