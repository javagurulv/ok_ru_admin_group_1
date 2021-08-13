package student_ivan_buymov.lesson_5.level_5.task_31_33;

import java.util.Arrays;

class ArrayUtilTest {



    public static void main(String[] args) {

        var arrayUtil = new ArrayUtil();
        checkCreateArrayLen(arrayUtil, 100);
        checkCreateArrayLen(arrayUtil, 0);
        checkCreateArrayLen(arrayUtil, -1);

        var array = arrayUtil.createArray(10);
        arrayUtil.fillArrayWithRandomNumbers(array);
        System.out.println("result random array is: " + Arrays.toString(array));

    }

    static void checkCreateArrayLen(ArrayUtil arrayUtil,  int expectedLen) {

        int res = 0;

        if (expectedLen < 0) {
            try {
                res = arrayUtil.createArray(expectedLen).length;
            } catch (Exception e) {
                if (e.getMessage().contains("negative")) {
                    System.out.println("OK");
                    return;
                } else {
                    System.out.println("ERR: Incorrect exception was caught");
                    System.exit(1);
                }
            }

        }

        res = arrayUtil.createArray(expectedLen).length;

        if (res == expectedLen) {
            System.out.println("OK");
        } else {
            System.out.println("ERR: length must be 0, got: " + res);
            System.exit(1);
        }
    }

}
