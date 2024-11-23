import javax.swing.*;

public class DayCare
{
    public static void main(String args[])
    {
        // Declare variables
        double weeklyRate[][] = {
            {30.00, 60.00, 88.00, 115.00, 140.00}, // age 0
            {26.00, 52.00, 70.00, 96.00, 120.00},  // age 1
            {24.00, 46.00, 67.00, 89.00, 110.00},  // age 2
            {22.00, 40.00, 60.00, 75.00, 88.00},   // age 3
            {20.00, 35.00, 50.00, 66.00, 84.00}};  // age 4+ (maximum age 4)

        int numDays;
        int age;
        String numDaysString;
        String ageString;
        final int QUIT = 999;

        age = 0;
        numDays = 0;
        while (age != QUIT)
        {
            // Get age input
            ageString = JOptionPane.showInputDialog("Enter the age of the child or 999 to quit: ");
            age = Integer.parseInt(ageString);

            if (age == QUIT)
            {
                break;
            }

            // Ensure age is within valid range (0 to 4)
            while (age < 0) {
                ageString = JOptionPane.showInputDialog("Invalid age. Please enter an age between 0 and 5: ");
                age = Integer.parseInt(ageString);
            }

            // If age is 5 or greater, treat as age 4
            if (age > 4) {
                age = 4;
            }

            // Get number of days per week input
            numDaysString = JOptionPane.showInputDialog("Enter number of days per week (1-5) or 999 to quit: ");
            numDays = Integer.parseInt(numDaysString);

            if (numDays == QUIT)
            {
                break;
            }

            // Ensure number of days is between 1 and 5
            while (numDays < 1 || numDays > 5) {
                numDaysString = JOptionPane.showInputDialog("Invalid number of days. Please enter the number of days between 1 and 5: ");
                numDays = Integer.parseInt(numDaysString);
            }

            // Determine and print the weekly rate
            double rate = weeklyRate[age][numDays - 1]; 
            System.out.println("The weekly rate for age " + age + " for " + numDays + " day(s) is: $" + rate);
        }
    }// Exit main
}// Exit DayCare
