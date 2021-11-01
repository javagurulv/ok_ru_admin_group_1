package student_vladislav_nikitin.lesson_8_2.level_5.task_17_18_19_20_21_22_23_24;

public class FraudRule1Test {

    public void isFraudPositiveTest() {
        boolean expectedResult = true;

        Trader testTrader = new Trader("Pokemon", "Tokyo", "Japan");
        Transaction testTransaction = new Transaction(testTrader, 42);
        FraudRule1 fraudRule1 = new FraudRule1("rule1");
        boolean result = fraudRule1.isFraud(testTransaction);

        String fullOutOfTest = "Rule 1 positive = ";
        System.out.println((result == expectedResult) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

    public void isFraudNegativeTest() {
        boolean expectedResult = false;

        Trader testTrader = new Trader("James", "Seattle", "USA");
        Transaction testTransaction = new Transaction(testTrader, 95);
        FraudRule1 fraudRule1 = new FraudRule1("rule1");
        boolean result = fraudRule1.isFraud(testTransaction);

        String fullOutOfTest = "Rule 1 negative = ";
        System.out.println((result == expectedResult) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

}
