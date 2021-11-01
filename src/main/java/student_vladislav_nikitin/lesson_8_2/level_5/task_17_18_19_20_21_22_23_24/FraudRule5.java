package student_vladislav_nikitin.lesson_8_2.level_5.task_17_18_19_20_21_22_23_24;

import java.util.Arrays;
import java.util.List;

class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        List<String> badCountries = Arrays.asList("Germany");
        int maxAmount = 1000;
        return (FraudChecks.isBadTraderCountry(t, badCountries) && FraudChecks.isBadMaxAmountTransaction(t, maxAmount));
    }

}
