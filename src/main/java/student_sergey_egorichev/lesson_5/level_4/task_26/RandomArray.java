package student_sergey_egorichev.lesson_5.level_4.task_26;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RandomArray {

    public static void main(String[] args) {

        ElectroPetrovich.hello();
        ElectroPetrovich.say("Теперь предлагаю тебе отдохнуть, а электроПетрович поработает.");
        ElectroPetrovich.say("Скажи какой длины массив нужен, а я заполню его сам.");

        Scanner scnr = new Scanner(System.in);
        int arrayLength = scnr.nextInt();

        int[] myArray = generateArray(arrayLength);

        ElectroPetrovich.say("Молодец! Лови:");
        printArray(myArray);
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
            System.out.println(someArray[i]);
        }
    }
}