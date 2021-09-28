package student_yuri_grigorov.lesson_8.level_5_6.task_19_24;

import java.lang.reflect.Modifier;
import java.text.MessageFormat;
import java.util.StringJoiner;

class ReflectionUtil {

    public String getClassAccessModifier(String fullClassName) throws ClassNotFoundException {
        Class<?> cl = Class.forName(fullClassName);
        return Modifier.toString(cl.getModifiers());
    }

    public String getSuperClassName(String fullClassName) throws ClassNotFoundException {
        Class<?> cl = Class.forName(fullClassName);
        return cl.getSuperclass().getName();
    }

    public void printClassMethods(String fullClassName) throws ClassNotFoundException {
        Class<?> cl = Class.forName(fullClassName);
        for (var m : cl.getDeclaredMethods()) {
            System.out.printf("%nMethod Name: %s%nModifier: %s%nReturn Types: %s%n",
                    m.getName(), Modifier.toString(m.getModifiers()), m.getReturnType());
        }
    }

    public void printClassFields(String fullClassName) throws ClassNotFoundException {
        Class<?> cl = Class.forName(fullClassName);
        for (var f : cl.getDeclaredFields()) {
            System.out.printf("%nField Name: %s%nModifier: %s%nType: %s%n",
                    f.getName(), Modifier.toString(f.getModifiers()), f.getType());
        }
    }

    public void printClassConstructors(String fullClassName) throws ClassNotFoundException {
        Class<?> cl = Class.forName(fullClassName);
        int i = 1;
        for (var c : cl.getDeclaredConstructors()) {
            System.out.printf("%nConstructor %d%nModifier: %s%n",
                    (i++), Modifier.toString(c.getModifiers()));
            StringJoiner types = new StringJoiner(", ");
            for (var t : c.getParameterTypes()) {
                types.add(t.getName());
            }
            System.out.println("Parameter Types: " + types);
        }
    }

}
