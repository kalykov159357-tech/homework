package org.example;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double num1, num2;
        int oper;

        System.out.print("Enter first number: ");
        num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        num2 = input.nextDouble();

        do {
            if (num2 == 0) {
                System.out.print("Error! Enter the other number that not equals 0: ");
                num2 = input.nextDouble();
            }
        }while(num2==0);

        System.out.println("Choose these numbers for the operation:");
        System.out.println("1-addition");
        System.out.println("2-subtraction");
        System.out.println("3-multiplication");
        System.out.println("4-division");
        oper = input.nextInt();

        switch (oper)
        {
            case 1:
                double res1=num1+num2;
                System.out.println("Addition: " + num1 + " + " + num2 + " = " + res1);
                break;

            case 2:
                double res2=num1-num2;
                System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + res2);
                break;

            case 3:
                double res3=num1*num2;
                System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + res3);
                break;

            case 4:
                double res4=num1/num2;
                System.out.println("Division: " + num1 + " / " + num2 + " = " + res4);
                break;

            default:
                System.out.println("Error!");
        }
    }

}

