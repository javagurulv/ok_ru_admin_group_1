package student_ilya_dolmatov.lesson_5.level_5.task_32;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        ArrayUtil newArray = new ArrayUtil();

        int[] array = newArray.createArray(5);

        System.out.println("Array length is: " + array.length);
        for(int i=0; i< array.length ; i++){
            System.out.println("Value of array index " + i + " is: " + array[i]);
        }

    }
}
