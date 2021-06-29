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
        calculatorTest.firstOfThreeTest();
        calculatorTest.secondOfThreeTest();
        calculatorTest.thirdOfThreeTest();
        calculatorTest.firstTwoOfThreeTest();
        calculatorTest.equalOfThreeTest();

        Calculator checkTwo = new Calculator(5,2);
        System.out.println(checkTwo.maxOfTwoNumbers());
        Calculator checkThree = new Calculator(5,3,8);
        System.out.println(checkThree.maxOfThreeNumbers());
    }
}