package student_vladislav_nikitin.lesson_8_2.level_5.task_17_18_19_20_21_22_23_24;

class FraudRule2Test {

    public void isFraudPositiveTest() {
        boolean expectedResult = true;

        Trader testTrader = new Trader("James", "Seattle", "USA");
        Transaction testTransaction = new Transaction(testTrader, 1500000);
        FraudRule2 fraudRule2 = new FraudRule2("rule2");
        boolean result = fraudRule2.isFraud(testTransaction);

        String fullOutOfTest = "Rule 2 positive = ";
        System.out.println((result == expectedResult) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

    public void isFraudNegativeTest() {
        boolean expectedResult = false;

        Trader testTrader = new Trader("James", "Seattle", "USA");
        Transaction testTransaction = new Transaction(testTrader, 95);
        FraudRule2 fraudRule2 = new FraudRule2("rule2");
        boolean result = fraudRule2.isFraud(testTransaction);

        String fullOutOfTest = "Rule 2 negative = ";
        System.out.println((result == expectedResult) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

}
