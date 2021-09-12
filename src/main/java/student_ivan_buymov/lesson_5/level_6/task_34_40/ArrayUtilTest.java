package student_ivan_buymov.lesson_5.level_6.task_34_40;

class ArrayUtilTest {

    public static void main(String[] args) throws ArrayUtil.ArrayIsEmpty {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }


    public void shouldCreateArray() {
        var util = new ArrayUtil();
        var expectedLen = 10;
        var array = util.createArray(expectedLen);

        if (array instanceof int[] && array.length == expectedLen) {
            System.out.println("create array: OK");
        } else {
            throw new RuntimeException("create array with len " + expectedLen + " failed");
        }
    }


    public void shouldFindMaxNumber() throws ArrayUtil.ArrayIsEmpty {
        var util = new ArrayUtil();
        var expectedLen = 10;
        var array = util.createArray(expectedLen);
        var expectedMax = 10;
        array[1] = expectedMax;

        System.out.print("test array: ");
        util.printArrayToConsole(array);

        var foundMax = util.findMaxNumber(array);

        if (expectedMax == util.findMaxNumber(array)) {
            System.out.println("find max: OK");
        } else {
            throw new RuntimeException("find max: FAIL, " + expectedMax + " != " + foundMax);
        }

    }

    public void shouldFindMinNumber() throws ArrayUtil.ArrayIsEmpty {
        var util = new ArrayUtil();
        var expectedLen = 10;
        var array = util.createArray(expectedLen);
        var expectedMin = -10;
        array[2] = expectedMin;

        System.out.print("test array: ");
        util.printArrayToConsole(array);

        var foundMin = util.findMinNumber(array);

        if (expectedMin == foundMin) {
            System.out.println("find min: OK");
        } else {
            throw new RuntimeException("find min: FAIL, " + expectedMin + " != " + foundMin);
        }

    }

}
