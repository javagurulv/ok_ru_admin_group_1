package student_sergey_kuzmin.lesson_4;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter integer from 1 to 7 to get day of week");
        int number = input.nextInt();

        if (number < 1 || number > 7) {
            System.out.println("This number does no qualify as day of week");
        } else {
            switch (number) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
            }
        }

    }
}

