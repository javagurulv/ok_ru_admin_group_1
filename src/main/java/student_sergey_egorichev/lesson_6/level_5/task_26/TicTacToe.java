package student_sergey_egorichev.lesson_6.level_5.task_26;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class TicTacToe {

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

    public boolean isDrawPosition(int[][] field) {
        boolean someoneWin = (isWinPosition(field, 0)
                || isWinPosition(field, 1));
		return (!someoneWin && !hasEmptyField(field));
    }

	private boolean hasEmptyField(int[][] field) {
		boolean hasEmpty = false;
		for (int[] line: field) {
			for (int element: line) {
				if (element == -1) {
					hasEmpty = true;
					break;
				}
			}
		}
		return hasEmpty;
	}

}
