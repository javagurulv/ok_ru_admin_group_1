package student_sergey_egorichev.lesson_7.level_7.task_32;

public class Division extends TwoArgumentMathOperation {

    public Division(MathOperation leftArgument,
                    MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        return calculateLeftSide() / calculateRightSide();
    }
}
