package student_sergey_egorichev.lesson_8_2.level_6;

import java.util.Arrays;
import java.util.List;

class FraudRuleFakeTrader extends FraudRule {
    @Override
    public boolean checkFraud(Transaction t) {
        List<String> fakeTrader = Arrays.asList("Pokemon");
        return fakeTrader.stream().anyMatch(trader -> t.getTrader().getFullName().contains(trader));
    }

}
