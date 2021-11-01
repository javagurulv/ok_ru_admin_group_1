package student_vladislav_nikitin.lesson_8.level_5.task_18;

public class ReflectionDemo {

    public static void main(String[] args) {

        Class reflect1 = null;
        try {
            reflect1 = Class.forName("student_vladislav_nikitin.lesson_8.level_5.task_18.ForReflection");
        }
        catch (Throwable e) {
            System.err.println(e);
        }

        ForReflection forReflection = new ForReflection();
        Class reflect2 = forReflection.getClass();

        Class reflect3 = ForReflection.class;

        System.out.println("All values should be true. If not seems something not working.");
        System.out.println("reflect1 == reflect2 – " + (reflect1 == reflect2));
        System.out.println("reflect2 == reflect3 – " + (reflect2 == reflect3));
        System.out.println("reflect1 == reflect3 – " + (reflect1 == reflect3));
    }

}
