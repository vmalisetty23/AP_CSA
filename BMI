/**
 * @author Vasishta Malisetty
 * @version 9 November, 2020
 */
import java.util.Scanner;
public class BMI
{
    
    public static void main(String[] args)
    {
        System.out.println("Enter Height (in inches):");
        Scanner Height = new Scanner (System.in);
        double height = Height.nextDouble();
        System.out.println("Enter Weight (in pounds):");
        Scanner Weight = new Scanner (System.in);
        double weight = Weight.nextDouble();
        
        double BMI = ((weight / (height * height)) * 703);
        System.out.println("BMI : " + BMI);
        
        if (BMI < 18.5)
        {
            System.out.println("You are Underweight");
        }
        else if (18.5 <= BMI && BMI < 25.0)
        {
            System.out.println("You are Normal");
        }
        else if (25.0 <= BMI && BMI < 30.0)
        {
            System.out.println("You are Overweight");
        }
        else if (30.0 <= BMI)
        {
            System.out.println("You are Obese");
        }
    }
    
}
