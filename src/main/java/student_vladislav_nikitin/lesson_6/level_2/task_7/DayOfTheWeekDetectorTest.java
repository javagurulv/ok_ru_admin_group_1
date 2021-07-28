package student_vladislav_nikitin.lesson_6.level_2.task_7;

class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();

        dayOfTheWeekDetectorTest.dayTest(1, "Monday");
        dayOfTheWeekDetectorTest.dayTest(2, "Tuesday");
        dayOfTheWeekDetectorTest.dayTest(3, "Wednesday");
        dayOfTheWeekDetectorTest.dayTest(4, "Thursday");
        dayOfTheWeekDetectorTest.dayTest(5, "Friday");
        dayOfTheWeekDetectorTest.dayTest(6, "Saturday");
        dayOfTheWeekDetectorTest.dayTest(7, "Sunday");
        dayOfTheWeekDetectorTest.dayTest(42, "Not correct day number");

    }

    void dayTest(int dayNumber, String expectedResult) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);

        testResult(result.equals(expectedResult), expectedResult + "test");
    }

    private void testResult(boolean condition, String nameOfTest) {
        String fullOutOfTest = nameOfTest + " = ";
        System.out.println(condition ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }
}
