package student_ilya_dolmatov.lesson_2.level_2.task_8;

import java.util.Scanner;

public class AskName {
    public static void main(String[] args) {
        System.out.println("Введите своё имя пользователя:");
        Scanner scanner = new Scanner(System.in);
        String loginName = scanner.nextLine();

        System.out.println("Hello " + loginName + " !");

    }
}
