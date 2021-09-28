package student_yuri_grigorov.lesson_8.level_1.task_5;

import java.util.Scanner;

class Safe2 {
    private String password;
    private double moneyAmount;

    public Safe2() {
        password = "pa$$word";
        moneyAmount = 0d;
    }

    public double getMoney(String password) {
        if (checkPassword(password)) {
            return moneyAmount;
        }
        return -1;
    }

    public void putMoney(double moneyAmount, String password) {
        if (checkPassword(password)) {
            this.moneyAmount = moneyAmount;
        }
    }

    private Boolean checkPassword(String password) {
        return password.equals(this.password);
    }
}
