import javax.swing.*;
import java.awt.*;

public class Morpion {
    public static void main(String[] args) {
        JPanel panel = new JPanel(new GridLayout(3, 3));
        Game morpion = new Game(panel);
        JFrame window = new JFrame("Morpion");
        window.setSize(320, 320);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                CaseMorpion caseMorpion = new CaseMorpion(i, j, morpion);
                panel.add(caseMorpion.getButton());
            }
        }

        window.add(panel);
        window.setVisible(true);
    }
}
