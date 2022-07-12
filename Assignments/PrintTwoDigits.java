
/**
 * @author Vasishta Malisetty
 * @version 30 December, 2020
 */
public class printTwoDigits
{
    public static int printTwoDigits(int n)
    {
        for (int i = 0; i < n; i++)
        {
            int random = (int)(Math.random() * 10) + 10;
            System.out.println(random);
            if (random == 13)
            {
                System.out.println("The number 13 was found!");
            }
            else
            {
                System.out.println("The number 13 was not found");
            }
        }
        return n;
    }
}
