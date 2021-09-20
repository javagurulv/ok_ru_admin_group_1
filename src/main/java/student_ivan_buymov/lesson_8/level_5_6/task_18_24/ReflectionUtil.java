package student_ivan_buymov.lesson_8.level_5_6.task_18_24;

import java.lang.reflect.*;
import java.util.Arrays;

public class ReflectionUtil {

    public String getClassAccessModifier(String fullClassName) throws ClassNotFoundException {
        var cl = Class.forName(fullClassName);
        var modifier = cl.getModifiers();
        return Modifier.toString(modifier);
    }

    public String getSuperClassName(String fullClassName) throws ClassNotFoundException {
        var cl = Class.forName(fullClassName);
        var sup = cl.getSuperclass();
        return sup.getName();
    }

    public void printClassMethods(String fullClassName) throws ClassNotFoundException {
        var cl = Class.forName(fullClassName);
        System.out.printf("Methods for %s:\n", cl.getSimpleName());
        for (Method method : cl.getDeclaredMethods()) {
            System.out.printf("Method Name: %s\n", method.getName());
            System.out.printf("Modifier: %s\n", Modifier.toString(method.getModifiers()));
            System.out.printf("Return Types: %s\n\n", method.getReturnType());
        }
    }

    public void printClassFields(String fullClassName) throws ClassNotFoundException {
        var cl = Class.forName(fullClassName);
        System.out.printf("Fields for %s:\n", cl.getSimpleName());
        for (Field f : cl.getDeclaredFields()) {
            System.out.printf("Field Name: %s\n", f.getName());
            System.out.printf("Modifier: %s\n", Modifier.toString(f.getModifiers()));
            System.out.printf("Type: %s\n\n", f.getType());
        }
    }

    public void printClassConstructors(String fullClassName) throws ClassNotFoundException {
        var cl = Class.forName(fullClassName);
        System.out.printf("Constructors for %s:\n", cl.getSimpleName());
        for (Constructor c : cl.getConstructors()) {
            System.out.printf("Params count: %s\n", c.getParameterCount());
            System.out.printf("Modifier: %s\n", Modifier.toString(c.getModifiers()));
            System.out.printf("Parameter Types: %s\n", Arrays.stream(c.getParameterTypes()).toList());
        }
    }

    public Object createClassInstanceUsingDefaultConstructor(String fullClassName) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        var cl = Class.forName(fullClassName);
        System.out.printf("Constructors for %s:\n", cl.getSimpleName());
        return cl.getDeclaredConstructor().newInstance();
    }

}
