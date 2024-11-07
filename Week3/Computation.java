import javax.swing.*;

public class Computation
{ 
    public static void main(String[] args)
    {
        double v1, v2;
        String vString1, vString2;
        //perform calc
        //call other calc methods

        vString1 = JOptionPane.showInputDialog("Enter first value: ");
        v1 = Integer.parseInt(vString1);

        vString2 = JOptionPane.showInputDialog("Enter Second value: ");
        v2 = Integer.parseInt(vString2);

        CalculateSum(v1,v2);

        System.exit(0);
    } 

public static void CalculateSum(double n1, double  n2)
{
    double sum;
    sum = n1+n2;

    JOptionPane.showMessageDialog(null, "Calculated Sum: " + sum);
}
    
}