package student_sergey_egorichev.lesson_5.level_6.task_37;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
    }

    public void shouldCreateArray() {
        int expectedLength = 5;

        ArrayUtil aUtil = new ArrayUtil();
        int[] testArray = aUtil.createArray(expectedLength);

        if (testArray.length == expectedLength) {
            System.out.println("Should Create Array: OK");
        } else {
            System.out.println("Should Create Array: FAIL");
        }
    }

    public void shouldFindMaxNumber() {
        int[] testArray = {12, 8, 35, 4};
        int expectedMaxValue = 35;

        ArrayUtil aUtil = new ArrayUtil();

        if (aUtil.findMaxNumber(testArray) == expectedMaxValue) {
            System.out.println("Find Max Number: OK");
        } else {
            System.out.println("Find Max Number: FAIL");
        }
    }

}
