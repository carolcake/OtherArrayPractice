/*
Caroline Hsu - 12/09/2020
This program models ArrayList.
 */
package testarraylisth;

import java.util.ArrayList;
import java.util.Scanner;

public class Registration
{
  public static void main(String[] args)
  {
    // declaring ArrayList, 15 is the capacity 
    // remember halve and add, 7.5+15
    ArrayList<String> studentNames = new ArrayList<>(15);
    String name = "";
    Scanner kb = new Scanner(System.in);
    char response = 'N';
    String message = "Nothing found!";
    
    while(response == 'N')
    {
      System.out.print("Enter a name: ");
      name = kb.nextLine();
      // adding to array list
      studentNames.add(name);
      System.out.println("Done? (Y/N)?");
      response = kb.nextLine().charAt(0);
    }
    System.out.println(studentNames);
    // reading from array list
    System.out.println(studentNames.get(2));
    
    // when you add Raunak, everyone gets pushed one more down
    // don't add to the middle, add to the end
    studentNames.add(1,"Raunak");
    System.out.println(studentNames);
    System.out.println(studentNames.get(2));
    // will turn Alex, Emily, Isaac to Alex, Raunak, Emily, Isaac
    
    // removing/deleting from array list
    // removes first occurance of Emily
    studentNames.remove("Emily"); // nothing will happen if no Emily
    System.out.println(studentNames);
    studentNames.remove(0);
    System.out.println(studentNames);
    
    for(int i = 0; i < studentNames.size(); i++)
    {
      if (studentNames.get(i).equals("Vlad"))
      {
        message = "We got this Vlad!";
      }
    }
    System.out.println(message);
  }
  
}
