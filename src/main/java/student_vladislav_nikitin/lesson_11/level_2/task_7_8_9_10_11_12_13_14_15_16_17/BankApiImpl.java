package student_vladislav_nikitin.lesson_11.level_2.task_7_8_9_10_11_12_13_14_15_16_17;

import java.util.List;
import java.util.Optional;

class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    public Optional<BankClient> findByUid(UserCredentials credentials,
                                          String uid) throws AccessDeniedException {
        if (! credentials.hasRole(Role.CAN_SEARCH_CLIENTS)) {
            throw new AccessDeniedException();
        }

        return clients.stream().filter(client -> client.getUid() == uid).findFirst();
    }

}
