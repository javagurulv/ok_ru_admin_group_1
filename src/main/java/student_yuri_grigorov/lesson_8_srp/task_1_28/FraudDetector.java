package student_yuri_grigorov.lesson_8_srp.task_1_28;

class FraudDetector {

    private final FraudRule[] rules;

    public FraudDetector(FraudRule[] rules) {
        this.rules = rules;
    }

    public FraudDetectionResult isFraud(Transaction t) {
        for (FraudRule rule : this.rules) {
            if (rule.isFraud(t)) {
                return new FraudDetectionResult(true, rule.getRuleName());
            }
        }
        return new FraudDetectionResult(false, null);
    }
}
