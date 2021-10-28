package student_vladislav_nikitin.lesson_8.level_1.task_4;

class SafeDemo {

    public static void main(String[] args) {
        Safe safe = new Safe();

        safe.password = "eiVaen1n";
        safe.moneyAmount = 4242;

        System.out.println("Safe password: " + safe.password);
        System.out.println("Safe money amount: " + safe.moneyAmount);
    }

}
