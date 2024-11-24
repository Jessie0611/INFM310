//This project will create 2 rectangle objects, find their area and perimeter: A=lw / P=2(l+w)
import javax.swing.*;

public class Rectangle
{
    //data attributes
    private double length;
    private double width;
    private double A;
    private double P;

    //set methods
       public void setLength(double l)
       {
           length = l;
           return;
       }
       public void setWidth(double w)
       {
           width = w;
           return;
       }

       //calculat a&p
       public void calculateArea(double area)
       {
           final double A;
           A = length*width;
           return;
       }
       public void calculatePerimeter(double perimeter)
       {
           final double P;
           P = 2*(length + width);
           return;
       }

       //get methods
        public double getLength()
        {
            return length;
        }
        public double getWidth()
        {
            return width;
        }
        public double getA()
        {
            return A;
        }
        public double getP()
        {
            return P;
        }

}
