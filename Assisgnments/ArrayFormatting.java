/*Name: Vasishta Malisetty
* Date: March 30th, 2021
* Purpose: To practice declaring, initializing, and traversing arrays
*/
import java.util.Arrays;
class Main {
  public static void main(String[] args) 
{

    //declare a 2D int array named values 
    //and initialize it to be 4 rows and 5 columns
int values[][] = new int[4][5];


    //using a nested for loop, assign even integers in 
    //row major order starting at 2
for(int row = 0; row < values.length; row++)
{
    int i = 0; 
    for(int col = 0; col < values[row].length; col++)
    {
        i++;
        values[row][col] = 2 * i;
    }
}

    //using a nested for loop, print all values in
    //row major order with one space and comma between values
    //and a new line between rows
for(int row = 0; row < values.length; row++)
{
    for(int col = 0; col < values[row].length; col++)
    {
        System.out.print(values[row][col] + ", ");
    }
    System.out.println();
    System.out.println();
}
System.out.println();
    //using a nested for loop, print all values in
    //column major order with one space and comma between values
    //and a new line between columns
for(int col = 0; col < values[0].length; col++)
{
    for(int row = 0; row < values.length; row++)
    {
        System.out.print(values[row][col] + ", ");
    }
    System.out.println();
    System.out.println();
}
System.out.println();
   //using a nested for loop, print all values of 
   //values array by row, with a line 
   //between each row
for(int i = 0; i < values.length; i++)
{
   System.out.println(Arrays.toString(values[i])); 
   System.out.println();
}
System.out.println();

    //declare a 2D String array named seatingChart
    //and use an initializer list to include the following names 
    //in column major order with 3 rows and 2 columns
    // Srikar Kush Tobin Aryan Gurleen Tanisha 
String seatingChart[][] = {{"Srikar", "Kush", "Tobin"}, {"Aryan", "Gurleen", "Tanisha"}};


    //using a nested for loop, print all values in
    //row major order with one space between values
    //and a new line between rows
for(int row = 0; row < seatingChart.length; row++)
{
    for(int col = 0; col < seatingChart[row].length; col++)
    {
        System.out.print(seatingChart[row][col] + " ");
    }
    System.out.println();
    System.out.println();
}

   
  }
}
