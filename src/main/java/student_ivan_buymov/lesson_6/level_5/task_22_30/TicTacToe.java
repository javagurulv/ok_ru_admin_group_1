package student_ivan_buymov.lesson_6.level_5.task_22_30;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// TODO nice to have:
// - check if move is outside field
// - check if move already exist

public class TicTacToe {

    public static final int PLAYER_ONE = 0;
    public static final int PLAYER_TWO = 1;
    public static final int EMPTY_CELL = -1;
    public static final String PLAYER_ONE_SIGN = "O";
    public static final String PLAYER_TWO_SIGN = "X";
    public static final String EMPTY_SIGN = "_";
    public static final Map<Integer, String> PLAYERS_SIGNS;
    public static final Map<Boolean, Integer> CURRENT_TURN;

    static {
        PLAYERS_SIGNS = new HashMap<>();
        PLAYERS_SIGNS.put(PLAYER_ONE, PLAYER_ONE_SIGN);
        PLAYERS_SIGNS.put(PLAYER_TWO, PLAYER_TWO_SIGN);
        PLAYERS_SIGNS.put(EMPTY_CELL, EMPTY_SIGN);
    }
    static {
        CURRENT_TURN = new HashMap<>();
        CURRENT_TURN.put(false, PLAYER_ONE);
        CURRENT_TURN.put(true, PLAYER_TWO);
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    public static int readFieldSize(){
        Scanner in = new Scanner(System.in);
        var msg = "bad size, must be integer >= 3";
        var n = 0;
        while (true){
            try {
                System.out.print("Input field size: ");
                n = in.nextInt();
                if (n < 3) {
                    System.out.println(msg);
                    continue;
                }
            } catch (Exception e) {
                System.out.println(msg);
            }
            return n;
        }
    }

    public void play() {
        var size = readFieldSize();
        int[][] field = createField(size);
        printFieldToConsole(field);
        var currentTurn = false;
        while(true) {
            Move move0 = getNextMove(CURRENT_TURN.get(currentTurn));
            field[move0.getX()][move0.getY()] = CURRENT_TURN.get(currentTurn);
            if (isWinPosition(field, CURRENT_TURN.get(currentTurn))) {
                System.out.printf("Player %d WIN!", CURRENT_TURN.get(currentTurn));
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
            printFieldToConsole(field);
            currentTurn = !currentTurn;

        }
        System.out.println();
        printFieldToConsole(field);
    }

    public boolean isNoEmptyCells(int a, int b, int c) {
        return (a != EMPTY_CELL) && (b != EMPTY_CELL) && (c != EMPTY_CELL);
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {

        for (int row = 0; row < field.length; row++) {
            for (int column = 0; column < field.length - 2; column++) {
                var a = field[row][column];
                var b = field[row][column + 1];
                var c = field[row][column + 2];
                if ((a == playerToCheck) && (b == playerToCheck) && (c == playerToCheck)) {
                    return isNoEmptyCells(a, b, c);
                }
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {

        for (int column = 0; column < field.length; column++) {
            for (int row = 0; row < field.length - 2; row++) {
                var a = field[row][column];
                var b = field[row + 1][column];
                var c = field[row + 2][column];
                if ((a == playerToCheck) && (b == playerToCheck) && (c == playerToCheck)) {
                    return isNoEmptyCells(a, b, c);
                }
            }
        }
        return false;
    }

    private boolean isWinPositionForDiagonalsRight(int[][] field, int playerToCheck) {

        for (int row = 0; row < field.length - 2; row++) {
            for (int column = 0; column < field.length - 2; column++) {
                var a = field[row][column];
                var b = field[row + 1][column + 1];
                var c = field[row + 2][column + 2];
                if ((field[row][column] == playerToCheck) && (b == playerToCheck) && (c == playerToCheck)) {
                    return isNoEmptyCells(a, b, c);
                }
            }
        }
        return false;
    }

    private boolean isWinPositionForDiagonalsLeft(int[][] field, int playerToCheck) {
        for (int row = 0; row < field.length - 2; row++) {
            for (int column = field.length - 1; column > field.length - 2; column--) {
                var a = field[row][column];
                var b = field[row + 1][column - 1];
                var c = field[row + 2][column - 2];
                if ((a == playerToCheck) && (b == playerToCheck) && (c == playerToCheck)) {
                    return isNoEmptyCells(a, b, c);
                }
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        return isWinPositionForDiagonalsLeft(field, playerToCheck) ||
                isWinPositionForDiagonalsRight(field, playerToCheck);
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return (isWinPositionForDiagonals(field, playerToCheck) ||
                isWinPositionForHorizontals(field, playerToCheck) ||
                isWinPositionForVerticals(field, playerToCheck)
        );
    }

    public boolean isDrawPosition(int[][] field) {
        for (int row = 0; row < field.length; row++) {
            for (int column = 0; column < field.length; column++) {
                if (field[row][column] == EMPTY_CELL) {
                    return false;
                }
            }
        }
        if (isWinPosition(field, PLAYER_ONE) || isWinPosition(field, PLAYER_TWO)) {
            return false;
        }
        return true;
    }

    public int[][] createField(int n) {
        var field = new int[n][n];
        for (var i = 0; i < field.length; i++) {
            for (var j = 0; j < field.length; j++) {
                field[i][j] = EMPTY_CELL;
            }
        }
        return field;
    }

    public Move getNextMove(int player) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.printf("%s turn(raw column): ", PLAYERS_SIGNS.get(player));
            try {
                String move = in.nextLine();
                String[] xy = move.strip().split(" ");
                int x = Integer.parseInt(xy[0]);
                int y = Integer.parseInt(xy[1]);
                return new Move(x - 1 , y - 1);
            } catch (Exception e) {
                System.out.println("bad move, must be two integer like: 2 4");
            }
        }
    }

    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < field.length + 1; i++) {
            for (int j = 0; j < field.length + 1; j++) {
                if (i == 0) {
                    if (j == 0) {
                        System.out.print(" ".repeat(3));
                    } else {
                        System.out.printf("%3s", j);
                    }
                } else {
                    if (j == 0) {
                        System.out.printf("%3s", i);
                    }
                    else {
                        System.out.printf("%3s", PLAYERS_SIGNS.get(field[i-1][j-1]));
                    }
                }
            }
            System.out.println();

        }

    }}
