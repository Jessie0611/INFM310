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

    System.out.println("Rectangle 1 Area: " + rectangle1.calculateArea());
    System.out.println("Rectangle 1 Perimeter: " + rectangle1.calculatePerimeter());
    System.out.println("Rectangle 2 Area: " + rectangle2.calculateArea());
    System.out.println("Rectangle 2 Perimeter: " + rectangle2.calculatePerimeter());
    
    }
}