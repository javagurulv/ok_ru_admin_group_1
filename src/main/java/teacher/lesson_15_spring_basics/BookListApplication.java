package teacher.lesson_15_spring_basics;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import teacher.lesson_15_spring_basics.config.BookListConfiguration;
import teacher.lesson_15_spring_basics.console_ui.AddBookUIAction;
import teacher.lesson_15_spring_basics.console_ui.ExitUIAction;
import teacher.lesson_15_spring_basics.console_ui.GetAllBooksUIAction;
import teacher.lesson_15_spring_basics.console_ui.RemoveBookUIAction;
import teacher.lesson_15_spring_basics.console_ui.SearchBooksUIAction;

public class BookListApplication {

	private static ApplicationContext applicationContext =
			new AnnotationConfigApplicationContext(BookListConfiguration.class);

	public static void main(String[] args) {
		while (true) {
			printProgramMenu();
			int menuNumber = getMenuNumberFromUser();
			executeSelectedMenuItem(menuNumber);
		}
	}

	private static void printProgramMenu() {
		System.out.println();
		System.out.println("Program menu:");
		System.out.println("1. Add book to list");
		System.out.println("2. Delete book from list");
		System.out.println("3. Show all books in the list");
		System.out.println("4. Search books");
		System.out.println("5. Exit");
		System.out.println();
	}

	private static int getMenuNumberFromUser() {
		System.out.println("Enter menu item number to execute:");
		Scanner scanner = new Scanner(System.in);
		return Integer.parseInt(scanner.nextLine());
	}

	private static void executeSelectedMenuItem(int selectedMenu) {
		switch (selectedMenu) {
			case 1: {
				AddBookUIAction uiAction = applicationContext.getBean(AddBookUIAction.class);
				uiAction.execute();
				break;
			}
			case 2: {
				RemoveBookUIAction uiAction = applicationContext.getBean(RemoveBookUIAction.class);
				uiAction.execute();
				break;
			}
			case 3: {
				GetAllBooksUIAction uiAction = applicationContext.getBean(GetAllBooksUIAction.class);
				uiAction.execute();
				break;
			}
			case 4: {
				SearchBooksUIAction uiAction = applicationContext.getBean(SearchBooksUIAction.class);
				uiAction.execute();
				break;
			}
			case 5: {
				ExitUIAction uiAction = applicationContext.getBean(ExitUIAction.class);
				uiAction.execute();
				break;
			}
		}
	}

}