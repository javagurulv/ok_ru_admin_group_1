package student_yuri_grigorov.lesson_8.level_3.taks_16;

public class SuperClassConstructorInvoker {
    public SuperClassConstructorInvoker() {
        // Invocation of a superclass constructor must be the first line in the subclass constructor.
        // https://docs.oracle.com/javase/tutorial/java/IandI/super.html
        super();
        System.out.println(1);
        System.out.println(2);
    }
}
