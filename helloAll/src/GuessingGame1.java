import java.util.Random;
import java.util.Scanner;

public class GuessingGame1 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        int userGuess;
        int attempts = 0;
        int maxAttempts = 5; // Set the maximum number of attempts

        while (attempts < maxAttempts) {
            attempts++;
            System.out.print("Guess the number (1-100): ");
            userGuess = scanner.nextInt();

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed it right.");
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've reached the maximum number of attempts. The number was: " + randomNumber);
        }

        scanner.close();
    }
}
