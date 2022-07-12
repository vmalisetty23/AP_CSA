
/**
 * @author Vasishta Malisetty
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class shiftRight
{
    public static int[] shiftRight(int[] a1)
    {
        int temp = a1[a1.length - 1];
        for (int i = 0; i < a1.length; i++)
        {
            a1[a1.length - i] = a1[a1.length - i - 1];
        }
        temp = a1[0];
        return a1;
    }
    
    public static int[] shiftLeft(int[] a1)
    {
        int temp = a1[a1.length - 1];
        for (int i = 0; i < a1.length; i++)
        {
            a1[a1.length - i] = a1[a1.length - i + 1];
        }
        temp = a1[0];
        return a1;
    }
}
