//Example program which uses the Employee Class

import javax.swing.JOptionPane;

public class EmployeeWages
{
    public static void main(String[] args)
    {
        Employee myEmployee = new Employee(); //calling default constructor to instatiate the object

        //call set methods to assign values
        myEmployee.setLastName("Battles");
        myEmployee.setHourlyWage(12.00);
        //call get methods to display values
       JOptionPane.showMessageDialog(null,"Employee Last Name: " + myEmployee.getLastName());
       JOptionPane.showMessageDialog(null,"Employee Hourly Wage: " + myEmployee.getHourlyWage());
       JOptionPane.showMessageDialog(null,"Employee Weekly Pay: " + myEmployee.getWeeklyPay());

       System.exit(0);
    }    
}