package student_vladislav_nikitin.lesson_8_2.level_5.task_17_18_19_20_21_22_23_24;

import java.util.Arrays;
import java.util.List;

class FraudDetectorTest {

    private class FakeFraudRule1 extends FraudRule {

        public FakeFraudRule1(String ruleName) {
            super(ruleName);
        }

        public boolean isFraud(Transaction t) {
            List<String> badCities = Arrays.asList("Moscow");
            int maxAmount = 10000;
            return (FraudChecks.isBadTraderCity(t, badCities) && FraudChecks.isBadMaxAmountTransaction(t, maxAmount));
        }

    }

    private class FakeFraudRule2 extends FraudRule {

        public FakeFraudRule2(String ruleName) {
            super(ruleName);
        }

        public boolean isFraud(Transaction t) {
            List<String> badNames = Arrays.asList("Josh", "Michael");
            return FraudChecks.isBadTraderName(t, badNames);
        }

    }

    void isFraudPositiveTest() {
        boolean expectedResult = true;

        Trader testTrader = new Trader("Michael", "Havana", "Cuba");
        Transaction testTransaction = new Transaction(testTrader, 432);
        List<FraudRule> testRules = Arrays.asList(new FakeFraudRule1("fake rule 1"), new FakeFraudRule2("fake rule 2"));
        FraudDetector fraudDetector = new FraudDetector(testRules);

        boolean result = fraudDetector.isFraud(testTransaction);

        String fullOutOfTest = "FraudDetector isFraud should be true = ";
        System.out.println((result == expectedResult) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

    void isFraudNegativeTest() {
        boolean expectedResult = false;

        Trader testTrader = new Trader("Barbora", "Yokohama", "Japan");
        Transaction testTransaction = new Transaction(testTrader, 673);
        List<FraudRule> testRules = Arrays.asList(new FakeFraudRule1("fake rule 1"), new FakeFraudRule2("fake rule 2"));
        FraudDetector fraudDetector = new FraudDetector(testRules);

        boolean result = fraudDetector.isFraud(testTransaction);

        String fullOutOfTest = "FraudDetector isFraud should be false = ";
        System.out.println((result == expectedResult) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

}
