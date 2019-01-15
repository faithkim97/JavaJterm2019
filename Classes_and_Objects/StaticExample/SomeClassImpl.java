import java.util.*;

public class SomeClassImpl {
  public static void main(String[] args) {
    SomeClass s = new SomeClass(2); // now x = 2 and y = 10
    System.out.println("Before:");
    System.out.println( s.getX() );
    System.out.println( SomeClass.getY() );

    s.setX(200);
    SomeClass.setY(-100);

    System.out.println("");
    System.out.println("After:");
    System.out.println( s.getX() );
    System.out.println( SomeClass.getY() );



  }


}
