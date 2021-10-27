package student_sergey_egorichev.lesson_12.level_1.task_8;

import java.math.BigDecimal;

class TaxCalculatorImpl implements TaxCalculator {
    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        if (income.compareTo(BigDecimal.valueOf(20000)) <= 0) {
            return income.multiply(BigDecimal.valueOf(0.25));
        } else if (income.compareTo(BigDecimal.valueOf(20000)) > 0) {
            BigDecimal taxBefore20k = BigDecimal.valueOf(5000);
            BigDecimal incomeOver20k = income.subtract(BigDecimal.valueOf(20000));
            BigDecimal taxOver20k = incomeOver20k.multiply(BigDecimal.valueOf(0.4));
            return taxBefore20k.add(taxOver20k);
        }
        return null;
    }
}
