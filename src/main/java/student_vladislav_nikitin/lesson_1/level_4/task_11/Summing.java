package student_vladislav_nikitin.lesson_1.level_4.task_11;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Summing {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Needs 2 number as arguments.");
            System.exit(1);
        }

        int firstNumber = 0, secondNumber = 0;
        try {
            firstNumber = Integer.parseInt(args[0]);
            secondNumber = Integer.parseInt(args[1]);
        }
        catch (NumberFormatException exception) {
            System.err.println("Invalid argument. Numbers are required.");
            System.err.println(exception.getMessage());
            System.exit(1);
        }

        int sum = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
    }
}
