import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchBookForm {

    public SearchBookForm(LibraryManager manager) {

        JFrame frame = new JFrame("Search Book");

        JLabel idLabel = new JLabel("Enter Book ID:");
        JTextField idField = new JTextField();

        JButton searchBtn = new JButton("Search");

        idLabel.setBounds(50,80,120,30);
        idField.setBounds(180,80,150,30);

        searchBtn.setBounds(150,150,120,30);

        frame.add(idLabel);
        frame.add(idField);
        frame.add(searchBtn);

        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setVisible(true);

        searchBtn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                int id = Integer.parseInt(idField.getText());

                for(Book book : manager.getBooks()){

                    if(book.id == id){

                        JOptionPane.showMessageDialog(frame,
                                "ID: " + book.id +
                                        "\nTitle: " + book.title +
                                        "\nAuthor: " + book.author);

                        return;
                    }
                }

                JOptionPane.showMessageDialog(frame,"Book Not Found");

            }
        });
    }
}