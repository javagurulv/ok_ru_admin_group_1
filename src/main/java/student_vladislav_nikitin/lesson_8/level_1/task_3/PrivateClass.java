package student_vladislav_nikitin.lesson_8.level_1.task_3;

/*
    Приватный класс возможно объявить внутри другого класса.
    Тогда его код будет недоступен в других классах.

    Но использование модификатора доступа private для "верхнего" класса – недоступно.
    Также в этом и нет смысла, создание такого класса, код которого мы не можем использовать.
 */
class PrivateClass {

    private class SuperPrivateClass {

        private void helloFromInnerClass() {
            System.out.println("Hello!");
        }
    }

}