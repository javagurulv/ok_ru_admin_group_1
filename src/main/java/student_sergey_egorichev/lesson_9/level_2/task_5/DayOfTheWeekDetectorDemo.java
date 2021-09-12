package student_sergey_egorichev.lesson_9.level_2.task_5;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector weekDayDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector weekDayDetector) {
        this.weekDayDetector = weekDayDetector;
    }

    void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number between 1 and 7: ");
        int number = scanner.nextInt();

        System.out.println(weekDayDetector.detectDayName(number));
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo detector = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion1());
        detector.run();

        DayOfTheWeekDetectorDemo detector2 = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion2());
        detector2.run();

        DayOfTheWeekDetectorDemo detector3 = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion3());
        detector3.run();
    }

}
