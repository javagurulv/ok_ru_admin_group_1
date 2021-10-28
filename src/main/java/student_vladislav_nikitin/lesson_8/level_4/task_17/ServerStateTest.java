package student_vladislav_nikitin.lesson_8.level_4.task_17;

class ServerStateTest {

    public static void main(String[] args) {
        ServerStateTest serverStateTest = new ServerStateTest();

        serverStateTest.serverStateEqualsPositiveTest();
        serverStateTest.serverStateEqualsNegativeTest();
        serverStateTest.serverStateEqualsWrongObjectTest();
    }

    void serverStateEqualsPositiveTest() {
        boolean expectedResult = true;

        ServerState s1 = new ServerState(13.5, 4096, 784, 8192, 398);
        ServerState s2 = new ServerState(13.5, 4096, 784, 8192, 398);

        boolean result = s1.equals(s2);

        testResult(result == expectedResult, "ServerState equals positive");
    }

    void serverStateEqualsNegativeTest() {
        boolean expectedResult = false;

        ServerState s1 = new ServerState(13.5, 4096, 784, 8192, 398);
        ServerState s2 = new ServerState(34.23, 2048, 593, 512, 134);

        boolean result = s1.equals(s2);

        testResult(result == expectedResult, "ServerState equals negative");
    }

    void serverStateEqualsWrongObjectTest() {
        boolean expectedResult = false;

        ServerState s1 = new ServerState(13.5, 4096, 784, 8192, 398);
        String s2 = "Just string";

        boolean result = s1.equals(s2);

        testResult(result == expectedResult, "ServerState equals wrong object");
    }


    private void testResult(boolean condition, String nameOfTest) {
        String fullOutOfTest = nameOfTest + " = ";
        System.out.println(condition ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }


}
