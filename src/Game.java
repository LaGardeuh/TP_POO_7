import javax.swing.*;
import java.awt.*;

public class Game {
    private int[][] grid;
    private int currentPlayer;
    private JPanel panel;

    public Game(JPanel panel) {
        grid = new int[3][3];
        currentPlayer = 1;
        this.panel = panel;

    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }

    public void jouer(int x, int y) {
        if (grid[x][y] != 0 || x < 0 || x >= 3 || y < 0 || y >= 3) {
            System.out.println("Position invalide ou déjà occupée.");
            return;
        }

        grid[x][y] = currentPlayer;

        if (whoWin(currentPlayer)) {
            System.out.println("Le joueur " + currentPlayer + " a gagné !");
            disableAllButtons();
            return;
        }

        if (estNulle()) {
            System.out.println("Partie nulle.");
            return;
        }

        currentPlayer = (currentPlayer == 1) ? 2 : 1;
    }

    private boolean whoWin(int player) {
        for (int i = 0; i < 3; i++) {
            if (grid[i][0] == player && grid[i][1] == player && grid[i][2] == player)
                return true;
            if (grid[0][i] == player && grid[1][i] == player && grid[2][i] == player)
                return true;
        }
        if (grid[0][0] == player && grid[1][1] == player && grid[2][2] == player)
            return true;
        if (grid[0][2] == player && grid[1][1] == player && grid[2][0] == player)
            return true;

        return false;
    }

    private boolean estNulle() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == 0)
                    return false;
            }
        }
        return true;
    }

    public void displayGrid() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void disableAllButtons() {
        for (Component component : panel.getComponents()) {
            if (component instanceof JButton) {
                ((JButton) component).setEnabled(false);
            }
        }
    }

}
