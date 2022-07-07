
/**
 * Class Main
 * @author Vasishta Malisetty
 * @version 15 October, 2020
 */
public class Main
{
    public static void main(String[] args)
    {
        Circle One = new Circle(6);
        Circle Two = new Circle(8);
        Circle Three = new Circle(10);
        
        System.out.println(One.getArea(6));
        System.out.println(Two.getArea(8));
        System.out.println(Three.getArea(10));
        
        
        
    }
}

/**
 * Class Circle
 * @author Vasishta Malisetty
 * @version 15 October, 2020
 */
public class Circle
{
    // instance variables - replace the example below with your own
    private double radius;

    /**
     * Constructor for objects of class Circle
     */
    public Circle(double theRadius)
    {
        // initialise instance variables
        radius = theRadius;
    }

    
    public static double getArea(double radius)
    {
        double totalArea = (double)(3.14 * (radius * radius));
        return totalArea;
    }
}
