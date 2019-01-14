import java.util.*;

public class MessyCodeSol {
  public static void main(String[] args) {
    forYouVerse("happy", "sad");
    forYouVerse("strong", "hurt");
    iWishVerse();
    fakeLoveVerse();
    fakeLoveVerse();
    fakeLoveVerse();
    justForYouVerse();
    forYouVerse("beautiful", "ugly");
    forYouVerse("sweet", "bitter");
    iWishVerse();
    fakeLoveVerse();
    fakeLoveVerse();
    fakeLoveVerse();
  }
/* Cleaner way with for loops
//Comment out current main method and uncomment this to execute
  public static void main(String[] args) {
    forYouVerse("happy", "sad");
    forYouVerse("strong", "hurt");
    iWishVerse();
    fakeLoveThreeVerse();
    justForYouVerse();
    forYouVerse("beautiful", "ugly");
    forYouVerse("sweet", "bitter");
    iWishVerse();
    fakeLoveThreeVerse();


  }


  public static void fakeLoveThreeVerse() {
    for (int i = 0; i < 3; i++) {
        System.out.println("I\'m so sick of this fake love, fake love, fake love");
    }
  }
  */
  public static void forYouVerse(String adj1, String adj2) {
    System.out.println("For you, I could pretend like I was " + adj1 + " when I was " + adj2);
  }

  public static void iWishVerse() {
    System.out.println("I wish love was perfect as love itself");
    System.out.println("I wish all my weakneses could be hidden");
    System.out.println("I grew a flower that can\'t be bloomed in a dream that can\'t come true");
  }

  public static void fakeLoveVerse() {
      System.out.println("I\'m so sick of this fake love, fake love, fake love");
  }

  public static void justForYouVerse() {
    System.out.println("I wanna be a good man, just for you");
    System.out.println("I gave the world, just for you");
    System.out.println("I changed everything, just for you");
  }


}
