package org.example;
import java.util.Scanner;

public class Task3 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Enter number: ");
        num = input.nextInt();
        if(num % 2 == 0)
        {
            System.out.println("Entered number is even.");
        }
        else
        {
            System.out.println("Entered number is odd.");
        }
    }
}
