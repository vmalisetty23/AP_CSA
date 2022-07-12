
/**
 * @author Vasishta Malisetty
 * @version 22 December, 2020
 */
import java.util.Scanner;
public class NestedLoops
{
    public static void main(String[] args)
    {
        //127 should equal 2020
        System.out.print("Input a target Population in the millions: ");
        Scanner scan = new Scanner(System.in);
        double targetPopulation = scan.nextDouble();
        
        int startYear = 2014;
        double startingPopulation = 123.8;
        double growthRate = 1.005;
        int newYear = 0;
        while (startingPopulation <= targetPopulation)
        {
            startingPopulation = startingPopulation * growthRate;
            newYear++; 
        }
        
        int targetYear = newYear + startYear;
        
        System.out.print("The target population will be reached in the year " + targetYear);
        
    }
}
