package student_vladislav_nikitin.lesson_8_2.level_6.task_25_26_27_28;

import java.util.List;

class FraudChecks {

    static public boolean isBadTraderName(Transaction t, List<String> badNames) {
        Trader trader = t.getTrader();
        String traderName = trader.getFullName();
        if (badNames.contains(traderName)) {
            return true;
        }
        return false;
    }

    static public boolean isBadTraderCity(Transaction t, List<String> badCities) {
        Trader trader = t.getTrader();
        String traderCity = trader.getCity();
        if (badCities.contains(traderCity)) {
            return true;
        }
        return false;
    }

    static public boolean isBadTraderCountry(Transaction t, List<String> badCountries) {
        Trader trader = t.getTrader();
        String traderCountry = trader.getCountry();
        if (badCountries.contains(traderCountry)) {
            return true;
        }
        return false;
    }

    static public boolean isBadMaxAmountTransaction(Transaction t, int maxAmount) {
        int transactionAmount = t.getAmount();
        if (transactionAmount > maxAmount) {
            return true;
        }
        return false;
    }

    static public boolean isBadMinAmountTransaction(Transaction t, int minAmount) {
        int transactionAmount = t.getAmount();
        if (transactionAmount < minAmount) {
            return true;
        }
        return false;
    }

}
