package student_vladislav_nikitin.lesson_2.level_3.task_11;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Mean {
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
        int firstNumber = getIntegerFromInput("Enter first number: ");
        int secondNumber = getIntegerFromInput("Enter second number: ");
        int thirdNumber = getIntegerFromInput("Enter third number: ");

        double average = Double.valueOf(firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("Arithmetic mean of " + firstNumber + ", " + secondNumber + ", " + thirdNumber + " is " + average);
    }
}
