// Calculator.java - This program performs arithmetic, ( +. -, *. /, % ) on two numbers
// Input:  Interactive.  Output:  Result of arithmetic operation
import javax.swing.*;

public class Calculator
{
	public static void main(String args[]) 
	{
		double numberOne, numberTwo;              	
		String numberOneString, numberTwoString;
		String operation;
		double result; 	
						
		numberOneString = JOptionPane.showInputDialog("Enter the first number: ");
		numberOne = Double.parseDouble(numberOneString); 
		numberTwoString = JOptionPane.showInputDialog("Enter the second number: ");
		numberTwo = Double.parseDouble(numberTwoString); 
		operation = JOptionPane.showInputDialog("Enter an operator (+.-.*,/,%): ");
		
		// Call performOperation method here		
		result = performOperation(numberOne, numberTwo, operation);

		System.out.format("%.2f",numberOne);
		System.out.print(" " + operation + " ");
		System.out.format("%.2f", numberTwo);
		System.out.print(" = ");
		System.out.format("%.2f", result);
	
		System.exit(0);

	} // End of main() method.
	
	public static double performOperation(double nOne, double nTwo, String op)
	{
		double answer = 0;
		if (op.equals("+"))
		{
			answer = nOne + nTwo;	
			return answer;
		}else if (op.equals("-"))
		{
			answer = nOne - nTwo;
			return answer;	
		}else if(op.equals("*"))
		{
			answer = nOne * nTwo;
			return answer;
		}else if (op.equals("/"))
		{
			if(nTwo == 0)
			{
				JOptionPane.showMessageDialog(null,"Error: Division by 0 is invalid.");
				System.exit(1);
			}
			else{
				answer = nOne/nTwo;
				return answer;
			}
		}else if (op.equals("%")){
			if(nTwo == 0)
			{
				JOptionPane.showMessageDialog(null,"Error: % by 0 is invalid.");
				System.exit(1);
			}
			else{
				answer = nOne%nTwo;
				return answer;
			}
		}

	}
	

}

