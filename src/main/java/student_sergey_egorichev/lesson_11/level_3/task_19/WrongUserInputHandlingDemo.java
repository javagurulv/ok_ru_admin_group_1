package student_sergey_egorichev.lesson_11.level_3.task_19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WrongUserInputHandlingDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer i = null;

        while (i == null) {
            try {
                System.out.print("ВВедите число: ");
                i = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Введённое вами нечто не является числом.");
                sc.next();
            }
        }
    }
}
