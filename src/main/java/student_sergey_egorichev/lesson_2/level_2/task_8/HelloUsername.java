package student_sergey_egorichev.lesson_2.level_2.task_8;

import java.util.Scanner;

public class HelloUsername {
    public static void main(String[] args) {
        System.out.println("""
                А теперь самое время познакомиться.
                Скажи, мой друг, как тебя зовут?""");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("Hello " + userName);

    }
}
