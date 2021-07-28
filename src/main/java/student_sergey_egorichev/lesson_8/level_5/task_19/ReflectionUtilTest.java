package student_sergey_egorichev.lesson_8.level_5.task_19;

public class ReflectionUtilTest {
    public static void main(String[] args) {
        getClassAccessModifierTest();
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
}
