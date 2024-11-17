//computes hotel guest rates at a hotel, include 2 overloaded methods named computeRate()
import java.text.NumberFormat;

import javax.swing.*;

public class Cornwall
{
	public static void main(String args[]) 
	{
        int numDays;
        double balance = 0.0, planCost = 0.0;
        String getDays, mealPlan;

        getDays = JOptionPane.showInputDialog("How many days are you planning to stay?");
        numDays = Integer.parseInt(getDays);

		mealPlan = JOptionPane.showInputDialog("Enter code for meal plan or X for none. ");

		balance = computeRate(numDays);
		
		if (!mealPlan.equalsIgnoreCase("X"))
		{
            planCost = computeRate(numDays, mealPlan);
            balance = planCost;
        }
        String formattedBalance = String.format("$%.2f", balance);

		JOptionPane.showMessageDialog(null, "The total cost for your stay is: " + formattedBalance);

		System.exit(0);
    }

	public static double computeRate(int numDays) {
        //V1 Rate is 99.99 per day with no meal plan
   		//each method returns the rate to the calling program to bbe displayed
		return numDays * 99.99;
    }

	public static double computeRate(int numDays, String mealPlan) {
        double mealCost = 0.0;
		//V2 accepts number of days and a code for a meal plan
        if (mealPlan.equalsIgnoreCase("A")) {
            // 3 meals per day at 169.00 per day
            mealCost = numDays * 169.00;
        } else if (mealPlan.equalsIgnoreCase("C")) {
            // Breakfast only at 112.00 per day
            mealCost = numDays * 112.00;
		}else {
            // Invalid meal plan
            JOptionPane.showInputDialog("Invalid meal plan code. Enter correct meal plan or x for none. ");
        }
		//each method returns the rate to the calling program to bbe displayed
        return mealCost;
    }
}