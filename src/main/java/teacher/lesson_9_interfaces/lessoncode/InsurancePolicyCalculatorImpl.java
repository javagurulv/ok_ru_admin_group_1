package teacher.lesson_9_interfaces.lessoncode;

import java.math.BigDecimal;

class InsurancePolicyCalculatorImpl
		implements InsurancePolicyCalculator {

	@Override
	public BigDecimal calculate(Policy policy) {
		//InsurancePolicyCalculator.PVN;

		return new BigDecimal("1.0");
	}

	@Override
	public int abc() {
		return 1;
	}

}
