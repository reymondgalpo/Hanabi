package Galpo.com.ex;

import java.util.Random;
import java.util.Scanner;

public class CupAndBallGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        boolean playAgain = true;
        
        while (playAgain) {
            String userGuess = null;
            String cup = null;

            // Generate a random number between 1 and 3
            int randomNum = random.nextInt(3) + 1;
            boolean correctGuess = false;
            int attempts = 2;

            System.out.println("Welcome to the Cup and Ball Game!");
            System.out.println("There are 3 cups. Try to guess which cup the ball is under.");
            
            
            do { 
                System.out.println("Enter a number between 1 and 3:");
                userGuess = scanner.nextLine(). toLowerCase();// Player's guess
                
                switch (randomNum) {
                    case 1:
                        cup = "1";
                        break;
                    case 2:
                        cup = "2";
                        break;
                    case 3:
                        cup = "3";
                        break;
                }

                // Check if the userGuess is correct
                if (cup.equals(userGuess)) {
                        System.out.println("Congratulations! You guessed correctly!");
                        correctGuess = true;

                } else {
                    if (attempts--> 0){
                        System.out.println("Nope! You have only " + attempts + " attempts left.");
                        System.out.println("...");
                    } else {
                        System.out.println("Sorry, you guessed wrong. The ball was under cup " + cup + ".");
                    }
                }
            } while (attempts>0 && !correctGuess);
            
            // Ask if the user wants to play again
            System.out.println("Do you want to play again? (yes/no)");
            String response = scanner.nextLine();
            playAgain = response.equalsIgnoreCase("yes");
        }
             
        System.out.println("Thank you for playing!");
        scanner.close();
    }// Closing of Main
}// Closing of Class