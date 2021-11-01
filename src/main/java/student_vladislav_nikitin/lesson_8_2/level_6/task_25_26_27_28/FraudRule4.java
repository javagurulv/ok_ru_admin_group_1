package student_vladislav_nikitin.lesson_8_2.level_6.task_25_26_27_28;

import java.util.Arrays;
import java.util.List;

class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        List<String> badCountries = Arrays.asList("Jamaica");
        return FraudChecks.isBadTraderCountry(t, badCountries);
    }

}
