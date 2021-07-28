package student_sergey_egorichev.lesson_5.level_4.task_28;

import java.util.Arrays;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RandomArray {

    public static void main(String[] args) {

        int arrayLength = (int) ((Math.random() * 10) + 3);
        int[] myArray = generateArray(arrayLength);

        printArray(myArray);
        System.out.println("MIN: " + Arrays.stream(myArray).min().getAsInt());
    }

    private static int[] generateArray(int length) {
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = (int) (Math.random()*100);
        }
        return numbers;
    }

    private static void printArray(int [] someArray) {
        for (int i = 0; i < someArray.length; i ++) {
            System.out.print(someArray[i] + " ");
        }
        System.out.print("\n");
    }
}
