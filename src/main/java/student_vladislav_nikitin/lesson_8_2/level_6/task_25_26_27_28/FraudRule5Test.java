package student_vladislav_nikitin.lesson_8_2.level_6.task_25_26_27_28;

class FraudRule5Test {

    public void isFraudPositiveTest() {
        boolean expectedResult = true;

        Trader testTrader = new Trader("Ewald", "Frankfurt", "Germany");
        Transaction testTransaction = new Transaction(testTrader, 1520);
        FraudRule5 fraudRule5 = new FraudRule5("rule5");
        boolean result = fraudRule5.isFraud(testTransaction);

        String fullOutOfTest = "Rule 5 positive = ";
        System.out.println((result == expectedResult) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

    public void isFraudNegativeCountryTest() {
        boolean expectedResult = false;

        Trader testTrader = new Trader("Ewald", "Frankfurt", "Germany");
        Transaction testTransaction = new Transaction(testTrader, 95);
        FraudRule5 fraudRule5 = new FraudRule5("rule5");
        boolean result = fraudRule5.isFraud(testTransaction);

        String fullOutOfTest = "Rule 5 country negative = ";
        System.out.println((result == expectedResult) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

    public void isFraudNegativeAmountTest() {
        boolean expectedResult = false;

        Trader testTrader = new Trader("James", "Seattle", "USA");
        Transaction testTransaction = new Transaction(testTrader, 1700);
        FraudRule5 fraudRule5 = new FraudRule5("rule5");
        boolean result = fraudRule5.isFraud(testTransaction);

        String fullOutOfTest = "Rule 5 amount negative = ";
        System.out.println((result == expectedResult) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

}
