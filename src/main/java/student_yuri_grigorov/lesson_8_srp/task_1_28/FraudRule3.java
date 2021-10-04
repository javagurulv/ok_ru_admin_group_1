package student_yuri_grigorov.lesson_8_srp.task_1_28;

class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCity().equals("Сидней");
    }
}
