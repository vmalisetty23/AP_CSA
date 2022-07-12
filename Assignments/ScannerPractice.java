
/**
 * @author Vasishta Malisetty
 * @version October 26, 2020
 */
import java.util.Scanner;

public class ScannerPractice
{
    public static void main(String[] args)
    {
        Scanner userCC = new Scanner(System.in); //create a scanner object
        System.out.println("Enter your credit card number: ");
        String userCreditCard = userCC.nextLine(); //read user input
        
        //closing Scanner
        userCC.close();
    }
}
