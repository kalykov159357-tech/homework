package org.example;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int age, monthly_income, credit_score, numyears_curjob, option;

        System.out.println("Enter your details to find out if you are eligible for a loan.");
        System.out.println("---Requirements---");
        System.out.println("The applicant is Approved if: ");
        System.out.println("* Age is between 21 and 65 *");
        System.out.println("* Monthly income is at least 30000 *");
        System.out.println("* Credit score is at least 70 *");
        System.out.println("* AND at least one of these is true: ");
        System.out.println("* The applicant has worked at the current job for at least 2 years *");
        System.out.println("* The applicant has no existing debt *");
        System.out.println("---The applicant is Rejected if the conditions are not satisfied.---");

        do {
            System.out.print("1. Enter your age: ");
            age = input.nextInt();
            if(age < 0)
                System.out.println("Error! Age cannot be less than 0.");

        }while(age < 0);

        do{
            System.out.print("2. Enter your monthly income: ");
            monthly_income = input.nextInt();
            if(monthly_income < 0)
                System.out.println("Error! Monthly_income cannot be less than 0.");

        }while(monthly_income < 0);

        do{
            System.out.print("3. Enter your credit score: ");
            credit_score=input.nextInt();
            if(credit_score < 0 || credit_score > 100)
                System.out.println("Error! This value cannot be less than 0 and more than 100.");

        }while(credit_score < 0 || credit_score > 100);

        do{
            System.out.print("4. Enter your number of years at current job: ");
            numyears_curjob = input.nextInt();
            if(numyears_curjob < 0)
                System.out.println("Error! This value cannot be less than 0");

        }while(numyears_curjob < 0);

        boolean debt=false;

        do{
            System.out.println("5. Debts: ");
            System.out.println("Select 0 or 1: ");
            System.out.println("0 - you have debts.");
            System.out.println("1 - you have not debts.");
            option = input.nextInt();

            switch(option)
            {
                case 0:
                    debt = false;
                    break;
                case 1:
                    debt = true;
                    break;
                default:
                    System.out.println("Error!");
            }

        }while(option > 1 || option < 0);

        if((age>=21 && age<65) && monthly_income>=30000 && credit_score>=70){
            if(numyears_curjob>=2 || debt)
                System.out.println("*****Result: Loan Approved.*****");

        }else
            System.out.println("*****Result: The application is rejected.*****");

    }
}

