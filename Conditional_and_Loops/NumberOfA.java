import java.util.*;

public class NumberOfA {
  public static void main(String[] args) {
    //should print 6
    System.out.println(checkNumberOfA("aaaaaa"));
    //should print 0
    System.out.println(checkNumberOfA("hello"));
    //should print 1
    System.out.println(checkNumberOfA("halo"));
  }

  public static int checkNumberOfA(String str) {
    int counter = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'a') {
        counter++;
      }//endif
    }//endfor
    return counter;
  }


}
