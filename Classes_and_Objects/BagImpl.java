import java.util.*;
/*
Class to create bag objects, get info of bag object,
change info of bag object
*/
public class BagImpl {
  public static void main(String[] args) {
    Bag brownBag = new Bag();
    Bag redBag = new Bag("red", 2, "Chanel");

    System.out.println("Bronw bag's color: " + brownBag.getColor() + " Red bag's color: "
            + redBag.getColor());

    System.out.println("brown bag brand: " + brownBag.getBrandName());

    brownBag.setBrandName("Prada");

    System.out.println("Brown bag brand: " + brownBag.getBrandName());

  }


}
