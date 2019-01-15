import java.util.*;

public class Pokemon {
  private String name;
  private int hp;
  private int exp;
  private String pokemonType;

  public Pokemon(String pokeName, int health, int experience, String type) {
    name = pokeName;
    hp = health;
    exp = experience;
    pokemonType = type;

  }

  public Pokemon() {
    name = "Charizard";
    hp = 200;
    exp = 0;
    pokemonType = "fire";
  }

  //getters

  public String getName() {
    return name;
  }

  public int getHP() {
    return hp;
  }

  public int getEXP() {
    return exp;
  }


  public String getType() {
    return pokemonType;
  }

  //setters
  public void setName(String n) {
    name = n;
  }

  public void setHP(int h) {
    hp = h;
  }

  public void setEXP(int e) {
    exp = e;
  }

  public void setType(String t) {
    pokemonType = t;
  }

  public void attack(Pokemon pokemon) {
    pokemon.setHP(pokemon.getHP() - 10);
  }




}
