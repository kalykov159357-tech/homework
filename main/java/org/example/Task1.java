package org.example;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, num3;

        System.out.print("Enter first number: ");
        num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        num2 = input.nextDouble();
        System.out.print("Enter third number: ");
        num3 = input.nextDouble();

        if(num1 == num2 && num2 == num3)
        {
            System.out.print("All numbers are equal.");
        }
        else if(num1 >= num2 && num1 >= num3)
        {
            System.out.print("Number: " + num1 + " is greatest among.");
        }
        else if(num2 >= num1 && num2 >= num3)
        {
            System.out.print("Number: " + num2 + " is greatest among.");
        }
        else
        {
            System.out.print("Number: " + num3 + " is greatest among.");
        }
    }

}

