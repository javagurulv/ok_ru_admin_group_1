package student_ilya_dolmatov;

import java.util.Scanner;

public class AskName {
    public static void main(String[] args) {
        System.out.println("Введите своё имя пользователя:");
        Scanner scanner = new Scanner(System.in);
        String loginName = scanner.nextLine();

        System.out.println("Hello " + loginName + " !");

    }
}
