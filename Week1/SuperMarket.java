import javax.swing.*;

public class SuperMarket {
    public static void main(String args[]) {
        final String HEAD1 = "WEEKLY HOURS WORKED";
        final String DAY_FOOTER = " Day Total "; // Leading spaces are intentional.
        final String SENTINEL = "done"; // Named constant for sentinel value.
        
        double hoursWorked = 0; // Current record hours.
        String hoursWorkedString = ""; // String version of hours.
        String dayOfWeek; // Current record day of week.
        double hoursTotal = 0; // Hours total for all days.
        boolean done = false; // loop control.

        // Print two blank lines.
        System.out.println();
        System.out.println();
        // Print heading.
        System.out.println(HEAD1);
        // Print two blank lines.
        System.out.println();
        System.out.println();

        // Read first record
        dayOfWeek = JOptionPane.showInputDialog("Enter day of week or done to quit: ");
        
        if (dayOfWeek.compareTo(SENTINEL) == 0) {
            done = true;
        } else {
            hoursWorkedString = JOptionPane.showInputDialog("Enter hours worked: ");
            hoursWorked = Double.parseDouble(hoursWorkedString);  // Changed to double for accuracy
            hoursTotal += hoursWorked; // Accumulate hours for the first day.
        }

        // Loop for input until user enters "done".
        while (!done) {
            // Print the day and hours worked.
            System.out.println(dayOfWeek + " " + hoursWorkedString);
            
            // Ask for the next day or exit condition.
            dayOfWeek = JOptionPane.showInputDialog("Enter day of week or done to quit: ");
            
            // Check for sentinel "done" to break out of the loop.
            if (dayOfWeek.compareTo(SENTINEL) == 0) {
                done = true;
            } else {
                hoursWorkedString = JOptionPane.showInputDialog("Enter hours worked: ");
                hoursWorked = Double.parseDouble(hoursWorkedString);  // Changed to double for accuracy
                hoursTotal += hoursWorked; // Accumulate hours for each day.
            }
        }

        // Print the total hours worked for the week.
        System.out.println(DAY_FOOTER + hoursTotal);
        
        // Exit the program.
        System.exit(0);
    }
}
