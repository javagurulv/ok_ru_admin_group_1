package student_ivan_buymov.lesson_2.level_1;

import java.util.Scanner;

class doubleOperations {
    public static void main(String[] args) {
        doMathOperations();
    }

    private static Double readDouble(String message, Scanner s) {
        do {
            System.out.print(message);
            if (s.hasNextDouble()) {
                return s.nextDouble();
            } else {
                System.out.println("number must be a double, try again");
                s.nextLine();
            }
        } while (true);
    }

    private static void doMathOperations() {

        Scanner scanner = new Scanner(System.in);

        double firstNumber = readDouble("Input first number: ", scanner);
        double secondNumber = readDouble("Input second number: ", scanner);

        String sumResult = String.format("%f + %f = %f", firstNumber, secondNumber, firstNumber + secondNumber);
        String subtractResult = String.format("%f - %f = %f", firstNumber, secondNumber, firstNumber - secondNumber);
        String multiplyResult = String.format("%f * %f = %f", firstNumber, secondNumber, firstNumber * secondNumber);
        String divisionResult = String.format("%f / %f = %f", firstNumber, secondNumber, firstNumber / secondNumber);

        System.out.println(sumResult);
        System.out.println(subtractResult);
        System.out.println(multiplyResult);
        System.out.println(divisionResult);

    }
}
