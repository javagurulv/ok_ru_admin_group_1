package student_sergey_egorichev.lesson_11.level_2.task_13;

import java.util.List;

class UserCredentials {

    private List<Role> roles;

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }
}
