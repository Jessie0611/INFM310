import javax.swing.JOptionPane;

public class MyRectangleClassProgram
{
    public static void main(String[] args)
    {
        Rectangle rectangle1 = new Rectangle();  //calling default constructor to instatiate the object
        Rectangle rectangle2 = new Rectangle();  //calling default constructor to instatiate the object

    rectangle1.setLength(10);
    rectangle1.setWidth(5);
    rectangle2.setLength(7);
    rectangle2.setWidth(3);

    rectangle1.calculateArea();
    rectangle1.calculatePerimeter();

    rectangle2.calculateArea();
    rectangle2.calculatePerimeter();

    JOptionPane.showMessageDialog(null,"Rectangle 1 Area: " + rectangle1.calculateArea());
    JOptionPane.showMessageDialog(null,"Rectangle 1 Perimeter: " + rectangle1.calculatePerimeter());
    JOptionPane.showMessageDialog(null,"Rectangle 2 Area: " + rectangle2.calculateArea());
    JOptionPane.showMessageDialog(null,"Rectangle 2 Perimeter: " + rectangle2.calculatePerimeter());
    
    }
}