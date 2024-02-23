import java.util.*;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rando = new Random();
        int randomNumber = rando.nextInt(100) + 1;
        //System.out.println("Random Number is: " + randomNumber);
        int tryCount = 0;
        while (true) {
            System.out.println("Enter your guess (1-100) : ");
            int playerGuess = scanner.nextInt();
            tryCount++;

            if (playerGuess == randomNumber) {
                System.out.println("CONGRATULATION! You Guess the Right Answer: ");
                System.out.println("So It took " + tryCount + " tries to guess the correct number");
                break;
            } else if (randomNumber > playerGuess) {
                System.out.println("NOPE! The Number is lower. Please Guess again.");
            } else {
                System.out.println("NOPE! The Number is higher.Please Guess again ");
            }
        }
    }
}
