package student_sergey_egorichev.lesson_6.level_2.task_7;

public class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        findDayOfTheWeekTest("Monday", 1);
        findDayOfTheWeekTest("Tuesday", 2);
        findDayOfTheWeekTest("Wednesday", 3);
        findDayOfTheWeekTest("Thursday", 4);
        findDayOfTheWeekTest("Friday", 5);
        findDayOfTheWeekTest("Saturday", 6);
        findDayOfTheWeekTest("Sunday", 7);
        findDayOfTheWeekTest("Not correct day number", 9);
    }

    private static void printResult(String testName, boolean result) {
        String status;
        if (result) {
            status = "OK";
        } else {
            status = "FAIL";
        }

        System.out.println(testName + ": " + status);
    }

    private static void findDayOfTheWeekTest(String expectedResult, int dayNumber) {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String realResult = detector.findDayOfTheWeek(dayNumber);
        printResult(expectedResult + " Test", realResult.equals(expectedResult));
    }
}
