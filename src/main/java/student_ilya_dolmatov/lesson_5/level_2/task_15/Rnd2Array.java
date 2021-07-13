package student_ilya_dolmatov.lesson_5.level_2.task_15;

import java.util.Random;

class Rnd2Array {
    public static void main(String[] args) {
        int[] array = new int[3];
        Random random = new Random();

        int i = 0;
        while(i < array.length){
            array[i] = random.nextInt(100-1)+20;
            System.out.println("Added value to index " + i + " is: " + array[i]);
            i++;
        }

        i = 0;
        while(i < array.length){
            array[i] += 2;
            i++;
        }
        i=0;
        System.out.println("\nNew array values +2:");
        while(i < array.length){
            System.out.println("Added value to index " + i + " is: " + array[i]);
            i++;
        }

    }
}
