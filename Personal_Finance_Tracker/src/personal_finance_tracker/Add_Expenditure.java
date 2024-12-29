/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//**************************************************************************************//
package personal_finance_tracker;
//*************************************************//

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author dylan
 */
//*************************************************//
public class Add_Expenditure extends javax.swing.JFrame {
    //*************************************************//
    /**
     * Creates new form Add_Expenditure
     */
    //*************************************************//
    
    //*************************************************//
    public Add_Expenditure() {
        initComponents();
    }
    //*************************************************//

    //*************************************************//
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //*************************************************//
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        cmbTypes = new javax.swing.JComboBox<>();
        btnExamples = new javax.swing.JButton();
        btnBack2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add an Expenditure");

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setText("Add an Expenditure by filling out the fields below and selecting the 'add expenditure' button ");

        btnAdd.setText("Add Expenditure");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblName.setText("Name the Expenditure:");

        lblType.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblType.setText("Type of Expenditure:");

        lblAmount.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblAmount.setText("Expenditure Amount:");

        cmbTypes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbTypes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rent", "Food", "Utilities", "Transportation", "Savings/Debt", "Health", "Entertainment", "Personal Care", "Family and Education", "Miscellaneous", "Housing" }));

        btnExamples.setText("What are the type of expenditures ?");
        btnExamples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExamplesActionPerformed(evt);
            }
        });

        btnBack2.setText("Back");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnExamples, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                            .addComponent(txtName))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cmbTypes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblType, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(96, 96, 96))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblType, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTypes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnBack2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExamples, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        
        //*************************************************//
        //confirm all text fields have values
        confirmValues();
        //*************************************************//
        
        //*************************************************//
        //get string values from fields
        String name = txtName.getText();
        //make sure the name is not greater than 20 characters
        if(name.length() > 20)
        {
            Personal_Finance_Tracker.textToSpeech("... Warning character length exceded");
            JOptionPane.showMessageDialog(null, "Warning, the 'Name' field cannot be greater than 20 characters in length", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String type = cmbTypes.getSelectedItem().toString();
        String amount = txtAmount.getText();
        //*************************************************//
        
        //*************************************************//
        //create an expenditure
        ExpenditureOrganiser expenditure = new ExpenditureOrganiser(name, type, amount);
        //*************************************************//
        
        //*************************************************//
        //save expenditure
        expenditure.saveExpenditure();
        Personal_Finance_Tracker.textToSpeech("... save successful");
        JOptionPane.showMessageDialog(null, "It has been saved successfully!!!", "Saved", JOptionPane.INFORMATION_MESSAGE);
        //*************************************************//
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnExamplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExamplesActionPerformed
        // TODO add your handling code here:
        
        //*************************************************//
        //message to showcase each of the types of expenditure's incase someone is not sure
        //types of categories generated from chat-GPT 
        String[] categories = {
            "Housing:\n  - Rent/Mortgage\n  - Property Taxes\n  - Home Insurance\n  - Maintenance/Repairs",
            "Food:\n  - Groceries\n  - Dining Out\n  - Snacks/Coffee",
            "Utilities:\n  - Electricity\n  - Water/Sewer\n  - Gas\n  - Internet\n  - Phone\n  - Trash/Recycling",
            "Transportation:\n  - Fuel\n  - Car Payment\n  - Insurance\n  - Public Transit\n  - Maintenance/Repairs\n  - Parking",
            "Savings/Debt:\n  - Emergency Fund\n  - Retirement Savings\n  - Investments\n  - Credit Card Payments\n  - Student Loans\n  - Personal Loans",
            "Health:\n  - Health Insurance\n  - Medical Bills\n  - Prescription Medications\n  - Dental Care\n  - Gym Membership",
            "Entertainment:\n  - Subscriptions (e.g., Netflix, Spotify)\n  - Hobbies\n  - Movies/Events",
            "Personal Care:\n  - Haircuts/Salon\n  - Skincare/Makeup\n  - Toiletries",
            "Family and Education:\n  - Childcare\n  - School Supplies\n  - Tuition Fees",
            "Miscellaneous:\n  - Gifts/Donations\n  - Clothing\n  - Travel/Vacations\n  - Pet Care\n  - Insurance (other types, e.g., life, renters)"
        };

        for (String category : categories) {
            JOptionPane.showMessageDialog(null, category, "Expenditure Group", JOptionPane.INFORMATION_MESSAGE);
        }
        //*************************************************//
    }//GEN-LAST:event_btnExamplesActionPerformed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        // TODO add your handling code here:

        //*************************************************//
        //go back to selection menu
        user_selection_window window = new user_selection_window();
        window.setVisible(true);
        dispose();
        //*************************************************//
    }//GEN-LAST:event_btnBack2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnExamples;
    private javax.swing.JComboBox<String> cmbTypes;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblType;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    //*************************************************//
    //confirm they have values
    private void confirmValues()
    {
        //*************************************************//
        //name of expenditure
        String name = txtName.getText();
        
        while(name.isBlank())
        {
            //*************************************************//
            JOptionPane.showMessageDialog(null, "Error, name must contain value. Please name your Expenditure", "Error", JOptionPane.INFORMATION_MESSAGE);
            name = JOptionPane.showInputDialog(null, "Please name your Expenditure:", "Enter name of Expenditure", JOptionPane.INFORMATION_MESSAGE);
            txtName.setText(name);
            //*************************************************//
        }
        //*************************************************//
        
        //*************************************************//
        //type of expenditure
        String type = cmbTypes.getSelectedItem().toString();
        
        while(type.isBlank())
        {
            //*************************************************//
            JOptionPane.showMessageDialog(null, "Error, name must contain value. Please name your Expenditure", "Error", JOptionPane.INFORMATION_MESSAGE);
            type = JOptionPane.showInputDialog(null, "Please name your Expenditure:", "Enter name of Expenditure", JOptionPane.INFORMATION_MESSAGE);
            cmbTypes.setSelectedItem(type);
            //*************************************************//
        }
        //*************************************************//
        
        //*************************************************//
        String amount = txtAmount.getText();
        
        while(amount.isBlank())
        {
            //*************************************************//
            JOptionPane.showMessageDialog(null, "Error, amount must contain value. Please enter the amount of your Expenditure", "Error", JOptionPane.INFORMATION_MESSAGE);
            amount = JOptionPane.showInputDialog(null, "Please nter the amount of your Expenditure:", "Enter amount of Expenditure", JOptionPane.INFORMATION_MESSAGE);
            txtAmount.setText(amount);
            //*************************************************//
        }
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    //method to save an expenditure to the file
    private void saveExpenditure (String expenditure)
    {
        //*************************************************//
        try {
            //*************************************************//
            // Create a File object for the text file
            File file = new File("List of Expenditure's.txt");
            //*************************************************//
            
            //*************************************************//
            // Pass the File object to the PrintWriter
            PrintWriter writer = new PrintWriter(file);
            //*************************************************//
            
            //*************************************************//
            // Write content to the file
            writer.println(expenditure);
            //*************************************************//
            
            //*************************************************//
            // Close the writer
            writer.close();
            //*************************************************//
            
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
    //*************************************************//
}
//***********************************END OF FILE****************************************//