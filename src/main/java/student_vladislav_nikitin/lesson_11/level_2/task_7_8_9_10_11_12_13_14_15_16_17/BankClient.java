package student_vladislav_nikitin.lesson_11.level_2.task_7_8_9_10_11_12_13_14_15_16_17;

class BankClient {

    private String uid;
    private String fullName;

    public BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    public String getUid() {
        return uid;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        BankClient bankClient = (BankClient) o;

        return (this.uid.equals(bankClient.getUid()) &&
                this.fullName.equals(bankClient.getFullName()));
    }

}
