package student_sergey_egorichev.lesson_5.level_6.task_35;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
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

}
