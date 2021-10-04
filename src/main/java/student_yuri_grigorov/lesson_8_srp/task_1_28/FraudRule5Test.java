package student_yuri_grigorov.lesson_8_srp.task_1_28;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudRule5Test {

    @Test
    public void isFraudPositive() {
        Trader trader = new Trader("Jon Doe", "Moscow", "Германия");
        Transaction t = new Transaction(trader, 1001);
        assertTrue(new FraudRule5("Rule 5").isFraud(t));
    }

    @Test
    public void isFraudNegative() {
        Trader trader = new Trader("Jon Doe", "Moscow", "Russia");
        Transaction t = new Transaction(trader, 1001);
        assertFalse(new FraudRule5("Rule 5").isFraud(t));
    }
}
