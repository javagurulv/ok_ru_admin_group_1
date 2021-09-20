package student_ivan_buymov.lesson_8.level_5_6.task_18_24;

public class GetClassTest {

    public static void main(String[] args) throws ClassNotFoundException {
        var myDog = new Dog("Wilfred");

        var classViaMethodOne = Class.forName("student_ivan_buymov.lesson_8.level_5_6.task_18_24.Dog");
        System.out.println("Method one result:" + classViaMethodOne);
        var classViaMethodTwo = myDog.getClass();
        System.out.println("Method two result:" + classViaMethodTwo);
        var classViaMethodThee = Dog.class;
        System.out.println("Method three result:" + classViaMethodThee);

        if ((classViaMethodOne == classViaMethodTwo) && (classViaMethodOne == classViaMethodThee)) {
            System.out.println("Wow, all methods works!");
        }
    }
}
