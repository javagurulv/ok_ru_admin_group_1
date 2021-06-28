package student_vladislav_nikitin.lesson_2.level_1.task_1;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class IntegerMath {
    static int getIntegerFromInput(String message) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(message);
            if (!scanner.hasNextInt()) {
                System.err.println(scanner.next() + " is not integer number");
            } else {
                return scanner.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        int firstNumber = getIntegerFromInput("Please enter first number: ");
        int secondNumber = getIntegerFromInput("Please enter second number: ");

        int sum = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        long multiply = firstNumber * secondNumber;
        float divide = Float.valueOf(firstNumber) / secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + subtraction);
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiply);
        System.out.println(firstNumber + " / " + secondNumber + " = " + divide);
    }
}
