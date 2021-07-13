package student_ilya_dolmatov.lesson_5.level_2.task_13;

import java.util.Random;

class RndSumArray {
    public static void main(String[] args) {
        int[] array = new int[3];
        Random random = new Random();

        int i = 0;
        while(i < array.length){
            array[i] = random.nextInt(10);
            System.out.println("Added value to index " + i + " is: " + array[i]);
            i++;
        }

        i = 0;
        int sum = 0;
        while(i < array.length){
            sum+=array[i];
            i++;
        }

        System.out.println("Sum of all array index values: " + sum);

    }
}
