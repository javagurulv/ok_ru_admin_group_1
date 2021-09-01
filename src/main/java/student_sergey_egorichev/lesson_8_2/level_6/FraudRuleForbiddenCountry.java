package student_sergey_egorichev.lesson_8_2.level_6;

import java.util.Arrays;
import java.util.List;

class FraudRuleForbiddenCountry extends FraudRule{
    @Override
    public boolean checkFraud(Transaction t) {
        List<String> forbiddenCountries = Arrays.asList("Ямайка");
        return forbiddenCountries.stream().anyMatch(country -> t.getTrader().getCountry().contains(country));
    }
}
