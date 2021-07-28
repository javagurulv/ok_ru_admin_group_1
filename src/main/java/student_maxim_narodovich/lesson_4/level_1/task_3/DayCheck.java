package student_maxim_narodovich.lesson_4.level_1.task_3;

import java.util.Scanner;

public class DayCheck {
    public static void main(String[] args) {
        System.out.println("Input digit between 1 and 7:");
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        switch (digit) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

    }
}
