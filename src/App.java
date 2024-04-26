import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();

        frame.setSize(700, 300);

        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("What is your name?");

        JButton button = new JButton("OK");

        JTextField textField = new JTextField(20);

        frame.add(label);
        frame.add(textField);
        frame.add(button);

        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String inputText = textField.getText();
                System.out.println("Contenu du champ de saisie : " + inputText);
            }
        });
    }
}
