import java.util.*;

public class SomeClass {
  private int x;

  private static int y = 10;

  public SomeClass(int xValue) {
    x = xValue;
  }

  public int getX() {
    return x;
  }

  public static int getY() {
    return y;
  }

  public void setX(int newX) {
    x = newX;
  }

  public static void setY(int newY) {
    y = newY;
  }
}//endclass
