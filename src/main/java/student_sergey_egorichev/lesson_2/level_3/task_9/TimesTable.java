package student_sergey_egorichev.lesson_2.level_3.task_9;

import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args) {
        System.out.println("Таблицу уможения на какое число ты хочешь чтобы я тебе рассказал?");
        Scanner scanner = new Scanner(System.in);
        int aNumber = scanner.nextInt();

        for(int i = 1; i <= 9; i++)
        {
            String outputLine = String.format("%d x %d = %d",
                    aNumber, i, aNumber * i);
            System.out.println(outputLine);
        }
    }
}
