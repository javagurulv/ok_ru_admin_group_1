package student_sergey_egorichev.lesson_6.level_7.task_33;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Move {
    private int x;
    private int y;

    Move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
