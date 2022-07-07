
/**
 * @author Vasishta Malisetty
 * @version September 25, 2020
 */
public class DatatypePractice
{
    public static void main(String[] args)
    {
        String name = new String("Vasishta");
        
        int age = 16;
        int firstTestScore = 93;
        int secondTestScore = 85;
        int thirdTestScore = 90;
        
        double average = ((firstTestScore + secondTestScore + thirdTestScore) / 3);
        System.out.println("My name is " + name + " and I am " + age + " years old.");
        System.out.print("The average of my test scores for this class is: " + average); 
        
    }
}
