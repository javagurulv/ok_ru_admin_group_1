package student_vladislav_nikitin.lesson_6.level_1.task_6;

class NumberUtilsTest {

    public static void main(String[] args) {
        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();

        numberUtilsTest.evenNumberTest();
        numberUtilsTest.oddNumberTest();
    }

    void evenNumberTest() {
        int number = 4;
        boolean expectedResult = true;

        NumberUtils numberUtils = new NumberUtils();
        boolean result = numberUtils.isEven(number);

        testResult(result == expectedResult, "Should be even number");
    }

    void oddNumberTest() {
        int number = 3;
        boolean expectedResult = false;

        NumberUtils numberUtils = new NumberUtils();
        boolean result = numberUtils.isEven(number);

        testResult(result == expectedResult, "Should be odd number");
    }

    void testResult(boolean condition, String nameOfTest) {
        String fullOutOfTest = nameOfTest + " = ";
        System.out.println(condition ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

}
