import java.util.*;

public class Bag {
  /** number of items that fit in the bag */
  private int numItems;

  /**Color of bag */
  private String color;

  /** list of items inside the bag */
  private String[] items;
  /** brand name of bag*/
  private String brandName;

/** Default constructor */
  public Bag() {
    color = "brown";
    numItems = 3;
    items = new String[numItems];
    brandName = "Louis Vuiton";
  }

  /** Constructor for customizing field values
  @param c color of the bag
  @param n number of items
  @param b brand name
  */
  public Bag(String c, int n, String b) {
    color = c;
    numItems = n;
    items = new String[numItems];
    brandName = b;
  }

/**Retrieve color of bag
@return  string color
*/
  public String getColor() {
    return color;
  }

/**Retrieve list of items in bag
@return list of items
*/
  public String[] getItems() {
    return items;
  }
/** Retrieve number of items of bag
@return int number of items
*/
  public int getNumItems() {
    return numItems;
  }

/** Retrieve brand name of bag
@return string brand name
*/
  public String getBrandName() {
    return brandName;
  }
/**Set new color of bag
@param c new string color
*/
public void setColor(String c) {
  color = c;
}
/** set new item list
@param newItems new list of items
*/
public void setItems(String[] newItems) {
  items = newItems;
}
/**set new number of items
@param n new number of items
*/
public void setNumItems(int n) {
  numItems = n;
}
/**
Set new brand bran name
@param b new brand name
*/
public void setBrandName(String b) {
  brandName = b;
}

/**Get item in the bag by index
@param i index for item list
@return string item
*/
public String getItem(int i) {
  if (outOfBounds(i)) {return "";}
  return items[i];
}

/**Helper method: checks if index is valid index for items list
@param i index for item list
*/
private boolean outOfBounds(int i) {
  return (i >= numItems || i < 0);
}

/**Add item into items list
@param newItem new item
*/
public void addItem(String newItem) {
  if (items[numItems - 1] != null) {
    System.out.println("Bag is already full");
  }
  for (int i =0; i < items.length; i++) {
    if (items[i] == null) {
      items[i] = newItem;
      return;
    }
  }
}//end of addItem
/**
print items inside the list
*/
public void printItems(){
  for (String item : items) {
    System.out.print(item + " ");
  }
  System.out.println("");
}







}
