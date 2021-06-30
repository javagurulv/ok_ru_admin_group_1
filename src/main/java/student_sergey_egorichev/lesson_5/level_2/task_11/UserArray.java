package student_sergey_egorichev.lesson_5.level_2.task_11;

import java.util.Scanner;

public class UserArray {

    public static void main(String[] args) {
        ElectroPetrovich petrovich = new ElectroPetrovich();
        petrovich.hello();
        int[] myArray = createArray(3);
        petrovich.say("Отлично! Надеюсь я правильно записал?");
        printArray(myArray);
    }

    private static int[] createArray(int length) {
        ElectroPetrovich petrovich = new ElectroPetrovich();
        Scanner scnr = new Scanner(System.in);

        petrovich.say("Давай сосредоточемся и придуаем несколько чисел. Допустим " + 3 + ".");
        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            petrovich.say("Число номер " + (i + 1) + ":");
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