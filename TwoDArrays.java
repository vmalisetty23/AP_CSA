
/**
 * @author Vasishta Malisetty
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class TwoDArrays
{
    public static void main(String[] args)
    {
        int[][] matrix = {{3, 4, 5}, {6, 7, 8}, {9, 10, 11}};
        
        //row major traversal
        for(int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[0].length; col++)
            {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        
        
        //column major traversal
        for (int col = 0; col < matrix[0].length; col++)
        {
            for(int row = 0; row < matrix.length; row++)
            {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    
        //print out contents of 2D Array by row
        for(int i = 0; i < matrix.length; i++)
        {
           System.out.println(Arrays.toString(matrix[i])); 
        }
        System.out.println();
        
        //for each loop
        for(int[] row : matrix)
        {
            for(int element : row)
            {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
