import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class ViewBooksForm {

    public ViewBooksForm(LibraryManager manager) {

        JFrame frame = new JFrame("View Books");

        String[] columns = {"ID", "Title", "Author"};

        DefaultTableModel model = new DefaultTableModel(columns, 0);

        JTable table = new JTable(model);

        ArrayList<Book> books = manager.getBooks();

        for (Book book : books) {
            Object[] row = {book.id, book.title, book.author};
            model.addRow(row);
        }

        JScrollPane scrollPane = new JScrollPane(table);

        frame.add(scrollPane);

        frame.setSize(500,400);
        frame.setVisible(true);
    }
}