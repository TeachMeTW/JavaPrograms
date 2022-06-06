package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Info {
    
    JFrame frame = new JFrame("Info");
    JLabel label = new JLabel();
    JTextArea txt = new JTextArea();

    Info() {
        // label.setText("The rules and most of the game logic will be the same as the classical Tic-Tac-Toe. Each player will take turns and put their piece on the board. One twist though in the game logic will be how many pieces the winner needs to have in a row in order to win. It will be asked to the user to decide before the game begins to select the number of 'in a row' pieces. Minimum can be 3 and maximum can be player count +1. For example, a game of four players can be chosen anywhere from 3 - 5 pieces in a row to define the winner. If the entire board is filled and there is no winner, it is a tie.");
        // label.setBounds(0,0,420,420);
        // label.setFont(new Font(null,Font.PLAIN,10));
        txt.setText("\n\n\t\tTicTacToe v2: \n\n\nThe rules of the game is simple. ");
        txt.append("After pressing play, you may choose how many players can participate (2-10). ");
        txt.append("If there are two players, classic tic tac toe will initiate. However, if 3-10 players are chosen, Tic Tac Toe 2.0 will initiate instead. ");
        txt.append("The board size would be 1 more than the player count, but you can decide how many in a row constitutes as a win. It must be more than 3 but less than the grid size. ");
        txt.append("Each player gets a unique 'signature' and if the entire board is filled without a winner, it is a tie. You can replay as many times you want.");
        txt.setBounds(10,10,420,420);
        txt.setVisible(true);
        txt.setEditable(false);
        txt.setLineWrap(true);
        txt.setWrapStyleWord(true);

        frame.add(txt);
        
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(455,455);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
