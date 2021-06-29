package student_ilya_dolmatov.lesson_4.level_4.task_14;

class Calculator {
        int firstNumber;
        int secondNumber;

        Calculator(int firstNumber, int secondNumber){
            this.firstNumber = firstNumber;
            this.secondNumber = secondNumber;
        }

        Calculator(int firstNumber){
            this.firstNumber = firstNumber;
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
        boolean isEven() {
            if (this.firstNumber % 2 == 0) { return true; } else { return false;}
        }
        int maxOfTwoNumbers() {
            if (firstNumber == secondNumber) {
                return firstNumber;
            } else if(firstNumber < secondNumber) {
                    return secondNumber;
            } else {
                return firstNumber;
            }
        }
}
