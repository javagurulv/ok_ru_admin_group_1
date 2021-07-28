package student_sergey_egorichev.lesson_5.level_2.task_13;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayElementsSum {
    public static void main(String[] args) {
        int[] myArray = generateArray(3);
        System.out.println(getArrayElementsSum(myArray));
    }

    private static int[] generateArray(int length) {
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = (int) (Math.random()*100);
        }
        return numbers;
    }

    private static int getArrayElementsSum(int[] myArray) {
        int elementsSum = 0;
        for (int i = 0; i < myArray.length; i ++) {
            elementsSum = elementsSum + myArray[i];
        }
        return elementsSum;
    }
}
