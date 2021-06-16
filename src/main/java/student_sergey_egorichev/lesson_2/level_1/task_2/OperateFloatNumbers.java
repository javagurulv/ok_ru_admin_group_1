package student_sergey_egorichev.lesson_2.level_1.task_2;

import java.util.Scanner;

public class OperateFloatNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Снова здравствуй, мой кожаный друг! Ты ещё не забыл меня?
                Это снова я, твой друг, электроПетрович.
                Давай усложним задачу. Введи ещё одно число, но не целое, а с десятичной частю:"""
        );
        double firstDoubleNumber = scanner.nextDouble();

        System.out.println(firstDoubleNumber + "? Xм, не плохо.\n"
                + "A теперь ещё одно. Точно такоеже, но другое:");
        double secondDoubleNumber = scanner.nextDouble();

        System.out.println("А теперь ВНИМАНИЕ! Смертельный номер!"
                + "\n" + firstDoubleNumber + " плюс " + secondDoubleNumber+ " будет " + (firstDoubleNumber + secondDoubleNumber)
                + "\n" + firstDoubleNumber + " минус " + secondDoubleNumber + " получаем " + (firstDoubleNumber - secondDoubleNumber)
                + "\n" + firstDoubleNumber + " на " + secondDoubleNumber + " это " + (firstDoubleNumber * secondDoubleNumber)
                + "\n" + firstDoubleNumber + " разделить на " + secondDoubleNumber + " останется " + (firstDoubleNumber / secondDoubleNumber)
                + "\nВпечатлён? A это ведь только начало."
        );

    }
}
