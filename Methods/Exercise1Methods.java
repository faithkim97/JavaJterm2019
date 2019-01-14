import java.util.*;

public class Exercise1Methods {
  public static void main(String[] args) {
    System.out.println("Integer addition: " + intSum(10,20));
    System.out.println("Float addition: " + floatSum(10.0f, 20.0f));

    System.out.println("Integer Subtraction: " + intSubtract(10,20));
    System.out.println("Float subtraction: " + floatSubtract(10.0f, 20.0f));

    System.out.println("Integer Multiplication: " + intProduct(10,20));
    System.out.println("Float Multiplicaiton: " + floatProduct(10.0f,20.0f));

    System.out.println("Integer division: " + intDivide(10,20));
    System.out.println("Float division: " + floatDivide(10.0f, 20.0f));

    System.out.println(concatStrings("Hello ", "World!"));


  }

  public static int intSum(int n1, int n2) {
    return n1 + n2;
  }

  public static float floatSum(float n1, float n2) {
    return n1 + n2;
  }

  public static int intSubtract(int n1, int n2) {
    return n1 - n2;
  }

  public static float floatSubtract(float n1, float n2) {
    return n1 - n2;
  }

  public static int intProduct(int n1, int n2) {
    return n1 * n2;
  }

  public static float floatProduct(float n1, float n2) {
    return n1 * n2;
  }

  public static int intDivide(int dividend, int divisor) {
    return dividend/divisor;
  }

  public static float floatDivide(float dividend, float divisor) {
    return dividend/divisor;
  }

  public static String concatStrings(String s1, String s2) {
    return s1 + s2;
  }




}
