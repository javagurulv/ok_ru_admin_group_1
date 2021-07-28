package student_vladislav_nikitin.lesson_4.level_1.task_4;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class OddOrNot {
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
        int number = getUserNumber();

        String answer = String.valueOf(number);
        if (number % 2 == 0) {
            answer += " is even";
        } else {
            answer += " is odd";
        }

        System.out.println(answer);
    }
}
