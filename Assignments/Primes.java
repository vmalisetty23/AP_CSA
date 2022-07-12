
/**
 * @author Vasishta Malisetty
 * @version 28 December, 2020
 */
import java.util.Scanner;
public class Primes
{
    /**
     *
     */
    public static int countFactors(int x)
    {
       int count = 0;
       for (int i = x; i > 0; i--)
       {
          if (x % i == 0)
          {
              System.out.println(i);
              count++;
          }
       }
       return count;
    }
    
    public static boolean isPrime(int n)
    {
        int factors = 0;
        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)
            {
                factors++;
            }
        }
        if (factors == 2)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}
