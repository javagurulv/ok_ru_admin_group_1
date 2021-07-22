package teacher.lesson_9_interfaces.lessoncode;

import java.math.BigDecimal;
import java.util.List;

public interface InsurancePolicyCalculator {

	static final int PVN = 21;

	BigDecimal calculate(Policy policy);

	public int abc();


	default int sum(int num1, int num2) {
		return this.abc() + num1 + num2;
	}

}
