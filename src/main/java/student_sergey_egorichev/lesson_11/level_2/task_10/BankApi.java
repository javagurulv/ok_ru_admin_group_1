package student_sergey_egorichev.lesson_11.level_2.task_10;

import java.util.Optional;

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessException;

}