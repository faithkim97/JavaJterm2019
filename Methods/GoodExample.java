import java.util.*;

public class GoodExample {
  public static void main(String[] args) {
    printNumbers(1,5);
    printNumbers(0,11);
    printNumbers(10,12);

  }

  public static void printNumbers(int start, int end) {
    for (int i = start; i <= end; i++) {
      System.out.println(i);
    }
  }

}
