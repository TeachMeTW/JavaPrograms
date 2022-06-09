package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class TTTV1_Logic {
    
    static int count = 0;

    public static void checkCondition() {
        if((TTTV1.buttons[0].getText()=="X") && (TTTV1.buttons[1].getText()=="X") && (TTTV1.buttons[2].getText()=="X")) {
            xWon(0,1,2);
        }
        if((TTTV1.buttons[3].getText()=="X") && (TTTV1.buttons[4].getText()=="X") && (TTTV1.buttons[5].getText()=="X")) {
            xWon(3,4,5);
        }
        if((TTTV1.buttons[6].getText()=="X") && (TTTV1.buttons[7].getText()=="X") && (TTTV1.buttons[8].getText()=="X")) {
            xWon(6,7,8);
        }
        if((TTTV1.buttons[1].getText()=="X") && (TTTV1.buttons[4].getText()=="X") && (TTTV1.buttons[7].getText()=="X")) {
            xWon(1,4,7);
        }
        if((TTTV1.buttons[0].getText()=="X") && (TTTV1.buttons[3].getText()=="X") && (TTTV1.buttons[6].getText()=="X")) {
            xWon(0,3,6);
        }
        if((TTTV1.buttons[2].getText()=="X") && (TTTV1.buttons[5].getText()=="X") && (TTTV1.buttons[8].getText()=="X")) {
            xWon(2,5,8);
        }
        if((TTTV1.buttons[0].getText()=="X") && (TTTV1.buttons[4].getText()=="X") && (TTTV1.buttons[8].getText()=="X")) {
            xWon(0,4,8);
        }
        if((TTTV1.buttons[2].getText()=="X") && (TTTV1.buttons[4].getText()=="X") && (TTTV1.buttons[6].getText()=="X")) {
            xWon(2,4,6);
        }


        if((TTTV1.buttons[0].getText()=="O") && (TTTV1.buttons[1].getText()=="O") && (TTTV1.buttons[2].getText()=="O")) {
            yWon(0,1,2);
        }
        if((TTTV1.buttons[3].getText()=="O") && (TTTV1.buttons[4].getText()=="O") && (TTTV1.buttons[5].getText()=="O")) {
            yWon(3,4,5);
        }
        if((TTTV1.buttons[6].getText()=="O") && (TTTV1.buttons[7].getText()=="O") && (TTTV1.buttons[8].getText()=="O")) {
            yWon(6,7,8);
        }
        if((TTTV1.buttons[1].getText()=="O") && (TTTV1.buttons[4].getText()=="O") && (TTTV1.buttons[7].getText()=="O")) {
            yWon(1,4,7);
        }
        if((TTTV1.buttons[0].getText()=="O") && (TTTV1.buttons[3].getText()=="O") && (TTTV1.buttons[6].getText()=="O")) {
            yWon(0,3,6);
        }
        if((TTTV1.buttons[2].getText()=="O") && (TTTV1.buttons[5].getText()=="O") && (TTTV1.buttons[8].getText()=="O")) {
            yWon(2,5,8);
        }
        if((TTTV1.buttons[0].getText()=="O") && (TTTV1.buttons[4].getText()=="O") && (TTTV1.buttons[8].getText()=="O")) {
            yWon(0,4,8);
        }
        if((TTTV1.buttons[2].getText()=="O") && (TTTV1.buttons[4].getText()=="O") && (TTTV1.buttons[6].getText()=="O")) {
            yWon(2,4,6);
        }

        for (int i = 0; i < 9; i++) {
            if(TTTV1.buttons[i].getText() != "") {
                count++;
            }
            if(count == 9) {
                noWindraw();
            }
        }
        count = 0;

    }
    public static void noWindraw() {
        for (int j = 0; j < 9; j++) {
            TTTV1.buttons[j].setBackground(Color.GRAY);
            TTTV1.buttons[j].setEnabled(false);
        }
        TTTV1.txt.setText("DRAW");
        Prompt p = new Prompt();
        
        
    }
    public static void xWon(int n1, int n2, int n3) {
        TTTV1.buttons[n1].setBackground(Color.GREEN);
        TTTV1.buttons[n2].setBackground(Color.GREEN);
        TTTV1.buttons[n3].setBackground(Color.GREEN);

        for (int i = 0; i < 9; i++) {
            TTTV1.buttons[i].setEnabled(false);
        }
        TTTV1.txt.setText("X Player wins");
        Prompt p = new Prompt();
    }

    public static void yWon(int n1, int n2, int n3) {
        TTTV1.buttons[n1].setBackground(Color.GREEN);
        TTTV1.buttons[n2].setBackground(Color.GREEN);
        TTTV1.buttons[n3].setBackground(Color.GREEN);

        for (int i = 0; i < 9; i++) {
            TTTV1.buttons[i].setEnabled(false);
        }
        TTTV1.txt.setText("O Player wins");
        Prompt p = new Prompt();
    }
}
