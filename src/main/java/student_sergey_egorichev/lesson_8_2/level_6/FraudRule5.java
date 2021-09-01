package student_sergey_egorichev.lesson_8_2.level_6;

public class FraudRule5 extends FraudRule {
    @Override
    public boolean checkFraud(Transaction t) {
        String forbiddenCountry = "Германия";
        int forbiddenAmount = 1000;
        if (forbiddenCountry.equals(t.getTrader().getCountry()) &&
                forbiddenAmount < t.getAmount()) {
            return true;
        }
        return false;
    }
}
