package student_yuri_grigorov.lesson_2.level_1_intern.task_2;

import java.util.Scanner;

/**
 * This class performs simple calculations with two doubles
 *
 * @author Yuri Grigorov
 */

public class SimpleCalcDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextDouble();

        double addition = firstNumber + secondNumber;
        double subtraction = firstNumber - secondNumber;
        double multiplication = firstNumber * secondNumber;
        double division = firstNumber / secondNumber;

        System.out.println(
                "(+) Addition: " + addition + System.lineSeparator() +
                        "(-) Subtraction : " + subtraction + System.lineSeparator() +
                        "(*) Multiplication: " + multiplication + System.lineSeparator() +
                        "(/) Division: " + division
        );
    }
}
