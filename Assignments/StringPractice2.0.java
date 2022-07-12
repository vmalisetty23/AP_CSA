
/**
 * @author Vasishta Malisetty
 * @version 21 October, 2020
 */
public class StringPractice
{
    public static void main(String[] args)
    {
        String word = "create";
        
        int wordLength = word.length();
        System.out.println(wordLength);
        
        System.out.println(word.substring(wordLength - 1));
        System.out.println();
        
        System.out.println(word.substring(3));
        
        String myNewString = word.substring(4,5) + word.substring(2,4) + word.substring(1, 2);
        
        System.out.println(myNewString);
        
        String a = "hi";
        String b = "hi";
        
        System.out.println(a==b);
        
        String j = new String("hi");
        String k = new String("hi");
        
        System.out.println(j==k);
        
        System.out.println(j.equals(k));
        
        System.out.println(word.indexOf("x"));
        System.out.println(word.indexOf("t"));
        
        String myOtherString = "java";
        
        System.out.println(word.compareTo(myOtherString));
        
    }
    
}
