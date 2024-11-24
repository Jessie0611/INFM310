//This project will create 2 rectangle objects, find their area and perimeter: A=lw / P=2(l+w)
public class Rectangle
{
    //data attributes
    private double length;
    private double width;
    public double A;
    public double P;

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
       public double calculateArea()
       {
           final double A;
           A = length*width;
           return A;
       }
       public double calculatePerimeter()
       {
           final double P;
           P = 2*(length + width);
           return P;
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
