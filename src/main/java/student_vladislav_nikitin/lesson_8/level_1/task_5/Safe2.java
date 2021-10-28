package student_vladislav_nikitin.lesson_8.level_1.task_5;

class Safe2 {
    private String password;
    private int moneyAmount;

    public Safe2(String password, int moneyAmount) {
        this.password = password;
        this.moneyAmount = moneyAmount;
    }

    public int getMoney(String password) {
        if (checkPassword(password)) {
            return 0;
        }

        return this.moneyAmount;
    }

    public void putMoney(String password, int newMoney) {
        if (checkPassword(password)) {
            return;
        };

        this.moneyAmount = this.moneyAmount + newMoney;
    }

    private boolean checkPassword(String password) {
        if (! password.equals(this.password)) {
            System.err.println("Wrong password");
            return false;
        }
        return true;
    }

}
