
/**
 * @author Vasishta Malisetty
 * @version (a version number or a date)
 */
public class Student
{
    // instance variables
    public String name;
    public int id;
    /**
     * Constructor for objects of class Student
     */
    public Student(String n, int i)
    {
        name = n;
        id = i;
    }

    public String getName()
    {                                                                                                  
        return name;
    }
    
    public void setName(String n)
    {
        String name = n;
    }
    
    public void printWelcome()
    {
        System.out.println("Welcome, " + name + "!");
    }
}


/**
 * @author Vasishta Malisetty
 * @version (a version number or a date)
 */
public class GradStudent extends Student
{
    // instance variables
    private String dissertationTopic;

   
    public GradStudent(String n, String topic, int i)
    {
        super(n, i);
        String dissertationTopic = topic;
    }

    
    public String getTopic()
    {
        return dissertationTopic;
    }
    
    public void setTopic(String topic)
    {
        String dissertationTopic = topic;
    }
    
    public void printWelcome()
    {
       System.out.println("Welcome to Graduate School! "+ name + "!");  
    }
}
