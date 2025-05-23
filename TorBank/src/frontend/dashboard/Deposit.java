/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package frontend.dashboard;

import backend.connections.DatabaseConnections;
import java.math.BigDecimal;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author DELL
 */
public class Deposit extends javax.swing.JPanel {

    /**
     * Creates new form Deposit
     */
    public Deposit() {
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

        jPanel1 = new javax.swing.JPanel();
        accountNumber = new javax.swing.JTextField();
        depositAmount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Deposit = new javax.swing.JButton();
        Backk = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(240, 236, 229));

        depositAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositAmountActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setText("Account Number");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("Deposit amount");

        Deposit.setBackground(new java.awt.Color(22, 26, 48));
        Deposit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Deposit.setForeground(new java.awt.Color(255, 255, 255));
        Deposit.setText("Deposit");
        Deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositActionPerformed(evt);
            }
        });

        Backk.setBackground(new java.awt.Color(22, 26, 48));
        Backk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Backk.setForeground(new java.awt.Color(255, 255, 255));
        Backk.setText("Back");
        Backk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(Deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Backk, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(accountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(186, 186, 186)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(226, 226, 226)
                            .addComponent(depositAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(accountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addComponent(depositAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Backk, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void depositAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depositAmountActionPerformed

    private void DepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositActionPerformed

    long accountNum = Long.parseLong(accountNumber.getText());
    double depositAmt = Double.parseDouble(depositAmount.getText());

    if (depositAmt <= 0) {
        JOptionPane.showMessageDialog(null, "Amount to deposit should be greater than zero.");
        return;
    }

    try (Connection conn = DatabaseConnections.getConnection()) {
        if (conn == null) {
            JOptionPane.showMessageDialog(null, "Failed to connect to the database");
            return;
        }

        String sqlBalance = "SELECT balance FROM accounts WHERE account_number = ?";
        PreparedStatement stmtBalance = conn.prepareStatement(sqlBalance);
        stmtBalance.setLong(1, accountNum);
        ResultSet rs = stmtBalance.executeQuery();

        if (!rs.next()) {
            JOptionPane.showMessageDialog(null, "Account not found.");
            return;
        }

        double currentBalance = rs.getDouble("balance");
        double newBalance = currentBalance + depositAmt;

        String sqlUpdateBalance = "UPDATE accounts SET balance = ? WHERE account_number = ?";
        PreparedStatement stmtUpdateBalance = conn.prepareStatement(sqlUpdateBalance);
        stmtUpdateBalance.setDouble(1, newBalance);
        stmtUpdateBalance.setLong(2, accountNum);
        int rowsUpdated = stmtUpdateBalance.executeUpdate();

        if (rowsUpdated > 0) {
            int userId = backend.controllers.UserController.getUserId();

            String sqlTransaction = "INSERT INTO transactions (from_account, to_account, amount, transaction_type, user_id) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmtTransaction = conn.prepareStatement(sqlTransaction);
            stmtTransaction.setLong(1, accountNum); 
            stmtTransaction.setLong(2, accountNum); 
            stmtTransaction.setDouble(3, depositAmt); 
            stmtTransaction.setString(4, "Deposit");  
            stmtTransaction.setInt(5, userId); 

            int rowsInserted = stmtTransaction.executeUpdate();

            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Deposit successful! New Balance: " + newBalance);
            } else {
                JOptionPane.showMessageDialog(null, "Failed to record transaction.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Failed to update balance.");
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage());
    }

    }//GEN-LAST:event_DepositActionPerformed

    private void BackkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackkActionPerformed
        transactions mainMenuPanel = new transactions();

    JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);

    mainFrame.getContentPane().removeAll();

    mainFrame.getContentPane().add(mainMenuPanel);

    mainFrame.pack();

    mainFrame.revalidate();
    mainFrame.repaint();
    mainFrame.setLocationRelativeTo(null); 
    }//GEN-LAST:event_BackkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Back1;
    private javax.swing.JButton Backk;
    private javax.swing.JButton Deposit;
    private javax.swing.JTextField accountNumber;
    private javax.swing.JTextField depositAmount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
