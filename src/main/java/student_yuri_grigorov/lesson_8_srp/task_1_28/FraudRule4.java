package student_yuri_grigorov.lesson_8_srp.task_1_28;

class FraudRule4  extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        String country = t.getTrader().getCountry();
        return country != null
                && country.equals("Ямайка");
    }
}
