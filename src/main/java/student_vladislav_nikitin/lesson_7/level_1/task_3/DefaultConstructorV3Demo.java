package student_vladislav_nikitin.lesson_7.level_1.task_3;

class DefaultConstructorV3Demo {

    public static void main(String[] args) {
        DefaultConstructorV3 defaultConstructorV3 = new DefaultConstructorV3();

        System.out.println("String fullName: " + defaultConstructorV3.getFullName());
        System.out.println("int age: " + defaultConstructorV3.getAge());
        System.out.println("boolean male: " + defaultConstructorV3.isMale());
        System.out.println("Boolean female: " + defaultConstructorV3.getFemale());
    }

}
