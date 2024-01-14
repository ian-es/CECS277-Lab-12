public class Alien extends Monster{

  /**Default constructor for Alien calls Monster constructor
  */
  public Alien(){
    super("Alien",6);
  }

  /**Getter for attack value of Alien
  @return attack value
  */
  @Override
  public int attack(){
    return 1;
  }

  
}