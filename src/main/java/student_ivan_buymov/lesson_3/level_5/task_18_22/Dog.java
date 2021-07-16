package student_ivan_buymov.lesson_3.level_5.task_18_22;

/* Тема: создание класса Dog.

Создать класс собака (Dog)
и продемонстрировать его работу с ним в программе.

Бизнес требования:
- У собаки должна быть кличка.
- Кличку собаке дают в момент создания и потом ее изменить нельзя.
- Собака должна уметь выполнять команду голос (voice()),
при выполнении этой команды на консоль должно выводиться
кличка собаки три раза.

Создать отдельный класс DogDemo,
объявить в нём main() метод и продемонстрировать
использование класса собака (Dog). */

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Dog {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    public void voice() {
        System.out.println("Wof, wof");
    }
}



