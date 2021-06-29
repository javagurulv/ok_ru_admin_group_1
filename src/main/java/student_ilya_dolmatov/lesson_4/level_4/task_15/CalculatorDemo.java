package student_ilya_dolmatov.lesson_4.level_4.task_15;

class CalculatorDemo {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
        calculatorTest.isFirstGreaterTest();
        calculatorTest.isSecondGreaterTest();
        calculatorTest.isBothEqTest();

        Calculator check = new Calculator(5,2);
        System.out.println(check.maxOfTwoNumbers());
    }
}