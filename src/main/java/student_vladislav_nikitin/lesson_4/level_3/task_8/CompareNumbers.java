package student_vladislav_nikitin.lesson_4.level_3.task_8;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CompareNumbers {
    static int getUserNumber() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the number: ");
            if (! scanner.hasNextInt()) {
                System.out.println(scanner.next() + " is not number!");
                continue;
            } else {
                return scanner.nextInt();
            }
        }
    }

    static boolean allNumberNotEquals(int num1, int num2, int num3) {
        return ! (num1 == num2 || num1 == num3 || num2 == num3);
    }

    public static void main(String[] args) {
        int firstNumber = getUserNumber();
        int secondNumber = getUserNumber();
        int thirdNumber = getUserNumber();

        String answer;

        boolean allEqual = firstNumber == secondNumber && secondNumber == thirdNumber;
        boolean allDifferent = allNumberNotEquals(firstNumber, secondNumber, thirdNumber);
        if (allEqual) {
            answer = "All numbers are equal";
        }
        else if (allDifferent) {
            answer = "All numbers are different";
        }
        else {
            answer = "Neither all are equal or different";
        }

        System.out.println(answer);
    }
}
