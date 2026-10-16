package org.example;
import java.util.Scanner;

public class ATMverification {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("=====ATM PIN Verification =====");
        System.out.println("You need to enter the PIN of your card in order to have access.");
        System.out.println("Please, enter the your PIN: ");
        int i = 2, PIN = 3030, ABC;
        while(i >= 0){
            ABC = input.nextInt();
            if(ABC == PIN){
                System.out.println("Access granted!");
                break;
            }else{
                System.out.println("Incorrect PIN.");
                System.out.println("Attempts left: " + i);
            }
            i--;

        }

    }
}
