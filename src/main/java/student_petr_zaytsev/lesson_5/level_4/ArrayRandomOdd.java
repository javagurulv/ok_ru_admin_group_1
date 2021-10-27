package student_petr_zaytsev.lesson_5.level_4;

import java.util.Random;

public class ArrayRandomOdd {

    public static void main(String[] args) {
        int length;
        // let us stick to a small number
        length = 8;

        int [] numbers = new int[length];


        Random rand = new Random();
        rand.nextInt();
        int i;
        for (i = 0; i < length; i++) {
            int n = rand.nextInt();
            numbers[i] = n;
        }

        // print array
        int x;
        System.out.println("Array content: ");
        for (x = 0; x < length; x++) {
            System.out.println(numbers[x]);
        }

        // print even elements
        int y;
        System.out.println("Even: ");
        for (y = 0; y < length; y++) {
            if(numbers[y] % 2 != 0)
                System.out.println(numbers[y]);
        }

    }



}