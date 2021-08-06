package student_sergey_egorichev.lesson_7.level_1.task_3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DefaultConstructorV3Demo {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        DefaultConstructorV3 defaultConstructorV3 = new DefaultConstructorV3();

        for (Method method : defaultConstructorV3.getClass().getMethods()) {
            if ((method.getName().startsWith("get") || method.getName().startsWith("is"))
                    && !method.getName().equals("getClass")
                    && method.getParameterTypes().length == 0) {
                System.out.println(method.getName() + ": "
                                + method.invoke(defaultConstructorV3));

            }

        }
    }
}
