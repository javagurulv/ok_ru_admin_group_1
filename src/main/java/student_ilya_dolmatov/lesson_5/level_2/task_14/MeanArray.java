package student_ilya_dolmatov.lesson_5.level_2.task_14;

import java.util.Random;

class MeanArray {
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
        float sum = 0;
        while(i < array.length){
            sum+=array[i];
            i++;
        }
        float mean = sum / i ;

        System.out.println("Mean value of sum array index values: " + mean);
    }
}
