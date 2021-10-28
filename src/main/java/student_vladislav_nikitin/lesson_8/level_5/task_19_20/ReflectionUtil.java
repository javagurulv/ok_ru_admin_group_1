package student_vladislav_nikitin.lesson_8.level_5.task_19_20;

import java.lang.reflect.Modifier;

class ReflectionUtil {

    public String getClassAccessModifier(String fullClassName) {
        Class reflectClass = null;
        try {
            reflectClass = Class.forName(fullClassName);
        }
        catch (Throwable e) {
            System.err.println(e);
            System.exit(1);
        }

        int modifier = reflectClass.getModifiers();
        return Modifier.toString(modifier);
    }

    public String getSuperClassName(String fullClassName) {
        Class reflectClass = null;
        try {
            reflectClass = Class.forName(fullClassName);
        }
        catch (Throwable e) {
            System.err.println(e);
            System.exit(1);
        }

        Class superClass = reflectClass.getSuperclass();
        return superClass.getName();
    }

}
