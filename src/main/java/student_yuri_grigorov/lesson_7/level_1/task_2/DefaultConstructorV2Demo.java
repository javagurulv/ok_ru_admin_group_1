package student_yuri_grigorov.lesson_7.level_1.task_2;

/*
We haven't created any constructors in DefaultConstructorV2, but
uninitialized instance variables are initialized with default values.
 */

class DefaultConstructorV2Demo {

    public static void main(String[] args) {
        DefaultConstructorV2 obj = new DefaultConstructorV2();

        System.out.println("Default value:");
        System.out.println("a = " + obj.a);
        System.out.println("a = " + obj.b);
    }
}
