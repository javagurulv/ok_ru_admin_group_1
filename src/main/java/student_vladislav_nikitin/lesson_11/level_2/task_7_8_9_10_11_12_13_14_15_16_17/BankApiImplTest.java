package student_vladislav_nikitin.lesson_11.level_2.task_7_8_9_10_11_12_13_14_15_16_17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

class BankApiImplTest {

    public static void main(String[] args) {
        BankApiImplTest test = new BankApiImplTest();

        test.findByUidTest();
        test.findByUidNotFoundTest();
        test.findByUidExceptionTest();
    }

    void findByUidTest() {
        BankClient bankClient = new BankClient("0123", "Full Name");
        UserCredentials userCredentials = new UserCredentials(Arrays.asList(Role.CAN_SEARCH_CLIENTS));
        BankApi bankApi = new BankApiImpl(Arrays.asList(bankClient));

        Optional<BankClient> optionalClient = Optional.empty();
        try {
            optionalClient = bankApi.findByUid(userCredentials, "0123");
        } catch (AccessDeniedException e) {
            System.out.println("findByUidTest = FAIL; got exception");
            return;
        }

        if (optionalClient.isEmpty()) {
            System.out.println("findByUidTest = FAIL; client is not found");
            return;
        }

        if (optionalClient.get().equals(bankClient)) {
            System.out.println("findByUidTest = OK");
        } else {
            System.out.println("findByUidTest = FAIL; found wrong client");
        }
    }

    void findByUidNotFoundTest() {
        BankClient bankClient = new BankClient("0123", "Full Name");
        UserCredentials userCredentials = new UserCredentials(Arrays.asList(Role.CAN_SEARCH_CLIENTS));
        BankApi bankApi = new BankApiImpl(Arrays.asList(bankClient));

        Optional<BankClient> optionalClient = Optional.empty();
        try {
            optionalClient = bankApi.findByUid(userCredentials, "0234");
        } catch (AccessDeniedException e) {
            System.out.println("findByUidNotFoundTest = FAIL");
            return;
        }

        if (optionalClient.isEmpty()) {
            System.out.println("findByUidNotFoundTest = OK");
        } else {
            System.out.println("findByUidNotFoundTest = FAIL");
        }
    }

    void findByUidExceptionTest() {
        BankClient bankClient = new BankClient("0123", "Full Name");
        UserCredentials userCredentials = new UserCredentials(new ArrayList<>());
        BankApi bankApi = new BankApiImpl(Arrays.asList(bankClient));

        try {
            bankApi.findByUid(userCredentials, "0123");
            System.out.println("findByUidExceptionTest = FAIL");
        } catch (AccessDeniedException e) {
            System.out.println("findByUidExceptionTest = OK");
        }
    }
}
