import java.util.Scanner;

public class guess {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
// вводим секретное число и количество попыток
        int secretNumber = 8;
        int attempts = 5;
        boolean guessed = false;
// используем цикл, чтобы действие не прерывалось
        while (attempts > 0) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("Correct! You guessed the number!");
                guessed = true;
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
// -- означает что с каждым разом попытки уменьшаются
            attempts--;

            if (attempts > 0) {
                System.out.println("Attempts left: " + attempts);
            }
        }

        if (!guessed) {
            System.out.println("Game over! The secret number was " + secretNumber);
        }

        scanner.close();
    }
}


