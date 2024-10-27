// SuperMarket.java - This program creates a report that lists weekly hours worked 
// by employees of a supermarket. The report lists total hours for 
// each day of one week. 
// Input:  Interactive / Output: Report. 
import javax.swing.*;
public class SuperMarket
{
    public static void main(String args[])
	{
        final String HEAD1 = "WEEKLY HOURS WORKED";
        final String DAY_FOOTER = "          Day Total "; // Leading spaces are intentional.
        final String SENTINEL = "done"; // Named constant for sentinel value.
        double hoursWorked = 0; // Current record hours.
        String hoursWorkedString = ""; // String version of hours
        String dayOfWeek; // Current record day of week.
        double hoursTotal = 0; // Hours total for a day.
        String prevDay = ""; // Previous day of week.
        boolean done = false; // loop control

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
            hoursWorked = Double.parseDouble(hoursWorkedString);
            prevDay = dayOfWeek;
            hoursTotal = hoursWorked;
        }

        while (done == false) {
            dayOfWeek = JOptionPane.showInputDialog("Enter day of week or 'done' to quit: ");
            if (dayOfWeek.compareTo(SENTINEL) == 0) {
                done = true;
            } else {
                hoursWorkedString = JOptionPane.showInputDialog("Enter hours worked: ");
                hoursWorked = Double.parseDouble(hoursWorkedString);

                // Check for day change
                if (!dayOfWeek.equals(prevDay)) {
                    dayChange(prevDay, hoursTotal);
                    // Reset for new day
                    prevDay = dayOfWeek;
                    hoursTotal = 0; // Reset hours total for the new day
                }
                hoursTotal += hoursWorked;
            }
        }
        // Print total for the last day if there was any input
        if (!prevDay.isEmpty() && hoursTotal > 0) {
            dayChange(prevDay, hoursTotal);
        }

        System.exit(0);
    }

    // Method to print the total hours for the day
    public static void dayChange(String day, double totalHours) {
        System.out.println(day + DAY_FOOTER + totalHours);
    }
}
