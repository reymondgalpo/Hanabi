package Galpo.com.ex;
import java.util.Random;
import java.util.Scanner;

public class Cupanbalgemver2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] cups = {"Cup 1", "Cup 2", "Cup 3"};
        int ballPosition = random.nextInt(3); // Randomly place the ball under one of the cups
        boolean gameRunning = true;
        int attempts = 0;

        System.out.println("Welcome to the Cup and Ball Game!");
        System.out.println("The ball is hidden under one of the cups: Cup 1, Cup 2, Cup 3.");
        
        do {
            System.out.println("\nChoose a cup (1, 2, or 3): ");
            int userChoice = scanner.nextInt() - 1; // Convert to 0-indexed

            if (userChoice < 0 || userChoice > 2) {
                System.out.println("Invalid choice. Please select a cup between 1 and 3.");
                continue;
            }

            attempts++;

            // Check if the user's choice matches the ball position
            switch (userChoice) {
                case 0:
                case 1:
                case 2:
                    if (userChoice == ballPosition) {
                        System.out.println("Congratulations! You found the ball under " + cups[userChoice] + "!");
                        gameRunning = false; // End the game
                    } else {
                        System.out.println("Sorry! The ball is not under " + cups[userChoice] + ". Try again.");
                        // Optionally, give a hint by revealing the ball position
                        System.out.println("The ball is under " + cups[ballPosition] + "!");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please select a cup between 1 and 3.");
            }

        } while (gameRunning);

        System.out.println("You found the ball in " + attempts + " attempts. Thanks for playing!");
        scanner.close();
    }//closing of main
}//closing of class

