package student_vladislav_nikitin.lesson_4.level_2.task_5;

import java.util.Scanner;

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

        String answer;
        if (firstNumber > secondNumber) {
            answer = firstNumber + " is greater than " + secondNumber;
        } else {
            answer = secondNumber + " is greater than " + firstNumber;
        }

        System.out.println(answer);
    }
}
