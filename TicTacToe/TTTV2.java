package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;


public class TTTV2 extends JFrame {
    JFrame frame = new JFrame();
    JPanel title = new JPanel();
    JPanel buttonPanel = new JPanel();
    JLabel txt = new JLabel();
    int size = (int)Math.pow((Player.playercount+1),2);
    int col_row = Player.playercount+1; 
    JButton[] buttons = new JButton[size];
    boolean[] players = new boolean[col_row];
    boolean gameEnd = false;
    int count = 0;
    int seq = 0;

    String[] pIcon = {"X","O","A","B","C","D","E","F", "G", "H"};
    Color[] pColors = {Color.red, Color.blue, Color.yellow, Color.ORANGE, Color.PINK, Color.MAGENTA, Color.cyan, Color.DARK_GRAY, Color.BLACK , new Color(5,12,25)};

    TTTV2() {
        setTitle("Tic Tac Toe V2");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(800,800);
        
        getContentPane().setBackground(new Color(50,50,50));

        setLayout(new BorderLayout());

        setVisible(true);

        

        txt.setBackground(new Color(25,25,25));
        txt.setForeground(new Color(25,255,0));
        txt.setFont(new Font("Comic Sans MS", Font.BOLD,75));
        txt.setHorizontalAlignment(JLabel.CENTER);
        txt.setText("Tic Tac Toe");
        txt.setOpaque(true);

        title.setLayout(new BorderLayout());
        title.setBounds(0,0,800,100);

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
                                        txt.setText(pIcon[j] + " turn");
                                        checkCondition();
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


    public void checkCondition() {

        // Check for horiz
        for (int k = 1; k<col_row+1;k++) {
            for(int i = (k-1)*col_row, j = i+1;  j < k*col_row && i < k*col_row; i++, j++) {
                //System.out.println("Current b1: " + buttons[i].getText() + " Current b2: " + buttons[j].getText() + " char: " + pIcon[z]);
                if(buttons[i].getText() == buttons[j].getText() && (buttons[i].getText() != "" && buttons[j].getText() != "")) {
                    seq++;
                    //System.out.println("\n Matching " + seq);
                }
                if (seq == Player.winCon-1) {
                    Won(buttons[i].getText());
                    break;
                    
                }
            }
            seq = 0;
        }




        for (int i = 0; i < size; i++) {
            if(buttons[i].getText() != "") {
                count++;
            }
            if(count == size) {
                noWindraw();
            }
        }
        count = 0;

    }
    public void noWindraw() {
        gameEnd = true;
        for (int j = 0; j < size; j++) {
            buttons[j].setBackground(Color.GRAY);
            buttons[j].setEnabled(false);
        }
        txt.setText("DRAW");
        Prompt p = new Prompt();
        //dispose();
        
    }
    public void Won(String winner) {
        for (int i = 0; i < size; i++) {
            buttons[i].setEnabled(false);
        }
        txt.setText(winner + " Player wins");
        Prompt p = new Prompt();
        //dispose();
    }

}
