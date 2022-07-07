
/**
 * @author Vasishta Malisetty
 * @version September 30, 2020
 */
public class Statistics
{
    public static void main(String[] args)
    {
        double Grade1 = 95;
        double Grade2 = 85;
        double Grade3 = 93;
        
        double SumofGrades = (Grade1 + Grade2 + Grade3);
        double AverageofGrades = SumofGrades / (double)3;
        
        System.out.println("The Average is: " + AverageofGrades);
        
        double Variance1 = Math.abs(AverageofGrades - Grade1);
        double Variance2 = Math.abs(AverageofGrades - Grade2);
        double Variance3 = Math.abs(AverageofGrades - Grade3);
        
        double StandardDeviation = (Variance1 + Variance2 + Variance3) / (double)3;
        System.out.println("The Standard Deviation is: " + StandardDeviation);
    }
}
