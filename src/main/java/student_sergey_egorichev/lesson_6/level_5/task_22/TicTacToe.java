package student_sergey_egorichev.lesson_6.level_5.task_22;

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

}
