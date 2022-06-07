package TicTacToe;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Player extends JFrame {
    
    JLabel label;
    JLabel label2;
    JTextField playerInput;
    JButton enter;
    JTextField playerInput2;
    JButton enter2;

    static int playercount;
    static int winCon;

    Player() {
        setLayout(new FlowLayout());

        label = new JLabel("Enter number of players (2-10): ");
        add(label);

        playerInput = new JTextField(10);
        add(playerInput);



        label2 = new JLabel("Enter number in a row to win (at least 3 but no more than players + 1): ");
        add(label2);

        playerInput2 = new JTextField(10);
        add(playerInput2);

        enter = new JButton("Enter");
        add(enter);

        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        enter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String players = playerInput.getText();
                    String win = playerInput2.getText();
                    winCon = Integer.parseInt(win);
                    playercount = Integer.parseInt(players);
                    if (playercount < 2 || playercount > 10 || winCon < 3 || winCon > playercount+1) {
                        throw new NumberFormatException();
                    }
                    dispose();
                    if (playercount == 2) {
                        TTTV1 t = new TTTV1();
                    }
                    else {
                        TTTV2 t2 = new TTTV2();
                    }
                    // System.out.println(playercount);
                    
                }
                catch (NumberFormatException ex) {
                    JFrame n = new JFrame();
                    ImageIcon icon = new ImageIcon("TicTacToe/jpeg.png");
                    JOptionPane.showMessageDialog(n, "Enter a valid player count or win condition!", "Invalid Player Count", JOptionPane.INFORMATION_MESSAGE, icon);
                    
                }
            }
        });

    }

}
