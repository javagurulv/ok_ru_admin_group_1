package student_sergey_egorichev.lesson_5.level_4.task_26;

import java.util.Random;

public class ElectroPetrovich {

    public static void hello() {
        String[] greeting = {"Здравствуй, мой любознательный друг! Это снова я, электроПетрович",
        "электроПетрович приветствует тебя, о идущий к знанию!",
        "Здравствуй, мой дорогой друг! Это электроПетрович.",
        "Здравствуй, мой кожаный друг!"};
        int rnd = new Random().nextInt(greeting.length);
        System.out.println(greeting[rnd]);
    }

    public static void say(String msg) {
        System.out.println(msg);
    }
}
