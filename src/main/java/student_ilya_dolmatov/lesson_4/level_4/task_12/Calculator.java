package student_ilya_dolmatov.lesson_4.level_4.task_12;

class Calculator {
    int firstNumber = 5;
    int secondNumber = 2;

    Calculator(){}

    Calculator(int firstNumber, int secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    int sum() {
        return this.firstNumber + this.secondNumber;
    }
    int sub() {
        return this.firstNumber - this.secondNumber;
    }
    int mul() {
        return this.firstNumber * this.secondNumber;
    }
    int div() {
        return this.firstNumber / this.secondNumber;
    }

     void sumTest() {
        int expectedResult = 7;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum();
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    void subTest() {
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub();
        if (realResult == expectedResult) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }
    void mulTest() {
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul();
        if (realResult == expectedResult) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }
    }
    void divTest() {
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.div();
        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }
}
