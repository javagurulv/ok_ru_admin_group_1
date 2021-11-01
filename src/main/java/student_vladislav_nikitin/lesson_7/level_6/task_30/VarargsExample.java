package student_vladislav_nikitin.lesson_7.level_6.task_30;

class VarargsExample {

    public static void main(String[] args) {
        Person[] people = {
                new Person("Jakson", 17),
                new Person("Camil", 42),
                new Person("Stephan", 25)
        };

        VarargsExample.varagrsMethod("Hello! ", people);
    }

    static void varagrsMethod(String greeting, Person... people) {
        for (Person person: people) {
            System.out.print(greeting);
            person.sayHello();
        }
    }
}

class Person {
    final String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void sayHello() {
        String helloMessage = "My name is " + this.name + ". I'm " + this.age + " years old.";
        System.out.println(helloMessage);
    }
}
