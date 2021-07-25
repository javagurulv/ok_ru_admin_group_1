package student_sergey_egorichev.lesson_8.level_5.task_18;

import student_sergey_egorichev.lesson_8.level_4.task_17.ServerState;

public class ServerStateReflectionDemo {

    public static void main(String[] args) {

        Class firstMethod = null;
        try {
            firstMethod = Class.forName("student_sergey_egorichev.lesson_8.level_4.task_17.ServerState");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        ServerState original = new ServerState(10, 50, 24, 18, 75, 3);
        Class secondMethod = original.getClass();

        Class thirdMethod = ServerState.class;

        if (firstMethod == secondMethod && secondMethod == thirdMethod && firstMethod == thirdMethod) {
            System.out.println("It works well");
        }
    }

}
