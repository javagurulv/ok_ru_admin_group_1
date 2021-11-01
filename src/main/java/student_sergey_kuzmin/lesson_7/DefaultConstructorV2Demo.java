package student_sergey_kuzmin.lesson_7;

public class DefaultConstructorV2Demo {
    public static void main(String[] args) {

        DefaultConstructor defaultConstructor = new DefaultConstructor();
        DefaultConstructorV2 defaultConstructorV2 = new DefaultConstructorV2();

        if (defaultConstructor.testint == defaultConstructorV2.testint2) {
            System.out.println("Constructors are equal");
        } else {
            System.out.println("Some constructors are more equal than others");
        }
    }
}
