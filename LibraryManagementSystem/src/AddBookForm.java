import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBookForm {

    public AddBookForm(LibraryManager manager) {

        JFrame frame = new JFrame("Add Book");

        JLabel idLabel = new JLabel("Book ID:");
        JLabel titleLabel = new JLabel("Title:");
        JLabel authorLabel = new JLabel("Author:");

        JTextField idField = new JTextField();
        JTextField titleField = new JTextField();
        JTextField authorField = new JTextField();

        JButton addBtn = new JButton("Add Book");

        idLabel.setBounds(50,50,100,25);
        idField.setBounds(150,50,150,25);

        titleLabel.setBounds(50,100,100,25);
        titleField.setBounds(150,100,150,25);

        authorLabel.setBounds(50,150,100,25);
        authorField.setBounds(150,150,150,25);

        addBtn.setBounds(150,200,120,30);

        frame.add(idLabel);
        frame.add(idField);
        frame.add(titleLabel);
        frame.add(titleField);
        frame.add(authorLabel);
        frame.add(authorField);
        frame.add(addBtn);

        frame.setSize(400,350);
        frame.setLayout(null);
        frame.setVisible(true);

        addBtn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                int id = Integer.parseInt(idField.getText());
                String title = titleField.getText();
                String author = authorField.getText();

                Book book = new Book(id, title, author);

                manager.addBook(book);

                JOptionPane.showMessageDialog(frame,"Book Added Successfully");
            }
        });
    }
}