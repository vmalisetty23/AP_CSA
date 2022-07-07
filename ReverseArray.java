
/**
 * @author Vasishta Malisetty
 * @version (a version number or a date)
 */
public class ReverseArray
{
    public static void main(String[] args)
    {
        int count = 0;
        int [] Array = {11, 42, -5, 27, 0, 89};
        
        for(int i = 0; i < Array.length; i++)
        {
            count++;
        }
        
        System.out.println(count);
        
        for(int x = count; x > 0; x--)
        {
            int number = Array[x];
            System.out.println(number);
        }
    }
}
