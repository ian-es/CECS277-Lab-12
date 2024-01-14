public class Flying extends MonsterDecorator{

  /** Default constructor for decorator that adds onto passed in value
  @param m Monster to be edited
  */
  public Flying(Monster m){
    super(m,"Flying",5);
  }

  /**Modifier for attack value
  @return modified attack value
  */
  @Override
  public int attack(){
    return super.attack() + 2;
  }
  
}