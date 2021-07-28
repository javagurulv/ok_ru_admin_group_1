package student_vladislav_nikitin.lesson_6.level_3.task_12_13_14_15_16_17;

class ArrayService {

    public boolean containsNumber(int[] array, int numberToFind) {
        for (int n: array) {
            if (n == numberToFind) {
                return true;
            }
        }
        return false;
    }

    public int countOccurrence(int[] array, int numberToCount) {
        int count = 0;
        for (int n: array) {
            if (n == numberToCount) {
                count++;
            }
        }
        return count;
    }

    public boolean replaceFirst(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    public boolean replaceAll(int[] array, int numberToReplace, int newNumber) {
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                flag = true;
            }
        }
        return flag;
    }

    public void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int oldElement = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = oldElement;
        }
    }
    
    public void sort(int[] array) {
        int oldElement;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j-1] > array[j]) {
                    oldElement = array[j-1];
                    array[j-1] = array[j];
                    array[j] = oldElement;
                }
            }
        }
    } 
}
