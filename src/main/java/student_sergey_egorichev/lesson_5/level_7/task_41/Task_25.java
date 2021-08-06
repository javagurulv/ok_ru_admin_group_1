package student_sergey_egorichev.lesson_5.level_7.task_41;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Task_25 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter Array Length:");
        int arrayLength = scnr.nextInt();

        System.out.println("Enter " + arrayLength + " elements of array:");
        int[] myArray = ArrayUtil.getArrayByUser(arrayLength);

        ArrayUtil.printArrayToConsole(myArray);
    }

}