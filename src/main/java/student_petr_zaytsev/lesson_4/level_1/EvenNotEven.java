package student_petr_zaytsev.lesson_4.level_1;
import java.util.Scanner;

public class EvenNotEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();


        System.out.println(number + " is " + division(number));
    }
    static String division(int x)
    {
        int remains = x% 2;
        if (remains == 0)
            return "even";
        else
            return "not even";
    }
}
