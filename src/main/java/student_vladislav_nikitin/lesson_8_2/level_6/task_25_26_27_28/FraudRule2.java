package student_vladislav_nikitin.lesson_8_2.level_6.task_25_26_27_28;

class FraudRule2 extends FraudRule {

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        int maxAmount = 1000000;
        return FraudChecks.isBadMaxAmountTransaction(t, maxAmount);
    }

}
