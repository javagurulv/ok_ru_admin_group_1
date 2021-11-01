package student_vladislav_nikitin.lesson_8_2.level_2.task_7_8;

class FraudDetector {

    boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        String traderName = trader.getFullName();
        if (traderName.equals("Pokemon")) {
            return true;
        }

        return false;
    }

}