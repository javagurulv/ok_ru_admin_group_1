package teacher.lesson_16_multithreading.lessoncode.bankaccount.atomicwithoutsynch;

public class AtomicBankAccountThreadApp {

	// Выдаёт не 0, но для этого может потребоваться запускать много раз
	public static void main(String[] args) {
		BankAccountAtomic bankAccount = new BankAccountAtomic(0);

		Thread thread1 = new Thread(new AddMoneyThread(bankAccount));
		Thread thread2 = new Thread(new RemoveMoneyThread(bankAccount));

		long before = System.currentTimeMillis();

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {

		}

		long after = System.currentTimeMillis();

		System.out.println("Bank Account money = " + bankAccount.getMoney());
		//System.out.println("Bank Account operations = " + bankAccount.getOperationCount());
		System.out.println("Time = " + (after - before));

	}
}
