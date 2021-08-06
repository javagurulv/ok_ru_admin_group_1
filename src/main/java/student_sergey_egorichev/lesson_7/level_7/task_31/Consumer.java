package student_sergey_egorichev.lesson_7.level_7.task_31;

public class Consumer {
    final String firstName;
    final String lastName;
    int moneyDebt;

    public Consumer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.moneyDebt = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMoneyDebt() {
        return moneyDebt;
    }

    public void setMoneyDebt(int moneyDebt) {
        this.moneyDebt = moneyDebt;
    }
}
