package student_petr_zaytsev.lesson_6.level_2;

public class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.monday();
        test.tuesday();
        test.wednesday();
        test.thursday();
        test.saturday();
        test.saturday();
        test.sunday();
        test.wrongNumber();
    }

    public void monday() {

        int day = 1;
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String result = detector.findDayOfTheWeek(day);

        if (result == "Monday") {
            System.out.println("Monday test = OK");
        } else {
            System.out.println("Monday test = FAIL");
        }

    }

    public void tuesday() {

        int day = 2;
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String result = detector.findDayOfTheWeek(day);

        if (result == "Tuesday") {
            System.out.println("Tuesday test = OK");
        } else {
            System.out.println("Tuesday test = FAIL");
        }

    }

    public void wednesday() {

        int day = 3;
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String result = detector.findDayOfTheWeek(day);

        if (result == "Wednesday") {
            System.out.println("Wednesday test = OK");
        } else {
            System.out.println("Wednesday test = FAIL");
        }

    }

    public void thursday() {

        int day = 4;
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String result = detector.findDayOfTheWeek(day);

        if (result == "Thursday") {
            System.out.println("Thursday test = OK");
        } else {
            System.out.println("Thursday test = FAIL");
        }

    }

    public void friday() {

        int day = 5;
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String result = detector.findDayOfTheWeek(day);

        if (result == "Friday") {
            System.out.println("Friday test = OK");
        } else {
            System.out.println("Friday test = FAIL");
        }

    }

    public void saturday() {

        int day = 6;
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String result = detector.findDayOfTheWeek(day);

        if (result == "Saturday") {
            System.out.println("Saturday test = OK");
        } else {
            System.out.println("Saturday test = FAIL");
        }

    }

    public void sunday() {

        int day = 7;
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String result = detector.findDayOfTheWeek(day);

        if (result == "Sunday") {
            System.out.println("Sunday test = OK");
        } else {
            System.out.println("Sunday test = FAIL");
        }

    }

    public void wrongNumber() {

        int day = 10;
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String result = detector.findDayOfTheWeek(day);

        if (result == "Not correct day number") {
            System.out.println("Wrong num test = OK");
        } else {
            System.out.println("Wrong num test = FAIL");
        }

    }
}
