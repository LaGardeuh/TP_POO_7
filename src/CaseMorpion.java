import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaseMorpion {
    JButton button;
    Game game;
    int x, y;

    public CaseMorpion(int x, int y, Game game) {
        this.x = x;
        this.y = y;
        this.game = game;

        button = new JButton();
        button.setPreferredSize(new Dimension(100, 100));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (game.getCurrentPlayer() == 1) {
                    button.setText("X");
                } else {
                    button.setText("O");
                }
                button.setEnabled(false);
                game.jouer(x, y);
            }
        });
    }

    public JButton getButton() {
        return button;
    }
}
