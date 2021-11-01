package student_vladislav_nikitin.lesson_6.level_5.task_22_23_24_25_26;

class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();

        ticTacToeTest.isWinPositionForHorizontalsFirstPlayerWinTest();
        ticTacToeTest.isWinPositionForHorizontalsFirstPlayerNotWinTest();
        ticTacToeTest.isWinPositionForHorizontalsSecondPlayerWinTest();
        ticTacToeTest.isWinPositionForHorizontalsSecondPlayerNotWinTest();

        ticTacToeTest.isWinPositionForVerticalsFirstPlayerWinTest();
        ticTacToeTest.isWinPositionForVerticalsFirstPlayerNotWinTest();
        ticTacToeTest.isWinPositionForVerticalsSecondPlayerWinTest();
        ticTacToeTest.isWinPositionForVerticalsSecondPlayerNotWinTest();

        ticTacToeTest.isWinPositionForDiagonalsStraightFirstPlayerWinTest();
        ticTacToeTest.isWinPositionForDiagonalsReverseFirstPlayerWinTest();
        ticTacToeTest.isWinPositionForDiagonalsFirstPlayerNotWinTest();
        ticTacToeTest.isWinPositionForDiagonalsStraightSecondPlayerWinTest();
        ticTacToeTest.isWinPositionForDiagonalsReverseSecondPlayerWinTest();
        ticTacToeTest.isWinPositionForDiagonalsSecondPlayerNotWinTest();

        ticTacToeTest.isWinPositionFirstPlayerWinHorizontalTest();
        ticTacToeTest.isWinPositionFirstPlayerWinVerticalTest();
        ticTacToeTest.isWinPositionFirstPlayerWinDiagonalTest();
        ticTacToeTest.isWinPositionFirstPlayerNotWinTest();
        ticTacToeTest.isWinPositionSecondPlayerWinHorizontalTest();
        ticTacToeTest.isWinPositionSecondPlayerWinVerticalTest();
        ticTacToeTest.isWinPositionSecondPlayerWinDiagonalTest();
        ticTacToeTest.isWinPositionSecondPlayerNotWinTest();

        ticTacToeTest.isDrawPositionTrueTest();
        ticTacToeTest.isDrawPositionFalseTest();
        ticTacToeTest.isDrawPositionEmptyCellsTest();
    }

    void isWinPositionForHorizontalsFirstPlayerWinTest() {
        int[][] field = {
                {1, -1, 0},
                {0, 0, 0},
                {1, 0, 1}
        };
        int player = 0;
        TicTacToe ticTacToe = new TicTacToe();

        boolean expectedResult = true;
        boolean result = ticTacToe.isWinPositionForHorizontals(field, player);

        testResult(expectedResult == result, "isWinPositionForHorizontals first player is win");
    }

    void isWinPositionForHorizontalsFirstPlayerNotWinTest() {
        int[][] field = {
                {1, 1, 0},
                {0, -1, 0},
                {1, 0, 0}
        };
        int player = 0;
        TicTacToe ticTacToe = new TicTacToe();

        boolean expectedResult = false;
        boolean result = ticTacToe.isWinPositionForHorizontals(field, player);

        testResult(expectedResult == result, "isWinPositionForHorizontals first player is not win");
    }

    void isWinPositionForHorizontalsSecondPlayerWinTest() {
        int[][] field = {
                {1, 1, 1},
                {0, -1, 0},
                {1, 0, 1}
        };
        int player = 1;
        TicTacToe ticTacToe = new TicTacToe();

        boolean expectedResult = true;
        boolean result = ticTacToe.isWinPositionForHorizontals(field, player);

        testResult(expectedResult == result, "isWinPositionForHorizontals second player is win");
    }

    void isWinPositionForHorizontalsSecondPlayerNotWinTest() {
        int[][] field = {
                {1, 1, 0},
                {0, 0, 0},
                {1, 0, 1}
        };
        int player = 1;
        TicTacToe ticTacToe = new TicTacToe();

        boolean expectedResult = false;
        boolean result = ticTacToe.isWinPositionForHorizontals(field, player);

        testResult(expectedResult == result, "isWinPositionForHorizontals second player is not win");
    }

    void isWinPositionForVerticalsFirstPlayerWinTest() {
        int[][] field = {
                {1, 0, 1},
                {1, 0, 0},
                {0, 0, 1}
        };
        int player = 0;
        TicTacToe ticTacToe = new TicTacToe();

        boolean expectedResult = true;
        boolean result = ticTacToe.isWinPositionForVerticals(field, player);

        testResult(expectedResult == result, "isWinPositionForVerticals first player is win");
    }

    void isWinPositionForVerticalsFirstPlayerNotWinTest() {
        int[][] field = {
                {1, 0, 0},
                {0, 1, 1},
                {1, 0, 0}
        };
        int player = 0;
        TicTacToe ticTacToe = new TicTacToe();

        boolean expectedResult = false;
        boolean result = ticTacToe.isWinPositionForVerticals(field, player);

        testResult(expectedResult == result, "isWinPositionForVerticals first player is not win");
    }

    void isWinPositionForVerticalsSecondPlayerWinTest() {
        int[][] field = {
                {1, 0, 1},
                {0, -1, 1},
                {0, 0, 1}
        };
        int player = 1;
        TicTacToe ticTacToe = new TicTacToe();

        boolean expectedResult = true;
        boolean result = ticTacToe.isWinPositionForVerticals(field, player);

        testResult(expectedResult == result, "isWinPositionForVerticals second player is win");
    }

    void isWinPositionForVerticalsSecondPlayerNotWinTest() {
        int[][] field = {
                {1, 1, 0},
                {0, 0, 0},
                {-1, 1, 0}
        };
        int player = 1;
        TicTacToe ticTacToe = new TicTacToe();

        boolean expectedResult = false;
        boolean result = ticTacToe.isWinPositionForVerticals(field, player);

        testResult(expectedResult == result, "isWinPositionForVerticals second player is not win");
    }

    void isWinPositionForDiagonalsStraightFirstPlayerWinTest() {
        int[][] field = {
                {0, 1, -1},
                {1, 0, 0},
                {0, 1, 0}
        };
        int player = 0;
        TicTacToe ticTacToe = new TicTacToe();

        boolean expectedResult = true;
        boolean result = ticTacToe.isWinPositionForDiagonals(field, player);

        testResult(expectedResult == result, "isWinPositionForDiagonals straight first player is win");
    }

    void isWinPositionForDiagonalsReverseFirstPlayerWinTest() {
        int[][] field = {
                {1, 1, 0},
                {1, 0, 0},
                {0, 0, 1}
        };
        int player = 0;
        TicTacToe ticTacToe = new TicTacToe();

        boolean expectedResult = true;
        boolean result = ticTacToe.isWinPositionForDiagonals(field, player);

        testResult(expectedResult == result, "isWinPositionForDiagonals reverse first player is win");
    }

    void isWinPositionForDiagonalsFirstPlayerNotWinTest() {
        int[][] field = {
                {1, 0, 0},
                {0, 1, -1},
                {1, 0, 0}
        };
        int player = 0;
        TicTacToe ticTacToe = new TicTacToe();

        boolean expectedResult = false;
        boolean result = ticTacToe.isWinPositionForDiagonals(field, player);

        testResult(expectedResult == result, "isWinPositionForDiagonals first player is not win");
    }

    void isWinPositionForDiagonalsStraightSecondPlayerWinTest() {
        int[][] field = {
                {1, 0, 1},
                {0, 1, 0},
                {0, 0, 1}
        };
        int player = 1;
        TicTacToe ticTacToe = new TicTacToe();

        boolean expectedResult = true;
        boolean result = ticTacToe.isWinPositionForDiagonals(field, player);

        testResult(expectedResult == result, "isWinPositionForDiagonals straight second player is win");
    }

    void isWinPositionForDiagonalsReverseSecondPlayerWinTest() {
        int[][] field = {
                {0, 0, 1},
                {0, 1, 0},
                {1, 0, 1}
        };
        int player = 1;
        TicTacToe ticTacToe = new TicTacToe();

        boolean expectedResult = true;
        boolean result = ticTacToe.isWinPositionForDiagonals(field, player);

        testResult(expectedResult == result, "isWinPositionForDiagonals reverse second player is win");
    }

    void isWinPositionForDiagonalsSecondPlayerNotWinTest() {
        int[][] field = {
                {1, 1, 0},
                {0, 0, 0},
                {1, 1, 0}
        };
        int player = 1;
        TicTacToe ticTacToe = new TicTacToe();

        boolean expectedResult = false;
        boolean result = ticTacToe.isWinPositionForDiagonals(field, player);

        testResult(expectedResult == result, "isWinPositionForDiagonals second player is not win");
    }

    void isWinPositionFirstPlayerWinHorizontalTest() {
        int[][] field = {
                {0, 1, 1},
                {0, 0, 0},
                {-1, 1, 0}
        };
        int player = 0;
        TicTacToe ticTacToe = new TicTacToe();

        boolean expectedResult = true;
        boolean result = ticTacToe.isWinPosition(field, player);

        testResult(expectedResult == result, "isWinPosition first player is win by horizontal");
    }

    void isWinPositionFirstPlayerWinVerticalTest() {
        int[][] field = {
                {0, 1, 1},
                {0, 0, -1},
                {0, 1, 0}
        };
        int player = 0;
        TicTacToe ticTacToe = new TicTacToe();

        boolean expectedResult = true;
        boolean result = ticTacToe.isWinPosition(field, player);

        testResult(expectedResult == result, "isWinPosition first player is win by vertical");
    }

    void isWinPositionFirstPlayerWinDiagonalTest() {
        int[][] field = {
                {0, 1, 1},
                {0, 0, 0},
                {1, 1, 0}
        };
        int player = 0;
        TicTacToe ticTacToe = new TicTacToe();

        boolean expectedResult = true;
        boolean result = ticTacToe.isWinPosition(field, player);

        testResult(expectedResult == result, "isWinPosition first player is win by diagonal");
    }

    void isWinPositionFirstPlayerNotWinTest() {
        int[][] field = {
                {0, 0, 1},
                {0, 1, 0},
                {1, -1, 0}
        };
        int player = 0;
        TicTacToe ticTacToe = new TicTacToe();

        boolean expectedResult = false;
        boolean result = ticTacToe.isWinPosition(field, player);

        testResult(expectedResult == result, "isWinPosition first player is not win");
    }

    void isWinPositionSecondPlayerWinHorizontalTest() {
        int[][] field = {
                {1, 1, 1},
                {1, 0, 0},
                {-1, 0, 0}
        };
        int player = 1;
        TicTacToe ticTacToe = new TicTacToe();

        boolean expectedResult = true;
        boolean result = ticTacToe.isWinPosition(field, player);

        testResult(expectedResult == result, "isWinPosition second player is win by horizontal");
    }

    void isWinPositionSecondPlayerWinVerticalTest() {
        int[][] field = {
                {0, 1, 1},
                {1, 1, 0},
                {0, 1, 0}
        };
        int player = 1;
        TicTacToe ticTacToe = new TicTacToe();

        boolean expectedResult = true;
        boolean result = ticTacToe.isWinPosition(field, player);

        testResult(expectedResult == result, "isWinPosition second player is win by vertical");
    }

    void isWinPositionSecondPlayerWinDiagonalTest() {
        int[][] field = {
                {0, 0, 1},
                {0, 1, 0},
                {1, 1, 0}
        };
        int player = 1;
        TicTacToe ticTacToe = new TicTacToe();

        boolean expectedResult = true;
        boolean result = ticTacToe.isWinPosition(field, player);

        testResult(expectedResult == result, "isWinPosition second player is win by diagonal");
    }

    void isWinPositionSecondPlayerNotWinTest() {
        int[][] field = {
                {0, 1, 1},
                {0, 0, 0},
                {1, 1, 0}
        };
        int player = 1;
        TicTacToe ticTacToe = new TicTacToe();

        boolean expectedResult = false;
        boolean result = ticTacToe.isWinPosition(field, player);

        testResult(expectedResult == result, "isWinPosition second player is not win");
    }

    void isDrawPositionTrueTest() {
        int[][] field = {
                {0, 0, 1},
                {1, 1, 0},
                {0, 1, 0}
        };
        TicTacToe ticTacToe = new TicTacToe();

        boolean expectedResult = true;
        boolean result = ticTacToe.isDrawPosition(field);

        testResult(expectedResult == result, "isDrawPosition true");
    }

    void isDrawPositionFalseTest() {
        int[][] field = {
                {0, 1, 1},
                {0, 1, 0},
                {1, 1, 0}
        };
        TicTacToe ticTacToe = new TicTacToe();

        boolean expectedResult = false;
        boolean result = ticTacToe.isDrawPosition(field);

        testResult(expectedResult == result, "isDrawPosition false");
    }

    void isDrawPositionEmptyCellsTest() {
        int[][] field = {
                {0, 0, 1},
                {0, -1, 0},
                {1, 1, 0}
        };
        TicTacToe ticTacToe = new TicTacToe();

        boolean expectedResult = false;
        boolean result = ticTacToe.isDrawPosition(field);

        testResult(expectedResult == result, "isDrawPosition empty cells");
    }

    private void testResult(boolean condition, String nameOfTest) {
        String fullOutOfTest = nameOfTest + " = ";
        System.out.println(condition ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

}
