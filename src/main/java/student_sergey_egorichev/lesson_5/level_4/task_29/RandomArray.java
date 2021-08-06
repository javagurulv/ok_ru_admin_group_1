package student_sergey_egorichev.lesson_5.level_4.task_29;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RandomArray {

    public static void main(String[] args) {

        int arrayLength = (int) ((Math.random() * 10) + 3);
        int[] myArray = generateArray(arrayLength);

        printArray(myArray);
        printArray(getEven(myArray));

    }

    private static int[] generateArray(int length) {
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = (int) (Math.random()*100);
        }
        return numbers;
    }

    private static void printArray(int [] someArray) {
        for (int i = 0; i < someArray.length; i ++) {
            System.out.print(someArray[i] + " ");
        }
        System.out.print("\n");
    }

    private static int[] getEven(int[] someArray) {
        int evenArrayLength = countEventNumbers(someArray);
        int[] evenArray = new int[evenArrayLength];
		fillEvenNumbers(someArray, evenArray);
        return evenArray;
    }

    private static void fillEvenNumbers(int[] someArray,
										int[] evenNumbers) {
		int evenCount = 0;
		for (int i = 0; i < someArray.length; i ++) {
			if (isEven(someArray[i])) {
				evenNumbers[evenCount] = someArray[i];
				evenCount ++;
			}
		}
	}

    private static int countEventNumbers(int[] arr) {
		int evenArrayLength = 0;
		for (int i = 0; i < arr.length; i ++) {
			if (isEven(arr[i])) {
				evenArrayLength ++;
			}
		}
		return evenArrayLength;
	}

	private static boolean isEven(int number) {
    	return number % 2 == 0;
	}

}
