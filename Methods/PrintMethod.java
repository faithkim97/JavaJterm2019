import java.util.*;
/*
CSC 212 Data Structures will go over why we can just pass in
the data type Object! 
*/
public class PrintMethod {
  public static void main(String[] args) {
    print("Hello!");
    print(1);
    print('c');
  }

  public static void print(Object o) {
    System.out.println(o);
  }

}
