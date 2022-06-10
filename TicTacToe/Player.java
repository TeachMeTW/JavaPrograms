package TicTacToe;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Player extends JFrame {
    
    // window elements
    JLabel label;
    JLabel label2;
    JTextField playerInput;
    JButton enter;
    JTextField playerInput2;
    JButton enter2;

    // accessible by other classes
    static int playercount;
    static int winCon;

    Player() {
        // use flow layout
        setLayout(new FlowLayout());

        // To get user input of players
        label = new JLabel("Enter number of players (2-10): ");
        add(label);

        playerInput = new JTextField(10);
        add(playerInput);

        // to get user input for win condition
        label2 = new JLabel("Enter number in a row to win (at least 3 but no more than players + 1): ");
        add(label2);

        playerInput2 = new JTextField(10);
        add(playerInput2);

        enter = new JButton("Enter");
        add(enter);

        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        
        // checks if button is pressed
        enter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // input validation: checks if player count is at least 2 but less than 10
                // checks that win condition must be at least 3 up to 1 more than players
                try {
                    String players = playerInput.getText();
                    String win = playerInput2.getText();
                    winCon = Integer.parseInt(win);
                    playercount = Integer.parseInt(players);
                    if (playercount < 2 || playercount > 10 || winCon < 3 || winCon > playercount+1) {
                        throw new NumberFormatException();
                    }
                    
                    // checks which version of tic tac toe to play

                    if (playercount == 2) {
                        TTTV1_Board t = new TTTV1_Board();
                        dispose();
                    }
                    else {
                        TTTV2_Board t2 = new TTTV2_Board();
                        dispose();
                    }
                    // System.out.println(playercount);
                    
                }

                // catch the error of bad win con or bad player count
                catch (NumberFormatException ex) {
                    JFrame n = new JFrame();
                    ImageIcon icon = new ImageIcon("TicTacToe/jpeg.png");
                    JOptionPane.showMessageDialog(n, "Enter a valid player count or win condition!", "Invalid Player Count", JOptionPane.INFORMATION_MESSAGE, icon);
                    
                }
            }
        });

    }

}
