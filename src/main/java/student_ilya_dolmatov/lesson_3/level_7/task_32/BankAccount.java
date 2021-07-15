package student_ilya_dolmatov.lesson_3.level_7.task_32;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BankAccount {
    String owner;
    int money;

    BankAccount(String owner, int moneyAmount) {
        this.owner = owner;
        this.money = moneyAmount;
    }

    String getOwner() {
        return this.owner;
    }

    String getMoney() {
        return Integer.toString(this.money);
    }
}
