package student_vladislav_nikitin.lesson_8_2.level_6.task_25_26_27_28;

class FraudRule4Test {

    public void isFraudPositiveTest() {
        boolean expectedResult = true;

        Trader testTrader = new Trader("Harry", "Promore", "Jamaica");
        Transaction testTransaction = new Transaction(testTrader, 452);
        FraudRule4 fraudRule4 = new FraudRule4("rule4");
        boolean result = fraudRule4.isFraud(testTransaction);

        String fullOutOfTest = "Rule 4 positive = ";
        System.out.println((result == expectedResult) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

    public void isFraudNegativeTest() {
        boolean expectedResult = false;

        Trader testTrader = new Trader("James", "Seattle", "USA");
        Transaction testTransaction = new Transaction(testTrader, 95);
        FraudRule4 fraudRule4 = new FraudRule4("rule4");
        boolean result = fraudRule4.isFraud(testTransaction);

        String fullOutOfTest = "Rule 4 negative = ";
        System.out.println((result == expectedResult) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

}
