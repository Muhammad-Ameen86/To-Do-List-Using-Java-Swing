import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Asad {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("To-Do List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create the components
        JTextField taskInput = new JTextField(20);
        JButton addButton = new JButton("Add");
        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> taskList = new JList<>(listModel);

        // Layout
        JPanel panel = new JPanel();
        panel.add(taskInput);
        panel.add(addButton);
        frame.add(panel, BorderLayout.NORTH);
        frame.add(new JScrollPane(taskList), BorderLayout.CENTER);

        // Add action to the button
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String task = taskInput.getText();
                if (!task.isEmpty()) {
                    listModel.addElement(task);
                    taskInput.setText("");
                }
            }
        });

        // Display the window
        frame.setVisible(true);
    }
}
