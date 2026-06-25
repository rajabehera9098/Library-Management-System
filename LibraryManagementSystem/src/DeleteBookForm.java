import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteBookForm {

    public DeleteBookForm(LibraryManager manager) {

        JFrame frame = new JFrame("Delete Book");

        JLabel idLabel = new JLabel("Enter Book ID:");
        JTextField idField = new JTextField();

        JButton deleteBtn = new JButton("Delete Book");

        idLabel.setBounds(50,80,120,30);
        idField.setBounds(180,80,150,30);

        deleteBtn.setBounds(150,150,120,30);

        frame.add(idLabel);
        frame.add(idField);
        frame.add(deleteBtn);

        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setVisible(true);

        deleteBtn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                int id = Integer.parseInt(idField.getText());

                manager.deleteBook(id);

                JOptionPane.showMessageDialog(frame,"Book Deleted Successfully");

            }
        });
    }
}