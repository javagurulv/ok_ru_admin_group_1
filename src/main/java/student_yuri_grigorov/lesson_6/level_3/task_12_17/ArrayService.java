package student_yuri_grigorov.lesson_6.level_3.task_12_17;

class ArrayService {
    public boolean contains(int[] array, int numberToSearch) {
        for (int i : array) {
            if (i == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    public int countOccurrences(int[] arr, int numberToSearch) {
        int occurrences = 0;
        for (int i : arr) {
            if (i == numberToSearch) {
                occurrences++;
            }
        }
        return occurrences;
    }

    public boolean replaceFirst(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if  (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    public int replaceAll(int[] arr, int numberToReplace, int newNumber) {
        int replaceCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if  (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                replaceCount++;
            }
        }
        return replaceCount;
    }

    public void revert(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int tmp;
        while (j > i) {
            tmp = arr[j];
            arr[j] = arr[i];
            arr[i] = tmp;
            j--;
            i++;
        }
    }

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public void printArrayToConsole(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Arr element = " + arr[i]);
        }
    }
}
