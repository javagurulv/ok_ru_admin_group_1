package student_sergey_egorichev.lesson_5.level_4.task_25;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class UserArray {

    public static void main(String[] args) {

        ElectroPetrovich.hello();
        ElectroPetrovich.say("А давай я сгенерирую для тебя массив.");
        ElectroPetrovich.say("Массив какой длины ты предпочитаешь в это время суток?");

        Scanner scnr = new Scanner(System.in);
        int arrayLength = scnr.nextInt();

        ElectroPetrovich.say("А теперь назови мне значения, " + arrayLength + " штук:");
        int[] myArray = getArrayByUser(arrayLength);

        ElectroPetrovich.say("Отлично! Надеюсь я правильно записал?");
        printArray(myArray);
    }

    private static int[] getArrayByUser(int length) {
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