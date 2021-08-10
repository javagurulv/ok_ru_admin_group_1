package teacher.lesson_11_exceptions.lessoncode;

import java.util.Optional;

public class BankApi {

	private static AccessDeniedException buildException() {
		return new AccessDeniedException("Invalid sequrity key", "");
	}

	public Optional<String> getClientFullName(String sequrityKey,
											  Long clientId)
				throws AccessDeniedException {
		if (sequrityKey == null || !sequrityKey.equals("abcd")) {
			//AccessDeniedException exception = new AccessDeniedException("Invalid sequrity key", sequrityKey);
			//throw exception;
			throw buildException();
		}
		if (clientId == 1L) {
			return Optional.of("Petja");
		} else {
			return Optional.empty();  // return "";
		}
	}

	public static void main(String[] args) throws AccessDeniedException {
		BankApi bankApi = new BankApi();
		try {
			Optional<String> result = bankApi.getClientFullName("sds", 1L);
			if (result.isEmpty()) {
				System.out.println("Client not found");
			} else {
				System.out.println("Client full name " + result.get());
			}
		} catch (AccessDeniedException exception) {
			System.out.println(exception.getMessage());
			System.out.println(exception.getInvalidSequrityKey());
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		} catch (Throwable e) {

		} finally {

			System.out.println("Finally");
		}

		// bankApi

	}

}
