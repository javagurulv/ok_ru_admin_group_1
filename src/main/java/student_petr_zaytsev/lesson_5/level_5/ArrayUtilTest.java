package student_petr_zaytsev.lesson_5.level_5;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {

        int length;
        length = 8;
        ArrayUtil array = new ArrayUtil();
        int [] result = array.createArray(length);

        if (length == result.length) {
            System.out.println("Length test = OK");
        } else {
            System.out.println("Length test = FAIL");
        }

    }

    public void shouldFindMaxNumber() {
        int[] numbers = new int[]{1, 2, 3};

        ArrayUtil array = new ArrayUtil();

        int result = array.findMaxNumber(numbers);

        if (result == 3) {
            System.out.println("Max test = OK");
        } else {
            System.out.println("Max test = Fail");
        }
    }
    public void shouldFindMinNumber() {
        int[] numbers = new int[]{1, 2, 3};

        ArrayUtil array = new ArrayUtil();

        int result = array.findMinNumber(numbers);

        if (result == 1) {
            System.out.println("Min test = OK");
        } else {
            System.out.println("Min test = Fail");
        }
    }
}
