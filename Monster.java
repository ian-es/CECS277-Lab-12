public abstract class Monster{
  int hp;
  String name;

  /**Default constructor for abstract Monster
  @param n name of monster
  @param h hp of monster
  */
  public Monster(String n, int h){
    hp = h;
    name = n;
  }

  /** Getter for name
  @return name of monster
  */
  public String getName(){
    return name;
  }

  /** Getter for hp
  @return hp of monster
  */
  public int getHp(){
    return hp;
  }

  /**Abstract method to be implemented that gets attack value
  */
  public abstract int attack();
  
}