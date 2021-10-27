package student_sergey_egorichev.lesson_12.level_1.task_4;

import java.math.BigDecimal;

class TaxCalculatorImpl implements TaxCalculator {
    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        if (income.compareTo(BigDecimal.valueOf(20000)) <= 0) {
            return income.multiply(BigDecimal.valueOf(0.25));
        }
        return null;
    }
}
