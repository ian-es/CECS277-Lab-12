public class Undead extends Monster{

  /**Default constructor for Undead calls Monster constructor
  */
  public Undead(){
    super("Undead",5);
  }

  /**Getter for attack value of Undead
  @return attack value
  */
  @Override
  public int attack(){
    return 1;
    }
}