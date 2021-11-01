package student_sergey_kuzmin.lesson_7;

public class DefaultConstructorV3Demo {

    public static void main(String[] args){
        DefaultConstructorV3 constV3 = new DefaultConstructorV3();

        System.out.println("fullName: " + constV3.getFullName());
        System.out.println("getAge: " + constV3.getAge());
        System.out.println("getFemale: " + constV3.getFemale());
        System.out.println("isMale: " + constV3.isMale());
    }
}
