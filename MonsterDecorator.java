public abstract class MonsterDecorator extends Monster{
  private Monster monster;

  /**Default constructor for Monster decorator that adds the decorators onto the base Monster
  @param m Base monster
  @param addName name of decoration to be added
  @param addHp amount of hp to be added
  */
  public MonsterDecorator(Monster m, String addName, int addHp){
    super(addName +" "+ m.getName(), addHp + m.getHp());
    monster = m;
  }

  /** Getter for attack
  @return monster attack value
  */
  @Override
  public int attack(){
    return monster.attack();
  }
}