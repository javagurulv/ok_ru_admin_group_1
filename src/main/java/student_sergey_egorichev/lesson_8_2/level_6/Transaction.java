package student_sergey_egorichev.lesson_8_2.level_6;

class Transaction {

    private int amount;
    private Trader trader;

    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public Trader getTrader() {
        return trader;
    }

    public FraudDetectionResult isFraud() {
        return FraudDetector.isFraud(this);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", trader=" + trader.getFullName() +
                '}';
    }
}
