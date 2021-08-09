package student_sergey_egorichev.lesson_8.level_7.task_25;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestRunner {
    public static void run(Class testClass) {
        for (Method m: testClass.getDeclaredMethods()){
            if (m.isAnnotationPresent(Test.class)) {
                try {
                    m.invoke(null);
                } catch (InvocationTargetException wrappedExc) {
                    Throwable exc = wrappedExc.getCause();
                    System.out.println(m + " failed: " + exc);
                } catch (IllegalAccessException exc) {
                    System.out.println("Invalid @Test: " + m);
                }
            }
        }
    }
}
