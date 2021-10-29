package student_vladislav_nikitin.lesson_6.level_5.task_22_23_24_25_26;

class TicTacToe {

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

}
