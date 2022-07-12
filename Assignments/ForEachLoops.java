
/**
 * @author Vasishta Malisetty
 * @version 10 February, 2021
 */
public class ForEachLoops
{
    public static void main(String[] args)
    {
        int[] numbers = {1, 3, 5, -2};
        
        for (int item: numbers)
        {
            item = item * 2;
            System.out.println(item);
        }
    }
