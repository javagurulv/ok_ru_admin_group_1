package student_vladislav_nikitin.lesson_6.level_6.task_27_28_29_30;

import java.util.Scanner;

class TicTacToe {

    private Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int[] row: field) {
            boolean playerIsWin = true;
            for (int i = 0; i < row.length; i++) {
                if (row[i] != playerToCheck) {
                    playerIsWin = false;
                    break;
                }
            }
            if (playerIsWin) {
                return playerIsWin;
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            boolean playerIsWin = true;
            for (int j = 0; j < field.length; j++) {
                if (field[j][i] != playerToCheck) {
                    playerIsWin = false;
                    break;
                }
            }
            if (playerIsWin) {
                return playerIsWin;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        boolean straightDiagonal = true;
        boolean reverseDiagonal = true;
        for (int i = 0; i < field.length; i++) {
            if (field[i][i] != playerToCheck) {
                straightDiagonal = false;
            }
            if (field[i][field.length - i-1] != playerToCheck) {
                reverseDiagonal = false;
            }
        }

        return straightDiagonal ? straightDiagonal : reverseDiagonal;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck) ||
               isWinPositionForVerticals(field, playerToCheck)   ||
               isWinPositionForDiagonals(field, playerToCheck);
    }

    public boolean isDrawPosition(int[][] field) {
        if (hasEmptyCell(field)){
            return false;
        }
        return ! (isWinPosition(field, 0) || isWinPosition(field, 1));
    }

    public boolean hasEmptyCell(int[][] field) {
        for (int[] row: field) {
            for (int cell: row) {
                if (cell == -1) {
                    return true;
                }
            }
        }
        return false;
    }

    public int[][] createField() {
        int[][] field = {
            { -1, -1, -1},
            { -1, -1, -1},
            { -1, -1, -1}
        };
        return field;
    }

    public Move getNextMove() {
        int x = giveUserInt("x") - 1;
        int y = giveUserInt("y") - 1;

        return new Move(x, y);
    }

    public void printFieldToConsole(int[][] field) {
        String horizontalLine = "-------------";
        for (int[] row: field) {
            System.out.println(horizontalLine);
            System.out.print("|");
            for (int cell: row) {
                switch (cell) {
                    case 0: System.out.print(" O ");
                            break;
                    case 1: System.out.print(" X ");
                            break;
                    default: System.out.print("   ");
                             break;
                }
                System.out.print("|");
            }
            System.out.print("\n");
        }
        System.out.println(horizontalLine);
    }

    public void play() {
        int[][] field = createField();
        while(true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
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

    private int giveUserInt(String intName) {
        while (true) {
            System.out.print("Please enter number for " + intName + ": ");
            if (this.inputScanner.hasNextInt()) {
                return this.inputScanner.nextInt();
            } else {
                System.out.println("\n" + this.inputScanner.next() + " is not number!");
            }
        }
    }

}
