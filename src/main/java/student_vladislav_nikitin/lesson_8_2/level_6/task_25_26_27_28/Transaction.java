package student_vladislav_nikitin.lesson_8_2.level_6.task_25_26_27_28;

class Transaction {

    private Trader trader;
    private int amount;

    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "transaction={" + this.trader +
                "; amount=" + this.amount + ";}";
    }
}