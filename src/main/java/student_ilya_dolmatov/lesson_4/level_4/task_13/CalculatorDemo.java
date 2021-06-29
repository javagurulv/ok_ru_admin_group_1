package student_ilya_dolmatov.lesson_4.level_4.task_13;

class CalculatorDemo {
        public static void main(String[] args) {
            CalculatorTest calculatorTest = new CalculatorTest();
            calculatorTest.sumTest();
            calculatorTest.subTest();
            calculatorTest.mulTest();
            calculatorTest.divTest();
            calculatorTest.isEvenTest();

            Calculator calculator = new Calculator(10,20);
            System.out.println(calculator.sum());
            System.out.println(calculator.sub());

            int result = calculator.sub();
            Calculator checkEven = new Calculator(result);
            System.out.println(checkEven.IsEven());

        }
}
