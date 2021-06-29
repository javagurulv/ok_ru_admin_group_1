package student_ilya_dolmatov.lesson_4.level_1.task_1;

import java.util.Scanner;

class SubZero {
    public static void main(String[] args) {
        System.out.println("Please input a value!");
        Scanner value = new Scanner(System.in);
        int newValue =  value.nextInt();
        if (newValue > 0) {
            System.out.println("Your value above zero.");
        }
        else if (newValue < 0) {
            System.out.println("Your value below zero.");
        }
        //    Already done check if zero before read task 2 ¯\_(ツ)_/¯
        else System.out.println("Your value is zero.");

    }
}
