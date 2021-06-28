package student_petr_zaytsev.lesson_2.level_2;
import java.util.Scanner;

public class HelloUsername {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        System.out.println("Hello " + username);
    }
}
