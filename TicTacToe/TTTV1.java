package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class TTTV1 extends JFrame {
    JFrame frame = new JFrame();
    JPanel title = new JPanel();
    JPanel buttonPanel = new JPanel();
    JLabel txt = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean pTurn;
    int count = 0;

    TTTV1() {
        setTitle("Tic Tac Toe V1");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(800,800);
        
        getContentPane().setBackground(new Color(50,50,50));

        setLayout(new BorderLayout());

        setVisible(true);

        

        txt.setBackground(new Color(25,25,25));
        txt.setForeground(new Color(210,105,30));
        txt.setFont(new Font("Comic Sans MS", Font.BOLD,75));
        txt.setHorizontalAlignment(JLabel.CENTER);
        txt.setText("Tic Tac Toe");
        txt.setOpaque(true);

        title.setLayout(new BorderLayout());
        title.setBounds(0,0,800,100);

        buttonPanel.setLayout(new GridLayout(3,3));

        for(int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttonPanel.add(buttons[i]);
            buttons[i].setFont(new Font("Times New Roman", Font.BOLD, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    for(int i=0;i<9;i++) {
                        if(e.getSource()==buttons[i]) {
                            if(pTurn) {
                                if(buttons[i].getText()=="") {
                                    buttons[i].setForeground(new Color(255,0,0));
                                    buttons[i].setText("X");
                                    pTurn=false;
                                    txt.setText("O turn");
                                    checkCondition();
                                }
                            }
                            else {
                                if(buttons[i].getText()=="") {
                                    buttons[i].setForeground(new Color(0,0,255));
                                    buttons[i].setText("O");
                                    pTurn=true;
                                    txt.setText("X turn");
                                    checkCondition();
                                }
                            }
                        }			
                    }
                }
            });
        }

        title.add(txt);
        add(title,BorderLayout.NORTH);
        add(buttonPanel);
        setLocationRelativeTo(null);
    }


    public void checkCondition() {
        if((buttons[0].getText()=="X") && (buttons[1].getText()=="X") && (buttons[2].getText()=="X")) {
            xWon(0,1,2);
        }
        if((buttons[3].getText()=="X") && (buttons[4].getText()=="X") && (buttons[5].getText()=="X")) {
            xWon(3,4,5);
        }
        if((buttons[6].getText()=="X") && (buttons[7].getText()=="X") && (buttons[8].getText()=="X")) {
            xWon(6,7,8);
        }
        if((buttons[1].getText()=="X") && (buttons[4].getText()=="X") && (buttons[7].getText()=="X")) {
            xWon(1,4,7);
        }
        if((buttons[0].getText()=="X") && (buttons[3].getText()=="X") && (buttons[6].getText()=="X")) {
            xWon(0,3,6);
        }
        if((buttons[2].getText()=="X") && (buttons[5].getText()=="X") && (buttons[8].getText()=="X")) {
            xWon(2,5,8);
        }
        if((buttons[0].getText()=="X") && (buttons[4].getText()=="X") && (buttons[8].getText()=="X")) {
            xWon(0,4,8);
        }
        if((buttons[2].getText()=="X") && (buttons[4].getText()=="X") && (buttons[6].getText()=="X")) {
            xWon(2,4,6);
        }


        if((buttons[0].getText()=="O") && (buttons[1].getText()=="O") && (buttons[2].getText()=="O")) {
            yWon(0,1,2);
        }
        if((buttons[3].getText()=="O") && (buttons[4].getText()=="O") && (buttons[5].getText()=="O")) {
            yWon(3,4,5);
        }
        if((buttons[6].getText()=="O") && (buttons[7].getText()=="O") && (buttons[8].getText()=="O")) {
            yWon(6,7,8);
        }
        if((buttons[1].getText()=="O") && (buttons[4].getText()=="O") && (buttons[7].getText()=="O")) {
            yWon(1,4,7);
        }
        if((buttons[0].getText()=="O") && (buttons[3].getText()=="O") && (buttons[6].getText()=="O")) {
            yWon(0,3,6);
        }
        if((buttons[2].getText()=="O") && (buttons[5].getText()=="O") && (buttons[8].getText()=="O")) {
            yWon(2,5,8);
        }
        if((buttons[0].getText()=="O") && (buttons[4].getText()=="O") && (buttons[8].getText()=="O")) {
            yWon(0,4,8);
        }
        if((buttons[2].getText()=="O") && (buttons[4].getText()=="O") && (buttons[6].getText()=="O")) {
            yWon(2,4,6);
        }

        for (int i = 0; i < 9; i++) {
            if(buttons[i].getText() != "") {
                count++;
            }
            if(count == 9) {
                noWindraw();
            }
        }
        count = 0;

    }
    public void noWindraw() {
        for (int j = 0; j < 9; j++) {
            buttons[j].setBackground(Color.GRAY);
            buttons[j].setEnabled(false);
        }
        txt.setText("DRAW");
        Prompt p = new Prompt();
        
        
    }
    public void xWon(int n1, int n2, int n3) {
        buttons[n1].setBackground(Color.GREEN);
        buttons[n2].setBackground(Color.GREEN);
        buttons[n3].setBackground(Color.GREEN);

        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        txt.setText("X Player wins");
        Prompt p = new Prompt();
    }

    public void yWon(int n1, int n2, int n3) {
        buttons[n1].setBackground(Color.GREEN);
        buttons[n2].setBackground(Color.GREEN);
        buttons[n3].setBackground(Color.GREEN);

        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        txt.setText("O Player wins");
        Prompt p = new Prompt();
    }
}
