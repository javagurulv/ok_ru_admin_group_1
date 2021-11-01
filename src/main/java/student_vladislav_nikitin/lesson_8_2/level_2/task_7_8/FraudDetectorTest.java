package student_vladislav_nikitin.lesson_8_2.level_2.task_7_8;

class FraudDetectorTest {

    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();

        fraudDetectorTest.isFraudPositiveTest();
        fraudDetectorTest.isFraudNegativeTest();
    }

    void isFraudPositiveTest() {
        boolean expectedResult = true;

        Trader testTrader = new Trader("Pokemon", "Japan");
        Transaction testTransaction = new Transaction(testTrader, 42);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(testTransaction);

        testResult(result == expectedResult, "isFraud positive");
    }

    void isFraudNegativeTest() {
        boolean expectedResult = false;

        Trader testTrader = new Trader("James", "USA");
        Transaction testTransaction = new Transaction(testTrader, 209);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(testTransaction);

        testResult(result == expectedResult, "isFraud negative");
    }

    private void testResult(boolean condition, String nameOfTest) {
        String fullOutOfTest = nameOfTest + " = ";
        System.out.println(condition ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

}
