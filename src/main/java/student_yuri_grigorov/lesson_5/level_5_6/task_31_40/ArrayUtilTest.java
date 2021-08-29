package student_yuri_grigorov.lesson_5.level_5_6.task_31_40;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    private void checkResult(boolean condition, String testName) {
        String msg = (condition) ? testName + " = OK" : testName + " = FAIL";
        System.out.println(msg);
    }

    public void shouldCreateArray() {
        int expectedLength = 10;
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] myArray = arrayUtil.createArray(expectedLength);

        boolean result = myArray.length == expectedLength;
        checkResult(result, "Should Create Array");
    }

    public void shouldFindMaxNumber() {
        int[] array = {6, 58, 83, 44, 92, 97, 93, 25, 13, 64};
        int expectedValue = 97;
        ArrayUtil arrayUtil = new ArrayUtil();
        boolean result = arrayUtil.findMaxNumber(array) == expectedValue;
        checkResult(result, "Should Find Max Number");
    }

    public void shouldFindMinNumber() {
        int[] array = {6, 58, 83, 44, 92, 97, 93, 25, 13, 64};
        int expectedValue = 6;
        ArrayUtil arrayUtil = new ArrayUtil();
        boolean result = arrayUtil.findMinNumber(array) == expectedValue;
        checkResult(result, "Should Find Min Number");
    }
}
