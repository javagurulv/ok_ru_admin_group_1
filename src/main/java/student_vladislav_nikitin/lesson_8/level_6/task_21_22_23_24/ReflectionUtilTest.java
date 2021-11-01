package student_vladislav_nikitin.lesson_8.level_6.task_21_22_23_24;

import student_vladislav_nikitin.lesson_8.level_4.task_17.ServerState;

abstract class A {
    protected String lineVar;
    public Integer numberVar;
}

class B extends A {

    private int numberValue;

    public B() {
        this.numberValue = 42;
    }
    protected B(boolean b) {}
    private B(Integer a, String b) {}

    public int getNumberValue() {
        return numberValue;
    }
}

class ReflectionUtilTest {

    public static void main(String[] args) {
        ReflectionUtil reflectionUtil = new ReflectionUtil();

        String serverStateModifier = reflectionUtil.getClassAccessModifier("student_vladislav_nikitin.lesson_8.level_4.task_17.ServerState");
        System.out.println("ServerState modifier is – " + serverStateModifier);

        String aClassModifier = reflectionUtil.getClassAccessModifier("student_vladislav_nikitin.lesson_8.level_6.task_21_22_23_24.A");
        System.out.println("A class modifier is – " + aClassModifier);

        String serverStateSuperClass = reflectionUtil.getSuperClassName("student_vladislav_nikitin.lesson_8.level_4.task_17.ServerState");
        System.out.println("ServerState superclass is – " + serverStateSuperClass);

        String bSuperClass = reflectionUtil.getSuperClassName("student_vladislav_nikitin.lesson_8.level_6.task_21_22_23_24.B");
        System.out.println("B superclass is – " + bSuperClass);

        System.out.println("\nServerState methods");
        reflectionUtil.printClassMethods("student_vladislav_nikitin.lesson_8.level_4.task_17.ServerState");
        System.out.println("\nReflectionUtil methods");
        reflectionUtil.printClassMethods("student_vladislav_nikitin.lesson_8.level_6.task_21_22_23_24.ReflectionUtil");

        System.out.println("\nServerState fields");
        reflectionUtil.printClassFields("student_vladislav_nikitin.lesson_8.level_4.task_17.ServerState");
        System.out.println("\nA class fields");
        reflectionUtil.printClassFields("student_vladislav_nikitin.lesson_8.level_6.task_21_22_23_24.A");

        System.out.println("\nServerState constructors");
        reflectionUtil.printClassConstructors("student_vladislav_nikitin.lesson_8.level_4.task_17.ServerState");
        System.out.println("\nB class constructors");
        reflectionUtil.printClassConstructors("student_vladislav_nikitin.lesson_8.level_6.task_21_22_23_24.B");

        ServerState ss = (ServerState) reflectionUtil.createClassInstanceUsingDefaultConstructor("student_vladislav_nikitin.lesson_8.level_4.task_17.ServerState");
        A aClass = (A) reflectionUtil.createClassInstanceUsingDefaultConstructor("student_vladislav_nikitin.lesson_8.level_6.task_21_22_23_24.A");
        B bClass = (B) reflectionUtil.createClassInstanceUsingDefaultConstructor("student_vladislav_nikitin.lesson_8.level_6.task_21_22_23_24.B");
        System.out.println(bClass.getNumberValue());
    }

}
