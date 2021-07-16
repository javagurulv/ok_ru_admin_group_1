package student_sergey_egorichev.lesson_5.level_7.task_41;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task_28 {

    public static void main(String[] args) {
        int [] myArray = ArrayUtil.createArray((int) (Math.random() * 10) + 3);
        ArrayUtil.fillArrayWithRandomNumbers(myArray);

        ArrayUtil.printArrayToConsole(myArray);
        System.out.println("MIN: " + ArrayUtil.findMinNumber(myArray));
    }

}
