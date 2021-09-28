package student_yuri_grigorov.lesson_8.level_1.task_7;

/**
 * Можно ли применять идентификатор доступа private на уровне класса?
 *
 * Да можно если этот класс вложеный
 */

class PrivateClass1 {

    private class InnerPrivateClass1 {
        void display() {
            System.out.println("Call from InnerPrivateClass1");
        }
    }

    void display() {
        System.out.println("Call from PrivateClass1");
        InnerPrivateClass1 innerPrivateClass1 = new InnerPrivateClass1();
        innerPrivateClass1.display();
    }
}

class Main {
    public static void main(String[] args) {
        PrivateClass1 privateClass1 = new PrivateClass1();
        privateClass1.display();
    }
}
