package student_yuri_grigorov.lesson_4.level_7_senior.task_23;

class LeapYearTest {

    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        doTest(!leapYear.isLeapYear(6), "Regular (not divided by 4)");
        doTest(!leapYear.isLeapYear(600), "Regular (divided by 4 and by 100 and not by 400)");
        doTest(leapYear.isLeapYear(8), "Leap (divided by 4 and not by 100)");
        doTest(leapYear.isLeapYear(800), "Leap (divided by 4 and by 100 and by 400)");
    }

    private static void doTest(boolean condition, String testName) {
        String msg = (condition) ? testName + " = OK" : testName + " = FAIL";
        System.out.println(msg);
    }
}
