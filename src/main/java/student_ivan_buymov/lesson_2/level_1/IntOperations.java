package student_ivan_buymov.lesson_2.level_1;

import java.util.Scanner;

class IntOperations {
    public static void main(String[] args) {
        doMathOperations();
    }

    private static Integer readInt(String message, Scanner s) {
        do {
            System.out.print(message);
            if (s.hasNextInt()) {
                return s.nextInt();
            } else {
                System.out.println("number must be a positive integer, try again");
                s.nextLine();
            }
        } while (true);
    }

    private static void doMathOperations() {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = readInt("Input first number: ", scanner);
        int secondNumber = readInt("Input second number: ", scanner);

        String sumResult = String.format("%d + %d = %d", firstNumber, secondNumber, firstNumber + secondNumber);
        String subtractResult = String.format("%d - %d = %d", firstNumber, secondNumber, firstNumber - secondNumber);
        String multiplyResult = String.format("%d * %d = %d", firstNumber, secondNumber, firstNumber * secondNumber);
        String divisionResult = String.format("%d / %d = %d", firstNumber, secondNumber, firstNumber / secondNumber);

        System.out.println(sumResult);
        System.out.println(subtractResult);
        System.out.println(multiplyResult);
        System.out.println(divisionResult);

    }
}
