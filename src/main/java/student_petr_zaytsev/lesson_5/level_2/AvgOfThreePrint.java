package student_petr_zaytsev.lesson_5.level_2;

import java.util.Random;

public class AvgOfThreePrint {

    public static void main(String[] args) {

        Random rand = new Random();

        int arrayLength = 3;

        int [] numbers = new int[arrayLength];

        int i;
        for (i = 0; i < arrayLength; i++) {
            int n = rand.nextInt();
            numbers[i] = n;
            System.out.println(numbers[i]);
        }

    }
}
