package student_sergey_egorichev.lesson_12.level_1.task_6;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class TaxCalculatorImplTest {

    @Test
    public void calculateTaxTest1() {
        BigDecimal salary = BigDecimal.valueOf(20000);
        BigDecimal expectedResult = new BigDecimal("5000.00");
        TaxCalculator calc = new TaxCalculatorImpl();
        Assert.assertTrue(calc.calculateTax(salary).equals(expectedResult));
    }

    @Test
    public void calculateTaxTest2() {
        BigDecimal salary = BigDecimal.ZERO;
        BigDecimal expectedResult = new BigDecimal("0.00");
        TaxCalculator calc = new TaxCalculatorImpl();
        Assert.assertTrue(calc.calculateTax(salary).equals(expectedResult));
    }

    @Test
    public void calculateTaxTest3() {
        BigDecimal salary = new BigDecimal(10000);
        BigDecimal expectedResult = new BigDecimal("2500.00");
        TaxCalculator calc = new TaxCalculatorImpl();
        Assert.assertEquals(calc.calculateTax(salary), expectedResult);
    }

    @Test
    public void calculateTaxTest4() {
        BigDecimal salary = new BigDecimal(30000);
        BigDecimal expectedResult = new BigDecimal("9000.0");
        TaxCalculator calc = new TaxCalculatorImpl();
        Assert.assertEquals(calc.calculateTax(salary), expectedResult);
    }
}