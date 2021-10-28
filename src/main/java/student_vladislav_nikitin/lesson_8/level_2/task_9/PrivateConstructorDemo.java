package student_vladislav_nikitin.lesson_8.level_2.task_9;

class PrivateConstructorDemo {

    public static void main(String[] args) {
        // Создание экзмепляра класса ниже работать не будет. Конструктор имеет модификатор доступа private.
        // PrivateConstructor privateConstructor = new PrivateConstructor(16);

        // А так будет, перегруженный конструктор имеет модификатор доступа public.
        PrivateConstructor secondPrivateConstructor = new PrivateConstructor(42, "string");
    }

}
