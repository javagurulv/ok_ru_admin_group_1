package student_vladislav_nikitin.lesson_5.level_5.task_31_32_33;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();

        arrayUtilTest.shouldCreateArray();
    }

    public void shouldCreateArray() {
        int[] array1, array2, array3;
        int expectedLength1 = 4;
        int expectedLength2 = 0;

        ArrayUtil arrayUtil = new ArrayUtil();

        array1 = arrayUtil.createArray(expectedLength1);
        array2 = arrayUtil.createArray(expectedLength2);
        array3 = arrayUtil.createArray(-5);

        System.out.println(testResult(
                array1.length == expectedLength1,
                "Array should be created with " + expectedLength1 + " elements"
        ));
        System.out.println(testResult(
                array2.length == expectedLength2,
                "Array should be created with " + expectedLength2 + " elements"
        ));
        System.out.println(testResult(
                array3 == null,
                "Array shouldn't be created (null)"
        ));
    }

    public String testResult(boolean condition, String testMessage) {
        String testOut = testMessage + " = ";
        return condition ? testOut + "OK" : testOut + "FAIL";
    }
}
