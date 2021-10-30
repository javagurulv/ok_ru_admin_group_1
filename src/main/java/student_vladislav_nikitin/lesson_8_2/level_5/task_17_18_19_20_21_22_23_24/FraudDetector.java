package student_vladislav_nikitin.lesson_8_2.level_5.task_17_18_19_20_21_22_23_24;

import java.util.Iterator;
import java.util.List;

class FraudDetector {

    private List<FraudRule> fraudRules;

    public FraudDetector(List<FraudRule> fraudRules) {
        this.fraudRules = fraudRules;
    }

    boolean isFraud(Transaction t) {
        for (Iterator<FraudRule> iterator = this.fraudRules.iterator(); iterator.hasNext(); ) {
            FraudRule rule = iterator.next();
            if (rule.isFraud(t)) {
                return true;
            }
        }
        return false;
    }

}