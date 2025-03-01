
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int numberOfTries = 0;
        int guess;
        boolean win = false;

        while (!win) {
            System.out.println("Guess a number between 1 and 100:");
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess == numberToGuess) {
                win = true;
            } else if (guess < numberToGuess) {
                System.out.println("Too low.");
            } else {
                System.out.println("Too high.");
            }
        }

        System.out.println("Congratulations! You guessed the number in " + numberOfTries + " tries.");
        scanner.close();
    }
}
