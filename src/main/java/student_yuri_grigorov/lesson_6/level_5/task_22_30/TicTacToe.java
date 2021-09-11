package student_yuri_grigorov.lesson_6.level_5.task_22_30;

import java.util.Scanner;

class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int[] row : field) {
            if (row[0] == playerToCheck && row[1] == playerToCheck && row[2] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < 3; i++) {
            if (field[i][0] == playerToCheck && field[i][1] == playerToCheck && field[i][2] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        boolean d1 = true;
        boolean d2 = true;
        for (int i = 0; i < 3; i++) {
            d1 &= (field[i][i] == playerToCheck);
            d2 &= (field[i][3-i-1] == playerToCheck);
        }
        return d1 || d2;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return (isWinPositionForHorizontals(field, playerToCheck)
                || isWinPositionForVerticals(field, playerToCheck)
                || isWinPositionForDiagonals(field, playerToCheck));
    }

    public boolean isDrawPosition(int[][] field) {
        return isFieldFull(field)
                && !isWinPosition(field, 0)
                && !isWinPosition(field, 1);
    }

    public boolean isFieldFull (int[][] field) {
        for (int[] row : field) {
            for (int i : row) {
                if (i == -1) return false;
            }
        }
        return true;
    }

    public int[][] createField()  {
        return new int[][]{
                {-1, -1, -1},
                {-1, -1, -1},
                {-1, -1, -1}
        };
    }

    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Make next move");
        System.out.print("x: ");
        int x = scanner.nextInt() - 1;
        System.out.print("y: ");
        int y = scanner.nextInt() - 1;
        return new Move(x, y);
    }

    public void printFieldToConsole(int[][] field) {
        char[] valueMap = {' ', '0', 'X'};
        for (int i = 0; i < 3; i++) {
            System.out.println("  +---+---+---+");
            System.out.printf("%d ", 3-i);
            for (int j = 0; j < 3; j++) {
                System.out.print("|");
                System.out.printf(" %s ", valueMap[field[j][3-i-1] + 1]);
            }
            System.out.println("|");
        }
        System.out.println("  +---+---+---+");
        System.out.println("    1   2   3  ");
    }

    public void play() {
        int[][] field = createField();
        while(true) {
            printFieldToConsole(field);
            System.out.println("Player 0");
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
            System.out.println("Player X");
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

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

}
