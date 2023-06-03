/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package apartease;

import java.net.Socket;
import java.text.SimpleDateFormat;
import static apartease.DBConnection.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class OwnerMessagePage extends javax.swing.JFrame {

    private String contentO;

    /**
     * Creates new form OwnerMessage
     */
    public OwnerMessagePage(String contentO) {
        initComponents();
        loadOwnerMessages();
        this.contentO = contentO;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        msg_area = new javax.swing.JTextArea();
        msg_text = new javax.swing.JTextField();
        msg_send = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Συνομιλία με Ιδιοκτήτη");

        msg_area.setColumns(20);
        msg_area.setRows(5);
        jScrollPane1.setViewportView(msg_area);

        msg_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msg_textActionPerformed(evt);
            }
        });

        msg_send.setText("Αποστολή");
        msg_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendOwnerMesage(evt);
            }
        });

        jButton1.setText("Πίσω");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnMessage(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(msg_text, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(msg_send))))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msg_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msg_send))
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void msg_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msg_textActionPerformed
    }//GEN-LAST:event_msg_textActionPerformed

    private void sendOwnerMesage(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendOwnerMesage
        String content = msg_text.getText().trim();
        String[] words = content.split("\\s+");
        int wordCount = words.length;

        if (wordCount >= 1 && wordCount <= 15 && !content.toLowerCase().contains("insert")) {
            boolean isInsertSuccessful = insertMessageIntoTable(content);

            if (isInsertSuccessful) {
                JOptionPane.showMessageDialog(this, "Message sent successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                loadOwnerMessages(); // Refresh the messages after sending a new one
                msg_text.setText(""); // Clear the text field
            } else {
                JOptionPane.showMessageDialog(this, "Failed to send message. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Failed to send message. Please check the length and content of your message.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_sendOwnerMesage

    private void returnMessage(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnMessage
        // Create an instance of the MessagePge frame
        MessagePage messagePage = new MessagePage();

        // Display the messagePage frame
        messagePage.setVisible(true);

        // Close the current messagePage frame
        dispose();
    }//GEN-LAST:event_returnMessage

    private boolean insertMessageIntoTable(String content) {
        try {
            Connection con = DBConnection.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT user_id FROM login_status WHERE id = 1");
            if (rs.next()) {
                int userID = rs.getInt(1);

                ResultSet rs2 = stmt.executeQuery("SELECT email FROM user WHERE user_type = 'tenant' and id = " + userID);
                if (rs2.next()) {
                    String receiverMail = rs2.getString(1);

                    String sql = "INSERT INTO message(content, sent_date, user_id, message_type, receiver_email) VALUES (?, CURDATE(), ?, 'private', ?)";

                    try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                        pstmt.setString(1, content);
                        pstmt.setInt(2, userID);
                        pstmt.setString(3, receiverMail);
                        pstmt.executeUpdate();
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    private void loadOwnerMessages() {

        StringBuilder sb = new StringBuilder();

        try {
            Connection con = DBConnection.getConnection();
            Statement stmt = con.createStatement();

            // Fetching buildingID
            ResultSet buildingRS = stmt.executeQuery("SELECT building.id FROM user, user_has_apartment, apartment, building, login_status WHERE 1 = user.id AND user.id = user_has_apartment.user_id AND user_has_apartment.apartment_id = apartment.id AND apartment.id = building.id");
            String buildingID = "";
            if (buildingRS.next()) {
                buildingID = buildingRS.getString("building.id");
            }

            // Fetching tenant, manager, and owner messages
            String messagesSql = "SELECT message.content, user.user_type FROM message JOIN user ON message.user_id = user.id JOIN user_has_apartment ON user.id = user_has_apartment.user_id JOIN apartment ON user_has_apartment.apartment_id = apartment.id JOIN building ON apartment.building_id = building.id WHERE (user.user_type = 'tenant' OR user.user_type = 'owner') AND message.message_type = 'private' AND building.id = '" + buildingID + "' ORDER BY message.sent_date ASC";

            ResultSet messagesRS = stmt.executeQuery(messagesSql);
            while (messagesRS.next()) {
                String userType = messagesRS.getString("user_type");
                String content = messagesRS.getString("content");

                if (userType.equals("tenant")) {
                    sb.append("Tenant: ");
                } else if (userType.equals("owner")) {
                    sb.append("Owner: ");
                }

                sb.append(content).append("\n");
            }

            msg_area.setText(sb.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTextArea msg_area;
    private javax.swing.JButton msg_send;
    private javax.swing.JTextField msg_text;
    // End of variables declaration//GEN-END:variables

}
