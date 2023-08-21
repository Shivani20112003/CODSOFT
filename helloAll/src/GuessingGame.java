//question-4
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        int userGuess;
        do {
            System.out.print("Guess the number (1-100): ");
            userGuess = scanner.nextInt();

            if(userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed it right.");
            } else if(userGuess < randomNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        } while(userGuess != randomNumber);

        scanner.close();
    }
}

