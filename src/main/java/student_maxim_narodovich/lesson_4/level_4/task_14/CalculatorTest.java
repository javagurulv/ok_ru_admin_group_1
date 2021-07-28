package student_maxim_narodovich.lesson_4.level_4.task_14;


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
}
