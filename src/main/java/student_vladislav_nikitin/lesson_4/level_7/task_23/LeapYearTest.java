package student_vladislav_nikitin.lesson_4.level_7.task_23;

class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();

        leapYearTest.notDivided4Test();
        leapYearTest.divided4AndNot100Test();
        leapYearTest.divided4And100And400Test();
        leapYearTest.divided4And100AndNot400Test();
    }

    void notDivided4Test() {
        int year = 9;
        boolean expectedResult = false; // regular year

        LeapYear leapYear = new LeapYear();
        boolean result = leapYear.isLeapYear(year);

        if (result == expectedResult) {
            System.out.println("Not divided 4. Regular year = OK");
        } else {
            System.out.println("Not divided 4. Regular year = FAIL");
        }
    }

    void divided4AndNot100Test() {
        int year = 144;
        boolean expectedResult = true; // leap year

        LeapYear leapYear = new LeapYear();
        boolean result = leapYear.isLeapYear(year);

        if (result == expectedResult) {
            System.out.println("Divided 4 but not 100. Leap year = OK");
        } else {
            System.out.println("Divided 4 but not 100. Leap year = FAIL");
        }
    }

    void divided4And100And400Test() {
        int year = 1600;
        boolean expectedResult = true; // leap year

        LeapYear leapYear = new LeapYear();
        boolean result = leapYear.isLeapYear(year);

        if (result == expectedResult) {
            System.out.println("Divided 4 and 100 and 400. Leap year = OK");
        } else {
            System.out.println("Divided 4 and 100 and 400. Leap year = FAIL");
        }
    }

    void divided4And100AndNot400Test() {
        int year = 300;
        boolean expectedResult = false; // regular year

        LeapYear leapYear = new LeapYear();
        boolean result = leapYear.isLeapYear(year);

        if (result == expectedResult) {
            System.out.println("Divided 4 and 100 but not 400. Regular year = OK");
        } else {
            System.out.println("Divided 4 and 100 but not 400. Regular year = FAIL");
        }
    }

}
