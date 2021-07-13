package student_vladislav_nikitin.lesson_4.level_1.task_2;

import java.util.Scanner;

class NegativeOrPositiveOrNull {

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
        if (number == 0) {
            answer += " is null.";
        }
        else if (number < 0) {
            answer += " is negative.";
        } else {
            answer += " is positive.";
        }

        System.out.println(answer);
    }
}
