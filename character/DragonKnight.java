package character;

import character.typeinterfaces.*;

public class DragonKnight extends CharacterBase implements MeleeInterface, MagicInterface {
  protected int health;
  protected int stamina;

  protected int level;
  protected int exp;
  protected int expToLevel;

  final protected String name;

  public DragonKnight(String name) {
    level = 0;
    exp = 0;
    expToLevel = 100;

    health = 100;
    stamina = 100;

    this.name = name;
  }

  public int getHealth() {
    return health;
  }

  public int getStamina() {
    return stamina;
  }

  public int getLevel() {
    return level;
  }

  public int getExp() {
    return exp;
  }

  public int getExpToLevel() {
    return expToLevel;
  }

  public String getName() {
    return name;
  }

  //MOVES
  public void attack() {
    System.out.println(name + " slaps");
  }

  public void meleeAttack() {
    System.out.println(name + " Swings his sword");
  }

  public void block() {
      System.out.println(name + " Prepares to defend against an attack");
  }

  public void magicAttack() {
    System.out.println(name + " fires a bolt of pure magic");
  }

  public void hover() {
    System.out.println(name + " starts floating mid-air");
  }

  public void curse() {
    System.out.println(name + " starts muttering a curse");
  }

  public void showEmWhatYouGot() {
    attack();
    meleeAttack();
    block();
    magicAttack();
    hover();
  }

}
