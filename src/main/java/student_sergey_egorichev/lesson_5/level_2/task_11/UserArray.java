package student_sergey_egorichev.lesson_5.level_2.task_11;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class UserArray {

    public static void main(String[] args) {
        int arrayLength = 3;

        ElectroPetrovich petrovich = new ElectroPetrovich();
        petrovich.hello();
        petrovich.say("Давай сосредоточемся и придуаем несколько чисел. Допустим " + arrayLength + ".");
        int[] myArray = generateArray(arrayLength);

        petrovich.say("Отлично! Надеюсь я правильно записал?");
        printArray(myArray);
    }

    private static int[] generateArray(int length) {
        Scanner scnr = new Scanner(System.in);
        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            numbers[i] = scnr.nextInt();
        }
        return numbers;
    }

    private static void printArray(int [] someArray) {
        for (int i = 0; i < someArray.length; i ++) {
            System.out.println(someArray[i]);
        }
    }
}