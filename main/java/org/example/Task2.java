package org.example;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age;

        System.out.print("Enter your age: ");
        age = input.nextInt();
        if(age > 18)
        {
            System.out.println("You can vote.");
        }
        else
        {
            System.out.println("You cannot vote.");
        }
    }
}
