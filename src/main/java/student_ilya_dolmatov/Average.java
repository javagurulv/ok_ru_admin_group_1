package student_ilya_dolmatov;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        Scanner scanner = new Scanner(System.in);
        double firstDigit = scanner.nextDouble();
        System.out.println("Введите второе число:");
        scanner = new Scanner(System.in);
        double secondDigit = scanner.nextDouble();
        System.out.println("Введите третье число:");
        scanner = new Scanner(System.in);
        double thirdDigit = scanner.nextDouble();

        double average = (firstDigit + secondDigit + thirdDigit) / 3;

        System.out.println("Среднее арифметическое чисел " + firstDigit + ", " + secondDigit + ", " + thirdDigit +
                " = " + average);
    }

}
