package student_sergey_egorichev.lesson_8_2.level_6;

import java.util.Arrays;
import java.util.List;

class FraudRuleForbiddenCity extends FraudRule {
    @Override
    public boolean checkFraud(Transaction t) {
        List<String> forbiddenCities = Arrays.asList("Сидней");
        return forbiddenCities.stream().anyMatch(city -> t.getTrader().getCity().contains(city));
    }
}
