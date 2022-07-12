/**
 * @author Vasishta Malisetty
 * @version January 8, 2021
 */
public class Main
{
    public static void main(String[] args)
    {
        Point One = new Point(3, 4);
        System.out.println(One.distanceToOrigin());
        One.printTranslate();
        
        
        Circle Two = new Circle(3, 4, 2);
        System.out.println(Two.getArea());
        System.out.println(Two.tripleTheRadius());
    }
    
}

/**
 * Class Point
 * @author Vasishta Malisetty
 * @version January 8, 2021
 */
public class Point extends Main
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;

    public Point(int newX, int newY)
    {
        x = newX;
        y = newY;
    }
    
    public void translate(int dx, int dy)
    {
        x += dx;
        y += dy;
    }
    
    public double distanceToOrigin()
    {
        return Math.sqrt(x * x + y * y);
    }
    
    //accessor method
    public void printTranslate()
    {
        System.out.println(x + " " + y);
    }
    
    public String toString()
    {
        return this.x + "," + this.y;
    }
}


/**
 * Class Circle
 * @author Vasishta Malisetty
 * @version January 8, 2021
 */
public class Circle
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private double radius;

    public Circle(int newX, int newY, double r)
    {
        x = newX;
        y = newY;
        radius = r;
        
    }

    public void translate(int dx, int dy)
    {
      x += dx;
      y += dy;
    }
    
    public double getArea()
    {
        return (3.14 * radius * radius);
    }
    
    public double tripleTheRadius()
    {
        return (radius * radius * radius);
    }
    
    
}
