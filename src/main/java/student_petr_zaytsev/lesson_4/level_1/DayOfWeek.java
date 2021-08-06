package student_petr_zaytsev.lesson_4.level_1;
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number from 1 to 7: ");
        int number = scanner.nextInt();


        if (checkDay(number)) {
            System.out.println(number + " is out of 0-7 range");
            System.exit(1);
        }
        System.out.println(showDay(number));

    }

    static boolean checkDay(int x)
    {
        if (!(x > 0 && x < 8))
            return Boolean.TRUE;
        else
            return Boolean.FALSE;
    }

    static String showDay(int x)
    {
        String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday" };

        return days[x];
    }
}
