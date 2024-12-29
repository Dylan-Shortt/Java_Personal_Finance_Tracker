/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//**************************************************************************************//
package personal_finance_tracker;
//*************************************************//

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dylan
 */
//*************************************************//
public class ExpenditureOrganiser {
    
    //*************************************************//
    //var's for each part of an expenditure
    private String name;
    private String type;
    private String amount;
    //*************************************************//

    //*************************************************//
    //base constructor
    public ExpenditureOrganiser() {
    }
    //*************************************************//
    
    //*************************************************//
    //getter and setter methods
    public void setName(String name) {
        this.name = name;
    }
//*************************************************//
    public void setType(String type) {
        this.type = type;
    }
//*************************************************//
    public void setAmount(String amount) {
        this.amount = amount;
    }
//*************************************************//
    public String getName() {
        return name;
    }
//*************************************************//
    public String getType() {
        return type;
    }
//*************************************************//
    public String getAmount() {
        return amount;
    }
    //*************************************************//

    //*************************************************//
    //base constructor
    public ExpenditureOrganiser(String name, String type, String amount) {
        this.name = name;
        this.type = type;
        this.amount = amount;
    }
    //*************************************************//
    
    //*************************************************//
    //method to write to a file
    public void saveExpenditure()
    {
        //*************************************************//
        try {
            //*************************************************//
            FileWriter writer = new FileWriter("Expenditure.txt", true);
            //*************************************************//
            
            //*************************************************//
            // Write content to the file
            writer.write(name + "#$#" + type + "#$#" + amount + "\n");
            //*************************************************//
            
            //*************************************************//
            // Close the writer
            writer.close();
            //*************************************************//
            
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException ex) {
            Logger.getLogger(ExpenditureOrganiser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    //*************************************************//

    //*************************************************//
    //return a list of objects
    public ArrayList<ExpenditureOrganiser> listOfExpenditures() {
        //*************************************************//
        ArrayList<ExpenditureOrganiser> expenditures = new ArrayList<>();
        //*************************************************//

        try {
            //*************************************************//
            // Create a File object for the text file
            File file = new File("Expenditure.txt");
            //*************************************************//
            
            //*************************************************//
            // Check if the file exists
            if (!file.exists()) {
                System.out.println("Expenditure file not found.");
                return expenditures;
            }
            //*************************************************//

            //*************************************************//
            // Open the file using a Scanner
            Scanner scanner = new Scanner(file);
            //*************************************************//

            //*************************************************//
            // Read each line and parse the data
            while (scanner.hasNextLine()) 
            {
                //*************************************************//
                String line = scanner.nextLine();
                //*************************************************//

                //*************************************************//
                // Split the line using the delimiter
                String[] parts = line.split("#\\$#");
                //*************************************************//

                //*************************************************//
                if (parts.length == 3) 
                {
                    //*************************************************//
                    // Create a new ExpenditureOrganiser object
                    ExpenditureOrganiser expenditure = new ExpenditureOrganiser(parts[0], parts[1], parts[2]);
                    //*************************************************//

                    //*************************************************//
                    // Add it to the list
                    expenditures.add(expenditure);
                    //*************************************************//
                }
                //*************************************************//
            }
            //*************************************************//

            //*************************************************//
            // Close the scanner
            scanner.close();
            //*************************************************//
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        //*************************************************//

        //*************************************************//
        return expenditures;
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    //method to find index by name
    public int findIndexByName(String searchName) {
        //*************************************************//
        ArrayList<ExpenditureOrganiser> expenditures = listOfExpenditures();
        //*************************************************//

        //*************************************************//
        for (int i = 0; i < expenditures.size(); i++) 
        {
            //*************************************************//
            if (expenditures.get(i).name.equals(searchName)) 
            {
                //*************************************************//
                return i;
                //*************************************************//
            }
            //*************************************************//
        }
        //*************************************************//

        //*************************************************//
        // Return -1 if no match is found
        return -1; 
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    //method to override the file with a changed list of contents
    public void updateExpenditureFile(ArrayList<ExpenditureOrganiser> expenditures)
    {
        //*************************************************//
        //try and catch to prevent errors
        try {
            //*************************************************//
            //we will use file writer to override and save to the text file
            FileWriter writer = new FileWriter ("Expenditure.txt");
            //*************************************************//
            
            //*************************************************//
            //write each object to the file
            for (ExpenditureOrganiser expenditure : expenditures)
            {
                writer.write(expenditure.getName() + "#$#" + expenditure.getType() + "#$#" + expenditure.getAmount() + "\n");
            }
            //*************************************************//
            
            //*************************************************//
            //close file
            writer.close();
            //*************************************************//
        } catch (IOException ex) {
            Logger.getLogger(ExpenditureOrganiser.class.getName()).log(Level.SEVERE, null, ex);
        }
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    //toStirng for displaying the var's
    @Override
    public String toString()
    {
        //*************************************************//
        String output = "";
        //*************************************************//
        
        //*************************************************//
        //create output String
        output = String.format("Name: %-25s Category: %-25s Amount: R%-2s", getName(), getType(), getAmount());
        //*************************************************//
        
        //*************************************************//
        //return 
        return output;
        //*************************************************//
    }
    //*************************************************//
}
//***********************************END OF FILE****************************************//