package student_ivan_buymov.lesson_8.level_5_6.task_18_24;

import java.lang.reflect.InvocationTargetException;

public class ReflectionUtilTest {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        var refl = new ReflectionUtil();
        var dogClassName = "student_ivan_buymov.lesson_8.level_5_6.task_18_24.Dog";
        String fullClassPath = refl.getClass().getCanonicalName();
        var modifiers = refl.getClassAccessModifier(fullClassPath);
        System.out.printf("Modifiers for %s: %s\n", fullClassPath, modifiers);
        String badClassPath = "student_ivan_buymov.lesson_8.level_5.task_18_20.classNotExist";
        try {
            var a = refl.getClassAccessModifier(badClassPath);
        } catch (ClassNotFoundException e) {
            System.out.println("Test bad class: OK");
        } catch (Exception e) {
            System.out.println("FAIL: unexpected error: " + e.getMessage());
        }

        System.out.printf("Super for %s: %s\n", fullClassPath, refl.getSuperClassName(fullClassPath));
        System.out.println();
        refl.printClassMethods(fullClassPath);
        System.out.println();
        refl.printClassFields(dogClassName);
        System.out.println();
        refl.printClassConstructors(dogClassName);
        System.out.println();
        var dog = refl.createClassInstanceUsingDefaultConstructor(dogClassName);
        System.out.printf("created instance: %s\n", dog);
    }

}
