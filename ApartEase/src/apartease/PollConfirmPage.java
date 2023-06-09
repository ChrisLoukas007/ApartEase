/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package apartease;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Bill
 */
public class PollConfirmPage extends javax.swing.JFrame {

    /**
     * Creates new form PollConfirmPage
     */
    private String Poll_answer1;
    private String Poll_answer2;
    private String Poll_answer3;
    private String Poll_answer4;
    private String Poll_question;
    public PollConfirmPage() {
        initComponents();
    }
    
     public PollConfirmPage(String Question,String answer1,String answer2,String answer3,String answer4) {
        initComponents();
        Poll_answer1=answer1;
        Poll_answer2=answer2;
        Poll_answer3=answer3;
        Poll_answer4=answer4;
        Poll_question=Question;
    }
     
     public void savePoll(){
         try
            {                            
                Connection con=DBConnection.getConnection();
                Statement stm = con.createStatement();
                ResultSet rs =   stm.executeQuery("select user_id from login_status where id=1");
                rs.next();
                int user_id = Integer.valueOf(rs.getString(1));
                String sql="INSERT INTO poll VALUES (NULL,'"+Poll_question+"','2023-06-02','2023-06-20','"+Poll_answer1+"','"+Poll_answer2+"','"+Poll_answer3+"','"+Poll_answer4+"','"+user_id+"')";
                stm.executeUpdate(sql);  
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Σελίδα Επιβεβαίωσης");

        jButton1.setText("Πίσω");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBack(evt);
            }
        });

        jButton2.setText("Επιβεβαίωση");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storePollButton(evt);
            }
        });

        jLabel2.setText("Παρακαλούμε επιβεβαίωστε την δημοσίευση της Δημοσκόπησης");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButton1)
                        .addGap(181, 181, 181)
                        .addComponent(jButton2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(156, 156, 156)
                            .addComponent(jLabel1))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(82, 82, 82))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goBack(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBack
            PollAnswerPage PollAnswer = new PollAnswerPage(Poll_question);
            PollAnswer.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_goBack

    private void storePollButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storePollButton
       savePoll();
       JOptionPane.showMessageDialog(this,"Επιτυχία");
       PollsPage PollsPage = new PollsPage();
       PollsPage.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_storePollButton

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
            java.util.logging.Logger.getLogger(PollConfirmPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PollConfirmPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PollConfirmPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PollConfirmPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PollConfirmPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
