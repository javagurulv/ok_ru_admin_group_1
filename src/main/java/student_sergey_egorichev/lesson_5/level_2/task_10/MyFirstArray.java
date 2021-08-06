package student_sergey_egorichev.lesson_5.level_2.task_10;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
public class MyFirstArray {
    public static void main(String[] args) {
        int[] myArray = createArray(3);
        printArray(myArray);
        }

        @CodeReviewComment(teacher = "createArrayWithRandomNumbers(...)")
    private static int[] createArray(int length) {
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = (int) (Math.random()*100);
        }
        return numbers;
    }

	@CodeReviewComment(teacher = "printArrayToConsole(...)")
    private static void printArray(int [] someArray) {
        for (int i = 0; i < someArray.length; i ++) {
            System.out.println(someArray[i]);
        }
    }
}
