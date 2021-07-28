package student_sergey_egorichev.lesson_8.level_4.task_17;

public class ServerStateTest {

    public static void main(String[] args) {

        serverStateTest1();
        serverStateTest2();

    }

    static void checkTestResult(String testName, boolean testResult) {
        if (testResult) {
            System.out.println(testName + ": OK");
        } else {
            System.out.println(testName + ": FAIL");
        }
    }

    static void serverStateTest1() {
        ServerState serverState1 = new ServerState(40,20,10,15, 72,8);
        ServerState serverState2 = new ServerState(40,20,10,15, 72,8);
        checkTestResult("Server States are equal", serverState1.equals(serverState2));
    }

    static void serverStateTest2() {
        ServerState serverState1 = new ServerState(40,20,10,15, 72,8);
        ServerState serverState2 = new ServerState(45,20,12,18, 72,8);
        checkTestResult("Server States are not equal", !serverState1.equals(serverState2));
    }

}
