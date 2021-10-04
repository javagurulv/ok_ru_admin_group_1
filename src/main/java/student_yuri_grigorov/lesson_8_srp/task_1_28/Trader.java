package student_yuri_grigorov.lesson_8_srp.task_1_28;

import java.lang.reflect.Field;
import java.util.StringJoiner;

class Trader {

    private String fullName;
    private String city;
    private String country;

    public Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }

    public Trader(String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ");

        Field[] fields = this.getClass().getDeclaredFields();

        for (Field field : fields) {
            try {
                result.add(field.getName() + ": " + field.get(this));
            } catch (IllegalAccessException ex) {
                System.out.println(ex);
            }
        }
        return "{" + result + "}";
    }

}
