/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.CustomerController;
import Model.DBSearch;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UpdateDeleteCustomers extends javax.swing.JFrame {

    /**
     * Creates new form AddCustomer
     */
    
    private CustomerController CustomerController;

    private DBSearch dbSearch;
    
    public UpdateDeleteCustomers() {
        initComponents();
        dbSearch = new DBSearch();

    }
    
    public void clearField() {
        customerIdInput.setText("");
        customerNameInput.setText("");
        contactNumberInput.setText("");
        emailInput.setText("");
        addressInput.setText("");
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
        CloseBtn = new javax.swing.JLabel();
        getCustomerDataBtn = new javax.swing.JButton();
        DeleteCustomerBtn = new javax.swing.JButton();
        UpdateCustomerBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        customerIdLable = new javax.swing.JLabel();
        customerIdInput = new javax.swing.JTextField();
        customerNameLable = new javax.swing.JLabel();
        customerNameInput = new javax.swing.JTextField();
        contactNumberLable = new javax.swing.JLabel();
        contactNumberInput = new javax.swing.JTextField();
        emailLable = new javax.swing.JLabel();
        emailInput = new javax.swing.JTextField();
        phoneNumberLable = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressInput = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        CloseBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CloseBtn.setText("X");
        CloseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseBtnMouseClicked(evt);
            }
        });

        getCustomerDataBtn.setText("Get Data");
        getCustomerDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getCustomerDataBtnActionPerformed(evt);
            }
        });

        DeleteCustomerBtn.setText("Delete Customer Details");
        DeleteCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCustomerBtnActionPerformed(evt);
            }
        });

        UpdateCustomerBtn.setText("Update Customer Details");
        UpdateCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateCustomerBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Reservation Management System  - Update & Delete Customer");

        customerIdLable.setText("Customer ID");

        customerNameLable.setText("Customer Name");

        customerNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNameInputActionPerformed(evt);
            }
        });

        contactNumberLable.setText("Conatct Number");

        contactNumberInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactNumberInputActionPerformed(evt);
            }
        });

        emailLable.setText("Email Address");

        phoneNumberLable.setText("Address");

        addressInput.setColumns(20);
        addressInput.setRows(5);
        jScrollPane1.setViewportView(addressInput);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(customerIdLable)
                        .addGap(18, 18, 18)
                        .addComponent(customerIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(getCustomerDataBtn)
                        .addGap(175, 175, 175))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(CloseBtn)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(contactNumberLable)
                                .addComponent(emailLable)
                                .addComponent(phoneNumberLable)
                                .addComponent(customerNameLable))
                            .addGap(30, 30, 30)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(customerNameInput)
                                .addComponent(contactNumberInput)
                                .addComponent(emailInput)
                                .addComponent(jScrollPane1))
                            .addGap(95, 95, 95))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(DeleteCustomerBtn)
                            .addGap(18, 18, 18)
                            .addComponent(UpdateCustomerBtn)
                            .addGap(47, 47, 47)))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerIdLable)
                            .addComponent(customerIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(getCustomerDataBtn))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerNameLable)
                    .addComponent(customerNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactNumberLable)
                    .addComponent(contactNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLable)
                    .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneNumberLable)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateCustomerBtn)
                    .addComponent(DeleteCustomerBtn))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 646, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseBtnMouseClicked
        dispose();
    }//GEN-LAST:event_CloseBtnMouseClicked

    private void getCustomerDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getCustomerDataBtnActionPerformed
        try {
            String customerID = customerIdInput.getText().trim();

            if (customerID == null) {
                JOptionPane.showMessageDialog(this, "Please Type a customerID.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            ResultSet resultSet = dbSearch.searchCustomerDetailsByID(customerID);

            if (resultSet != null && resultSet.next()) {
                customerNameInput.setText(resultSet.getString("fullName"));
                contactNumberInput.setText(resultSet.getString("contactNumber"));
                emailInput.setText(resultSet.getString("email"));
                addressInput.setText(resultSet.getString("address"));


            } else {
                JOptionPane.showMessageDialog(this, "No member found for the Typed fullName.", "No Data", JOptionPane.INFORMATION_MESSAGE);
            }

            if (resultSet != null && !resultSet.isClosed()) {
                resultSet.close();
            }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "An error occurred while searching for Customers.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_getCustomerDataBtnActionPerformed

    private void DeleteCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteCustomerBtnActionPerformed
        String customerID = customerIdInput.getText().trim();

        if (customerID.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Customers suppierID must be filled out",
                "Input Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Confirm with the user before deleting
            int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this Customers Details?",
                "Confirm Deletion", JOptionPane.YES_NO_OPTION);

            // If user confirms deletion
            if (confirmation == JOptionPane.YES_OPTION) {
                try {
                    boolean success = CustomerController.deleteCustomer(customerID);

                    if (success) {
                        JOptionPane.showMessageDialog(null, "Customer Details deleted successfully",
                            "Deletion Successful", JOptionPane.INFORMATION_MESSAGE);
                        // Clear the input fields after successful deletion
                        clearField();
                    } else {
                        JOptionPane.showMessageDialog(null, "Failed to delete Customer",
                            "Deletion Failed", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    // Handle SQL exception
                    JOptionPane.showMessageDialog(null, "An error occurred while deleting Customer",
                        "Deletion Failed", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_DeleteCustomerBtnActionPerformed

    private void UpdateCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateCustomerBtnActionPerformed

        String customerID = customerIdInput.getText().trim();
        String fullName = customerNameInput.getText().trim();
        String contactNumber = contactNumberInput.getText().trim();
        String email = emailInput.getText().trim();
        String address = addressInput.getText().trim();

        // Check if any of the fields are blank
        if (customerID.isEmpty() || fullName.isEmpty() || contactNumber.isEmpty() || 
                email.isEmpty() || address.isEmpty()) {
            // Show an error message
            JOptionPane.showMessageDialog(null, "All fields must be filled out", 
                    "Input Error", JOptionPane.ERROR_MESSAGE);
        } else {

            boolean success = false;
            success = CustomerController.updateCustomer(customerID, fullName, contactNumber, email, address);
            if (success) {
                JOptionPane.showMessageDialog(null, "Customer information updated successfully",
                    "Update Successful", JOptionPane.INFORMATION_MESSAGE);
                clearField();
            } else {
                JOptionPane.showMessageDialog(null, "Failed to update customer information",
                    "Update Failed", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_UpdateCustomerBtnActionPerformed

    private void customerNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerNameInputActionPerformed

    private void contactNumberInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNumberInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactNumberInputActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateDeleteCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDeleteCustomers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CloseBtn;
    private javax.swing.JButton DeleteCustomerBtn;
    private javax.swing.JButton UpdateCustomerBtn;
    private javax.swing.JTextArea addressInput;
    private javax.swing.JTextField contactNumberInput;
    private javax.swing.JLabel contactNumberLable;
    private javax.swing.JTextField customerIdInput;
    private javax.swing.JLabel customerIdLable;
    private javax.swing.JTextField customerNameInput;
    private javax.swing.JLabel customerNameLable;
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel emailLable;
    private javax.swing.JButton getCustomerDataBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel phoneNumberLable;
    // End of variables declaration//GEN-END:variables
}
