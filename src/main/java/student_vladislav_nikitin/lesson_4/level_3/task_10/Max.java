package student_vladislav_nikitin.lesson_4.level_3.task_10;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Max {
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

    public static void main(String[] args) {
        int firstNumber = getUserNumber();
        int secondNumber = getUserNumber();
        int thirdNumber = getUserNumber();
        int[] numbers = {firstNumber, secondNumber, thirdNumber};

        int maxNumber = firstNumber;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > firstNumber) {
                maxNumber = numbers[i];
            }
        }

        System.out.println(maxNumber);
    }
}
