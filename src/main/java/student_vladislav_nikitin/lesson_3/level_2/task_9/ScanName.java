package student_vladislav_nikitin.lesson_3.level_2.task_9;

import java.util.Scanner;

class ScanName {
    public static String getName() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        return scanner.next();
    }

    public static void main(String[] args) {
        String name = getName();
        String greeting = "Hi " + name + "!";
        System.out.println(greeting);
    }
}
