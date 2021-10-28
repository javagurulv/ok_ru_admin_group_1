package student_vladislav_nikitin.lesson_8.level_5.task_19_20;

abstract class A {
}

class B extends A {
}

class ReflectionUtilTest {

    public static void main(String[] args) {
        ReflectionUtil reflectionUtil = new ReflectionUtil();

        String serverStateModifier = reflectionUtil.getClassAccessModifier("student_vladislav_nikitin.lesson_8.level_4.task_17.ServerState");
        System.out.println("ServerState modifier is – " + serverStateModifier);

        String aClassModifier = reflectionUtil.getClassAccessModifier("student_vladislav_nikitin.lesson_8.level_5.task_19_20.A");
        System.out.println("A class modifier is – " + aClassModifier);

        String serverStateSuperClass = reflectionUtil.getSuperClassName("student_vladislav_nikitin.lesson_8.level_4.task_17.ServerState");
        System.out.println("ServerState superclass is – " + serverStateSuperClass);

        String bSuperClass = reflectionUtil.getSuperClassName("student_vladislav_nikitin.lesson_8.level_5.task_19_20.B");
        System.out.println("B superclass is – " + bSuperClass);

    }

}
