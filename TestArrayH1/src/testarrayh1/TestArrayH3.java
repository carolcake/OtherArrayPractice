/*  Caroline Hsu - 11/06/2020
Write a program to utilize array and solve for any variable in the following
formula:
A = B * C
loop 10 times
        ask user which variable to solve for (A or B or C)?
        read the two other inputs
        calculate the third
end of loop
after ending the loop
display a report with all of the corresponding variables A, B, and C
     you would need to use 3 arrays of doubles
 */
package testarrayh1;
// import Scanner from API
import java.util.Scanner;
public class TestArrayH3
{
  public static void main(String[] args)
  {
    // declare variables and arrays and a variable of type Scanner
    double[] variableA = new double[10];
    double[] variableB = new double[10];
    double[] variableC = new double[10];
    Scanner input = new Scanner(System.in);
    String response;
    final int LOOP_LENGTH = 10;
    
    // start the for loop to ask for variables and use formula to solve
    for(int counter = 0; counter < LOOP_LENGTH; counter++)
    {
      // repeats every time in the for loop and asks for a variable to solve 
      System.out.print("Which variable would you like to solve for: A, B, " +
                           "or C? " );
      response = input.nextLine(); // receives response from user
      // starts the if statement of if the response is A (ignores case)
      if(response.equalsIgnoreCase("A"))
      {
        // asks for other variable values and solves the formula for
        // a = b * c
        System.out.print("Please enter your B value: ");
        variableB[counter] = input.nextDouble();
        System.out.print("Please enter your C value: ");
        variableC[counter] = input.nextDouble();
        variableA[counter] = variableB[counter] * variableC[counter];
      }
      // starts an else if statement for if the response is B (ignores case)
      else if(response.equalsIgnoreCase("B"))
      {
        // asks for other variable values and solves the formula for
        // b = a / c
        System.out.print("Please enter your A value: ");
        variableA[counter] = input.nextDouble();
        System.out.print("Please enter your C value: ");
        variableC[counter] = input.nextDouble();
        variableB[counter] = variableA[counter] / variableC[counter];
      }
      // starts the if statement of if the response is C (ignores case)
      else if(response.equalsIgnoreCase("C"))
      {
        // asks for other variable values and solves the formula for
        // c = a / b
        System.out.print("Please enter your A value: ");
        variableA[counter] = input.nextDouble();
        System.out.print("Please enter your B value: ");
        variableB[counter] = input.nextDouble();
        variableC[counter] = variableA[counter] / variableB[counter];
      }
      // dummy next line
      else
      {
        System.out.println("Invalid entry.");
      }
      input.nextLine();
    }
    // print the values of all of the variables for the user with a for loop
    for(int counter = 0; counter < LOOP_LENGTH; counter++)
    {
      System.out.println("Your A value is: " + variableA[counter]);
      System.out.println("Your B value is: " + variableB[counter]);
      System.out.println("Your C value is: " + variableC[counter]);
    }
  }
}
