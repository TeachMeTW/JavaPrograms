package TicTacToe;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Player extends JFrame {
    
    JLabel label;
    JTextField playerInput;
    JButton enter;
    static int playercount;

    Player() {
        setLayout(new FlowLayout());

        label = new JLabel("Enter number of players");
        add(label);

        playerInput = new JTextField(10);
        add(playerInput);

        enter = new JButton("Enter");
        add(enter);

        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        enter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String players = playerInput.getText();
                    playercount = Integer.parseInt(players);
                    if (playercount < 2 || playercount > 10) {
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
                    JOptionPane.showMessageDialog(n, "Enter a valid player count!", "Invalid Player Count", JOptionPane.INFORMATION_MESSAGE, icon);
                    
                }
            }
        });

    }

}
