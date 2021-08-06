package student_ilya_dolmatov.lesson_5.level_4.task_29;

import java.util.Random;

class EvenOfArray {
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

        EvenOfArray even = new EvenOfArray();
        for(i = 0 ; i < array.length; i++) {
            even.isEven(array[i]);
        }
    }

    void isEven(int value){
        if (value % 2 == 0) {System.out.println(value);}
    }
}
