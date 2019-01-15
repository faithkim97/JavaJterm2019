import java.util.*;

public class NumberBoolean {
  public static void main(String[] args) {
    printByNumber(0);
    printByNumber(1);
    printByNumber(-100);
  }

  public static void printByNumber(int number) {
    if (number == 0) {
      System.out.println("Queen Allura");
    } else if (number < 0) {
      System.out.println("Lance is my son");
    } else {
      System.out.println("Keith is my son-in-law");
    }
  }//endfxn

  // //// Original code: Comment out the main function and printByNumber
  // //// and uncomment this:
  // public static void main(String[] args) {
  //   int number = 0;
  //   if (number == 0) {
  //     System.out.println("Queen Allura");
  //   } else if (number < 0) {
  //     System.out.println("Lance is my son");
  //   } else if (number > 0){
  //     System.out.println("Keith is my son-in-law");
  //   }
  // }

}
