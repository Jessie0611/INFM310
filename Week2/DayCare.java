import javax.swing.*;

public class DayCare
 {
    public static void main(String args[])
    {
        // Declare variables
        double weeklyRate[][] ={{30.00, 60.00, 88.00, 115.00, 140.00},
                                {26.00, 52.00, 70.00, 96.00, 120.00},
                                {24.00, 46.00, 67.00, 89.00, 110.00},
                                {22.00, 40.00, 60.00, 75.00, 88.00},
                                {20.00, 35.00, 50.00, 66.00, 84.00}};
        int numDays;
        int age;
        String numDaysString;
        String ageString;
        int QUIT = 999;

        ageString = JOptionPane.showInputDialog("Enter the age of the child or 999 to quit: ");
        age = Integer.parseInt(ageString);

        
    }//Exit main
}//Exit DayCare