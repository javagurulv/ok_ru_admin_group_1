package student_vladislav_nikitin.lesson_8_2.level_4.task_13_14_15_16;

import java.util.Arrays;
import java.util.List;

class FraudDetector {

    boolean isFraud(Transaction t) {
        if (rule1(t) || rule2(t) || rule3(t) || rule4(t) || rule5(t)) {
            return true;
        }
        return false;
    }

    private boolean rule1(Transaction t) {
        List<String> badNames = Arrays.asList("Pokemon");
        return isBadTraderName(t, badNames);
    }

    private boolean rule2(Transaction t) {
        int maxAmount = 1000000;
        return isBadMaxAmountTransaction(t, maxAmount);
    }

    private boolean rule3(Transaction t) {
        List<String> badCities = Arrays.asList("Sydney");
        return isBadTraderCity(t, badCities);
    }

    private boolean rule4(Transaction t) {
        List<String> badCountries = Arrays.asList("Jamaica");
        return isBadTraderCountry(t, badCountries);
    }

    private boolean rule5(Transaction t) {
        List<String> badCountries = Arrays.asList("Germany");
        int maxAmount = 1000;
        return (isBadTraderCountry(t, badCountries) && isBadMaxAmountTransaction(t, maxAmount));
    }

    private boolean isBadTraderName(Transaction t, List<String> badNames) {
        Trader trader = t.getTrader();
        String traderName = trader.getFullName();
        if (badNames.contains(traderName)) {
            return true;
        }
        return false;
    }

    private boolean isBadTraderCity(Transaction t, List<String> badCities) {
        Trader trader = t.getTrader();
        String traderCity = trader.getCity();
        if (badCities.contains(traderCity)) {
            return true;
        }
        return false;
    }

    private boolean isBadTraderCountry(Transaction t, List<String> badCountries) {
        Trader trader = t.getTrader();
        String traderCountry = trader.getCountry();
        if (badCountries.contains(traderCountry)) {
            return true;
        }
        return false;
    }

    private boolean isBadMaxAmountTransaction(Transaction t, int maxAmount) {
        int transactionAmount = t.getAmount();
        if (transactionAmount > maxAmount) {
            return true;
        }
        return false;
    }

    private boolean isBadMinAmountTransaction(Transaction t, int minAmount) {
        int transactionAmount = t.getAmount();
        if (transactionAmount < minAmount) {
            return true;
        }
        return false;
    }


}