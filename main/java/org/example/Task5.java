package org.example;
import java.util.Scanner;

public class Task5 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        int attend_point, HW_point, exam_point, total_point;

        System.out.println("Enter the data to determine whether the student has passed.");

        do {

            System.out.print("1. Enter the point for attendance: ");
            attend_point = input.nextInt();
            if (attend_point < 0 || attend_point > 10)
                System.out.println("Error! The value cannot be less than 0 and more than 10.");

        }while(attend_point < 0 || attend_point > 10);

        do {

            System.out.print("2. Enter the point for Homework: ");
            HW_point = input.nextInt();
            if (HW_point < 0 || HW_point > 60)
                System.out.println("Error! The value cannot be less than 0 and more than 60.");

        }while(HW_point < 0 || HW_point > 60);

        do {

            System.out.print("3. Enter the point for exam: ");
            exam_point = input.nextInt();
            if (exam_point < 0 || exam_point > 30)
                System.out.println("Error! The value cannot be less than 0 and more than 30.");

        }while(exam_point < 0 || exam_point > 30);

        total_point = attend_point + HW_point + exam_point;
        System.out.println("The student's total point: " + total_point);
        if((total_point>65) && (attend_point>=6) && (exam_point>=17))
            System.out.println("*****The student successfully passed the exam!*****");
        else
            System.out.println("*****The student did not pass the exam.*****");

    }
}
