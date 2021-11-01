package student_vladislav_nikitin.lesson_9.level_2.task_4_5;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    final private Scanner scanner = new Scanner(System.in);
    private DayOfTheWeekDetector dayOfTheWeekDetector;

    DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayDetector) {
        this.dayOfTheWeekDetector = dayDetector;
    }

    void run() {
        int numberOfWeek = getUserInt();
        System.out.println(dayOfTheWeekDetector.detectDayName(numberOfWeek));
    }

    private int getUserInt() {
        while (true) {
            System.out.print("Enter number of day in week: ");
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println(scanner.next() + " is not number!");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("If version");
        DayOfTheWeekDetectorDemo demo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        demo.run();


        System.out.println("\nSwitch version");
        demo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        demo.run();

        System.out.println();

        System.out.println("\nArray version");
        demo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        demo.run();
    }
}
