package student_vladislav_nikitin.lesson_4.level_1.task_3;

import java.util.Scanner;

class DayOfWeek {
    static int getUserNumber() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the number from 1 to 7: ");
            if (! scanner.hasNextInt()) {
                System.out.println(scanner.next() + " is not number!");
                continue;
            } else {
                int userNumber = scanner.nextInt();
                if (userNumber < 1 || userNumber > 7) {
                    System.out.println(userNumber + " is not in range from 1 to 7!");
                    continue;
                }

                return userNumber;
            }
        }
    }

    public static void main(String[] args) {
        int userNumber = getUserNumber();

        String day = switch (userNumber) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday my dudes";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Unknown";
        };

        System.out.println("It's " + day);
    }
}
