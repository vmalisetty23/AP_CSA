
/**
 * Class Main
 * @author Vasishta Malisetty
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    { 
      BankAccount Vasishta = new BankAccount(13, 15.50, "VasishtaACCOUNT"); 
      Vasishta.Withdraw(14);
      System.out.println(Vasishta.toString());
    }
}

/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount extends Main
{
// instance variables - replace the example below with your own
public String name;
private int accountNumber;
private double balance;
private static int numberOfObjects;

/**
* Constructor for objects of class BankAccount
*/
public BankAccount()
{
  accountNumber = 0;
  balance = 0.0;
  name = "";
}


public BankAccount(int theAccountNumber, double theBalance, String theName)
{
  accountNumber = theAccountNumber;
  balance = theBalance;
  name = theName;
  numberOfObjects++;
}

/**
* An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
public String toString()
{
  String theBalance = Double.toString(balance);

  String theFinal = ("Name: "+ name + "   Balance: "+ theBalance);

  return theFinal;
}

public void Withdraw(double moneyWithdraw)
{
  if (moneyWithdraw > balance)
  {
    System.out.println("Your Broke");
  } 
  else 
  {
    balance -= moneyWithdraw;
  }
}


public void Deposit(double MoneyDeposit)
{
  balance += MoneyDeposit;
}
public int returnNumberofMethods()
{
    return numberOfObjects;
}
}
