package student_vladislav_nikitin.lesson_4.level_4.task_11;

import java.util.Scanner;

class CalculatorDemo {
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

        System.out.printf(
                "%d + %d = %d\n",
                firstNumber, secondNumber,
                Calculator.summing(firstNumber, secondNumber)
        );
        System.out.printf(
                "%d - %d = %d\n",
                firstNumber, secondNumber,
                Calculator.subtraction(firstNumber, secondNumber)
        );
        System.out.printf(
                "%d * %d = %d\n",
                firstNumber, secondNumber,
                Calculator.multiplication(firstNumber, secondNumber)
        );
        System.out.printf(
                "%d / %d = %f\n",
                firstNumber, secondNumber,
                Calculator.division(firstNumber, secondNumber)
        );
    }
}
