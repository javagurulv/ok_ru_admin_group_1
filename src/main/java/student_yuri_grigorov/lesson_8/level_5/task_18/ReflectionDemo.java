package student_yuri_grigorov.lesson_8.level_5.task_18;

import java.util.Random;

public class ReflectionDemo {

    public static void main(String[] args) throws ClassNotFoundException {
        Class cl1 = Class.forName("java.util.Random");
        System.out.println(cl1);

        Random generator = new Random();
        Class cl2 = generator.getClass();
        System.out.println(cl2);

        Class cl3 = Random.class;
        System.out.println(cl3);

        if ((cl1 == cl2) && (cl2 == cl3)) {
            System.out.println("All equals");
        }
    }
}
