package student_vladislav_nikitin.lesson_8_2.level_4.task_13_14_15_16;

class FraudDetectorTest {

    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();

        fraudDetectorTest.isFraudRule1PositiveTest();
        fraudDetectorTest.isFraudRule1NegativeTest();

        fraudDetectorTest.isFraudRule2PositiveTest();
        fraudDetectorTest.isFraudRule2NegativeTest();

        fraudDetectorTest.isFraudRule3PositiveTest();
        fraudDetectorTest.isFraudRule3NegativeTest();

        fraudDetectorTest.isFraudRule4PositiveTest();
        fraudDetectorTest.isFraudRule4NegativeTest();

        fraudDetectorTest.isFraudRule5PositiveTest();
        fraudDetectorTest.isFraudRule5Negative1Test();
        fraudDetectorTest.isFraudRule5Negative2Test();
    }


    void isFraudRule1PositiveTest() {
        boolean expectedResult = true;

        Trader testTrader = new Trader("Pokemon", "Tokyo", "Japan");
        Transaction testTransaction = new Transaction(testTrader, 42);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(testTransaction);

        testResult(result == expectedResult, "isFraud rule1 positive");
    }

    void isFraudRule1NegativeTest() {
        boolean expectedResult = false;

        Trader testTrader = new Trader("James", "Seattle", "USA");
        Transaction testTransaction = new Transaction(testTrader, 209);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(testTransaction);

        testResult(result == expectedResult, "isFraud rule1 negative");
    }

    void isFraudRule2PositiveTest() {
        boolean expectedResult = true;

        Trader testTrader = new Trader("James", "Seattle", "USA");
        Transaction testTransaction = new Transaction(testTrader, 1000001);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(testTransaction);

        testResult(result == expectedResult, "isFraud rule2 negative");
    }

    void isFraudRule2NegativeTest() {
        boolean expectedResult = false;

        Trader testTrader = new Trader("James", "Seattle", "USA");
        Transaction testTransaction = new Transaction(testTrader, 209);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(testTransaction);

        testResult(result == expectedResult, "isFraud rule2 negative");
    }

    void isFraudRule3PositiveTest() {
        boolean expectedResult = true;

        Trader testTrader = new Trader("Lula", "Sydney", "Australia");
        Transaction testTransaction = new Transaction(testTrader, 42);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(testTransaction);

        testResult(result == expectedResult, "isFraud rule3 positive");
    }

    void isFraudRule3NegativeTest() {
        boolean expectedResult = false;

        Trader testTrader = new Trader("James", "Seattle", "USA");
        Transaction testTransaction = new Transaction(testTrader, 209);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(testTransaction);

        testResult(result == expectedResult, "isFraud rule3 negative");
    }

    void isFraudRule4PositiveTest() {
        boolean expectedResult = true;

        Trader testTrader = new Trader("Harry", "Promore", "Jamaica");
        Transaction testTransaction = new Transaction(testTrader, 42);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(testTransaction);

        testResult(result == expectedResult, "isFraud rule4 positive");
    }

    void isFraudRule4NegativeTest() {
        boolean expectedResult = false;

        Trader testTrader = new Trader("James", "Seattle", "USA");
        Transaction testTransaction = new Transaction(testTrader, 209);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(testTransaction);

        testResult(result == expectedResult, "isFraud rule4 negative");
    }

    void isFraudRule5PositiveTest() {
        boolean expectedResult = true;

        Trader testTrader = new Trader("Ewald", "Frankfurt", "Germany");
        Transaction testTransaction = new Transaction(testTrader, 1500);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(testTransaction);

        testResult(result == expectedResult, "isFraud rule5 positive");
    }

    void isFraudRule5Negative1Test() {
        boolean expectedResult = false;

        Trader testTrader = new Trader("Ewald", "Frankfurt", "Germany");
        Transaction testTransaction = new Transaction(testTrader, 750);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(testTransaction);

        testResult(result == expectedResult, "isFraud rule5 negative1");
    }

    void isFraudRule5Negative2Test() {
        boolean expectedResult = false;

        Trader testTrader = new Trader("James", "Seattle", "USA");
        Transaction testTransaction = new Transaction(testTrader, 1700);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(testTransaction);

        testResult(result == expectedResult, "isFraud rule5 negative2");
    }


    private void testResult(boolean condition, String nameOfTest) {
        String fullOutOfTest = nameOfTest + " = ";
        System.out.println(condition ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

}
