package student_sergey_egorichev.lesson_5.level_2.task_11;

import java.util.Random;

public class ElectroPetrovich {
    public static void hello() {
        String[] greeting = {"Здравствуй, мой любознательный друг! Это снова я, электроПетрович",
        "электроПетрович приветствует тебя, о идущий к знанию!"};
        int rnd = new Random().nextInt(greeting.length);
        System.out.println(greeting[rnd]);
    }

    public static void say(String msg) {
        System.out.println(msg);
    }
}
