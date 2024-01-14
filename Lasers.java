public class Lasers extends MonsterDecorator{

  /** Default constructor for decorator that adds onto passed in value
  @param m Monster to be edited
  */
  public Lasers(Monster m){
    super(m,"Laser",3);
  }

  /**Modifier for attack value
  @return modified attack value
  */
  @Override
  public int attack(){
    return super.attack() + 3;
  }
  
}