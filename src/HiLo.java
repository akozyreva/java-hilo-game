import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain = "";
        do {
            // generate number for game
            // Math.random() double from 0.0 to almost 0.1
            int theNumber = (int) (Math.random() * 200 - 100);
            System.out.println(theNumber);

            int guess = 0;
            int attempt = 0;
            while (guess != theNumber) {
                attempt += 1;
                System.out.println("Guess a number between -100 and 100:");
                guess = scanner.nextInt();
                System.out.println("You entered " + guess + ".");
                if (guess > theNumber)
                    System.out.println("The number " + guess + " is too big");
                else if (guess < theNumber)
                    System.out.println("The number " + guess + " is too small");
            }
            System.out.println("You win! Guessed number is " + theNumber);
            System.out.println("Whole numbers of attempts are: " + attempt);
            System.out.println("Would you like to play again? y/n");
            playAgain = scanner.next();
        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Thank you for playing! Goodbye!");
        scanner.close();
    }

}
