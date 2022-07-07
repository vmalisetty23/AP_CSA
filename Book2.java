
/**
 * @author Vasishta Malisetty
 * @version 30 October, 2020
 */
public class Book
{
    // declaration of instance variables
    private String Title; //title variable
    private String Author; //author variable
    private String Genre; //genre variable
    private int Pages; //pages variable
    private boolean Difficulty; //difficulty variable
    // declaration of rating variables
    private double bookRating1 = Math.random() * 5; // This randomizes the rating, and is set between 0 and 5
    private double bookRating2 = Math.random() * 5; // This randomizes the rating, and is set between 0 and 5
    private double bookRating3 = Math.random() * 5; // This randomizes the rating, and is set between 0 and 5
    private double bookRating4 = Math.random() * 5; // This randomizes the rating, and is set between 0 and 5
    private double bookRating5 = Math.random() * 5; // This randomizes the rating, and is set between 0 and 5
    
    public Book(String theTitle, String theAuthor, String theGenre) //contructor for objects of the Book class with parameters in parentheses
    {
        Title = theTitle; //initializes instance variables
        Author = theAuthor; //initializes instance variables
        Genre = theGenre; //initializes instance variables
        
    }
    
    public Book(String theTitle, int thePages, boolean theDifficulty) //overloaded constructor for objects of the Book class with parameters in parentheses
    {
        Title = theTitle; //initializes instance variables
        Pages = thePages; //initializes instance variables
        Difficulty = theDifficulty; //initializes instance variables
    }
    
    public static double addRating(double bookRating1, double bookRating2, double bookRating3, double bookRating4, double bookRating5) //signiture for addRating method
    {
        double addRating = (double) (bookRating1 + bookRating2 + bookRating3 + bookRating4 + bookRating5) / 5.0; //calculates average rating for one book 
        return addRating; //stores the number
    }
    
    public static void main(String[] args)
    { 
        Book One = new Book("Three Guineas", "Virginia Woolf", "Nonfiction"); //creating first object with first constructor
        Book Two = new Book("Harry Potter and the Goblet of Fire", "J.K. Rowling", "Fiction"); //creating second object with first constructor
        Book Three = new Book("Percy Jackson and the Lightning Thief", 377, false); //creating third object with second constructor
        Book Four = new Book("The Martian", 369, false); //creating fourth object with second constructor
        
        System.out.println("Title: " + One.Title + ", Author: " + One.Author + ", Genre: " + One.Genre); //prints out first object
        System.out.print("Rating: ");
        System.out.printf("%.2f", addRating(One.bookRating1, One.bookRating2, One.bookRating3, One.bookRating4, One.bookRating5)); //prints out average rating of first object
        System.out.println(" "); //space
        System.out.println(" "); //space
        
        System.out.println("Title: " + Two.Title + ", Author: " + Two.Author + ", Genre: " + Two.Genre); //prints out second object
        System.out.print("Rating: ");
        System.out.printf("%.2f", addRating(Two.bookRating1, Two.bookRating2, Two.bookRating3, Two.bookRating4, Two.bookRating5)); //prints out average rating of second object
        System.out.println(" "); //space
        System.out.println(" "); //space
        
        System.out.println("Title: " + Three.Title +  ", Pages: " + Three.Pages + ", Hard to Read: " + Three.Difficulty); //prints out third object
        System.out.print("Rating: ");
        System.out.printf("%.2f", addRating(Three.bookRating1, Three.bookRating2, Three.bookRating3, Three.bookRating4, Three.bookRating5)); //prints out average rating of third object
        System.out.println(" "); //space
        System.out.println(" "); //space
        
        System.out.println("Title: " + Four.Title  + ", Pages: " + Four.Pages + ", Hard to Read: " + Four.Difficulty); //prints out fourth object
        System.out.print("Rating: ");
        System.out.printf("%.2f", addRating(Four.bookRating1, Four.bookRating2, Four.bookRating3, Four.bookRating4, Four.bookRating5)); //prints out average rating of the fourth object
        System.out.println(" "); //space
        System.out.println(" "); //space
        
        System.out.println("Total Pages in Books: " + (Three.Pages + Four.Pages)); //prints out total pages in objects that have the number of pages within its parameters
        
        System.out.println("Total Amount of Characters in Titles: " + (One.Title.length() + Two.Title.length() + Three.Title.length() + Four.Title.length())); //prints out the total number of characters in each object's title
        
        System.out.println("Last Letter of Each Book Title Combined: " + (One.Title.substring(One.Title.length() - 1) + Two.Title.substring(Two.Title.length() - 1) + Three.Title.substring(Three.Title.length() - 1) + Four.Title.substring(Four.Title.length() - 1))); //concatenates the last letter of the title in each object
        
        System.out.println("First Letter of Author Names Combined: " + (One.Title.substring(0, 1) + Two.Title.substring(0, 1))); //concatenates the first letter of the authors name for each object that has the author name within its parameters
        
        System.out.printf("Average Rating of all books: " + ((addRating(One.bookRating1, One.bookRating2, One.bookRating3, One.bookRating4, One.bookRating5) + addRating(Two.bookRating1, Two.bookRating2, Two.bookRating3, Two.bookRating4, Two.bookRating5) + addRating(Four.bookRating1, Four.bookRating2, Four.bookRating3, Four.bookRating4, Four.bookRating5)+ addRating(Three.bookRating1, Three.bookRating2, Three.bookRating3, Three.bookRating4, Three.bookRating5)) / 4.0)); //calculates the average of the average ratings of each book and prints it
    }

        
    }
