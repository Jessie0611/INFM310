import javax.swing.*;

public class SumAndProduct
{
    public static void main(String[] args)
    {
        int number;
        String numString;
        

        numString = JOptionPane.showInputDialog("Enter a number or 0 to quit: ");
        number = Integer.parseInt(numString);  
        while (number != 0)
        {
                findSum(number);
                findProduct(number);

            numString = JOptionPane.showInputDialog("Enter a number or 0 to quit: ");
            number = Integer.parseInt(numString);
            
        }
        System.exit(0);
    }
    public static void findSum(int num)
    {
        int sum = 0, i;

        for(i = 1; i <= num; i++)
        {
            sum += i;
        }
        JOptionPane.showMessageDialog(null, "Sum: " + sum);
    }
    public static void findProduct(int num)
    {
        int product = 1, p;

        for(p = 1; p <= num; p++)
        {
            product *= p;
        }
        JOptionPane.showMessageDialog(null,"Product: " + product);
    }
}
