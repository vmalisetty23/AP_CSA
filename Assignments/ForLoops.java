
/**
 * @author Vasishta Malisetty
 * @version 
 */
import java.util.Scanner;
public class ForLoops
{
    public static int CountFactors(int i)
    {
        System.out.print("Enter a Number: ");
        Scanner number = new Scanner (System.in);
        int Number = number.nextInt();
        int n = 0;
        
        for (i = Number; i > 0; i--)
        {
            if (Number % i == 0)
            {
                System.out.println(i);
                n = n + 1;
            }
        }
        return n;
    }
}
