package student_sergey_egorichev.lesson_12.level_1.task_7;

import java.math.BigDecimal;

public class TaxCalculatorDemo {
    public static void main(String[] args) {
        TaxCalculator tc = new TaxCalculatorImpl();
        System.out.println(tc.calculateTax(BigDecimal.valueOf(20000)));
    }
}
