package student_yuri_grigorov.lesson_7.level_7.task_32;

class Subtraction extends TwoArgumentMathOperation {

	public Subtraction(MathOperation leftArgument,
					   MathOperation rightArgument) {
		super(leftArgument, rightArgument);
	}

	@Override
	public double calculate() {
		return calculateLeftSide() - calculateRightSide();
	}
}

