
/**
 * Class Main
 * @author Vasishta Malisety
 * @version 15 October, 2020
 */
public class Main
{
    public static void main(String[] args)
    {
PotatoHeadMethods Nicholas = new PotatoHeadMethods("baseball", "green", 15);
PotatoHeadMethods Eric = new PotatoHeadMethods("helmet", "blue", 17);
PotatoHeadMethods Harry = new PotatoHeadMethods("tophat", "brown", 19);

int NicholasAge = Nicholas.getAge();
int EricAge = Eric.getAge();
int HarryAge = Harry.getAge();

System.out.println(NicholasAge);
System.out.println(Nicholas.setAge());

double ageAverage = PotatoHeadMethods.averageTheirAges(NicholasAge, EricAge, HarryAge);

System.out.println(ageAverage);
System.out.printf("%.2f", PotatoHeadMethods.averageTheirAges(Nicholas.getAge(), Eric.getAge(), Harry.getAge()));
    }
}


/**
 * Class PotatoHeadMethods
 * @author Vasishta Malisetty
 * @version 15 October, 2020
 */
public class PotatoHeadMethods
{
    // instance variables - replace the example below with your own
    private String hat;
    private String eyes;
    private int age;
    private String hair;
    private int height;

    /**
     * Constructor for objects of class PotatoHeadMethods
     */
    public PotatoHeadMethods(String hisHat, String hisEyes, int hisAge)
    {
        // initialise instance variables
        hat = hisHat;
        eyes = hisEyes;
        age = hisAge;
        
    }
    
    /**
     * Constructor for objects of class PotatoHeadMethods
     */
    public PotatoHeadMethods(String hisHair, int hisHeight)
    {
        // initialise instance variables
        hair = hisHair;
        height = hisHeight;
        
    }

    public static double averageTheirAges(int age1, int age2, int age3)
    {
        double totalAge = (double)(age1 + age2 + age3) / 3;
        return totalAge;
    }
    
    public int getAge()
    {
        // getter method
        return age;
    }
    
    public int setAge()
    {
       //setter method
       int  personAge = getAge();
       personAge++;
       return personAge;
    }
    
}
