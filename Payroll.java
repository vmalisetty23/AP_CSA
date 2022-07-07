/**
 * @author Vasishta Malisetty
 * @version 26 February, 2021
 */
public class Payroll
{
    //instance variables
    private int[] itemsSold;
    private double[] wages;
    private static int count;
    private int sum;
    private double average;
    /**
     * Constructor for objects of class Payroll
     */
    public Payroll(int[] itemsSold)
    {
        this.itemsSold = itemsSold;
        wages = new double[10];
    }

    public double computeBonusThreshold(int[] itemsSold)
    {
        int greatest = itemsSold[0];
        int smallest = itemsSold[0];
        
        for (int i = 1; i < itemsSold.length; i++)
        {
            if (itemsSold[i] > greatest)
            {
                itemsSold[i] = greatest;
            }
            if (itemsSold[i] < smallest)
            {
                itemsSold[i] = smallest;
            }
        }
        
        double sum = 0.0;
        for (int x = 0; x < itemsSold.length; x++)
        {
            sum += itemsSold[x];
        }
        
        double average;
        average = (sum - greatest - smallest)/(itemsSold.length - 2);
        return average;
    }
    
    public void computeWages(double fixedWages, double perItemWages)
    {
        for(int i = 0; i < itemsSold.length; i++)
        {
            if (itemsSold[i] < computeBonusThreshold())
            {
                wages[i] = fixedWages + perItemWages * itemsSold[i];
            }
            else
            {
                wages[i] = (fixedWages + perItemWages * itemsSold[i] * 1.1);
            }
        }
    }
    
    
}
