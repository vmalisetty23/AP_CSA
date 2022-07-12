
/**
 * @author Vasishta Malisetty
 * @version 29 December, 2020
 */
import java.util.Scanner;
public class ExtractingDigits
{
    public static void main(String[] args)
    {
        System.out.print("Enter Integer: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        
        while (number != 0)
        {
            System.out.println(number % 10);
            number /= 10;
        }
        
    }
}
