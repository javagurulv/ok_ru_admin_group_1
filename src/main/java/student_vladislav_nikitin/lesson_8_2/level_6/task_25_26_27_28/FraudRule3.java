package student_vladislav_nikitin.lesson_8_2.level_6.task_25_26_27_28;

import java.util.Arrays;
import java.util.List;

class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        List<String> badCities = Arrays.asList("Sydney");
        return FraudChecks.isBadTraderCity(t, badCities);
    }

}
