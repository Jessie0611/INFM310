// HouseholdSize.java - This program uses a bubble sort to arrange up to 300 household sizes in
// descending order and then prints the mean and median household size.
// Input: Interactive.
// Output: Mean and median household size.
import javax.swing.*;
public class HouseholdSize
{
	public static void main(String args[])
	{
		// Declare variables.
		final int SIZE = 300; // Maximum number of household sizes.
		int householdSizes[] = new int[SIZE]; // Array used to store up to 300 household sizes.
		int x;
		int limit = SIZE; // limit = total num of households
		int householdSize = 0; 
		String householdSizeString;
		int pairsToCompare;
		boolean switchOccurred;
		int temp;
		double sum = 0;
		double mean = 0;
		double median = 0;
		// Input household size
		householdSizeString = JOptionPane.showInputDialog("Enter household size or 999 to quit: ");
		householdSize = Integer.parseInt(householdSizeString);
		
		// This is the work done in the fillArray() method
		x = 0;
		while(x < limit && householdSize != 999)
		{
			// Place value in array.
			householdSizes[x] = householdSize;
			sum += householdSize; // Calculate total of household sizes here
			x++; // Get ready for next input item.
			householdSizeString = JOptionPane.showInputDialog("Enter household size or 999 to quit: ");
			householdSize = Integer.parseInt(householdSizeString);
		} // End of input loop.
		limit = x; //actual number of array
		mean = sum / limit; // Find the mean
		// This is the work done in the sortArray() method
		pairsToCompare = limit -1;
		switchOccurred = true;

		while (switchOccurred == true) //go through all passes
		{
			x = 0;
			switchOccurred = false;
			while (x < pairsToCompare) //go through oine pass with all pair comparison
			{
				if (householdSizes[x] < householdSizes[x + 1])
				{ 
					temp = householdSizes[x];
            		householdSizes[x] = householdSizes[x + 1];
            		householdSizes[x + 1] = temp;
            		switchOccurred = true; 
				}
				x++;
			}	
			pairsToCompare--;
		}	
		// Print the mean
		System.out.println("Mean: " + mean);
		
		// Calculate the median, check the value of limit, if odd then median will be in the middle, if even median will be the average of the two middle elements
		if (limit % 2 == 0)
		{
            median = (householdSizes[limit / 2 - 1] + householdSizes[limit / 2]) / 2.0;
		}else{
			median = householdSizes[limit / 2];
		}
		// Print the median
		System.out.println("Median: " + median);
	
		System.exit(0);
	} // End of main() method.
} // End of HouseholdSize class.
