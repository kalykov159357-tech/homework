package org.example;
import java.util.Scanner;

public class Task7 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        boolean premium=false, coupon=false, birthday=false;
        int sum_purchase, orders, opt, discount, sum_discount, final_price;

        do {
            System.out.print("1. Enter the total purchase amount: ");
            sum_purchase = input.nextInt();
            if (sum_purchase < 0)
                System.out.println("The purchase amount cannot be less than 0");

        }while(sum_purchase < 0);

        do {
            System.out.println("2. Are you a premium member: ");
            System.out.println("Select 0 or 1: ");
            System.out.println("0 - you are not a premium member.");
            System.out.println("1 - you are a premium member");
            opt=input.nextInt();
            switch(opt)
            {
                case 0:
                    premium=false;
                    break;
                case 1:
                    premium=true;
                    break;
                default:
                    System.out.println("Error!");
            }

        }while(opt<0 || opt>1);

        do {
            System.out.print("3. Enter the number of previous orders: ");
            orders = input.nextInt();
            if (orders < 0)
                System.out.println("Error! This value cannot be less than 0.");

        }while(orders < 0);

        do{
            System.out.println("4. Have you a discount coupon?");
            System.out.println("Select 0 or 1: ");
            System.out.println("0 - you have not.");
            System.out.println("1 - you have");
            opt=input.nextInt();
            switch(opt)
            {
                case 0:
                    coupon=false;
                    break;
                case 1:
                    coupon=true;
                    break;
                default:
                    System.out.println("Error!");
            }
        }while(opt<0 || opt>1);

        do{
            System.out.println("5. Is this your birth month?");
            System.out.println("Select 0 or 1: ");
            System.out.println("0 - No.");
            System.out.println("1 - Yes");
            opt=input.nextInt();
            switch(opt)
            {
                case 0:
                    birthday=false;
                    break;
                case 1:
                    birthday=true;
                    break;
                default:
                    System.out.println("Error!");
            }
        }while(opt<0 || opt>1);

        if(sum_purchase >= 200 && premium) {
            if (coupon || birthday) {
                discount = 20;
                sum_discount = (sum_purchase * discount) / 100;
                final_price = sum_purchase - sum_discount;
                System.out.println("Original price: " + sum_purchase);
                System.out.println("Discount: " + discount);
                System.out.println("Discount amount: " + sum_discount);
                System.out.println("Final price: " + final_price);
            }
        }else if(sum_purchase >= 150) {
            if(premium || orders >= 10) {
                discount = 15;
                sum_discount = (sum_purchase * discount) / 100;
                final_price = sum_purchase - sum_discount;
                System.out.println("Original price: " + sum_purchase);
                System.out.println("Discount: " + discount);
                System.out.println("Discount amount: " + sum_discount);
                System.out.println("Final price: " + final_price);
            }
        }else if(sum_purchase >= 100 && coupon){
            discount = 10;
            sum_discount = (sum_purchase * discount) / 100;
            final_price = sum_purchase - sum_discount;
            System.out.println("Original price: " + sum_purchase);
            System.out.println("Discount: " + discount);
            System.out.println("Discount amount: " + sum_discount);
            System.out.println("Final price: " + final_price);
        }else{
            System.out.println("You are not discount.");
        }

    }
}
