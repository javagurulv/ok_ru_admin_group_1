package teacher.lesson_17_log4j.lessoncode.core.services.validators;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import teacher.lesson_17_log4j.lessoncode.core.requests.AddBookRequest;
import teacher.lesson_17_log4j.lessoncode.core.responses.CoreError;

@Component
public class AddBookRequestValidator {

	public List<CoreError> validate(AddBookRequest request) {
		List<CoreError> errors = new ArrayList<>();
		validateTitle(request).ifPresent(errors::add);
		validateAuthor(request).ifPresent(errors::add);
		return errors;
	}

	private Optional<CoreError> validateTitle(AddBookRequest request) {
		return (request.getTitle() == null || request.getTitle().isEmpty())
			? Optional.of(new CoreError("title", "Must not be empty!"))
			: Optional.empty();
	}

	private Optional<CoreError> validateAuthor(AddBookRequest request) {
		return (request.getAuthor() == null || request.getAuthor().isEmpty())
				? Optional.of(new CoreError("author", "Must not be empty!"))
				: Optional.empty();
	}

}
