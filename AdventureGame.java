
/**
 * Write a description of class AdventureGame here.
 *
 * @author (Kaleb)
 * @version (11.19)
 */
import java.util.Scanner;

public class AdventureGame 
{
public static void main (String[] args)
  {
    //Clear the BlueJ terminal
    System.out.println("\000C");
      
    //Define the user input scanner
    Scanner user_input= new Scanner (System.in);
    int decision;
     
    //Prompt the user for which function they would like to use
    System.out.println("You are about to begin your journey.");
    System.out.println("Type 1 to begin");
    decision = user_input.nextInt();
    System.out.println("You have chosen " + decision + " Let us begin");
     
    if (decision == 1) // begin
    {
       //Prompt the user for which function they would like to use
       System.out.println("Your journey begins in a vase field of grass");
      System.out.println("You awaken from your slumber, feeling very paranoid");
       System.out.println("Although you have never seen this grassy field before, you think to yourself");
       System.out.println("something isn't right");
       System.out.println("Type 2 to continue");
       decision = user_input.nextInt();
       System.out.println("You have chosen " + decision + " Continuation of your journey begins");
      
     }
    if (decision == 2) // continue
    {
       //Promt the user for which function they would like to use
       System.out.println("Still being the paranoid person you are, you sit up from the grass");
       System.out.println("this doesn't feel right. you think to yourself");
       System.out.println("You look back, seeing something in the distance. What could it be?");
       System.out.println("Type 3 to get a closer look");
       System.out.println("Type 4 to get out of its view distance");
       decision = user_input.nextInt();
       System.out.println("You have chosen " + decision + " let us continue");
    }
    if (decision == 3) // closer look
    {
      //Prompt the user for which function they would like to use
      System.out.println("As you creep up slowly to the faded figure it snaps");
      System.out.println("Without hesitation it grabs you with one giant hand,");
      System.out.println("trapping you.");
      System.out.println("Then in one single swoop it tosses you into darkness");
      System.out.println("Game Over");
      System.out.println("Type 1 to end your journey");
      decision = user_input.nextInt();
      System.out.println("You have chosen " + decision + " to end your journey. Try to make the right decisions next time!");
    }
    if (decision == 4) // get out of view 
    {
      //Prompt the user for which function they would like to use
      System.out.println("As you run and run and run and run you trip");
      System.out.println("what's this? It appears I have tripped over nothing?");
      System.out.println("You forget about the mysterious figure");
      System.out.println("maybe I should dig up whatever I tripped on");
      System.out.println("nahhhh. It's proboably useless");
      System.out.println("Still forgetful, the mysterious figure draws its attention away from you");
      System.out.println("maybe it's afraid. could it be what I tripped on? you think");
      System.out.println("Type 5 to dig up what you tripped on");
      System.out.println("Type 6 to keep running");
      decision = user_input.nextInt();
      System.out.println("You have chosen " + decision + " let us continue");
    }
    if (decision == 5) // dig
    {
      //Prompt the user for which function they would like to use
      System.out.println("guess I should start diggin");
      System.out.println("As you claw your hands through the grass, you start to feel something hard");
      System.out.println("A long,brown pole you think must resemble a stick");
      System.out.println("a stick? why a stick?");
      System.out.println("As you breathe a sigh of relief you continue on running forward");
      System.out.println("Type 7 to keep the stick");
      System.out.println("Type 8 to keep on running");
      decision = user_input.nextInt();
      System.out.println("You have chosen " + decision + " let us continue");
    }
    if (decision == 6) //keep running
    {
      //Prompt the user for which function they would like to use
      System.out.println("As you pick yourself up from tripping, you sprint onwards");
      System.out.println("Up ahead you see a huge grassy hill");
      System.out.println("this must mean this place isn't just a vase field of grass you think to yourself");
      System.out.println("You look behind, checking if the mysterious figure is still following you");
      System.out.println("As it turns out, it's gone!");
      System.out.println("The mysterious figure has disappeared!");
      System.out.println("Type 9 to climb the mountain");
      System.out.println("Type 10 to stay put");
      decision = user_input.nextInt();
      System.out.println("You have chosen " + decision + " let us continue");
    }
    if (decision == 7) // keep the stick
    {
      //Prompt the user for which function they would like to use
      System.out.println("As you equip the stick, the mysterious figure slowly creeps towards you");
      System.out.println("You keep your stick at the ready");
      System.out.println("You think to yourself, what if this doesn't work?");
      System.out.println("what if I cause damage to myself while doing this?");
      System.out.println("You then realize you must face this mysterious figure head on");
      System.out.println("You think: maybe, just maybe, this thing will stop following me");
      System.out.println("You start to have second thoughts. should I stop and think or take it head on?");
      System.out.println("Type 11 to take on the mysterious figure");
      System.out.println("Type 12 to stop and think");
      decision = user_input.nextInt();
      System.out.println("You have chosen " + decision + " time to make the right choice!");
    }
    if (decision == 8) // keep running
    {
      //Prompt the user for which function they would like to use
      System.out.println("With no way of turning back, you continue to sprint onwards");
      System.out.println("Darkness blocks your path");
      System.out.println("NOW there's NO way of turning back, were your last words");
      System.out.println("As you look behind you the mysterious figure is there");
      System.out.println("As you look straight in front of you darkness block your path");
      System.out.println("With nowhere to run, you're engulfed in darkness.");
      System.out.println("Encased in pitch black darkness you fade off into existence");
      System.out.println("Game Over");
      System.out.println("Type 1 to end your journey");
      decision = user_input.nextInt();
      System.out.println("You have chosen " + decision + " to end your journey. Try to make the right decisions next time!");
    }
    if (decision == 9) // climb the mountain
    {
        //Prompt the user for which function they would like to use
        System.out.println("I should've dug up whatever made me trip and fall you think to yourself");
        System.out.println("If only you had something useful to help you climb the grassy mountain");
        System.out.println("With your bare hands you start to climb the grassy mountain");
        System.out.println("After a couple minutes or so you finally reach the top of the mountain");
        System.out.println("You see it: The Light");
        System.out.println("You've done it!");
        System.out.println("You've surpassed the mysterious figure,");
        System.out.println("You've made the right choices,");
        System.out.println("and you haven't faded off into existence");
        System.out.println("As you walk into the light, you breathe a breath of relief you fade off");
        System.out.println("Fade off into light");
        System.out.println("Game Complete");
        System.out.println("It seems as you have won!");
        System.out.println("Want to choose a different path?");
        System.out.println("Type 1 to choose a different path");
        decision = user_input.nextInt();
        System.out.println("Seems you've chosen " + decision + " let's see where you take us too");
    }
    if (decision == 10) // stay put
    {
        System.out.println("Staying put was not the best idea");
        System.out.println("The mysterious figure pops up and grabs you");
        System.out.println("You begin to fade of into existence");
        System.out.println("Game Over");
        System.out.println("Type 1 to end your journey");
        decision = user_input.nextInt();
        System.out.println("You have chosen " + decision + " to end your journey. Try to make the right decisions next time!");
    }
    if (decision == 11) // stay put
    {
        //Prompt the user for which function they would like to use
        System.out.println("Although it's just a useless stick, your brave self still thinks it's a good idea");
        System.out.println("Keep in mind the mysterious figure is bothered by it");
        System.out.println("So, as you charge on the mysterious figure dissapears into thin air");
        System.out.println("is it, is it gone?");
        System.out.println("You look around, seeing nothing in sight"); 
        System.out.println("You're still paranoid, however");
        System.out.println("I mean I GUESS you've won?");
        System.out.println("Game Complete?");
        System.out.println("It seems as you have won!");
        System.out.println("Want to choose a different path?");
        System.out.println("Type 1 to choose a different path");
        decision = user_input.nextInt();
        System.out.println("Seems you've chosen " + decision + " let's see where you take us too");
    }
    if (decision == 12) // stop and think
    {
        //Prompt the user for which function they would like to use
        System.out.println("With very little time to think");
        System.out.println("the mysterious figure dissapears");
        System.out.println("In all directions the grassy field starts to fade off");  
        System.out.println("With very little oxygen you start to fade off into existence"); 
        System.out.println("Game Over"); 
        System.out.println("Type 1 to end your journey");
        decision = user_input.nextInt();
        System.out.println("You have chosen " + decision + " to end your journey. Try to make the right decisions next time!"); 
    }
}
}