package student_sergey_egorichev.lesson_6.level_7.task_33;

public class TicTacToeAI {
    int userID;
    int enemyID;


    TicTacToeAI(int userID) {
        this.userID = userID;

        if (userID == 0) this.enemyID = 1;
        else if (userID == 1) this.enemyID =0;
    }

    /**
     * Returns number of occurrences numberToSearch in th array
     *
     * @param array
     * @param numberToSearch
     */
    private static int countOccurrences(int[] array, int numberToSearch) {

        int counter = 0;
        for (int element: array) {
            if (element == numberToSearch) {
                counter ++;
            }
        }

        return counter;
    }

    /**
     * Get last empty position from the row
     *
     * @param array row with last empty position
     * @return empty position
     */
    private static int lastEmptyInTheRow(int[] array) {
        for (int i = 0; i < 3; i ++) {
            if (array[i] == -1) return i;
        }
        return -1;
    }

    /**
     * Find a winning position in horizontal rows
     *
     * @param field current game field
     * @param user current user 0 - player1 or 1 – TicTacToeAI
     * @return
     */
    private int[] horizontalAttackPosition(int[][] field, int user) {
        int[] result = {-1, -1};
        for (int i = 0; i < 3; i ++) {
            if (countOccurrences(field[i], user) == 2) {
                result = new int[] {i, lastEmptyInTheRow(field[i])};
            }
        }
        return result;
    }

    /**
     * Find winning position in vertical rows
     *
     * @param field current game field
     * @param user user id, 0 - player1 or 1 - TicTacToeAI
     * @return
     */
    private int[] verticalAttackPosition(int[][] field, int user) {
        int[] result = {-1, -1};
        int[] temp;
        for (int i = 0; i < 3; i ++) {
            temp = new int[] {field[0][i], field[1][i], field[2][i]};
            if (countOccurrences(temp, user) == 2) {
                result[1] = i;
                result[0] = lastEmptyInTheRow(temp);
                return result;
            } else continue;
        }
        return result;
    }

    /**
     * Find winning position in diagonal rows
     *
     * @param field current game field
     * @param user user id, 0 - player1 or 1 - TicTacToeAI
     * @return
     */
    private int[] diagonalAttackPosition(int[][] field, int user) {
        int[] descending = new int[] {field[0][0], field[1][1], field[2][2]};
        int[] ascending = new int[] {field[2][0], field[1][1], field[0][2]};
        if (countOccurrences(descending, user) == 2) {
            return new int[] {lastEmptyInTheRow(descending),
                    lastEmptyInTheRow(descending)};
        } else if (countOccurrences(ascending, user) == 2) {
            return new int[] {Math.abs(lastEmptyInTheRow(ascending)-2),
                    lastEmptyInTheRow(ascending)};
        }
        return new int[] {-1, -1};
    }

    /**
     * Get position for next move
     *
     * @param field current game field
     * @param user user id
     * @return
     */
    private int[] getPositionForMove(int[][] field, int user) {
        int[] attackPossibleHorizontal = horizontalAttackPosition(field, user);
        int[] attackPossibleVertical = verticalAttackPosition(field, user);
        int[] attackPossibleDiagonal = diagonalAttackPosition(field, user);

        if (attackPossibleHorizontal[0] != -1
                || attackPossibleHorizontal[1] != -1) return attackPossibleHorizontal;
        else if (attackPossibleVertical[0] != -1
                || attackPossibleVertical[1] != -1) return attackPossibleVertical;
        else if(attackPossibleDiagonal[0] != -1
                || attackPossibleDiagonal[1] != -1) return attackPossibleDiagonal;
        else return new int[] {-1, -1};
    }

    public int[] getPositionForAttack(int[][] field) {
        return getPositionForMove(field, this.userID);
    }

    public int[] getPositionForDefence(int[][] field) {
        return getPositionForMove(field, this.enemyID);
    }

    public int[] getRandomPosition(int[][] field) {
        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j < 3; j ++) {
                if (field[j][i] == -1) {
                    return new int[] {j, i};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
