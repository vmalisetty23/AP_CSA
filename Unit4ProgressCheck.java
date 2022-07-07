
/**
 * @author Vasishta Malisetty
 * @version 1 January, 2021
 */
public class Unit4ProgressCheck
{
    public static void longestStreak(String str)
    {
        int longestStreak = 1;
        int currentStreak = 1;
        int len = str.length();
        char longestLetter = str.charAt(0);
        for (int i = 1; i < len - 1; i++)
        {
            if (str.charAt(i) == str.charAt(i - 1))
            {
               currentStreak++; 
            }
            else
            {
                currentStreak = 1;
            }
            
            if (currentStreak > longestStreak)
            {
                longestStreak = currentStreak;
                longestLetter = str.charAt(i);
            }
        }
        System.out.println(longestLetter + " " + longestStreak);
        
    }
}
