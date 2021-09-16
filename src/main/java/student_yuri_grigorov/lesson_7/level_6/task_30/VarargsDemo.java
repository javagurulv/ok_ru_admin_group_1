package student_yuri_grigorov.lesson_7.level_6.task_30;

/**
 * It is possible to provide methods that can be called with a variable number of
 * parameters. These are called "varargs" methods.
 */

class VarargsDemo {

    public static void main(String[] args) {
        System.out.println(max(3.1, 5, 6.3, -5));
    }

    // The ellipsis ... is part of the Java code. It denotes that the method can receive
    // an arbitrary number of arguments.
    // The double... parameter type is the same as double[].
    public static double max(double... values) {
        double largest = Double.NEGATIVE_INFINITY;
        for (double v : values) {
            if (v > largest) largest = v;
        }
        return largest;
    }
}
