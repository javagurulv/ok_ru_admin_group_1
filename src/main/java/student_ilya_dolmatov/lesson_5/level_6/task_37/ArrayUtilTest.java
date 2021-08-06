package student_ilya_dolmatov.lesson_5.level_6.task_37;

import java.util.Random;

class ArrayUtilTest {
    Random random = new Random();
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
    }

    public void shouldCreateArray() {
        System.out.println("Output from shouldCreateArray!");
        ArrayUtil newArray = new ArrayUtil();

        int[] array = newArray.createArray(5);
        newArray.fillArrayWithRandomNumbers(array);

        System.out.println("Array length is: " + array.length);
        for(int i=0; i< array.length ; i++){
            System.out.println("Value of array index " + i + " is: " + array[i]);
        }
        System.out.println();
    }

    public void shouldFindMaxNumber() {
        System.out.println("Output from shouldFindMaxNumber!");
        ArrayUtil newArray = new ArrayUtil();

        int[] array = newArray.createArray(5);

        for(int i = 0; i < array.length; i++){
            if(i == 2){
                array[i] = 100;
            } else {
                array[i] = random.nextInt(99);
            }
        }

        int expectedResult = 100;
        int result = array[0];
        for(int i = 0; i < array.length; i++) {
            if (array[i] > result) {
                result = array[i];
            }
        }

        if(result == expectedResult){
            System.out.println("Test shouldFindMaxNumber = PASS");
        } else {
            System.out.println("Test shouldFindMaxNumber = FAIL");
        }

        System.out.println();
    }
}
