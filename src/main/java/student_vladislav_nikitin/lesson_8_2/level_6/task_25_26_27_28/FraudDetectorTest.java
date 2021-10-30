package student_vladislav_nikitin.lesson_8_2.level_6.task_25_26_27_28;

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
        FraudDetectionResult expectedResult = new FraudDetectionResult(true, "fake rule 2");

        Trader testTrader = new Trader("Michael", "Havana", "Cuba");
        Transaction testTransaction = new Transaction(testTrader, 432);
        List<FraudRule> testRules = Arrays.asList(new FakeFraudRule1("fake rule 1"), new FakeFraudRule2("fake rule 2"));
        FraudDetector fraudDetector = new FraudDetector(testRules);

        FraudDetectionResult result = fraudDetector.isFraud(testTransaction);

        String fullOutOfTest = "FraudDetector isFraud should be true = ";
        if ((expectedResult.isFraud() == result.isFraud()) &&
                (expectedResult.getRuleName() != null) &&
                (expectedResult.getRuleName().equals(result.getRuleName()) )) {
            fullOutOfTest += "OK";
        } else {
            fullOutOfTest += "FAIL";
        }
        System.out.println(fullOutOfTest);
    }

    void isFraudNegativeTest() {
        FraudDetectionResult expectedResult = new FraudDetectionResult(false, null);

        Trader testTrader = new Trader("Barbora", "Yokohama", "Japan");
        Transaction testTransaction = new Transaction(testTrader, 673);
        List<FraudRule> testRules = Arrays.asList(new FakeFraudRule1("fake rule 1"), new FakeFraudRule2("fake rule 2"));
        FraudDetector fraudDetector = new FraudDetector(testRules);

        FraudDetectionResult result = fraudDetector.isFraud(testTransaction);

        String fullOutOfTest = "FraudDetector isFraud should be false = ";
        if ((expectedResult.isFraud() == result.isFraud()) &&
                (expectedResult.getRuleName() == null) ) {
            fullOutOfTest += "OK";
        } else {
            fullOutOfTest += "FAIL";
        }
        System.out.println(fullOutOfTest);
    }

}
