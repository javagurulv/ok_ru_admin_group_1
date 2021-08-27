package student_yuri_grigorov.lesson_4.level_4_junior.task_11_15;

class CalculatorDemo {
    public static void main(String[] args) {
        int a = 12;
        int b = 7;
        Calculator calc = new Calculator();
        System.out.println("add: " + calc.add(a, b));
        System.out.println("sub: " + calc.sub(a, b));
        System.out.println("mul: " + calc.mul(a, b));
        System.out.println("div: " + calc.div(a, b));
        System.out.println(a + " isEven: " + calc.isEven(a));
        System.out.println(b + " isEven: " + calc.isEven(b));
    }
}
