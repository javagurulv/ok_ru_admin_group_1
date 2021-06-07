package student_ilya_dolmatov.lesson_2.level_3.task_9;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Введите число для вывода таблицы умножения:");
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();

        System.out.println("Test Data:\nInput a number: " + digit + "\n\nExpected Output :");
        int res;
        for(int i = 1; i<=10; i++){
            res = digit * i;
            System.out.println("\t" + digit + " x " + i + " = " + res);
        }
    }
}
