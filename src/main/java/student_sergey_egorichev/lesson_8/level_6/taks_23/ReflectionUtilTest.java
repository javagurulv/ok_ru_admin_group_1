package student_sergey_egorichev.lesson_8.level_6.taks_23;

public class ReflectionUtilTest {
    public static void main(String[] args) {
        getClassAccessModifierTest();
        getSuperClassNameTest();
    }

    static void checkTestResult(String testName, boolean testResult) {
        if (testResult) {
            System.out.println(testName + ": OK");
        } else {
            System.out.println(testName + ": FAIL");
        }
    }

    static void getClassAccessModifierTest() {
        try {
            checkTestResult("getClassAccessModifier test",
                    ReflectionUtil.getClassAccessModifier("student_sergey_egorichev.lesson_8.level_4.task_17.ServerState") == "public");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void getSuperClassNameTest() {
        String testChildClass = "student_sergey_egorichev.lesson_8.level_2.task_11.HDD";
        String testParentClass = "student_sergey_egorichev.lesson_8.level_2.task_11.Disk";
        try {
            checkTestResult("getSuperClassName test",
                    ReflectionUtil.getSuperClassName(testChildClass).equals(testParentClass));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
