package student_ivan_buymov.lesson_6.level_5.task_22_30;


public class TicTacToeTest {

    static class TestTicTacException extends Exception {
        public TestTicTacException(String errorMessage) {
            super(errorMessage);
        }
    }

    public static void main(String[] args) throws TestTicTacException {

        var t = new TicTacToeTest();
        t.testWinHorizontal();
        t.testWinVertical();
        t.testWinDiagonal();
        t.testIsWinPosition();
        t.testDrawPosition();
        t.testPrintField();

    }

    public void testPrintField() {
        var t =  new TicTacToe();
        int[][] field = {
                {-1, 0, -1, 0, -1},
                {0, -1, -1, -1, -1},
                {-1, -1, -1, 1, -1},
                {-1, -1, -1, -1, -1},
                {-1, 0, -1, 1, -1},
        };
        t.printFieldToConsole(field);

    }


    public void testWinDiagonal() throws TestTicTacException {
        var t = new TicTacToe();
        int[][] fieldPLayerOnwWin = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0},
        };
        if (t.isWinPositionForDiagonals(fieldPLayerOnwWin, 1)) {
            System.out.println("test winner exist diagonal right: OK");
        } else {
            throw new TestTicTacException("fail diagonal: player 1 must be a winner");
        }
        fieldPLayerOnwWin = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0},
        };
        if (t.isWinPositionForDiagonals(fieldPLayerOnwWin, 0)) {
            System.out.println("test winner exist diagonal left: OK");
        } else {
            throw new TestTicTacException("fail diagonal: player 0 must be a winner");
        }
        var noWinners = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 1, 0, 0},
        };
        if (!t.isWinPositionForDiagonals(noWinners, 0)) {
            System.out.println("test no winner exist diagonal: OK");
        } else {
            throw new TestTicTacException("fail diagonal: player 0 must not be a winner");
        }
        if (!t.isWinPositionForDiagonals(noWinners, 1)) {
            System.out.println("test no winner exist diagonal: OK");
        } else {
            throw new TestTicTacException("fail diagonal: player 1 must not be a winner");
        }
    }

    public void testWinVertical() throws TestTicTacException {
        var t = new TicTacToe();
        var fieldPLayerOneWin = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0},
        };
        if (t.isWinPositionForVerticals(fieldPLayerOneWin, 1)) {
            System.out.println("test winner exist vertical: OK");
        } else {
            throw new TestTicTacException("fail vertical: player 1 must be a winner");
        }
        var noWinners = new int[][]{
                {0, 1, 0, 0, 0},
                {1, 0, 1, 1, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 1, 1, 0},
                {0, 1, 0, 0, 0},
        };
        if (!t.isWinPositionForVerticals(noWinners, 1)) {
            System.out.println("test no winners exist vertical: OK");
        } else {
            throw new TestTicTacException("fail vertical: winner 1 must not exist");
        }
        if (!t.isWinPositionForVerticals(noWinners, 0)) {
            System.out.println("test no winners exist vertical: OK");
        } else {
            throw new TestTicTacException("fail vertical: winner 0 must not exist");
        }
    }


    public void testWinHorizontal() throws TestTicTacException {
        var t = new TicTacToe();
        var fieldPLayerOneWin = new int[][] {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1},
                {0, 0, 0, 0, 0},
        };
        if (t.isWinPositionForHorizontals(fieldPLayerOneWin, 1)) {
            System.out.println("test winner exist horizontal: OK");
        } else {
            throw new TestTicTacException("fail horizontal: player 1 must be a winner");
        }
        var noWinners = new int[][]{
                {0, 1, 0, 1, 0},
                {1, 0, 1, 1, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 1, 1, 0},
                {0, 1, 1, 0, 0},
        };
        if (!t.isWinPositionForHorizontals(noWinners, 1)) {
            System.out.println("test no winners exist horizontal: OK");
        } else {
            throw new TestTicTacException("fail horizontal: winner must not exist");
        }
        if (!t.isWinPositionForHorizontals(noWinners, 0)) {
            System.out.println("test no winners exist horizontal: OK");
        } else {
            throw new TestTicTacException("fail horizontal: winner must not exist");
        }


    }

    public void testIsWinPosition() throws TestTicTacException {
        var playerOneWin = new int[][]{
                {0, 1, 0, 1, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
        };
        var t = new TicTacToe();
        if (t.isWinPosition(playerOneWin, 1)){
            System.out.println("test player win: OK");
        } else {
            throw new TestTicTacException("fail player win: player 1 must be a winner");
        }

        var noWinners = new int[][]{
                {-1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1},
                {-1, 1, 0, 1, -1},
                {-1, -1, -1, -1, -1},
        };
        if (!t.isWinPosition(noWinners, 0)){
            System.out.println("test not winners: OK");
        } else {
            throw new TestTicTacException("fail player win: player 0 must not be a winner");
        }
        if (!t.isWinPosition(noWinners, 1)){
            System.out.println("test not winners: OK");
        } else {
            throw new TestTicTacException("fail player win: player 1 must not be a winner");
        }

    }


    public void testDrawPosition() throws TestTicTacException {
        var drawPosition = new int[][]{
                {1, 1, 0},
                {0, 0, 1},
                {1, 1, 0},
        };
        var t = new TicTacToe();
        if (t.isDrawPosition(drawPosition)) {
            System.out.println("test draw position: OK");
        } else {
            throw new TestTicTacException("test draw position fail: must be draw position");
        }

        var notDrawPosition = new int[][]{
                {1, 1, 0},
                {0, -1, 1},
                {1, 1, 0},
        };
        if (!t.isDrawPosition(notDrawPosition)) {
            System.out.println("test draw position: OK");
        } else {
            throw new TestTicTacException("test draw position fail: must be a not draw position");
        }
    }



}
