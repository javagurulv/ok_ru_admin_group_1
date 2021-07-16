package student_ilya_dolmatov.lesson_5.level_4.task_30;

import java.util.Random;

class NotEvenOfArray {
    public static void main(String[] args) {

        Random random = new Random();

        int arrayLength = random.nextInt(10)+3;
        int[] array = new int[arrayLength];

        int i;
        for(i = 0 ; i < array.length; i++){
            array[i] = random.nextInt(100);
        }

        for(i = 0 ; i < array.length; i++) {
            System.out.println("Value for array index " + i + " is: " + array[i]);
        }
        System.out.println("\nEven array's values:");

        NotEvenOfArray even = new NotEvenOfArray();
        for(i = 0 ; i < array.length; i++) {
            even.notEven(array[i]);
        }
    }

    void notEven(int value){
        if (value % 2 != 0) {System.out.println(value);}
    }
}
