package student_vladislav_nikitin.lesson_9.level_2.task_4_5;

class DayOfTheWeekDetectorImplTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorImplTest test = new DayOfTheWeekDetectorImplTest();

        DayOfTheWeekDetector ifVersionImpl = new DayOfTheWeekDetectorIfVersion();
        test.detectDayNameInOfBoundsWeek(ifVersionImpl);
        test.detectDayNameOutOfBoundsWeek(ifVersionImpl);

        DayOfTheWeekDetector switchVersionImpl = new DayOfTheWeekDetectorSwitchVersion();
        test.detectDayNameInOfBoundsWeek(switchVersionImpl);
        test.detectDayNameOutOfBoundsWeek(switchVersionImpl);

        DayOfTheWeekDetector arrayVersionImpl = new DayOfTheWeekDetectorArrayVersion();
        test.detectDayNameInOfBoundsWeek(arrayVersionImpl);
        test.detectDayNameOutOfBoundsWeek(arrayVersionImpl);
    }

    void detectDayNameInOfBoundsWeek(DayOfTheWeekDetector impl) {
        String expectedResult = "Thursday";
        int dayOfWeek = 4;

        String nameImpl = impl.getClass().getSimpleName();

        String result = impl.detectDayName(dayOfWeek);

        String fullOutOfTest = nameImpl + "; Day should be within in week = ";
        System.out.println(expectedResult.equals(result) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

    void detectDayNameOutOfBoundsWeek(DayOfTheWeekDetector impl) {
        String expectedResult = "Please input a valid number between 1 and 7";
        int dayOfWeek = 12;

        String nameImpl = impl.getClass().getSimpleName();

        String result = impl.detectDayName(dayOfWeek);

        String fullOutOfTest = nameImpl + "; Day should be out of week = ";
        System.out.println(expectedResult.equals(result) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

}
