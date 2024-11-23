import javax.swing.*;

public class Computation {
    public static void main(String[] args) {
        double v1, v2;
        String vString1, vString2;

        // Prompt the user for input
        vString1 = JOptionPane.showInputDialog("Enter first value: ");
        v1 = Double.parseDouble(vString1);

        vString2 = JOptionPane.showInputDialog("Enter second value: ");
        v2 = Double.parseDouble(vString2);

        // Call methods to perform calculations
        CalculateSum(v1, v2);
        CalculateDifference(v1, v2);
        CalculateProduct(v1, v2);

        // Exit the program
        System.exit(0);
    }

    // Method to calculate and display the sum
    public static void CalculateSum(double n1, double n2) {
        double sum = n1 + n2;
        JOptionPane.showMessageDialog(null, "Calculated Sum: " + sum);
    }

    // Method to calculate and display the difference
    public static void CalculateDifference(double n1, double n2) {
        double difference = n1 - n2;
        JOptionPane.showMessageDialog(null, "Calculated Difference: " + difference);
    }

    // Method to calculate and display the product
    public static void CalculateProduct(double n1, double n2) {
        double product = n1 * n2;
        JOptionPane.showMessageDialog(null, "Calculated Product: " + product);
    }
}
