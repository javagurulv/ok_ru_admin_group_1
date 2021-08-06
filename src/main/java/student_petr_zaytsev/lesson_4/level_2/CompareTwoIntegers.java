package student_petr_zaytsev.lesson_4.level_2;
import java.util.Scanner;

public class CompareTwoIntegers {
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
            output = String.valueOf(x) + " is bigger than " + String.valueOf(y);
        if (result < 0)
            output = String.valueOf(y) + " is bigger than " + String.valueOf(x);
        else
            output = String.valueOf(y) + " equals " + String.valueOf(x);

        return output;
    }
}
