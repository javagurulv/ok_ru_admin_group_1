package student_sergey_egorichev.lesson_5.level_2.task_15;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayPlus {
    public static void main(String[] args) {
        int increaseBy = 2;

        int[] myArray = generateArray(3);
        printArray(myArray);

        for (int i = 0; i < myArray.length; i ++) {
            myArray[i] = myArray[i] + increaseBy;
        }

        printArray(myArray);
    }

    private static int[] generateArray(int length) {
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = (int) (Math.random()*100);
        }
        return numbers;
    }

    private static void printArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i ++) {
            System.out.println(myArray[i]);
        }
    }
}
