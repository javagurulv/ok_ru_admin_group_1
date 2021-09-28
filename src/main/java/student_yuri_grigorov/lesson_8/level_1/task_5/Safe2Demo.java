package student_yuri_grigorov.lesson_8.level_1.task_5;

class Safe2Demo {
    public static void main(String[] args) {
        Safe2 safe2 = new Safe2();
        safe2.putMoney(1000000, "pa$$word");
        System.out.println("Amount of money in the safe: " + safe2.getMoney("pa$$word"));
    }
}
