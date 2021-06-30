package student_sergey_egorichev.lesson_5.level_7.task_41;

import java.util.Scanner;

class Task_26 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter Array Length:");
        int arrayLength = scnr.nextInt();

        int[] myArray = ArrayUtil.createArray(arrayLength);
        ArrayUtil.fillArrayWithRandomNumbers(myArray);

        ArrayUtil.printArrayToConsole(myArray);
    }

}