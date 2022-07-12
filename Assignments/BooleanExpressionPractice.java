
/**
 * @author Vasishta Malisetty
 * @version 9 November, 2020
 */
public class BooleanExpressionPractice
{
    public static int max(int x, int y, int z)
    {
        return Math.max(x, (Math.max(y, z)));
    }
    
    public static double perfectSquare(double n)
    {
        Math.sqrt(n);
        Math.round(n);
        Math.pow(n,2);
        if (Math.pow(n,2) == n)
        {
            return n;
        }
        return n; 
    }
}
