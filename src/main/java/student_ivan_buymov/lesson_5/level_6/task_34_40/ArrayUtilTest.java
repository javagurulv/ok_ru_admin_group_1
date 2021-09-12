package student_ivan_buymov.lesson_5.level_6.task_34_40;

class ArrayUtilTest {

    public static void main(String[] args) throws ArrayUtil.ArrayIsEmpty {

        String d = "sdf";

        var util = new ArrayUtil();
        var array = util.createArray(10);
        array[1] = 10;
        array[2] = -10;

        util.printArrayToConsole(array);

        System.out.println("Max number is: " + util.findMaxNumber(array));


    }

}
