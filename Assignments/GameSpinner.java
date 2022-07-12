
/**
 * Class Main
 * @author Vasishta Malisetty
 * @version 05 February, 2020
 */
public class Main
{
    public static void main(String[] args)
    {
        GameSpinner g = new GameSpinner(2); //creates GameSpinner object
        
        for (int i = 0; i < 5; i++) //for loop carries out spin method 5 times
        {
            g.spin();
        }
        
        System.out.println("The length of the current run is " + g.currentRun()); //prints out length of run
    }
}

/**
 * Class GameSpinner
 * @author Vasishta Malisetty
 * @version 05 February, 2021
 */
public class GameSpinner extends Main
{
    //instance variables
    private int sectors;
    private int currentValue;
    private int pastValue;
    private static int count;
    
    public GameSpinner(int sect)//constructor for object GameSpinner
    {
        sectors = sect; //initializes instance variable
    }
    
    public int spin() //creates spin method
    {
        pastValue = currentValue;
        currentValue = (int)(Math.random() * sectors) + 1; //picks random number between 1 and sector
        
        if (currentValue == pastValue)
        {
            count++; //if numbers are the same, the length of run increases
        }
        else
        {
            count = 1; //if numbers are different, the length of run resets to 1
        }
        
        return currentValue; //returns currentValue
    }
    
    public int currentRun() //creates currentRun method
    {
        return count; //returns the length of the run
    }
}
