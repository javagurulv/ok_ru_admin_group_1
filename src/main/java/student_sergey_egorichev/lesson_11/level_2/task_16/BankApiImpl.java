package student_sergey_egorichev.lesson_11.level_2.task_16;

import java.util.List;
import java.util.Optional;

class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    public Optional<BankClient> findByUid(UserCredentials credentials,
                                          String uid) throws AccessDeniedException {

        if (!credentials.hasRole(Role.CAN_SEARCH_CLIENTS)) {
            AccessDeniedException e = new AccessDeniedException("Haven't CAN_SEARCH_CLIENTS role.");
            throw e;
        }

        for (BankClient client: this.clients) {
            if (client.getUid().equals(uid)) {
                return Optional.of(client);
            }
        }

        return Optional.empty();
    }

}