package teacher.lesson_15_spring_basics.core.requests;

public class AddBookRequest {

	private String title;
	private String author;

	public AddBookRequest(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
}
