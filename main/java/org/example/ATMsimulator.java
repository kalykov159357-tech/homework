package org.example;
import java.util.Scanner;

public class ATMsimulator {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double balance = 0;
        double deposit = 0;
        double withdraw;
        int PIN = 1234, pin, attempt = 2, option;

        System.out.println("===== SIMPLE ATM =====");
        System.out.println("Enter your PIN: ");

        while(attempt >= 0) {
            pin = input.nextInt();

            if(pin == PIN){
                System.out.println("Login successful!\n");

                do {
                    System.out.println("\n===== ATM MENU =====");
                    System.out.println("1. Check balance");
                    System.out.println("2. Deposit money");
                    System.out.println("3. Withdraw money");
                    System.out.println("4. Exit");
                    System.out.print("Choose option: ");
                    option = input.nextInt();

                    switch (option) {
                        case 1:
                            System.out.println("Your current balance is: $" + balance);
                            break;

                        case 2:
                            do {
                                System.out.print("Enter deposit amount: ");
                                deposit = input.nextDouble();
                                if (deposit < 0) {
                                    System.out.println("Error! The amount cannot be negative.");
                                }
                            } while (deposit < 0);
                            balance =+ deposit;
                            System.out.println("Deposit successful.");
                            System.out.println("Your new balance is: $" + balance);
                            break;

                        case 3:
                            if (balance == 0) {
                                System.out.println("Your current balance is: $0");
                                System.out.println("You cannot perform a withdrawal operation.");
                                break;
                            }
                            do{

                                System.out.print("Enter withdrawal amount: ");
                                withdraw = input.nextDouble();
                                if(withdraw > 0 && withdraw <= balance){
                                    balance -= withdraw;
                                    System.out.println("Successfully withdrawn.");
                                    System.out.println("Your new balance is: $" + balance);

                                }else if (withdraw > balance) {
                                    System.out.println("Error! The amount must not be greater than the current balance.");
                                } else {
                                    System.out.println("Error! The amount cannot be negative.");
                                }
                            } while (withdraw < 0 || withdraw > balance);
                            break;

                        case 4:
                            System.out.println("Thank you for you  our ATM!");
                            break;

                        default:
                            System.out.println("Error! Incorrect option.");
                            break;
                    }

                }while (option != 4) ;
            }else{
                System.out.println("Incorrect number.");
                System.out.println("Attempts left: " + attempt);
            }
            if(attempt == 0){
                System.out.println("Your account has been blocked.");
            }
            attempt--;
        }
    }
}



