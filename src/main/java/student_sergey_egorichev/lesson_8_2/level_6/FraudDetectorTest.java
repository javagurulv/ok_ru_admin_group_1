package student_sergey_egorichev.lesson_8_2.level_6;

import org.junit.Assert;
import org.junit.Test;

public class FraudDetectorTest {

    @Test
    public void NotFraudTransaction() {
        Trader trader = new Trader("Gena", "Msk", "Russia");
        Transaction t = new Transaction(trader, 300);
        Assert.assertFalse(t.isFraud().isFraud());
    }

    @Test
    public void FraudByFakeTrader() {
        Trader trader = new Trader("Pokemon", "Tokyo", "Japan");
        Transaction t = new Transaction(trader, 451);
        Assert.assertTrue(new FraudRuleFakeTrader().checkFraud(t));
    }

    @Test
    public void FraudByAmount() {
        Trader trader = new Trader("Petrovich", "Spb", "Russia");
        Transaction t = new Transaction(trader, 1645000);
        Assert.assertTrue(new FraudRuleMaxAmount().checkFraud(t));
    }

    @Test
    public void FraudByForbiddenCity() {
        Trader trader = new Trader("Антон", "Сидней", "Австралия");
        Transaction t = new Transaction(trader, 677);
        Assert.assertTrue(new FraudRuleForbiddenCity().checkFraud(t));
    }

    @Test
    public void FraudByForbiddenCountry() {
        Trader trader = new Trader("Boris", "Кингстон", "Ямайка");
        Transaction t = new Transaction(trader, 9999);
        Assert.assertTrue(new FraudRuleForbiddenCountry().checkFraud(t));
    }

    @Test
    public void TestFraudRule5Negative() {
        Trader trader = new Trader("Ульрихь", "Швангау", "Германия");
        Transaction t = new Transaction(trader, 900);
        Assert.assertFalse(new FraudRule5().checkFraud(t));
    }

    @Test
    public void TestFraudRule5Positive() {
        Trader trader = new Trader("Ульрихь", "Швангау", "Германия");
        Transaction t = new Transaction(trader, 1001);
        Assert.assertTrue(new FraudRule5().checkFraud(t));
    }

}
