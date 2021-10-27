package student_vladislav_nikitin.lesson_7.level_7.task_32;

class Multiplication extends TwoArgumentMathOperation {

    public Multiplication(MathOperation leftArgument,
                          MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        return calculateLeftSide() * calculateRightSide();
    }

}
