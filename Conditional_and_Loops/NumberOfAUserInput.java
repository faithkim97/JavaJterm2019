import java.util.*;

public class NumberOfAUserInput {
  public static void main(String[] args) {
    if (args.length > 0) {
      System.out.println(checkNumberOfA(args[0]));
    } else {
      System.out.println(checkNumberOfA("aaaa"));
    }
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
