package student_vladislav_nikitin.lesson_8.level_6.task_21_22_23_24;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class ReflectionUtil {

    public String getClassAccessModifier(String fullClassName) {
        Class reflectClass = getReflectClass(fullClassName);
        if (reflectClass == null) {
            return "Invalid class name";
        }

        int modifier = reflectClass.getModifiers();
        return Modifier.toString(modifier);
    }

    public String getSuperClassName(String fullClassName) {
        Class reflectClass = getReflectClass(fullClassName);
        if (reflectClass == null) {
            return "Invalid class name";
        }

        Class superClass = reflectClass.getSuperclass();
        return superClass.getName();
    }

    public void printClassMethods(String fullClassName) {
        Class reflectClass = getReflectClass(fullClassName);
        if (reflectClass == null) {
            System.err.println("Invalid class name");
            return;
        }

        Method[] methods = reflectClass.getDeclaredMethods();
        for (Method method: methods) {
            String methodName = method.getName();
            String methodModifier = Modifier.toString(method.getModifiers());
            String methodReturns = method.getReturnType().toString();
            System.out.println("Method Name: " + methodName);
            System.out.println("Modifier: " + methodModifier);
            System.out.println("Return Types: " + methodReturns);
        }

    }

    public void printClassFields(String fullClassName) {
        Class reflectClass = getReflectClass(fullClassName);
        if (reflectClass == null) {
            System.err.println("Invalid class name");
            return;
        }

        Field[] fields = reflectClass.getDeclaredFields();
        for (Field field: fields) {
            String fieldName = field.getName();
            String fieldModifier = Modifier.toString(field.getModifiers());
            String fieldType = field.getType().toString();
            System.out.println("Field Name: " + fieldName);
            System.out.println("Modifier: " + fieldModifier);
            System.out.println("Type: " + fieldType);
        }
    }

    public void printClassConstructors(String fullClassName) {
        Class reflectClass = getReflectClass(fullClassName);
        if (reflectClass == null) {
            System.err.println("Invalid class name");
            return;
        }

        Constructor[] constructors = reflectClass.getDeclaredConstructors();
        for (int i = 0; i < constructors.length; i++) {
            String constructorModifier = Modifier.toString(constructors[i].getModifiers());
            String constructorParameterTypes = "";
            for (Class parameterType: constructors[i].getParameterTypes()) {
                constructorParameterTypes += parameterType.toString() + " ";
            }
            System.out.println("Constructor " + (i + 1));
            System.out.println("Modifier: " + constructorModifier);
            System.out.println("Parameter Types: " + constructorParameterTypes);
        }
    }

    public Object createClassInstanceUsingDefaultConstructor(String fullClassName) {
        Class reflectClass = getReflectClass(fullClassName);
        if (reflectClass == null) {
            System.err.println("Invalid class name");
            return null;
        }

        int classModifier = reflectClass.getModifiers();
        if ((classModifier == 1024) || (classModifier == 512)) {
            System.err.println("Could not create instance of interface or abstract class");
            return null;
        }

        Constructor[] constructors = reflectClass.getDeclaredConstructors();
        for (Constructor constructor: constructors) {
            if (constructor.getParameterCount() == 0) {
                try {
                    return constructor.newInstance();
                }
                catch (Throwable e) {
                    System.err.println(e);
                }
            }
        }

        System.err.println("Class hasn't default constructor");
        return null;
    }

    private Class getReflectClass(String fullClassName) {
        Class reflectClass = null;
        try {
            reflectClass = Class.forName(fullClassName);
        }
        catch (Throwable e) {
            System.err.println(e);
            return null;
        }

        return reflectClass;
    }
}