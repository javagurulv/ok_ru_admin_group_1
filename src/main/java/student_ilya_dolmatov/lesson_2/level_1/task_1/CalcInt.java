package student_ilya_dolmatov.lesson_2.level_1.task_1;

import java.util.Scanner;

public class CalcInt {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число:");
        scanner = new Scanner(System.in);
        int secondNumber = scanner.nextInt();

        System.out.println("Результаты сложения:");
        System.out.println(firstNumber + secondNumber);
        System.out.println("Результаты вычитания:");
        System.out.println(firstNumber - secondNumber);
        System.out.println("Результаты умножения:");
        System.out.println(firstNumber * secondNumber);
        System.out.println("Результаты деления:");
        System.out.println(firstNumber / secondNumber);

    }
}
