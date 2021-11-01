package student_vladislav_nikitin.lesson_8.level_2.task_12;

class A {
    public A() {
        System.out.println("Class A Constructor");
    }
}

class B extends A {
    public B() {
        System.out.println("Class B Constructor");
    }
}

class C extends B {
    public C() {
        System.out.println("Class C Constructor");
    }
}

/*
    Java по умолчанию добавляет super для запуска конструктора родителя,
    для его инициализации.
    Таким образом вызвались все конструкторы родителей в цепочке наследования.
 */
class MainClass {
    public static void main(String[] args) {
        C c = new C();
    }
}
