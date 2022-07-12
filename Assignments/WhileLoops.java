
/**
 * @author Vasishta Malisetty
 * @version 20 November, 2020
 */
import java.util.Scanner;
public class WhileLoops
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int sum = 0;
        int number = 1;
        
        
        while (number <= count)
        {
            sum = sum + number;
            number++;
        }
        
        System.out.println(sum);
        
    }
}
