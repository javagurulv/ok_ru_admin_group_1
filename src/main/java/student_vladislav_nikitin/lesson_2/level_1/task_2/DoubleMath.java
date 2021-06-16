package student_vladislav_nikitin.lesson_2.level_1.task_2;

import java.util.Scanner;

public class DoubleMath {
    static double getDoubleFromInput(String message) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(message);
            if (!scanner.hasNextDouble()) {
                System.err.println(scanner.next() + " is not real number");
            } else {
                return scanner.nextDouble();
            }
        }
    }

    public static void main(String[] args) {
        double firstNumber = getDoubleFromInput("Please enter first number: ");
        double secondNumber = getDoubleFromInput("Please enter second number: ");

        double sum = firstNumber + secondNumber;
        double subtraction = firstNumber - secondNumber;
        double multiply = firstNumber * secondNumber;
        double divide = firstNumber / secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + subtraction);
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiply);
        System.out.println(firstNumber + " / " + secondNumber + " = " + divide);
    }
}
