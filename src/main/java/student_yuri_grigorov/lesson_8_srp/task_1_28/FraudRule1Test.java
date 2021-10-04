package student_yuri_grigorov.lesson_8_srp.task_1_28;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudRule1Test {

    @Test
    public void isFraudPositive() {
        Trader trader = new Trader("Pokemon", "London");
        Transaction t = new Transaction(trader, 1000000);
        assertTrue(new FraudRule1("Rule 1").isFraud(t));
    }

    @Test
    public void isFraudNegative() {
        Trader trader = new Trader("Jon Doe", "London");
        Transaction t = new Transaction(trader, 1000000);
        assertFalse(new FraudRule1("Rule 1").isFraud(t));
    }
}
