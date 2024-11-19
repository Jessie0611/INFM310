// Reverse.java -This program reverses numbers stored in an array.
// Input: Interactive Output: Original contents of array and the reversed contents of the array. 
import javax.swing.*;

public class Reverse
{
	public static void main(String args[]) 
	{
		int numbers[] = {9, 8, 7, 6, 5};
		int x; 

		// Print contents of array
		System.out.println("Original array:");
        printArray(numbers);
		// Call reverseArray method here
		reverseArray(numbers);
		//print content of array	
	
		System.out.println("Reversed array:");
        printArray(numbers);
		// Print contents of reversed array
		
		
		System.exit(0);

	} // End of main() method.

	// Write reverseArray method here.
	public static void reverseArray(int[] values)
	{
		int x, temp, size;
		size = values.length;
		for(x = 0; x < size / 2; x++)
		{	//swap current beginning with the end
			temp = values[x];
			values[x] = values[size-1-x];
			values[size-1-x] = temp;
		}
	}	
	public static void printArray(int[] values)
    {
        for(int i = 0; i < values.length; i++)
        {
            System.out.print(values[i] + " ");
        }
        System.out.println();

}

}