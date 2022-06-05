package TicTacToe;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {

    private JFrame frame = new JFrame();
    private static ImageIcon frameIcon = new ImageIcon("TicTacToe/jpeg.png");;

    public GUI() {
        setFrame();

    }

    public void setFrame() {
        frame.setTitle("Tic Tac Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1920,1080);
        frame.setVisible(true);
        frame.setIconImage(frameIcon.getImage());

    }

    public void setLabels() {

    }
    public static void main(String[] args) {
        new GUI();
    }
}
