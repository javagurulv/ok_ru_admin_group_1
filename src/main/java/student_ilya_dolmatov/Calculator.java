package student_ilya_dolmatov;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        Scanner scanner = new Scanner(System.in);
        Double firstNumber = scanner.nextDouble();
        System.out.println("Введите второе число:");
        scanner = new Scanner(System.in);
        Double secondNumber = scanner.nextDouble();
        System.out.println("Результаты сложения:");
        System.out.println(firstNumber + secondNumber);
        System.out.println("Результаты вычитания:");
        System.out.println(firstNumber - secondNumber);
        System.out.println("Результаты умножения:");
        System.out.println(firstNumber * secondNumber);
        System.out.println("Результаты деления:");
        System.out.println(firstNumber / secondNumber);


//        Scanner scanner = new Scanner(System.in);
//        int firstNumber = scanner.nextInt();
//        4. Запишите полученные результаты в переменные;
//        5. При помощи System.out.println() выведите на консоль полученные результаты сложения, вычитания, умножения и деления.
//        (каждый результат на новой строке отдельно).

    }
}
