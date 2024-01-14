/*
Group 11
Ian Escalante
Julio Calderon

CECS 277 Lab 12
4/26/2022
*/
class Main {
  public static void main(String[] args) {
    Monster m = new Alien();
    System.out.println("Monster creator!\nChoose a base monster:");
    System.out.println("1. Alien\n2. Beast\n3. Undead");
    int monChoice = CheckInput.getIntRange(1,3);
    if (monChoice == 1){
      m = new Alien();
    } else if(monChoice == 2){
      m = new Beast();
    } else if(monChoice == 3){
      m = new Undead();
    }
    int abChoice = -1;
    while(abChoice != 5){
      System.out.println(m.getName() + " has " + m.getHp() + " HP and attacks for " + m.attack() + " damage.");
      System.out.println("Add an ability:\n1. Fire\n2. Flying\n3. Lasers\n4. Poison\n5. Quit");
      abChoice = CheckInput.getIntRange(1,5); 
      if (abChoice == 1){
        m = new Fire(m);
      }
      else if (abChoice ==2){
        m = new Flying(m);
      }
      else if (abChoice ==3){
        m = new Lasers(m);
      }
      else if (abChoice ==4){
        m = new Poison(m);
      }
    }
    System.out.println("Exiting...");
  }
}