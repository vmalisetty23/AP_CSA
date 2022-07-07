
/**
 * @author Vasishta Malisetty
 * @version 08 February, 2021
 */
public class Values
{
    public static double average(int[] Array)
    {
        double sum = 0;
        for (int i = 0; i < Array.length; i++)
        {
            sum = sum + Array[i];
        }
        
        double average = (sum/Array.length);
        return average;
    }
    
    public static int countAboveAve(int[] Array)
    {
        int count = 0;
        for (int w = 0; w < Array.length; w++)
        {
           if (Array[w] > average(Array))
           {
               count++;
           }
        }
        return count;
    }
    
    public static int largest(int Array[])
    {
        int greatest = Array[0];
        for (int x = 1; x < Array.length; x++)
        {
            if (Array[x] > greatest)
            {
                greatest = Array[x];
            }
        }
        return greatest;
    }
    
    public static int indexOfSmallest(int[] Array)
    {
        int least = Array[0];
        int index = 0;
        for (int y = 1; y < Array.length; y++)
        {
            if (Array[y] < least)
            {
                least = Array[y];
                index = y;
            }
        }
        return index;
    }
    
    public static void main(String[] args)
    {
      int Array[] = {1, 2, 3, 4, 5};
      
      System.out.println(average(Array));
      System.out.println(countAboveAve(Array));
      System.out.println(largest(Array));
      System.out.println(indexOfSmallest(Array));
    }
}
