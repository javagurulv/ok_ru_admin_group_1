package student_ilya_dolmatov.lesson_5.level_2.task_10;

import java.util.Random;

class IntArray {
    public static void main(String[] args) {

        int[] array = new int[3];
        Random random = new Random();

        int i = 0;
        while(i < array.length){
            array[i] = random.nextInt(10);
            i++;
        }

        i = 0;
        while(i < array.length){
            System.out.println("Array index " + i + " = " + array[i]);
            i++;
        }


    }
}
