
/**
 * @author Vasishta Malisetty
 * @version 08 February, 2021
 */
import java.util.Arrays;
public class arrays
{
    public static void main(String[] args)
    {
        int[] numbers = {1, 2, 4, 8, 16};
        
        System.out.println(numbers[3]);
        System.out.println(" ");
        
        int i = 0;
        while (i < numbers.length)
        {
            System.out.println(numbers[i]);
            i++;
        }
        
        System.out.println(" ");
        System.out.println(" ");
        
        for (int w = 0; w < numbers.length; w++)
        {
            System.out.println(numbers[w]);
        }
        
        System.out.println(" ");
        System.out.println(" ");
        
        for (int z = 0; z < 5; z++)
        {
            System.out.println(numbers[z]);
        }
        
        System.out.println(" ");
        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 2, 3};
        
        if (Arrays.equals(arr1, arr2))
        {
            System.out.println("Same");
        }
        else 
        {
            System.out.println("Not Same");
        }
        
        System.out.println(" ");
        System.out.println(arr1);
        System.out.println(" ");
        System.out.println(Arrays.toString(arr1));
    }
    
}
