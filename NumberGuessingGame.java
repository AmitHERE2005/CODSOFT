import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxRange = 100;
        int attemptsLimit = 10;
        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {
            int randomNumber = random.nextInt(maxRange) + 1;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("I have generated a number between 1 and " + maxRange + ". Try to guess it!");

            while (attempts < attemptsLimit && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the number correctly.");
                    guessedCorrectly = true;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you have run out of attempts. The correct number was: " + randomNumber);
            }

            System.out.print("Do you want to play another round? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        }
        System.out.println("Thank you for playing the Number Guessing Game!");
        scanner.close();
    }
}
