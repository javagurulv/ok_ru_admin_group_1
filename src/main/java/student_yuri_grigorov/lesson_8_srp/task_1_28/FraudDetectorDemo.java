package student_yuri_grigorov.lesson_8_srp.task_1_28;

class FraudDetectorDemo {

    public static void main(String[] args) {
        FraudDetector detector = new FraudDetector(new FraudRule[] {
                new FraudRule1("Rule 1"),
                new FraudRule2("Rule 2"),
                new FraudRule3("Rule 3"),
                new FraudRule4("Rule 4"),
                new FraudRule5("Rule 5"),
        });
        Trader trader = new Trader("Pokemon", "Moscow");
        Transaction t = new Transaction(trader, 1000000);
        detector.isFraud(t);
        System.out.println(t);
    }
}
