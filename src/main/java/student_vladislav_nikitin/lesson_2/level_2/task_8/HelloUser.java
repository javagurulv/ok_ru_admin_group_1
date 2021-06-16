package student_vladislav_nikitin.lesson_2.level_2.task_8;

import java.util.Scanner;

public class HelloUser {
    static String getName() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            if (name.length() > 0) {
                return name;
            }
            System.out.println("Your don't have a name?");
        }
    }

    public static void main(String[] args) {
        String userName = getName();
        System.out.println("Hello " + userName + "!");
    }
}
