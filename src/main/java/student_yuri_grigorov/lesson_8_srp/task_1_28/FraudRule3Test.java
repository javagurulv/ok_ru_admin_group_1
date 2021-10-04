package student_yuri_grigorov.lesson_8_srp.task_1_28;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudRule3Test {

    @Test
    public void isFraudPositive() {
        Trader trader = new Trader("Jon Doe", "Сидней");
        Transaction t = new Transaction(trader, 1000000);
        assertTrue(new FraudRule3("Rule 3").isFraud(t));
    }

    @Test
    public void isFraudNegative() {
        Trader trader = new Trader("Jon Doe", "London");
        Transaction t = new Transaction(trader, 1000000);
        assertFalse(new FraudRule3("Rule 3").isFraud(t));
    }
}