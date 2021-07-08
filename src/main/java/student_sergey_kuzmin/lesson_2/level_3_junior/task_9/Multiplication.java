package student_sergey_kuzmin.lesson_2.level_3_junior.task_9;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter number to multiply from 1 to 10");
        int wholenumber = input.nextInt();

        System.out.println("Here you go!");
        for (int i = 1; i <= 10; i++) {
            System.out.println(
                    wholenumber + " x " + i + " = " + wholenumber * i
            );
        }
    }
}









