/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//**************************************************************************************//
package personal_finance_tracker;
//*************************************************//

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author dylan
 */
//*************************************************//
public class ViewAllExpenditures extends javax.swing.JFrame {
    //*************************************************//
    /**
     * Creates new form ViewAllExpenditures
     */
    //*************************************************//
    
    //*************************************************//
    private Personal_Finance_Tracker personal = new Personal_Finance_Tracker();
    public ViewAllExpenditures() {
        initComponents();
        displayAllExpenditures();
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

        lblTitile = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDisplay = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();
        btnGraph = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        btnBalance = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Display all Expenditures ");

        lblTitile.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblTitile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitile.setText("Full List Of Expenditures");

        txaDisplay.setEditable(false);
        txaDisplay.setColumns(20);
        txaDisplay.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txaDisplay.setRows(5);
        jScrollPane1.setViewportView(txaDisplay);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnGraph.setText("Display Graph Of Expenditures");
        btnGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraphActionPerformed(evt);
            }
        });

        lblTotal.setText("Total Expenditures:");

        btnBalance.setText("Balance");
        btnBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBalanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(txtTotal))
                        .addGap(18, 18, 18)
                        .addComponent(btnBalance, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGraph)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitile, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnBack, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(btnGraph, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTotal)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        //*************************************************//
        //return to user selection window
        user_selection_window window = new user_selection_window();
        window.setVisible(true);
        dispose();
        //*************************************************//
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraphActionPerformed
        // TODO add your handling code here:
        
        //*************************************************//
        //display graph of expenditures
        displayGraph();
        //*************************************************//
    }//GEN-LAST:event_btnGraphActionPerformed

    private void btnBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBalanceActionPerformed
        // TODO add your handling code here:
        
        //*************************************************//
        //calculate total expenses 
        double expenses = Double.parseDouble(txtTotal.getText().substring(1));
        //*************************************************//
        
        //*************************************************//
        //get total income for the month 
        String input = (JOptionPane.showInputDialog(null, "Please enter your monthly income: ", "Monthly Income", JOptionPane.INFORMATION_MESSAGE));
        double income = Double.parseDouble(input);
       //*************************************************//
       
       //*************************************************//
       //display monthly balance
       double balance = income - expenses;
       
       //balance is positive 
       if(balance > 0)
       {
           personal.textToSpeech("... Well done, your are net Positive");
           JOptionPane.showMessageDialog(null, "Avaliable savings: R" + balance, "Net Positive", JOptionPane.INFORMATION_MESSAGE);
       }
       else
       {
           //if_ negative
           personal.textToSpeech("Warning ... You are Net Negative");
           JOptionPane.showMessageDialog(null, "Avaliable savings: R" + balance, "Net Negative", JOptionPane.WARNING_MESSAGE);
           
       }
       //*************************************************//
    }//GEN-LAST:event_btnBalanceActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBalance;
    private javax.swing.JButton btnGraph;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitile;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextArea txaDisplay;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    //*************************************************//
    // Display all of the expenditures
    private void displayAllExpenditures() 
    {
        //*************************************************//
        // Initialize display string
        StringBuilder display = new StringBuilder();
        int totalExpenditures = 0;
        //*************************************************//
    
        //*************************************************//
        // Get the list of all expenditures
        ExpenditureOrganiser expenditure = new ExpenditureOrganiser();
        ArrayList<ExpenditureOrganiser> array = expenditure.listOfExpenditures();
        //*************************************************//
    
        //*************************************************//
        // Format and display the list of expenditures
        for (ExpenditureOrganiser temp : array) 
        {
            display.append(temp.toString()).append("\n");
            totalExpenditures += Integer.parseInt(temp.getAmount());
        }
        //*************************************************//

        //*************************************************//
        // Set monospaced font for proper alignment
        txaDisplay.setFont(new java.awt.Font("Monospaced", java.awt.Font.PLAIN, 12));
        //*************************************************//
        
        //*************************************************//
        // Set display text in the text area
        txaDisplay.setText(display.toString());
        //*************************************************//
        
        //*************************************************//
        //update total display
        txtTotal.setText("R " + totalExpenditures);
        //*************************************************//
    }
    //*************************************************//

    //*************************************************//
    //display the pie-graph
    //this pie-chart was created with the help of ChatGPT for sourcing new code and new Java Libraries
    private void displayGraph() 
    {
        //*************************************************//
        // Prepare the dataset
        DefaultPieDataset dataset = new DefaultPieDataset();
        ExpenditureOrganiser expenditureOrganiser = new ExpenditureOrganiser();
        ArrayList<ExpenditureOrganiser> expenditures = expenditureOrganiser.listOfExpenditures();
        //*************************************************//
        
        //*************************************************//
        // Populate dataset with category frequencies
        for (ExpenditureOrganiser expenditure : expenditures) 
        {
            //*************************************************//
            String type = expenditure.getType();
            double amount = Double.parseDouble(expenditure.getAmount());
            //*************************************************//

            try {
                //*************************************************//
                // Try to get the current value for the key
                Number currentAmount = dataset.getValue(type);
                dataset.setValue(type, currentAmount.doubleValue() + amount);
                //*************************************************//
            } catch (org.jfree.data.UnknownKeyException e) {
                //*************************************************//
                // Key not found, so add it with the initial amount
                dataset.setValue(type, amount);
            }
            //*************************************************//
        }
        //*************************************************//

        //*************************************************//
        // Create the pie chart
        JFreeChart pieChart = ChartFactory.createPieChart(
            "Expenditure Distribution",
            dataset,
            true, // Legend
            true, // Tooltips
            false // URLs
        );
        //*************************************************//

        //*************************************************//
        // Display the chart in a panel
        ChartPanel chartPanel = new ChartPanel(pieChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 370));
        //*************************************************//

        //*************************************************//
        // Show in a dialog
        JFrame chartFrame = new JFrame("Expenditure Pie Chart");
        chartFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        chartFrame.add(chartPanel);
        chartFrame.pack();
        chartFrame.setVisible(true);
        //*************************************************//
    }
    //*************************************************//

}
//***********************************END OF FILE****************************************//