package student_vladislav_nikitin.lesson_8_2.level_5.task_17_18_19_20_21_22_23_24;

class FraudRule2 extends FraudRule {

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        int maxAmount = 1000000;
        return FraudChecks.isBadMaxAmountTransaction(t, maxAmount);
    }

}
