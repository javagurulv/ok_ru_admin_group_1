package student_sergey_egorichev.lesson_5.level_6.task_38;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
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

    @CodeReviewComment(teacher = "Где тест на пустой массив?")
    public void shouldFindMinNumber() {
        int[] testArray = {12, 8, 35, 4};
        int expectedMinValue = 4;

        ArrayUtil aUtil = new ArrayUtil();

        if (aUtil.findMinNumber(testArray) == expectedMinValue) {
            System.out.println("Find Min Number: OK");
        } else {
            System.out.println("Find Min Number: FAIL");
        }
    }

}
