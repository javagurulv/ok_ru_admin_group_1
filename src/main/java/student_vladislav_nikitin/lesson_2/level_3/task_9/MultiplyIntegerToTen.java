package student_vladislav_nikitin.lesson_2.level_3.task_9;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class MultiplyIntegerToTen {
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
        int number = getIntegerFromInput("Input a number: ");
        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            long multiply = number * multiplier;
            System.out.println(number + " * " + multiplier + " = " + multiply);
        }
    }
}
