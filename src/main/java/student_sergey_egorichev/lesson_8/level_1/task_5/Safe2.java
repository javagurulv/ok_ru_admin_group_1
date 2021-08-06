package student_sergey_egorichev.lesson_8.level_1.task_5;

import java.util.Scanner;

class Safe2 {
    private String password;
    private Integer moneyAmount;

    public Safe2(String password, int moneyAmount) {
        this.password = password;
        this.moneyAmount = moneyAmount;
    }

    public Integer getMoneyAmount() {
        if (checkPassword()) {
            return this.moneyAmount;
        }
        return null;
    }

    public void setMoneyAmount(int moneyAmount) {
        if (checkPassword()) {
            this.moneyAmount = moneyAmount;
        }
    }

    private boolean checkPassword() {
        System.out.print("Введите пароль: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextLine().equals(password)) {
            return true;
        } else {
            return false;
        }
    }


}
