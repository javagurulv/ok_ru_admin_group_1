package student_sergey_egorichev.lesson_11.level_2.task_13;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Optional;

public class BankApiImplTest {

    @Test
    public void findByUid1() {
        BankClient client1 = new BankClient("42", "Douglas Adams");
        BankClient client2 = new BankClient("19", "Roland Deschain");

        BankApi bank = new BankApiImpl(Arrays.asList(client1, client2));

        UserCredentials user = new UserCredentials(Arrays.asList(Role.CAN_SEARCH_CLIENTS));

        Optional<BankClient> fUser = null;
        try {
            fUser = bank.findByUid(user, "42");
        } catch (AccessDeniedException e) {
            e.printStackTrace();
        }

        Assert.assertTrue(fUser.get().getFullName().equals(client1.getFullName()));
    }

    @Test
    public void findByUid2() {
        boolean exceptionThrowed = false;

        BankClient client1 = new BankClient("42", "Douglas Adams");
        BankClient client2 = new BankClient("19", "Roland Deschain");

        BankApi bank = new BankApiImpl(Arrays.asList(client1, client2));

        UserCredentials user = new UserCredentials(Arrays.asList());

        Optional<BankClient> fUser = null;
        try {
            fUser = bank.findByUid(user, "42");
        } catch (AccessDeniedException e) {
            exceptionThrowed = true;
        }

        Assert.assertTrue(exceptionThrowed);
    }

}
