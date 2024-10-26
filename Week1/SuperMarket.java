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
		final String DAY_FOOTER = "          Day Total ";  // Leading spaces are intentional.
		final String SENTINEL = "done";		// Named constant for sentinel value. 
		double hoursWorked = 0;       		// Current record hours.
		String hoursWorkedString = "";   	// String version of hours
		String dayOfWeek;			// Current record day of week.
		double hoursTotal = 0;      		// Hours total for a day.
		String prevDay = ""; 		   	// Previous day of week.
		boolean done = false;				// loop control

		System.out.println(); 
		System.out.println(); 
		// Print heading.
		System.out.println(HEAD1);
		// Print two blank lines.
		System.out.println(); 
		System.out.println(); 

		// Read first record 
		dayOfWeek = JOptionPane.showInputDialog("Enter day of week or done to quit: ");
		if(dayOfWeek.compareTo(SENTINEL) == 0)
			done = true;
		else
		{
			hoursWorkedString = JOptionPane.showInputDialog("Enter hours worked: ");
			hoursWorked = Integer.parseInt(hoursWorkedString); 
			prevDay = dayOfWeek;
			hoursTotal = hoursWorked;
		}
		while(done == false)
		{	
			dayOfWeek = JOptionPane.showInputDialog("Enter day of week or 'done' to quit: ");
            if (dayOfWeek.compareTo(SENTINEL) == 0) {
                done = true;
		} else {
			hoursWorkedString = JOptionPane.showInputDialog("Enter hours worked: ");
			hoursWorked = Double.parseDouble(hoursWorkedString); 

		}
		hoursTotal += hoursWorked;
		if (hoursTotal > 0) {
            System.out.println(DAY_FOOTER + hoursTotal);
        }
					
		System.exit(0);

	} // End of main() method.
	
}
}
