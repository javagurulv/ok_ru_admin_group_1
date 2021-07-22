package student_maxim_narodovich.lesson_4.level_4.task_15;

public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.divisionTest();
        calculatorTest.evenTest();
        calculatorTest.maxOfTwoNumbersTest1();
        calculatorTest.maxOfTwoNumbersTest2();
        calculatorTest.maxOfTwoNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest1();
        calculatorTest.maxOfThreeNumbersTest2();
        calculatorTest.maxOfThreeNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest4();
        calculatorTest.maxOfThreeNumbersTest5();
        calculatorTest.maxOfThreeNumbersTest6();
        calculatorTest.maxOfThreeNumbersTest7();
        // по аналогии реализуйте тесты для остальных методов
    }

    public void sumTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 15;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    public void subtractionTest() {
        int firstNumber = 17;  // подготавливаем тестовые данные
        int secondNumber = 3;  // подготавливаем тестовые данные
        int expectedResult = 14;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.subtraction(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("subtraction test = OK");
        } else {
            System.out.println("subtraction test = FAIL");
        }
    }
    public void multiplicationTest() {
        int firstNumber = 7;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 35;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("multiplication test = OK");
        } else {
            System.out.println("multiplication test = FAIL");
        }
    }
    public void divisionTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        double expectedResult = 2;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        double realResult = calculator.division(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("division test = OK");
        } else {
            System.out.println("division test = FAIL");
        }
    }
    public void evenTest() {
        int digit = 7;
        boolean expectedResult = false;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(digit);
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("even test = OK");
        } else {
            System.out.println("even test = FAIL");
        }
    }
    public void maxOfTwoNumbersTest1() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 10;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("maxOfTwoNumbers test 1 = OK");
        } else {
            System.out.println("maxOfTwoNumbers test 1 = FAIL");
        }
    }
    public void maxOfTwoNumbersTest2() {
        int firstNumber = 7;  // подготавливаем тестовые данные
        int secondNumber = 14;  // подготавливаем тестовые данные
        int expectedResult = 14;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("maxOfTwoNumbers test 1 = OK");
        } else {
            System.out.println("maxOfTwoNumbers test 1 = FAIL");
        }
    }
    public void maxOfTwoNumbersTest3() {
        int firstNumber = 42;  // подготавливаем тестовые данные
        int secondNumber = 42;  // подготавливаем тестовые данные
        int expectedResult = 42;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("maxOfTwoNumbers test 1 = OK");
        } else {
            System.out.println("maxOfTwoNumbers test 1 = FAIL");
        }
    }
    public void maxOfThreeNumbersTest1() {
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 15;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("maxOfThreeNumbers test 1 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test 1 = FAIL");
        }
    }
    public void maxOfThreeNumbersTest2() {
        int firstNumber = 433;
        int secondNumber = 1111;
        int thirdNumber = 15;
        int expectedResult = 1111;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("maxOfThreeNumbers test 2 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test 2 = FAIL");
        }
    }
    public void maxOfThreeNumbersTest3() {
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 134;
        int expectedResult = 134;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("maxOfThreeNumbers test 3 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test 3 = FAIL");
        }
    }
    public void maxOfThreeNumbersTest4() {
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("maxOfThreeNumbers test 4 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test 4 = FAIL");
        }
    }
    public void maxOfThreeNumbersTest5() {
        int firstNumber = 43;
        int secondNumber = 43;
        int thirdNumber = 2;
        int expectedResult = 43;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("maxOfThreeNumbers test 5 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test 5 = FAIL");
        }
    }
    public void maxOfThreeNumbersTest6() {
        int firstNumber = 5;
        int secondNumber = 134;
        int thirdNumber = 134;
        int expectedResult = 134;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("maxOfThreeNumbers test 6 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test 6 = FAIL");
        }
    }
    public void maxOfThreeNumbersTest7() {
        int firstNumber = 444;
        int secondNumber = 444;
        int thirdNumber = 444;
        int expectedResult = 444;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("maxOfThreeNumbers test 7 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test 7 = FAIL");
        }
    }

}
