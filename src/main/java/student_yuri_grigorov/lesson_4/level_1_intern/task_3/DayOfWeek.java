package student_yuri_grigorov.lesson_4.level_1_intern.task_3;

import java.util.Scanner;

class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day number: ");
        int dayNum = scanner.nextInt();
        String dayStr = switch (dayNum) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Unknown";
        };
        System.out.println(dayStr);
    }
}
