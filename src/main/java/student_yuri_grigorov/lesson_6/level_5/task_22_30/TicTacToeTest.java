package student_yuri_grigorov.lesson_6.level_5.task_22_30;

import java.util.Arrays;

class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.isWinPositionForHorizontalsTest();
        ticTacToeTest.isWinPositionForVerticalsTest();
        ticTacToeTest.isWinPositionForDiagonalsTest1();
        ticTacToeTest.isWinPositionForDiagonalsTest2();
        ticTacToeTest.isWinPositionTest();
        ticTacToeTest.isDrawPositionTest1();
        ticTacToeTest.isDrawPositionTest2();
        ticTacToeTest.isDrawPositionTest3();
        ticTacToeTest.createFieldTest();
    }

    public void isWinPositionForHorizontalsTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                { 0, 0,-1},
                { 1, 1, 1},
                {-1,-1,-1}
        };
        checkTestResult(!ticTacToe.isWinPositionForHorizontals(field, 0),
                "isWinPositionForHorizontals - test return value (false)");
        checkTestResult(ticTacToe.isWinPositionForHorizontals(field, 1),
                "isWinPositionForHorizontals - test return value (true)");
    }

    public void isWinPositionForVerticalsTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field =  {
                { 0, 1,-1},
                { 0, 1,-1},
                {-1, 1,-1}
        };
        checkTestResult(!ticTacToe.isWinPositionForVerticals(field, 0),
                "isWinPositionForVerticals - test return value (false)");
        checkTestResult(ticTacToe.isWinPositionForVerticals(field, 1),
                "isWinPositionForVerticals - test return value (true)");
    }

    public void isWinPositionForDiagonalsTest1() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field =  {
                { 1, 0, 0},
                {-1, 1,-1},
                { 0,-1, 1}
        };
        checkTestResult(!ticTacToe.isWinPositionForDiagonals(field, 0),
                "isWinPositionForDiagonals - test d1 return value (false)");
        checkTestResult(ticTacToe.isWinPositionForDiagonals(field, 1),
                "isWinPositionForDiagonals - test d1 return value (true)");
    }

    public void isWinPositionForDiagonalsTest2() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field =  {
                { 0, 0, 1},
                {-1, 1,-1},
                { 1,-1, 0}
        };
        checkTestResult(!ticTacToe.isWinPositionForDiagonals(field, 0),
                "isWinPositionForDiagonals - test d2 return value (false)");
        checkTestResult(ticTacToe.isWinPositionForDiagonals(field, 1),
                "isWinPositionForDiagonals - test d2 return value (true)");
    }

    public void isWinPositionTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field =  {
                { 1, 1, 1},
                {-1, 0,-1},
                {-1, 0,-1}
        };
        checkTestResult(!ticTacToe.isWinPosition(field, 0),
                "isWinPosition - test1 return value (false)");
        checkTestResult(ticTacToe.isWinPosition(field, 1),
                "isWinPosition - test1 return value (true)");
    }

    public void isDrawPositionTest1() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field =  {
                { 1, 0, 0},
                { 0, 1, 1},
                { 1,-1, 0}
        };
        checkTestResult(!ticTacToe.isDrawPosition(field),
                "isDrawPosition - test1 return value (false)");
    }

    public void isDrawPositionTest2() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field =  {
                { 1, 0, 0},
                { 0, 1, 0},
                { 1, 0, 1}
        };
        checkTestResult(!ticTacToe.isDrawPosition(field),
                "isDrawPosition - test2 return value (false)");
    }

    public void isDrawPositionTest3() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field =  {
                { 1, 0, 0},
                { 0, 1, 1},
                { 1, 0, 0}
        };
        checkTestResult(ticTacToe.isDrawPosition(field),
                "isDrawPosition - test3 return value (true)");
    }

    public void createFieldTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field =  {
                {-1, -1, -1},
                {-1, -1, -1},
                {-1, -1, -1}
        };
        checkTestResult(Arrays.deepEquals(ticTacToe.createField(), field),
                "createFieldTest - test return value (true)");
    }


    private void checkTestResult(boolean condition, String testName) {
        String msg = (condition) ? testName + " = OK!" : testName + " = FAIL!";
        System.out.println(msg);
    }
}
