package student_sergey_egorichev.lesson_5.level_2.task_14;

import java.util.Arrays;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayMedian {

    public static void main(String[] args) {
        int[] myArray = generateArray(3);
//        System.out.println(getMiddleInTheRow(myArray));
        System.out.println(getMedian(myArray));
    }

    private static int[] generateArray(int length) {
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = (int) (Math.random()*100);
        }
        return numbers;
    }

    private static int getMedian(int[] myArray) {
        int elementsSum = 0;
        for (int i = 0; i < myArray.length; i ++) {
            elementsSum = elementsSum + myArray[i];
        }
        return elementsSum / myArray.length;
    }

    private static int getMiddleInTheRow(int[] myArray) {
        int[] sortedArray = myArray;
        Arrays.sort(sortedArray);
        return sortedArray[sortedArray.length / 2];
    }
}
