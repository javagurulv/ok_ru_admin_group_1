package student_vladislav_nikitin.lesson_8_2.level_6.task_25_26_27_28;

import java.util.Arrays;
import java.util.List;

class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        List<String> badNames = Arrays.asList("Pokemon");
        return FraudChecks.isBadTraderName(t, badNames);
    }

}
