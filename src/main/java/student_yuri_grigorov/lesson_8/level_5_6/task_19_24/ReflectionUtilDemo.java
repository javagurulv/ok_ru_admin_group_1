package student_yuri_grigorov.lesson_8.level_5_6.task_19_24;

class ReflectionUtilDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        ReflectionUtil reflectionUtil = new ReflectionUtil();
        String className = "student_yuri_grigorov.lesson_7.level_4_5.task_14_28.Square";
        reflectionUtil.printClassMethods(className);
        reflectionUtil.printClassFields(className);
        reflectionUtil.printClassConstructors(className);
    }
}
