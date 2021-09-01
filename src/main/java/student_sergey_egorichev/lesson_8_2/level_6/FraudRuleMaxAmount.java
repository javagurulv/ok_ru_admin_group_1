package student_sergey_egorichev.lesson_8_2.level_6;

public class FraudRuleMaxAmount extends  FraudRule{
    @Override
    public boolean checkFraud(Transaction t) {
        if (t.getAmount() > 1000000) {
            return true;
        }
        return false;
    }
}

