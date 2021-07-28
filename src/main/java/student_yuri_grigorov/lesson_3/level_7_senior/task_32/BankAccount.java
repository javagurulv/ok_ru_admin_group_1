package student_yuri_grigorov.lesson_3.level_7_senior.task_32;

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
        return String.valueOf(this.money);
    }

}
