

import java.util.Scanner;

class ATM {
    double balance = 10000; // Initial balance
    int pin = 1234;

    void checkPin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == pin) {
            menu();
        } else {
            System.out.println("Incorrect PIN!");
        }
    }

    void menu() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");

            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdraw Successful!");
                    } else {
                        System.out.println("Insufficient Balance!");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("Deposit Successful!");
                    break;

                case 4:
                    System.out.println("Thank you! Visit again.");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

public class AtmSimulator {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkPin();
    }
}