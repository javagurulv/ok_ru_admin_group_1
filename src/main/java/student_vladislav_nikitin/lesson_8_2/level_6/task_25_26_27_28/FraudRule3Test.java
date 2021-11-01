package student_vladislav_nikitin.lesson_8_2.level_6.task_25_26_27_28;

class FraudRule3Test {

    public void isFraudPositiveTest() {
        boolean expectedResult = true;

        Trader testTrader = new Trader("Lula", "Sydney", "Australia");
        Transaction testTransaction = new Transaction(testTrader, 452);
        FraudRule3 fraudRule3 = new FraudRule3("rule3");
        boolean result = fraudRule3.isFraud(testTransaction);

        String fullOutOfTest = "Rule 3 positive = ";
        System.out.println((result == expectedResult) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

    public void isFraudNegativeTest() {
        boolean expectedResult = false;

        Trader testTrader = new Trader("James", "Seattle", "USA");
        Transaction testTransaction = new Transaction(testTrader, 95);
        FraudRule3 fraudRule3 = new FraudRule3("rule3");
        boolean result = fraudRule3.isFraud(testTransaction);

        String fullOutOfTest = "Rule 3 negative = ";
        System.out.println((result == expectedResult) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

}
