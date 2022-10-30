/* Write a program to utilize array
     loop 10 times
        read input
        result = input * 5  
     end of loop
     after ending loop
     display a report with the input and corresponding result

 */
package testarrayh1;

import java.util.Scanner;
public class TestArrayH2
{
  public static void main(String[] args)
  {
    //    int[] input = new int[10];
    //    int[] result = new int[10];
    Scanner kb = new Scanner(System.in);
    final int COEFFICIENT = 5;
    int arraySize;
    
    System.out.print("How many numbers? ");
    arraySize = kb.nextInt();
    int[] input = new int[arraySize];
    int[] result = new int[arraySize];
    
    for(int counter = 0; counter < input.length; counter++)
    {
      // read input
      System.out.print("Please enter a number: ");
      input[counter] = kb.nextInt();
      // calculate result = input * COEFFICIENT
      result[counter] = input[counter] * COEFFICIENT;
    }
    // new line
    System.out.println("");
    
    // second for loop to display the input and result for the user
    // loop 10 times
    for(int counter = 0; counter < input.length; counter++)
    {
      // display each input and result
      System.out.println(input[counter] + " times " + COEFFICIENT + 
                        " is " + result);
    }
  }
  
}
