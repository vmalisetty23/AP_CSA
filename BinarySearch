
/**
 * @author Vasishta Malisetty
 * @version 10 March, 2021
 */
import java.util.ArrayList;
public class BinarySearch
{
    public static int moreBooks(String[] books, String find)
    {
        int left = 0;
        int right = books.length - 1;
        
        while (left <= right)
        {
            int middle = (left + right)/2;
            
            if (find.compareTo(books[middle]) < 0)
            {
                right = middle - 1;
            }
            else if (find.compareTo(books[middle]) > 0)
            {
                left = middle + 1;
            }
            else
            {
                return middle;
            }
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
        String myBooks[] = {"Divergent", "Allegiant", "Anne of Green Gables", "To Kill a Mockingbird", "Harry Potter", "Life of Pi", "Pillars of the Earth"};   
    }
}
