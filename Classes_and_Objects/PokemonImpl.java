import java.util.*;

public class PokemonImpl {
  public static void main(String[] args) {
    Pokemon charizard = new Pokemon();
    Pokemon squirtle = new Pokemon("squirtle", 100, 0, "water");

    System.out.println("There are two pokemons: " + charizard.getName() +
      " and " + squirtle.getName() + " who get into a fight" );

    System.out.println(charizard.getName() + " has " + charizard.getHP() +
      " HP and " + squirtle.getName() + " has " + squirtle.getHP() + " HP" );
    while (squirtle.getHP() > 0) {
      charizard.attack(squirtle);
      System.out.println("Charizard attacks squirtle, so now " + squirtle.getName() +
      " has " + squirtle.getHP() + "HP");
    }

    System.out.println(squirtle.getName() + " has fainted! " + charizard.getName() +
    " won! ");



  }//endmain


}
