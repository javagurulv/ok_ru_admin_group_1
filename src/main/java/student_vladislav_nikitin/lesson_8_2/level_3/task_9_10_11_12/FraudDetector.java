package student_vladislav_nikitin.lesson_8_2.level_3.task_9_10_11_12;

class FraudDetector {

    boolean isFraud(Transaction t) {
        if (isBadTraderName(t) || isBadTraderCity(t) || isBadAmountMaxTransaction(t)) {
            return true;
        }
        return false;
    }

    private boolean isBadTraderName(Transaction t) {
        String badTraderName = "Pokemon";

        Trader trader = t.getTrader();
        String traderName = trader.getFullName();
        if (traderName.equals(badTraderName)) {
            return true;
        }
        return false;
    }

    private boolean isBadTraderCity(Transaction t) {
        String badTraderCity = "Sydney";

        Trader trader = t.getTrader();
        String traderCity = trader.getCity();
        if (traderCity.equals(badTraderCity)) {
            return true;
        }
        return false;
    }

    private boolean isBadAmountMaxTransaction(Transaction t) {
        int maxTransactionAmount = 1000000;

        int transactionAmount = t.getAmount();
        if (transactionAmount > maxTransactionAmount) {
            return true;
        }
        return false;
    }

}