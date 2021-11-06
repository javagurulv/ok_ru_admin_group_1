package student_vladislav_nikitin.lesson_11.level_2.task_7_8_9_10_11_12_13_14_15_16_17;

import java.util.List;

class UserCredentials {

    private List<Role> roles;

    UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public boolean hasRole(Role role) {
        return this.roles.contains(role);
    }
}
