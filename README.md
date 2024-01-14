# CECS277-Lab-12
Java Decorator 

CECS 277 Lab 12 Spring 2022

Ian Escalante, Julio Calderon


# Monster Maker
Using the following class diagram:

![image](https://github.com/ian-es/CECS277-Lab-12/assets/103468553/8e0b345a-e46e-4719-b5f3-78023c7b4066)

Using the Decorator Pattern, create a monster maker program that uses three base types
of monsters (ex. Alien, Beast, Zombie, Vampire, Mummy, etc.). Those monsters can
then be decorated with at least three different monster abilities (ex. lasers, poison, flying,
speed, strength, fire, etc.).
Rather than an interface, you should create an abstract Monster class. A monster has a
name and hp. The Monster should have a getName and getHP methods, as well as an
abstract attack method. Your base monster classes should extend from the abstract class,
set the name and hp, and should override the attack method (give each of your monsters
different names, hp, and attack damage).
The MonsterDecorator class’s constructor should pass in the Monster, the updated name
for the monster, and the updated hp of the monster.
The Monster abilities (decorations) classes should each have a constructor that passes the
updated name and hp to the MonsterDecorator. They should also each override the attack
method to add more attack damage to the value returned. You can choose the amount of
extra hp and extra attack that each different decoration does.
The main method should present the user with a menu to choose the base monster type
and display the stats of the monster. Then repeatedly allow the user to choose an ability
to apply to their monster, and then display the monster’s updated stats. Also allow the
user to quit.

## Output
![image](https://github.com/ian-es/CECS277-Lab-12/assets/103468553/ebe3bd7f-cdce-42fd-90d1-a5156ad92428)
![image](https://github.com/ian-es/CECS277-Lab-12/assets/103468553/9091d639-65a5-4cc6-bbd3-74c9130281e1)


