/*

 */
package testarrayh1;

public class TestArrayH1
{
  public static void main(String[] args)
  {
    // declaring array
    int[] mult3 = new int[30];
    int value = 0;
    // declaring AND populating an array of string
    String[] studentNames = {"John", "Susan", "Sampson", "Katy", "Krishna"};
    
    // populating an array
    for (int i = 0; i < mult3.length; i++)
    {
      // check screenshots from 11/4/2020 for information
      mult3[i] = value;
      value = value + 3;
    }
    // assigning a value to a member of an array
    mult3[13] = 97000000;
    mult3[4] = 1789;
    
    // going through the array and displaying the contents
    for (int i = 0; i < mult3.length; i++)
    {
      System.out.println("Index #" + i + ": " + mult3[i]);
    }
    
    for (int i = 0; i < studentNames.length; i++)
    {
      System.out.println(studentNames[i]);
    }
  }
  
}
