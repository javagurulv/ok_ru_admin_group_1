package student_ilya_dolmatov.lesson_5.level_5.task_32;


import java.util.Random;

class ArrayUtil {
    Random random = new Random();

    public int[] createArray(int arrayLength) {
        int[] newArray = new int[arrayLength];
        for(int i = 0; i < newArray.length; i++){
            newArray[i] = random.nextInt(100);
        }
        return newArray;
    }

}
