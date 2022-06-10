package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Info {
    

    // Create info panel

    JFrame frame = new JFrame("Info");
    JLabel label = new JLabel();
    JTextArea txt = new JTextArea();

    Info() {


        // Info text    
        txt.setText("\n\n\t\tTicTacToe v2: \n\n\nThe rules of the game is simple. ");
        txt.append("After pressing play, you may choose how many players can participate (2-10). ");
        txt.append("If there are two players, classic tic tac toe will initiate. However, if 3-10 players are chosen, Tic Tac Toe 2.0 will initiate instead. ");
        txt.append("The board size would be 1 more than the player count, but you can decide how many in a row constitutes as a win. It must be more than 3 but less than the grid size. ");
        txt.append("Each player gets a unique 'signature' and if the entire board is filled without a winner, it is a tie. You can replay as many times you want.");

        // set position of text
        txt.setBounds(10,10,420,420);
        txt.setVisible(true);
        txt.setEditable(false);
        txt.setLineWrap(true);
        txt.setWrapStyleWord(true);

        frame.add(txt);
        
        // Set window properties
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(455,455);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
