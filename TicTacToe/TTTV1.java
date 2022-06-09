package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class TTTV1 extends JFrame {
    JFrame frame = new JFrame();
    JPanel title = new JPanel();
    JPanel buttonPanel = new JPanel();
    static JLabel txt = new JLabel();
    static JButton[] buttons = new JButton[9];
    boolean pTurn;
    

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
                                    TTTV1_Logic.checkCondition();
                                }
                            }
                            else {
                                if(buttons[i].getText()=="") {
                                    buttons[i].setForeground(new Color(0,0,255));
                                    buttons[i].setText("O");
                                    pTurn=true;
                                    txt.setText("X turn");
                                    TTTV1_Logic.checkCondition();
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



}
