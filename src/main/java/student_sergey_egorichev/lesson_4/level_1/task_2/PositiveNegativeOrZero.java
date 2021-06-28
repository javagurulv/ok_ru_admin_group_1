package student_sergey_egorichev.lesson_4.level_1.task_2;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class PositiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter some number (integer): ");
        int someNumber = scanner.nextInt();

        if (someNumber < 0) {
            System.out.println(someNumber + " is negative.");
        } else if (someNumber == 0) {
            System.out.println("Is zero.");
        } else {
            System.out.println(someNumber + " is positive.");
        }
    }
}