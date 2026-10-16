 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int correctPin = 1234;
        int attempts = 3;
        double balance = 1500;
        boolean loggedIn = false;

        System.out.println("====SIMPLE ATM====");

        // LOG IN
        while (attempts > 0) {
            System.out.println("Enter your PIN: ");
            int pin = scanner.nextInt();

            if (pin == correctPin) {
                System.out.println("Login successful!");
                loggedIn = true;
                break;
            } else {
                attempts--;
                System.out.println("Incorrect PIN.");
                System.out.println("Remaining attempts: " + attempts);
            }
        }


        if (loggedIn) {
            int choice;

            do {
                System.out.println("\n===== ATM MENU =====");
                System.out.println("1. Check balance");
                System.out.println("2. Deposit money");
                System.out.println("3. Withdraw money");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");

                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Your balance: " + balance);
                        break;

                    case 2:
                        System.out.print("Enter deposit amount: ");
                        double deposit = scanner.nextDouble();

                        if (deposit > 0) {
                            balance += deposit;
                            System.out.println("Updated balance: " + balance);
                        } else {
                            System.out.println("Invalid amount!");
                        }
                        break;

                    case 3:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawal = scanner.nextDouble();

                        if (withdrawal > 0 && withdrawal <= balance) {
                            balance -= withdrawal;
                            System.out.println("Updated balance: " + balance);
                        } else {
                            System.out.println("Invalid amount or insufficient balance!");
                        }
                        break;

                    case 4:
                        System.out.println("Thank you for using SIMPLE ATM!");
                        break;

                    default:
                        System.out.println("Invalid option!");
                }

            } while (choice != 4);

        } else {
            System.out.println("Your account has been blocked.");
        }

        scanner.close();




    }}