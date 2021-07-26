package student_sergey_egorichev.lesson_8.level_6.taks_24;

import java.lang.reflect.*;

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

    public static Constructor[] getClassConstructorList(String fullClassName) throws  ClassNotFoundException {
        Class targetClass = Class.forName(fullClassName);
        return targetClass.getDeclaredConstructors();
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

    public static void printClassConstructors(String fullClassName) throws ClassNotFoundException {
        int index = 1;
        for (Constructor constructor: getClassConstructorList(fullClassName)) {
            System.out.println("Constructor " + index);
            System.out.println("Modifier: " + Modifier.toString(constructor.getModifiers()));
            System.out.print("Parameter Types: ");
            for (Class parameter: constructor.getParameterTypes()) {
                System.out.print(" " + parameter.getTypeName());
            }
            System.out.println();
            System.out.println();
            index ++;
        }
    }

    public static Object createClassInstanceUsingDefaultConstructor(String fullClassName) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class targetClass = Class.forName(fullClassName);
        return targetClass.newInstance();
    }

}
