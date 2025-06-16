import java.util.Scanner;
import java.util.Random;

public class GuessTheParity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        String playAgain;

        do {
            int number = random.nextInt(100); // random number between 0 and 99
            System.out.println("Is the number " + number + " even or odd?");
            String guess = scanner.nextLine().toLowerCase();

            boolean isEven = number % 2 == 0;
            if ((isEven && guess.equals("even")) || (!isEven && guess.equals("odd"))) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }

            System.out.println("Your score: " + score);
            System.out.println("Do you want to play again? (yes/no)");
            playAgain = scanner.nextLine().toLowerCase();
        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing!");
    }
}
