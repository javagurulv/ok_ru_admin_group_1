package student_vladislav_nikitin.lesson_8_2.level_6.task_25_26_27_28;

class Trader {

    private String fullName;
    private String city;
    private String country;

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
        return "trader={name=" + this.fullName +
                "; city=" + this.city +
                "; country=" + this.country + ";}";
    }
}