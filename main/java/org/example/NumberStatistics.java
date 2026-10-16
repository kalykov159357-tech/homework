package org.example;
import java.util.Scanner;

public class NumberStatistics {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int num, positive=0, negative=0, zero=0, even=0, odd=0;

        System.out.println("=====Number Statistics=====");
        System.out.println("Enter 10 integer numbers: ");

        for(int i=0; i<10; i++){
            num = input.nextInt();
            if(num > 0){
                positive++;
            }
            if(num < 0){
                negative++;
            }
            if(num == 0){
                zero++;
            }
            if(num % 2 == 0){
                even++;
            }
            if(num % 2 != 0){
                odd++;
            }
        }
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zero);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }

}

