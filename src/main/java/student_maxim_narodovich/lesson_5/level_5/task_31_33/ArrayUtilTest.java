package student_maxim_narodovich.lesson_5.level_5.task_31_33;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        int arrayLength = 17;
        ArrayUtil testArray = new ArrayUtil();
        int[] myArray = testArray.createArray(arrayLength);
        int realResult = myArray.length;
        if (realResult == arrayLength) {
            System.out.println("Array length Test = OK");
        } else {
            System.out.println("Array length Test = FAIL");
        }
    }
}
