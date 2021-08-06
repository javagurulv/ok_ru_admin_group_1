package student_sergey_egorichev.lesson_8.level_1.task_4;

import java.util.Scanner;

public class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe();

        safe.password = "Where's the Money, Lebowski?";
        safe.moneyAmount = 9999;

        Scanner scanner = new Scanner(System.in);

        if (scanner.nextLine().equals(safe.password)) {
            System.out.println("Take your " + safe.moneyAmount);
        } else {
            System.out.println("It's uh... uh... it's down there somewhere, let me take another look.");
        }
    }
}
