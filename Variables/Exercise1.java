import java.util.*;
/*
Create  a new Java file and make a main method like we did in previous examples
Inside the main method, use variables to create code for the following functionalities:
Add/multiply/divide/subtract  two numbers together (do it for integers and floats)
Add two strings together
Print out the results
Compile and execute your code and see what happens

*/
public class Exercise1 {

  public static void main(String[] args) {
    //addition
    int int1 = 10;
    int int2 = 20;
    int intSum = int1 + int2;
    System.out.println("Integer addition: " + intSum);

    float float1 = 10.0f;
    float float2 = 20.0f;
    float floatSum = float1 + float2;
    System.out.println("Float addition: " + floatSum);

    //subtraction
    int intSubtract = int1 - int2;
    float floatSubtract = float1 - float2;
    System.out.println("Integer Subtraction: "+ intSubtract);
    System.out.println("Float subtraction: " + floatSubtract);

    //multiplication
    int intMult = int1 * int2;
    float floatMult = float1 * float2;
    System.out.println("Integer multiplication: " + intMult);
    System.out.println("Float multiplication: "+ floatMult);

    //division
    int intDivide = int1/int2;
    float floatDivide = float1/float2;
    System.out.println("Integer division: "+ intDivide);
    System.out.println("Float division: "+ floatDivide);

    //adding two strings (this is called concatenation)
    String helloStr = "Hello ";
    String worldStr = "World!";
    String addedStr = helloStr + worldStr;
    System.out.println(addedStr);

  }


}
