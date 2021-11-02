package student_vladislav_nikitin.lesson_10.level_6.task_30_31_32_33_34_35_36_37_38;

import java.util.List;
import java.util.Map;

class BooksDemo {

    public static void main(String[] args) {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        UIAction saveAction = new SaveBookUIAction(bookDatabase);
        UIAction findByIdAction = new FindByIdUIAction(bookDatabase);
        UIAction findByAuthorAction = new FindByAuthorUIAction(bookDatabase);
        UIAction findByTitleAction = new FindByTitleUIAction(bookDatabase);
        UIAction deleteByIdAction = new DeleteByIdUIAction(bookDatabase);

        saveAction.execute();
        saveAction.execute();

        findByIdAction.execute();
        findByAuthorAction.execute();
        findByTitleAction.execute();

        deleteByIdAction.execute();
    }
}
