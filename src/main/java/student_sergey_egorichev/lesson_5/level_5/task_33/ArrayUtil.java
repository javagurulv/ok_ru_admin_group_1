package student_sergey_egorichev.lesson_5.level_5.task_33;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }
    }

}
