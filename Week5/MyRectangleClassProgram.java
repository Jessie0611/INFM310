import javax.swing.JOptionPane;

public class MyRectangleClassProgram
{
    public static void main ()
    {
        Rectangle rectangle1 = new Rectangle();  //calling default constructor to instatiate the object
        Rectangle rectangle2 = new Rectangle();  //calling default constructor to instatiate the object

    rectangle1.setLength(10);
    rectangle1.setWidth(5);
    rectangle2.setLength(7);
    rectangle2.setWidth(3);

    JOptionPane.showMessageDialog(null,"Rectangle 1 Area: " + Rectangle.getA());
    JOptionPane.showMessageDialog(null,"Rectangle 1 Perimeter: " + Rectangle.getP());
    JOptionPane.showMessageDialog(null,"Rectangle 2 Area: " + Rectangle.getA());
    JOptionPane.showMessageDialog(null,"Rectangle 2 Perimeter: " + Rectangle.getP());
    
    }
}