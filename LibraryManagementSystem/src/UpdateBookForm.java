import javax.swing.*;

public class UpdateBookForm {

    public UpdateBookForm(LibraryManager manager) {

        JFrame frame = new JFrame("Update Book");

        JLabel idLabel = new JLabel("Book ID:");
        JLabel titleLabel = new JLabel("New Title:");
        JLabel authorLabel = new JLabel("New Author:");

        JTextField idField = new JTextField();
        JTextField titleField = new JTextField();
        JTextField authorField = new JTextField();

        JButton updateBtn = new JButton("Update Book");

        idLabel.setBounds(50,50,100,30);
        idField.setBounds(150,50,150,30);

        titleLabel.setBounds(50,100,100,30);
        titleField.setBounds(150,100,150,30);

        authorLabel.setBounds(50,150,100,30);
        authorField.setBounds(150,150,150,30);

        updateBtn.setBounds(150,200,130,30);

        frame.add(idLabel);
        frame.add(idField);
        frame.add(titleLabel);
        frame.add(titleField);
        frame.add(authorLabel);
        frame.add(authorField);
        frame.add(updateBtn);

        frame.setSize(400,350);
        frame.setLayout(null);
        frame.setVisible(true);

        updateBtn.addActionListener(e -> {

            int id = Integer.parseInt(idField.getText());
            String title = titleField.getText();
            String author = authorField.getText();

            manager.updateBook(id, title, author);

            JOptionPane.showMessageDialog(frame,"Book Updated Successfully");

        });
    }
}