//lab 9-7
//

import javax.swing.*;

public class ChangeCase
{
	public static void main(String args[]) 
	{
		String sample;
		
		sample = JOptionPane.showInputDialog("Enter a string or 'done' to quit: ");

		while (sample.compareTo("done") != 0)
		{
			JOptionPane.showMessageDialog(null,"Lowercase: " +sample.toLowerCase());
			JOptionPane.showMessageDialog(null, "Uppercase: " +sample.toUpperCase());

			sample = JOptionPane.showInputDialog("Enter a string or 'done' to quit: ");
		}
		System.exit(0);
    }

}