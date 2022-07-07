
/**
 * @author Vasishta Malisetty
 * @version October 8th, 2020
 */
public class Book
{
    private int numPage;
    private int currentPage;

    /**
     * Constructor for objects of class Book
     */
    public Book(int thenumPage, int thecurrentPage)
    {
        numPage = thenumPage;
        currentPage = thecurrentPage;
    }
    public static int addPageNums(int thenumPage1, int thenumPage2)
    {
        int totalPages = (thenumPage1 + thenumPage2);
        return totalPages;
    }

    public static void main(String[] args)
    {
        Book One = new Book(245, 15);
        Book Two = new Book(325, 75);
        
        System.out.println("The total amount of pages in both books is " + addPageNums(One.numPage, Two.numPage));
        
        System.out.println("The current page you are on in Book One is " + One.currentPage);
        System.out.println("The total amount of pages you in Book One is " + One.numPage);
        System.out.println("The current page you are on in Book Two is " + Two.currentPage);
        System.out.println("The total amount of pages you in Book Two is " + Two.numPage);
    }
}
