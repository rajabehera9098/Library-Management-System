import javax.swing.*;

public class MainApp {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Library Management System");

        LibraryManager manager = new LibraryManager();

        JButton addBookBtn = new JButton("Add Book");
        JButton viewBookBtn = new JButton("View Books");
        viewBookBtn.addActionListener(e -> new ViewBooksForm(manager));
        JButton deleteBookBtn = new JButton("Delete Book");
        deleteBookBtn.addActionListener(e -> new DeleteBookForm(manager));
        JButton searchBookBtn = new JButton("Search Book");
        searchBookBtn.setBounds(180,210,150,30);
        searchBookBtn.addActionListener(e -> new SearchBookForm(manager));
        JButton updateBookBtn = new JButton("Update Book");
        updateBookBtn.addActionListener(e -> new UpdateBookForm(manager));

        updateBookBtn.setBounds(180,260,150,30);

        frame.add(updateBookBtn);
        frame.add(searchBookBtn);

        addBookBtn.setBounds(180,60,150,30);
        viewBookBtn.setBounds(180,110,150,30);
        deleteBookBtn.setBounds(180,160,150,30);

        frame.add(addBookBtn);
        frame.add(viewBookBtn);
        frame.add(deleteBookBtn);

        addBookBtn.addActionListener(e -> new AddBookForm(manager));

        frame.setSize(500,400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}