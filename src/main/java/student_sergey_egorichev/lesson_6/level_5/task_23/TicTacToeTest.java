package student_sergey_egorichev.lesson_6.level_5.task_23;

public class TicTacToeTest {
    /**
     * run tests
     * @param args
     */
    public static void main(String[] args) {
        // isWinPositionForHorizontals()
        isWinPositionForHorizontalsTest1();
        isWinPositionForHorizontalsTest2();
        // isWinPositionForVerticals()
        isWinPositionForVerticalsTest1();
        isWinPositionForVerticalsTest2();
    }

    /**
     * Check result and print tests execution status.
     *
     * @param testName Name of test for human-readable output.
     * @param testResult Result of test method.
     */
    private static void checkTestResult(String testName, boolean testResult) {
        if (testResult) {
            System.out.println(testName + ": OK");
        } else {
            System.out.println(testName + ": FAIL");
        }
    }

    private static void isWinPositionForHorizontalsTest1() {
        int[][] testState = new int[][] {
                {-1, 1, -1},
                {0, 0, 0},
                {-1, 1, -1}
        };
        boolean expectedResult = true;

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForHorizontals(testState, 0);

        checkTestResult("Win Position For Horizontals (0 - player, positive)",
                realResult == expectedResult);
    }

    private static void isWinPositionForHorizontalsTest2() {
        int[][] testState = new int[][] {
                {-1, 1, -1},
                {0, 0, 0},
                {-1, 1, -1}
        };
        boolean expectedResult = false;

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForHorizontals(testState, 1);

        checkTestResult("Win Position For Horizontals (1 - player, negative)",
                realResult == expectedResult);
    }

    private static void isWinPositionForVerticalsTest1() {
        int[][] testState = new int[][] {
                {-1, 0, -1},
                {1, 0, 1},
                {-1, 0, -1}
        };
        boolean expectedResult = true;

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForVerticals(testState, 0);

        checkTestResult("Win Position For Verticals (0 - player, positive)",
                realResult == expectedResult);
    }

    private static void isWinPositionForVerticalsTest2() {
        int[][] testState = new int[][] {
                {-1, 0, -1},
                {1, 0, 1},
                {-1, 0, -1}
        };
        boolean expectedResult = false;

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForVerticals(testState, 1);

        checkTestResult("Win Position For Verticals (1 - player, negative)",
                realResult == expectedResult);
    }
}
