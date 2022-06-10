package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class TTTV1_Logic {
    
    static int count = 0;

    public static void checkCondition() {


        // Checks for X win conditions [manually coded since just 3 places]


        // Horizontal section

        if((TTTV1_Board.buttons[0].getText()=="X") && (TTTV1_Board.buttons[1].getText()=="X") && (TTTV1_Board.buttons[2].getText()=="X")) {
            xWon(0,1,2);
        }
        if((TTTV1_Board.buttons[3].getText()=="X") && (TTTV1_Board.buttons[4].getText()=="X") && (TTTV1_Board.buttons[5].getText()=="X")) {
            xWon(3,4,5);
        }
        if((TTTV1_Board.buttons[6].getText()=="X") && (TTTV1_Board.buttons[7].getText()=="X") && (TTTV1_Board.buttons[8].getText()=="X")) {
            xWon(6,7,8);
        }

        // Vertical Section

        if((TTTV1_Board.buttons[1].getText()=="X") && (TTTV1_Board.buttons[4].getText()=="X") && (TTTV1_Board.buttons[7].getText()=="X")) {
            xWon(1,4,7);
        }
        if((TTTV1_Board.buttons[0].getText()=="X") && (TTTV1_Board.buttons[3].getText()=="X") && (TTTV1_Board.buttons[6].getText()=="X")) {
            xWon(0,3,6);
        }
        if((TTTV1_Board.buttons[2].getText()=="X") && (TTTV1_Board.buttons[5].getText()=="X") && (TTTV1_Board.buttons[8].getText()=="X")) {
            xWon(2,5,8);
        }

        // Diagonal section

        if((TTTV1_Board.buttons[0].getText()=="X") && (TTTV1_Board.buttons[4].getText()=="X") && (TTTV1_Board.buttons[8].getText()=="X")) {
            xWon(0,4,8);
        }
        if((TTTV1_Board.buttons[2].getText()=="X") && (TTTV1_Board.buttons[4].getText()=="X") && (TTTV1_Board.buttons[6].getText()=="X")) {
            xWon(2,4,6);
        }



        // Checks for Y win conditions [manually coded since just 3 places]

        // Horizontal Section

        if((TTTV1_Board.buttons[0].getText()=="O") && (TTTV1_Board.buttons[1].getText()=="O") && (TTTV1_Board.buttons[2].getText()=="O")) {
            yWon(0,1,2);
        }
        if((TTTV1_Board.buttons[3].getText()=="O") && (TTTV1_Board.buttons[4].getText()=="O") && (TTTV1_Board.buttons[5].getText()=="O")) {
            yWon(3,4,5);
        }
        if((TTTV1_Board.buttons[6].getText()=="O") && (TTTV1_Board.buttons[7].getText()=="O") && (TTTV1_Board.buttons[8].getText()=="O")) {
            yWon(6,7,8);
        }

        // Vertical Section

        if((TTTV1_Board.buttons[1].getText()=="O") && (TTTV1_Board.buttons[4].getText()=="O") && (TTTV1_Board.buttons[7].getText()=="O")) {
            yWon(1,4,7);
        }
        if((TTTV1_Board.buttons[0].getText()=="O") && (TTTV1_Board.buttons[3].getText()=="O") && (TTTV1_Board.buttons[6].getText()=="O")) {
            yWon(0,3,6);
        }
        if((TTTV1_Board.buttons[2].getText()=="O") && (TTTV1_Board.buttons[5].getText()=="O") && (TTTV1_Board.buttons[8].getText()=="O")) {
            yWon(2,5,8);
        }

        // Diagonal Section

        if((TTTV1_Board.buttons[0].getText()=="O") && (TTTV1_Board.buttons[4].getText()=="O") && (TTTV1_Board.buttons[8].getText()=="O")) {
            yWon(0,4,8);
        }
        if((TTTV1_Board.buttons[2].getText()=="O") && (TTTV1_Board.buttons[4].getText()=="O") && (TTTV1_Board.buttons[6].getText()=="O")) {
            yWon(2,4,6);
        }

        // Checks if its a draw by checking if everything is filled without a winner
        for (int i = 0; i < 9; i++) {
            if(TTTV1_Board.buttons[i].getText() != "") {
                count++;
            }
            if(count == 9) {
                noWindraw();
            }
        }
        count = 0;

    }

    // Locks all spaces and prints draw
    // opens prompt to user to replay
    public static void noWindraw() {
        for (int j = 0; j < 9; j++) {
            TTTV1_Board.buttons[j].setBackground(Color.GRAY);
            TTTV1_Board.buttons[j].setEnabled(false);
        }
        TTTV1_Board.txt.setText("DRAW");
        Prompt p = new Prompt();
        
        
    }

    // Displays where X won and locks the spaces
    // promps user for replay or not
    public static void xWon(int n1, int n2, int n3) {
        TTTV1_Board.buttons[n1].setBackground(Color.GREEN);
        TTTV1_Board.buttons[n2].setBackground(Color.GREEN);
        TTTV1_Board.buttons[n3].setBackground(Color.GREEN);

        for (int i = 0; i < 9; i++) {
            TTTV1_Board.buttons[i].setEnabled(false);
        }
        TTTV1_Board.txt.setText("X Player wins");
        Prompt p = new Prompt();
    }

    // Displays where y won and locks the spaces
    // promps user for replay or not
    public static void yWon(int n1, int n2, int n3) {
        TTTV1_Board.buttons[n1].setBackground(Color.GREEN);
        TTTV1_Board.buttons[n2].setBackground(Color.GREEN);
        TTTV1_Board.buttons[n3].setBackground(Color.GREEN);

        for (int i = 0; i < 9; i++) {
            TTTV1_Board.buttons[i].setEnabled(false);
        }
        TTTV1_Board.txt.setText("O Player wins");
        Prompt p = new Prompt();
    }
}
