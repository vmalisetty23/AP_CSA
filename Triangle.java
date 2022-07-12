
/**
 * @author Vasishta Malisetty
 * @version 17 December, 2020
 */
public class Triangle
{
    public static int Triangle(int Stars)
    {
        int x;
        for (x = Stars; x >= 0; x--)
        {
            
          
            for (int y = x; y <= Stars; y++)
            {
                System.out.print("*");
            } 
            System.out.println();
        }
        return x;
    }
