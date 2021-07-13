package student_sergey_egorichev.lesson_6.level_7.task_33;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int[] line: field) {
            if ((line[0] == playerToCheck)
            && (line[1] == playerToCheck)
            && (line[2] == playerToCheck)) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int j = 0; j < 3; j ++) {
            if ((field[0][j] == playerToCheck)
            && (field[1][j] == playerToCheck)
            && (field[2][j] == playerToCheck)
            ) {
              return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        if (((field[0][0] == playerToCheck)
                && (field[1][1] == playerToCheck)
                && (field[2][2] == playerToCheck)
        ) || ((field[2][0] == playerToCheck)
                && (field[1][1] == playerToCheck)
                && (field[0][2] == playerToCheck)
                )
        ) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Check the position is win for one of players.
     *
     * @param field current field position
     * @param playerToCheck user (0 or 1) needs win check
     * @return true if current user win, false – else
     */
    public boolean isWinPosition(int[][] field, int playerToCheck) {
        if (isWinPositionForHorizontals(field, playerToCheck)
                || isWinPositionForVerticals(field, playerToCheck)
                || isWinPositionForDiagonals(field, playerToCheck)
        ) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Check the position is draw.
     *
     * @param field current field position
     * @return true if position is draw, false – else
     */
    public boolean isDrawPosition(int[][] field) {
        boolean someoneWin = (isWinPosition(field, 0)
                || isWinPosition(field, 1));
        boolean hasEmpty = false;
        for (int[] line: field) {
            for (int element: line) {
                if (element == -1) {
                    hasEmpty = true;
                    break;
                }
            }
        }
        return (!someoneWin && !hasEmpty);
    }

    /**
     * Create empty field:
     *                  -1 -1 -1
     *                  -1 -1 -1
     *                  -1 -1 -1
     *
     * @return array[3][3]
     */
    public int[][] createField() {
        int[][] array = new int[3][3];
        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j < 3; j ++) {
                array[i][j] = -1;
            }
        }
        return array;
    }

    /**
     * Get position from user, and create object Move.
     *
     * @return
     */
    public Move getNextMove() {
        int x = takeIntFromUser("x");
        int y = takeIntFromUser("y");
        return new Move(x, y);
    }

    private int takeIntFromUser(String name) {
        System.out.print("Введите " + name + ": ");
        Scanner scnr = new Scanner(System.in);
        int value = scnr.nextInt();
        return value;
    }

    public void printFieldToConsole(int[][] field) {
        for (int[] line: field) {
            for (int i = 0; i < 3; i ++) {
                String output;
                if (line[i] == 0) {
                    output = "X";
                } else if (line[i] == 1) {
                    output = "O";
                } else {
                    output = "_";
                }

                if (i != 0) {
                    output = " " + output;
                }
                System.out.print(output);
            }
            System.out.print("\n");
        }
    }

    public void play() {
        int[][] field = createField();
        while(true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            System.out.println("Мой ход:");
            TicTacToeAI petrovich = new TicTacToeAI(1);
            int[] attack = petrovich.getPositionForAttack(field);
            int[] defence = petrovich.getPositionForDefence(field);
            int[] random = petrovich.getRandomPosition(field);
            if (! Arrays.stream(attack).anyMatch(x -> x == -1)) {
                field[attack[0]][attack[1]] = 1;
            } else if (! Arrays.stream(defence).anyMatch(x -> x == -1)) {
                field[defence[0]][defence[1]] = 1;
            } else {
                field[random[0]][random[1]] = 1;
            }

            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }
}
