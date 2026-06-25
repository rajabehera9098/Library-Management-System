import java.util.ArrayList;
import java.io.*;

public class LibraryManager {

    ArrayList<Book> books = new ArrayList<>();

    public LibraryManager() {
        loadBooks();
    }

    public void addBook(Book book) {
        books.add(book);
        saveBooks();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void deleteBook(int id) {
        books.removeIf(book -> book.id == id);
        saveBooks();
    }
    public void updateBook(int id, String newTitle, String newAuthor) {

        for (Book book : books) {

            if (book.id == id) {

                book.title = newTitle;
                book.author = newAuthor;

                saveBooks();

                return;
            }
        }
    }
    private void saveBooks() {

        try {
            PrintWriter writer = new PrintWriter(new FileWriter("books.txt"));

            for (Book book : books) {
                writer.println(book.id + "," + book.title + "," + book.author);
            }

            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadBooks() {

        try {

            File file = new File("books.txt");

            if (!file.exists()) return;

            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String title = data[1];
                String author = data[2];

                books.add(new Book(id, title, author));
            }

            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}