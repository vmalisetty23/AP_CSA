/**
 * Class Main
 * @author Vasishta Malisetty
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    {
        //creating a 2D array of our MagicSquare values
        int [][] magicSquare = {{16, 3, 2, 13}, {5, 10, 11, 8}, {9, 6, 7, 12}, {4, 15, 14, 1}};
        
        //creating an instance/object of the MagicSquare class
        //so we can call our methods - we are constructing the
        //object with the magicSquare 2D array we created above
        MagicSquare testArray = new MagicSquare(magicSquare);
    }
}


/**
 * MagicSquare Class
 * @author Vasishta Malisetty
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class MagicSquare
{
    // private instance variables
    private int [][] sqaure;
    private int n; //rows of squares
    /**
     * Constructor for objects of class MagicSquare
     */
    public MagicSquare(int [][] squareArray)
    {
        //initializing the 2D array instance variable
        int [][] square = squareArray;
        //initializing n with the size of the square 2D array
        n = square.length;
    }
}
