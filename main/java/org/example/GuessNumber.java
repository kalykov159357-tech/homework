package org.example;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int sec_num = 12, guess = 0;
        int attempt = 5;

        System.out.println("=====Guess the Number=====");
        System.out.println("You have a maximum " + attempt + " attempts.");

        int i = 0;
        do{

            i++;

            System.out.println("Enter your guess: ");
            guess = input.nextInt();

            if(guess > sec_num){

                System.out.println("Too high!");

            }else if(guess < sec_num){

                System.out.println("Too low!");

            }else if(guess == sec_num){

                System.out.println("Correct!");
                System.out.println("You needed " + i + " attempts.");
                break;
            }
            if( i == attempt){

                System.out.println("Game over!");
                System.out.println("The secret number was " + sec_num);
            }


        }while(i < attempt);

    }
}

