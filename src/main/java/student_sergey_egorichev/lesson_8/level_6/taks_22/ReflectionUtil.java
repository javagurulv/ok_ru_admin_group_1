package student_sergey_egorichev.lesson_8.level_6.taks_22;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class ReflectionUtil {

    public static String getClassAccessModifier(String fullClassName) throws ClassNotFoundException {
        Class targetClass = Class.forName(fullClassName);
        return Modifier.toString(targetClass.getModifiers());
    }

    public static String getSuperClassName(String fullClassName) throws ClassNotFoundException {
        Class targetClass = Class.forName(fullClassName);
        return targetClass.getSuperclass().getName();
    }

    public static Method[] getClassMethodList(String fullClassName) throws ClassNotFoundException {
        Class targetClass = Class.forName(fullClassName);
        return targetClass.getDeclaredMethods();
    }

    public static Field[] getClassFieldList(String fullClassName) throws ClassNotFoundException {
        Class targetClass = Class.forName(fullClassName);
        return targetClass.getDeclaredFields();
    }

    public static void printClassMethods(String fullClassName) throws ClassNotFoundException {
        for (Method method: getClassMethodList(fullClassName)) {
            System.out.println("Method Name: " + method.getName());
            System.out.print("Parameter:");
            for (Parameter parameter: method.getParameters()) {
                System.out.print(" " + parameter.getName());
            }
            System.out.println();
            System.out.println("Modifer: " + method.getModifiers());
            System.out.println("Return Types: " + method.getReturnType() + "\n");
        }
    }

    public static void printClassFields(String fullClassName) throws ClassNotFoundException {
        for (Field field: getClassFieldList(fullClassName)) {
            System.out.println("Field Name: " + field.getName());
            System.out.println ("Modifier: " + Modifier.toString(field.getModifiers()));
            System.out.println("Type: " + field.getType() + "\n");
        }
    }

}
