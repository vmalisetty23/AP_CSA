
/**
 * @author Vasishta Malisety
 * @version 29 December, 2020
 */
public class Palindrome
{
    public static boolean isPalindrome(String str)
    {
        int length = str.length();
        for(int i = 0; i < length; i++)
       {
           String current = str.substring(i, i + 1);
           String opposite = str.substring(length - 1 - i, length - i);
       if(!current.equals(opposite))
       {
           return false;
           }
       }
       return true;
    }
}
