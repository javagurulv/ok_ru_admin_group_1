package student_yuri_grigorov.lesson_6.level_1.task_6;

class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.shouldReturnTrue();
        numberUtilsTest.shouldReturnFalse();
    }

    private void checkResult(boolean condition, String testName) {
        String msg = (condition) ? testName + " = OK" : testName + " = FAIL";
        System.out.println(msg);
    }

    private void shouldReturnTrue() {
        int inputValue = 8;
        NumberUtils numberUtils = new NumberUtils();
        boolean result = numberUtils.isEven(inputValue);
        checkResult(result, "Should Return True");
    }

    private void shouldReturnFalse() {
        int inputValue = 9;
        NumberUtils numberUtils = new NumberUtils();
        boolean result = numberUtils.isEven(inputValue);
        checkResult(result, "Should Return False");
    }

}
