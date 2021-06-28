package student_maxim_narodovich.lesson_2.level_1.task_1;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class OperationsWithUserIntDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("first number + second number = " + (firstNumber + secondNumber));
        System.out.println("first number - second number = " + (firstNumber - secondNumber));
        System.out.println("first number * second number = " + (firstNumber * secondNumber));
        System.out.println("first number / second number = " + (firstNumber / secondNumber));

    }
}
