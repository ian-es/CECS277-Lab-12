public class Fire extends MonsterDecorator{

  /** Default constructor for decorator that adds onto passed in value
  @param m Monster to be edited
  */
  public Fire(Monster m){
    super(m,"Firey",2);
  }

  /**Modifier for attack value
  @return modified attack value
  */
  @Override
  public int attack(){
    return super.attack() + 2;
  }
  
}