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
        
        int userGuess = 1;
        int userChoice = 0;
        int DICE_ROLL_6 = 0;
        int DICE_ROLL_12 = 0;
       
        
        

        while (userChoice != 4) {
            //The following code is the main menu
            System.out.println("Please enter your username");
            
            System.out.println("-------Extreme Dice Game of Extremities-------");
            System.out.println("---------------------------------------------------------------");
            System.out.println("");
            System.out.println("The Rules Are As Follows");
            System.out.println("-1- You Are Not Allowed to Exit Until You Guess The Roll Correctly");
            System.out.println("-2- You Are Not Allowed To Escape");
            System.out.println("-3- Saturdays are for the boys");
            System.out.println("-4- Lets get this pastry");
            System.out.println("");
            System.out.println("---------------------------------------------------------------");
            System.out.println("The Extreme Options of Epic Extremes are as follows");
            System.out.println("1... Who is playing?");
            System.out.println("2... 6 sided dice");
            System.out.println("3... 12 sided dice");
            System.out.println("4... Exit and take a L fam fam");
            System.out.println("");
            System.out.println("---------------------------------------------------------------");
            System.out.println("Please Select The Dice That You Would Like To Roll");

            //The following code prompts the user to make their choice
            userChoice = keyedInput.nextInt();
            System.out.println("");
            System.out.println("---------------------------------------------------------------");

            //The following code is for the 6 sided dice
            if (userChoice == 2) {
                System.out.println("Please enter your guess");
                //The code that generates a number between 1-6 and prompts the user to enter their guess
                while (userGuess != DICE_ROLL_6) {
                    System.out.println("You will be returned to the main menu if you guess correctly");
                    DICE_ROLL_6 = (int) Math.round(Math.random() * 5 + 1);
                    userGuess = keyedInput.nextInt();
                    
                }
            }
            //The code for the 12 sided dice 
            if (userChoice == 3) {
                System.out.println("Please enter your guess");

                //The code generates a random number from 1-12 and prompts the user to guess
                while (userGuess != DICE_ROLL_12) {
                    System.out.println("You will be returned to the main menu if you guess correctly");
                    DICE_ROLL_12 = (int) Math.round(Math.random() * 11 + 1);
                    userGuess = keyedInput.nextInt();
                    
                    
                }
            }
            if (userChoice == 1){
                
            }
        }
        //Message displayed once the user exits
        System.out.println("You gave up like a loser baby");
    }

}
