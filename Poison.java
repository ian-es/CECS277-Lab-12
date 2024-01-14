public class Poison extends MonsterDecorator{

  /** Default constructor for decorator that adds onto passed in value
  @param m Monster to be edited
  */
  public Poison(Monster m){
    super(m,"Poisoned",1);
  }

  /**Modifier for attack value
  @return modified attack value
  */
  @Override
  public int attack(){
    return super.attack() + 5;
  }
  
}