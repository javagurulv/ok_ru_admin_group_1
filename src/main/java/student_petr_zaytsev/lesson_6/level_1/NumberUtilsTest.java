package student_petr_zaytsev.lesson_6.level_1;

public class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest test = new NumberUtilsTest();
        test.evenTest();
    }

    public void evenTest() {

        int n = 8;

        NumberUtils function = new NumberUtils();
        boolean result = function.isEven(n);

        if (result) {
            System.out.println("Even test = OK");
        } else {
            System.out.println("Even test = FAIL");
        }

    }
}
