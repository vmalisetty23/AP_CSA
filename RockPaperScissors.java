
/**
 * Exectues the game Rock, Paper, Scissors
 *
 * @author Vasishta Malisetty
 * @version 9 November, 2020
 */
import java.util.Scanner;
public class RockPaperScissors
{
 
    
    public static void main(String[] args)
    {
        System.out.println("Choose Rock, Paper, or Scissors:");
        Scanner input = new Scanner (System.in);
        String hand = input.nextLine();
        
        int number = (int)(Math.random() * 2.9);
        
        if (number == 0)
        {
            String Rock = "Rock";
            System.out.println("The CPU has chosen Rock");
        }
        
        else if (number == 1)
        {
            String Scissors = "Scissors";
            System.out.println("The CPU has chosen Scissors");
        }
        
        else if (number == 2)
        {
            String Paper = "Paper";
            System.out.println("The CPU has chosen Paper");
        }
        
        if (number == 0 && hand.equals("Rock"))
        {
            System.out.println("Rock ties Rock");
            System.out.println("It is a Tie");
        }
        else if (number == 1 && hand.equals("Rock"))
        {
            System.out.println("Rock beats Scissors");
            System.out.println("You win!");
        }
        else if (number == 2 && hand.equals("Rock"))
        {
            System.out.println("Paper beats Rock");
            System.out.println("You Lose");
        }
        else if (number == 0 && hand.equals("Scissors"))
        {
            System.out.println("Rock beats Scissors");
            System.out.println("You Lose");
        }
        else if (number == 1 && hand.equals("Scissors"))
        {
            System.out.println("Scissors ties Scissors");
            System.out.println("It is a Tie");
        }
        else if (number == 2 && hand.equals("Scissors"))
        {
            System.out.println("Scissors beats Paper");
            System.out.println("You Win!");
        }
        else if (number == 0 && hand.equals("Paper"))
        {
            System.out.println("Paper beats Rock");
            System.out.println("You Win!");
        }
        else if (number == 1 && hand.equals("Paper"))
        {
            System.out.println("Scissors beats Paper");
            System.out.println("You Lose");
        }
        else if (number == 2 && hand.equals("Paper"))
        {
            System.out.println("Paper ties Paper");
            System.out.println("It is a Tie");
        }
       
    }
}
