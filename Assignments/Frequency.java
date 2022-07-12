
/**
 * @author Vasishta Malistty
 * @version 29 December, 2020
 */
public class Frequency
{
    public static void main(String[] args)
    {
        int count = 0;
        int number = 1327;
        
        while (number <= 4542)
        {
            if (number % 3 == 0 && number % 5 != 0)
            {
                count++;
            }
            number++;
        }
        System.out.println(count);
    }
}
