package student_petr_zaytsev.lesson_5.level_4;

import java.util.Random;

public class RandomIntArrayPrintMin {

    public static void main(String[] args) {

        Random rand = new Random();
        rand.nextInt();
        int length;

        length = rand.nextInt();

        // create array
        int [] numbers = new int[length];

        // now get random numbers
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



        // print min
        System.out.println("Smallest: "+getMin(numbers,length));
    }
    public static int getMin(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-1];
    }
}
