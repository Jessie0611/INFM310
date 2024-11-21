//Employee Class Example
//This can be a stand alone java file, can compile but not run, only creating class not using it yet

public class Employee
{
    //data attributes
    private String lastName;
    private double hourlyWage;
    private double weeklyPay;

    //set methods
    public void setLastName(String name)
    {
        lastName = name;
        return;
    }
    public void setHourlyWage(double wage)
    {
        hourlyWage = wage;
        calculateWeeklyPay();
        return;
    }
    private void calculateWeeklyPay()
    {
        final double WEEKLY_HOURS = 40;
        weeklyPay = hourlyWage * WEEKLY_HOURS;
        return;
    }
    //get methods have to be public, interface will return values so not void
    public String getLastName()
    {
        return lastName;
    }
    public double getHourlyWage()
    {
        return hourlyWage;
    }
    public double getWeeklyPay()
    {
        return weeklyPay;
    }
} //end of employee class