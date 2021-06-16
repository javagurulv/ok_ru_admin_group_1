package student_sergey_egorichev.lesson_2.level_3.task_11;

import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        System.out.println("""
                А теперь давай сделаем что-то полезное. Задачка:
                Ты с двумя друзьями пьёшь в баре. На скольо денег ты выпил?""");

        Scanner scanner = new Scanner(System.in);

        int firstFriend = scanner.nextInt();

        System.out.println("A на какую сумму нажрал твой друг?");
        int secondFriend = scanner.nextInt();

        System.out.println("А чо третий?");
        int thirdFriend = scanner.nextInt();

        float averageOfThree = (float) (firstFriend + secondFriend + thirdFriend)/3;

        String output = String.format("""
                А теперь прекращайте считать кто сколько должен.
                Скидывайтесь по %f, и вперёд, к новым приключениям!""",
                averageOfThree);

        System.out.println(output);
    }
}
