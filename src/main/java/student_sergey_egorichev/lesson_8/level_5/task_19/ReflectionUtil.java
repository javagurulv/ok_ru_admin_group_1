package student_sergey_egorichev.lesson_8.level_5.task_19;

import java.lang.reflect.Modifier;

public class ReflectionUtil {

    public static String getClassAccessModifier(String fullClassName) throws ClassNotFoundException {

        Class targetClass = Class.forName(fullClassName);
        return Modifier.toString(targetClass.getModifiers());

    }

}
