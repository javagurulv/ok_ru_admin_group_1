package student_vladislav_nikitin.lesson_4.level_3.task_9;

import java.util.Scanner;

class OrderDirection {
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

        String answer;

        boolean increaseOrder = thirdNumber > secondNumber && secondNumber > firstNumber;
        boolean decreaseOrder = firstNumber > secondNumber && secondNumber > thirdNumber;

        if (increaseOrder) {
            answer = "increasing";
        }
        else if (decreaseOrder) {
            answer = "decreasing";
        }
        else {
            answer = "Neither increasing or decreasing order";
        }

        System.out.println(answer);
    }
}
