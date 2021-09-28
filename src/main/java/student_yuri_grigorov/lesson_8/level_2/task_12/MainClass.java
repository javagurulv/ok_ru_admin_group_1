package student_yuri_grigorov.lesson_8.level_2.task_12;

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

/**
 * При создании экземляра класса вызывется дефолтный конструктор класса и всех классов,
 * которые учвствуют в цепочке наследования.
 */
public class MainClass {
    public static void main(String[] args) {
        C c = new C();
    }
}
