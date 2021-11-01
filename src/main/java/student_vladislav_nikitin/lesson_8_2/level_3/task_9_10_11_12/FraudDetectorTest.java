package student_vladislav_nikitin.lesson_8_2.level_3.task_9_10_11_12;

class FraudDetectorTest {

    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();

        fraudDetectorTest.isFraudTraderNamePositiveTest();
        fraudDetectorTest.isFraudTraderNameNegativeTest();
        fraudDetectorTest.isFraudTraderCityPositiveTest();
        fraudDetectorTest.isFraudTraderCityNegativeTest();
        fraudDetectorTest.isFraudMaxTransactionAmountPositiveTest();
        fraudDetectorTest.isFraudMaxTransactionAmountNegativeTest();
    }

    void isFraudTraderNamePositiveTest() {
        boolean expectedResult = true;

        Trader testTrader = new Trader("Pokemon", "Japan");
        Transaction testTransaction = new Transaction(testTrader, 42);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(testTransaction);

        testResult(result == expectedResult, "isFraud Trader name positive");
    }

    void isFraudTraderNameNegativeTest() {
        boolean expectedResult = false;

        Trader testTrader = new Trader("James", "USA");
        Transaction testTransaction = new Transaction(testTrader, 209);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(testTransaction);

        testResult(result == expectedResult, "isFraud Trader name negative");
    }

    void isFraudTraderCityPositiveTest() {
        boolean expectedResult = true;

        Trader testTrader = new Trader("Lula", "Sydney");
        Transaction testTransaction = new Transaction(testTrader, 42);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(testTransaction);

        testResult(result == expectedResult, "isFraud Trader city positive");
    }

    void isFraudTraderCityNegativeTest() {
        boolean expectedResult = false;

        Trader testTrader = new Trader("James", "USA");
        Transaction testTransaction = new Transaction(testTrader, 209);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(testTransaction);

        testResult(result == expectedResult, "isFraud Trader city negative");
    }

    void isFraudMaxTransactionAmountPositiveTest() {
        boolean expectedResult = true;

        Trader testTrader = new Trader("James", "USA");
        Transaction testTransaction = new Transaction(testTrader, 1000001);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(testTransaction);

        testResult(result == expectedResult, "isFraud max Transaction amount negative");
    }

    void isFraudMaxTransactionAmountNegativeTest() {
        boolean expectedResult = false;

        Trader testTrader = new Trader("James", "USA");
        Transaction testTransaction = new Transaction(testTrader, 209);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(testTransaction);

        testResult(result == expectedResult, "isFraud max Transaction amount negative");
    }

    private void testResult(boolean condition, String nameOfTest) {
        String fullOutOfTest = nameOfTest + " = ";
        System.out.println(condition ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

}
