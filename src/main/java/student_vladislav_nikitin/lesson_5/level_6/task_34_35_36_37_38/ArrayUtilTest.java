package student_vladislav_nikitin.lesson_5.level_6.task_34_35_36_37_38;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();

        arrayUtilTest.shouldCreateArray();
        arrayUtilTest.shouldFindMaxNumber();
        arrayUtilTest.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        int[] array1, array2, array3;
        int expectedLength1 = 4;
        int expectedLength2 = 0;

        ArrayUtil arrayUtil = new ArrayUtil();

        array1 = arrayUtil.createArray(expectedLength1);
        array2 = arrayUtil.createArray(expectedLength2);
        array3 = arrayUtil.createArray(-5);

        testResult(
                array1.length == expectedLength1,
                "Array should be created with " + expectedLength1 + " elements"
        );
        testResult(
                array2.length == expectedLength2,
                "Array should be created with " + expectedLength2 + " elements"
        );
        testResult(
                array3 == null,
                "Array shouldn't be created (null)"
        );
    }

    public void shouldFindMaxNumber() {
        int[] array1, array2, array3;
        int expectedResult1 = 42;
        int expectedResult2 = 0;
        int expectedResult3 = -38;

        ArrayUtil arrayUtil = new ArrayUtil();

        array1 = new int[] {-3, 42, 13, 42};
        array2 = new int[] {-12, 0, -24};
        array3 = new int[] {-42, -97, -38};

        int result1 = arrayUtil.findMaxNumber(array1);
        int result2 = arrayUtil.findMaxNumber(array2);
        int result3 = arrayUtil.findMaxNumber(array3);

        testResult(
                result1 == expectedResult1,
                "Maximum value of element in array is " + expectedResult1
        );
        testResult(
                result2 == expectedResult2,
                "Maximum value of element in array is " + expectedResult2
        );
        testResult(
                result3 == expectedResult3,
                "Maximum value of element in array is " + expectedResult3
        );
    }

    public void shouldFindMinNumber() {
        int[] array1, array2, array3;
        int expectedResult1 = -3;
        int expectedResult2 = 0;
        int expectedResult3 = -97;

        ArrayUtil arrayUtil = new ArrayUtil();

        array1 = new int[] {-3, 42, 13, 42};
        array2 = new int[] {42, 0, 11};
        array3 = new int[] {42, -97, -38};

        int result1 = arrayUtil.findMinNumber(array1);
        int result2 = arrayUtil.findMinNumber(array2);
        int result3 = arrayUtil.findMinNumber(array3);

        testResult(
                result1 == expectedResult1,
                "Minimum value of element in array is " + expectedResult1
        );
        testResult(
                result2 == expectedResult2,
                "Minimum value of element in array is " + expectedResult2
        );
        testResult(
                result3 == expectedResult3,
                "Minimum value of element in array is " + expectedResult3
        );
    }

    public void testResult(boolean condition, String testMessage) {
        String testOut = testMessage + " = ";
        System.out.println(condition ? testOut + "OK" : testOut + "FAIL");
    }
}
