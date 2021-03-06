package student_sergey_egorichev.lesson_7.level_3.task_9;

import teacher.codereview.CodeReview;

/*
    Что такое абстрактный класс?
        Это класс который определяет базовый функционал классов, которые
        которые от него наследуются.

    Можно ли создать экземпляр абстрактного класса в момент выполнения программы?
        Привычным способом, используя конструктор - нельзя. Однако, создать объект
        абстрактного класса, переопределив все необходимые методы, возможно.
        (См. AbstractClassDemo)


 */
@CodeReview(approved = true)
abstract class AbstractClass {

    public int index;

    public void countIndex() {
    }

}
