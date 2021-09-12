package student_ivan_buymov.lesson_5.level_6.task_34_40;

/*
class ArrayUtil {



}В классе ArrayUtilTest напишите автоматический тест
    для метода int findMaxNumber(int[] array)
    из предыдущего задания.

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
    }

    public void shouldCreateArray() {
        // Напишите реализацию !!!
    }

    public void shouldFindMaxNumber() {
        // Напишите реализацию !!!
    }
}Создайте в классе ArrayUtil метод для
    нахождения минимального числа в массиве целых чисел.

class ArrayUtil {

    public int findMinNumber(int[] array) {
        // Напишите реализацию !!!
    }

}В классе ArrayUtilTest напишите автоматический тест
    для метода int findMinNumber(int[] array)
    из предыдущего задания.

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        // Напишите реализацию !!!
    }

    public void shouldFindMaxNumber() {
        // Напишите реализацию !!!
    }

    public void shouldFindMinNumber() {
        // Напишите реализацию !!!
    }
}Проверьте весь ваш код и убедитесь, что у каждого цикла
        for есть фигурные скобки {} ограничивающие его тело.

        Хотя фигурные скодки {} при объявлении цикла for являются не обязательным элементом,
        указывать их в своей программе очень желательно. Фигурные скобки очень сильно облегчают
        чтение программы, при их использовании сразу видно какая часть кода относится к телу
        цикла for, а какая нет.

        Пример без скодок:
        int sum = 0;
        for (int i = 0; i < 100; i++)
        System.out.println(i);
        sum = sum + i;

        Пример со скобками:
        int sum = 0;
        for (int i = 0; i < 100; i++) {
        System.out.println(i);
        sum = sum + i;
        }

        Код со скобками читается намного проще, при его чтении не надо задумываться о том,
        какая часть кода относится к телу цикла for, а какая нет.Проверьте весь ваш код и убедитесь, что для каждого тела цикла
        for вы используете правильные отступы.

        Правильное форматирование кода сильно облегчает чтение программы.

        Пример без отступов:
        int sum = 0;
        for (int i = 0; i < 100; i++) {
        System.out.println(i);
        sum = sum + i;
        }

        Пример с правильными отступами:
        int sum = 0;
        for (int i = 0; i < 100; i++) {
        System.out.println(i);
        sum = sum + i;
        }


        Код с правильным форматингом (отступами) читается
         и понимается намного проще.

        Не забывайте в своих программах использовать отступы при написании тела цикла for!
*/

class ArrayUtil {

    public class ArrayIsEmpty extends Exception {
        public ArrayIsEmpty(String message) { super(message); }
    }

    public int[] createArray(int arrayLength) throws IllegalArgumentException {
        if (arrayLength >= 0) {
            return new int[arrayLength];
        } else {
            throw new IllegalArgumentException("number can't be a negative, got: " + arrayLength);
        }
    }

    public void printArrayToConsole(int[] array) {
        if (array.length == 0) {
            System.out.println("[]");
        } else {
            System.out.print("[");
            for(int i = 0; i < array.length -1; i++) {
                System.out.print(array[i] + ", ");
            }
            System.out.println(array[array.length - 1] + "]");
        }
    }

    public int findMaxNumber(int[] array) throws ArrayIsEmpty {
        if (array.length == 0) {
            throw new ArrayIsEmpty("can't find max element in empty list");
        }
        var max = array[0];
        for(int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int findMinNumber(int[] array) throws ArrayIsEmpty {
        if (array.length == 0) {
            throw new ArrayIsEmpty("can't find max element in empty list");
        }
        var min = array[0];
        for(int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}
