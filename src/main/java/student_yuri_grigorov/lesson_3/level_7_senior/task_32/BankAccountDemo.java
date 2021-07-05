package student_yuri_grigorov.lesson_3.level_7_senior.task_32;

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        String moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }

}
