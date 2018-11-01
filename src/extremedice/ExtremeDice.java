/*
 Jaffar Shorbaji
 October 31 2018
 This is an extreme dice program
 */

package extremedice;
import java.util.Scanner; 
/**
 *
 * @author jasho9017
 */
public class ExtremeDice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner keyedInput = new Scanner(System.in);
       
       int userGuess = 0;
       int userChoice = 0;
       int DICE_ROLL_6;
       int DICE_ROLL_12;
       
       //The following code is the main menu
       System.out.println("-------Extreme Dice Game of Extremities-------");
       System.out.println("---------------------------------------------------------------");
       System.out.println("");
       System.out.println("The Rules Are As Follows");
       System.out.println("-1- You Are Not Allowed to Exit Until You Guess The Roll Correctly");
       System.out.println("-2- You Are Not Allowed To Escape");
       System.out.println("-3- Saturdays are for the boys");
       System.out.println("-4- Lets get this bread");
       System.out.println("");
       System.out.println("---------------------------------------------------------------");
       System.out.println("The Extreme Options of Epic Extremes are as follows");
       System.out.println("1... 6 sided dice");
       System.out.println("2... 12 sided dice");
       System.out.println("");
       System.out.println("---------------------------------------------------------------");
       System.out.println("Please Select The Dice That You Would Like To Roll");
       
       //The following code prompts the user to make their choice
       userChoice = keyedInput.nextInt();
       System.out.println("");
       System.out.println("---------------------------------------------------------------");
       
       while (userChoice == 1){
           System.out.println("Please enter your guess");
           userGuess = keyedInput.nextInt();
           DICE_ROLL_6 = (int)Math.round(Math.random()*5+1);
           if (userGuess == DICE_ROLL_6){
               
           }
       }
       
    }
    
}
