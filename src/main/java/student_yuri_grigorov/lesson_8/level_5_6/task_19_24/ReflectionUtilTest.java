package student_yuri_grigorov.lesson_8.level_5_6.task_19_24;

class ReflectionUtilTest {

    public static void main(String[] args) throws ClassNotFoundException {
        ReflectionUtilTest test = new ReflectionUtilTest();
        test.getClassAccessModifierTest();
        test.getSuperClassNameTest();
    }

    public void getClassAccessModifierTest() throws ClassNotFoundException {
        ReflectionUtil reflectionUtil = new ReflectionUtil();
        String className = "student_yuri_grigorov.lesson_8.level_5.task_18.ReflectionDemo";
        String expectedResult = "public";
        Boolean result = reflectionUtil.getClassAccessModifier(className).equals(expectedResult);
        checkTestResult(result, "getClassAccessModifier");
    }

    public void getSuperClassNameTest() throws ClassNotFoundException {
        ReflectionUtil reflectionUtil = new ReflectionUtil();
        String className = "student_yuri_grigorov.lesson_7.level_4_5.task_14_28.Shape";
        String expectedResult = "java.lang.Object";
        Boolean result = reflectionUtil.getSuperClassName(className).equals(expectedResult);
        checkTestResult(result, "getSuperClassName");
    }

    private void checkTestResult(boolean condition, String testName) {
        String msg = (condition) ? testName + " = OK!" : testName + " = FAIL!";
        System.out.println(msg);
    }
}
