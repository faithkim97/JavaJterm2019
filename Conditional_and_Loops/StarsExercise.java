import java.util.*;

public class StarsExercise {
  public static void main(String[] args) {
    writeStars(5);
  }

  public static void writeStars(int numberOfStars) {
    String star = "";
    for (int i = 0; i < numberOfStars; i++) {
      star += "*";
      System.out.println(star);
    }
  }


}
