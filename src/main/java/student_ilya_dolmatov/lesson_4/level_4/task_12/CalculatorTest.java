package student_ilya_dolmatov.lesson_4.level_4.task_12;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CalculatorTest {
    public static void main(String[] args) {

        Calculator calculatorTest = new Calculator();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();

        Calculator calculator = new Calculator(30,10);
        System.out.println(calculator.sum());
        System.out.println(calculator.sub());
        System.out.println(calculator.mul());
        System.out.println(calculator.div());

    }
}
