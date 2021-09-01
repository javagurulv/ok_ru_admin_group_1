package student_sergey_egorichev.lesson_8_2.level_6;

abstract class FraudRule {
    String ruleName = this.getClass().getSimpleName();

    abstract public boolean checkFraud(Transaction t);

    public String getRuleName() {
        return ruleName;
    }
}