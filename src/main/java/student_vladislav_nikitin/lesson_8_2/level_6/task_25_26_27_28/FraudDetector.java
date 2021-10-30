package student_vladislav_nikitin.lesson_8_2.level_6.task_25_26_27_28;

import java.util.Iterator;
import java.util.List;

class FraudDetector {

    private List<FraudRule> fraudRules;

    public FraudDetector(List<FraudRule> fraudRules) {
        this.fraudRules = fraudRules;
    }

    FraudDetectionResult isFraud(Transaction t) {
        for (Iterator<FraudRule> iterator = this.fraudRules.iterator(); iterator.hasNext(); ) {
            FraudRule rule = iterator.next();
            if (rule.isFraud(t)) {
                System.out.println(t);
                return new FraudDetectionResult(true, rule.getRuleName());
            }
        }
        return new FraudDetectionResult(false, null);
    }

}