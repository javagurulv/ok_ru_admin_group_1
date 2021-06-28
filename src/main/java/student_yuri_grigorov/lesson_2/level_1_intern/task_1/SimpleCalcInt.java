package student_yuri_grigorov.lesson_2.level_1_intern.task_1;

import java.util.Scanner;

import teacher.codereview.CodeReview;

/**
 * This class performs simple calculations with two integers
 *
 * @author Yuri Grigorov
 */

@CodeReview(approved = true)
public class SimpleCalcInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;

        System.out.println(
                "(+) Addition: " + addition + System.lineSeparator() +
                "(-) Subtraction : " + subtraction + System.lineSeparator() +
                "(*) Multiplication: " + multiplication + System.lineSeparator() +
                "(/) Division: " + division
        );
    }
}
