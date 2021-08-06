package student_petr_zaytsev.lesson_4.level_4;

public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.multiplyTest();
        calculatorTest.subtractTest();
        calculatorTest.divideTest();
        calculatorTest.evenTest();
        calculatorTest.maxOfTwoNumbersTest();
        calculatorTest.AllEquals();
        calculatorTest.FirstLastEquals();
        calculatorTest.LastTwoEquals();
        calculatorTest.FirstTwoEquals();
        calculatorTest.ThirdIsBigger();
        calculatorTest.SecondIsBigger();
        calculatorTest.FirstIsBigger();
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
    public void multiplyTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiply(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Multiply test = OK");
        } else {
            System.out.println("Multiply test = FAIL");
        }
    }

    public void subtractTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtract(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Subtract test = OK");
        } else {
            System.out.println("Subtract test = FAIL");
        }
    }

    public void divideTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.divide(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Divide test = OK");
        } else {
            System.out.println("Divide test = FAIL");
        }
    }

    public void evenTest() {
        int x = 10;
        int y = 5;

        Calculator calculator = new Calculator();
        boolean evenResult = calculator.isEven(x);
        boolean unevenResult = calculator.isEven(y);

        if ((evenResult == true) && (unevenResult == false)) {
            System.out.println("Even test = OK");
        } else {
            System.out.println("Even test = FAIL");
        }
    }

    public void maxOfTwoNumbersTest() {
        int x = 10;
        int y = 5;

        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(x, y);

        if (result == x) {
            System.out.println("maxOfTwoNumbersTest test = OK");
        } else {
            System.out.println("maxOfTwoNumbersTest test = FAIL");
        }
    }

    public void FirstIsBigger() {
        int x = 100;
        int y = 5;
        int z = 20;

        Calculator calculator = new Calculator();
        int result = calculator.CompareThreeIntegers(x, y, z);

        if (result == x) {
            System.out.println("FirstIsBigger test = OK");
        } else {
            System.out.println("FirstIsBigger test = FAIL ");
        }
    }

    public void SecondIsBigger() {
        int x = 100;
        int y = 500;
        int z = 20;

        Calculator calculator = new Calculator();
        int result = calculator.CompareThreeIntegers(x, y, z);

        if (result == y) {
            System.out.println("SecondIsBigger test = OK");
        } else {
            System.out.println("SecondIsBigger test = FAIL ");
        }
    }

    public void ThirdIsBigger() {
        int x = 100;
        int y = 500;
        int z = 2000;

        Calculator calculator = new Calculator();
        int result = calculator.CompareThreeIntegers(x, y, z);

        if (result == z) {
            System.out.println("ThirdIsBigger test = OK");
        } else {
            System.out.println("ThirdIsBigger test = FAIL ");
        }
    }

    public void FirstTwoEquals() {
        int x = 100;
        int y = 100;
        int z = 2000;

        Calculator calculator = new Calculator();
        int result = calculator.CompareThreeIntegers(x, y, z);

        if (result == z) {
            System.out.println("FirstTwoEquals test = OK");
        } else {
            System.out.println("FirstTwoEquals test = FAIL ");
        }
    }

    public void LastTwoEquals() {
        int x = 0;
        int y = 100;
        int z = 100;

        Calculator calculator = new Calculator();
        int result = calculator.CompareThreeIntegers(x, y, z);

        if (result == z) {
            System.out.println("LastTwoEquals test = OK");
        } else {
            System.out.println("LastTwoEquals test = FAIL");
        }
    }

    public void FirstLastEquals() {
        int x = 100;
        int y = 8;
        int z = 100;

        Calculator calculator = new Calculator();
        int result = calculator.CompareThreeIntegers(x, y, z);

        if (result == z) {
            System.out.println("FirstLastEquals test = OK");
        } else {
            System.out.println("FirstLastEquals test = FAIL");
        }
    }

    public void AllEquals() {
        int x = 100;
        int y = 100;
        int z = 100;

        Calculator calculator = new Calculator();
        int result = calculator.CompareThreeIntegers(x, y, z);

        if (result == z) {
            System.out.println("AllEquals test = OK");
        } else {
            System.out.println("AllEquals test = FAIL");
        }
    }

}
