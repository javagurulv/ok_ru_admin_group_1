package student_yuri_grigorov.lesson_8_srp.task_1_28;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudRule4Test {

    @Test
    public void isFraudPositive() {
        Trader trader = new Trader("Jon Doe", "Moscow", "Ямайка");
        Transaction t = new Transaction(trader, 1000000);
        assertTrue(new FraudRule4("Rule 4").isFraud(t));
    }

    @Test
    public void isFraudNegative() {
        Trader trader = new Trader("Jon Doe", "Moscow", "Russia");
        Transaction t = new Transaction(trader, 1000000);
        assertFalse(new FraudRule4("Rule 4").isFraud(t));
    }

}
