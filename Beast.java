public class Beast extends Monster{

  /**Default constructor for Beast calls Monster constructor
  */
  public Beast(){
    super("Beast",8);
  }

  /**Getter for attack value of Beast
  @return attack value
  */
  @Override
  public int attack(){
    return 3;
  }

  
}