package student_yuri_grigorov.lesson_8.level_1.task_4;

class SafeDemo {

    public static void main(String[] args) {
        Safe safe = new Safe();
        safe.password = "new_pa$$word";
        safe.moneyAmount = 1000000;
        System.out.println("Safe password: " + safe.password);
        System.out.println("Amount of money in the safe: " + safe.moneyAmount);
    }
}
