package student_petr_zaytsev.lesson_4.level_2;
import java.util.Scanner;

public class ShowMinorInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int firstnumber = scanner.nextInt();
        System.out.println("Enter another number: ");
        int secondnumber = scanner.nextInt();

        String result = substraction(firstnumber, secondnumber);

        System.out.println(result);

    }
    static String substraction(int x, int y)
    {
        int result = x - y;
        String output;

        if (result > 0)
            output = String.valueOf(y);
        else
            output = String.valueOf(x);

        return output;
    }
}
