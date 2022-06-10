package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;


public class TTTV2_Board extends JFrame {
    JFrame frame = new JFrame();
    JPanel title = new JPanel();
    JPanel buttonPanel = new JPanel();
    
    static JLabel txt = new JLabel();
    static int size = (int)Math.pow((Player.playercount+1),2);
    static JButton[] buttons = new JButton[size];

    int col_row = Player.playercount+1; 
    boolean[] players = new boolean[col_row];
    
    String[] pIcon = {"X","O","A","B","C","D","E","F", "G", "H"};
    Color[] pColors = {Color.red, Color.blue, Color.yellow, Color.ORANGE, Color.PINK, Color.MAGENTA, Color.cyan, Color.DARK_GRAY, Color.BLACK , new Color(5,12,25)};

    TTTV2_Board() {
        setTitle("Tic Tac Toe V2");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(800,800);
        
        getContentPane().setBackground(new Color(210,105,30));

        setLayout(new BorderLayout());

        setVisible(true);


        txt.setBackground(new Color(25,25,25));
        txt.setForeground(new Color(255,255,255));
        txt.setFont(new Font("Comic Sans MS", Font.BOLD,75));
        txt.setHorizontalAlignment(JLabel.CENTER);
        txt.setText("Tic Tac Toe");
        txt.setOpaque(true);

        title.setLayout(new BorderLayout());
        title.setBounds(0,0,800,100);

        // Fill hashmap
        
        for (int i = 0; i < Player.playercount; i++) {
           TTTV2_Logic.pairH.put(pIcon[i], 0);
           TTTV2_Logic.pairV.put(pIcon[i], 0);
           TTTV2_Logic.pairDL.put(pIcon[i], 0);
           TTTV2_Logic.pairDR.put(pIcon[i], 0);
        }

        
        buttonPanel.setLayout(new GridLayout(col_row,col_row));
        for (int g = 0; g < col_row; g++) {
            players[g] = true;
        }

        for(int i = 0; i < size; i++) {
            buttons[i] = new JButton();
            buttonPanel.add(buttons[i]);
            buttons[i].setFont(new Font("Times New Roman", Font.BOLD, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    for(int i=0;i<size;i++) {
                        if(e.getSource()==buttons[i]) {
                            for (int k = 0; k < (col_row-1); k++ ) { 
                                if (players[k]) {
                                    
                                    if(buttons[i].getText()=="") {
                                        buttons[i].setForeground(pColors[k]);
                                        buttons[i].setText(pIcon[k]);
                                        players[k]=false;
                                        int j = (k + 1) % (col_row-1); // index for next active player
                                        players[j] = true; // mark next active player
                                        txt.setForeground(pColors[j]);
                                        txt.setText(pIcon[j] + " turn");
                                        TTTV2_Logic.checkCondition();
                                        break; 
                                    }
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
