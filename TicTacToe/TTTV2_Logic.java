package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class TTTV2_Logic {

    static Map<String, Integer> pairV = new HashMap<String, Integer>();
    static Map<String, Integer> pairH = new HashMap<String, Integer>();
    static Map<String, Integer> pairDR = new HashMap<String, Integer>();
    static Map<String, Integer> pairDL = new HashMap<String, Integer>();

    static int size = (int)Math.pow((Player.playercount+1),2);
    static int col_row = Player.playercount+1; 
    static int count = 0;

    static String[] pIcon = {"X","O","A","B","C","D","E","F", "G", "H"};
    static Color[] pColors = {Color.red, Color.blue, Color.yellow, Color.ORANGE, Color.PINK, Color.MAGENTA, Color.cyan, Color.DARK_GRAY, Color.BLACK , new Color(5,12,25)};

    public static void checkCondition() {

        // Check for horiz

        // check for vert
        checkHoriz(0);
        checkVert(0);
        checkDiag(0);

        for (int i = 0; i < Player.playercount; i++) {
            pairH.put(pIcon[i], 0);
            pairV.put(pIcon[i], 0);
            pairDL.put(pIcon[i], 0);
            pairDR.put(pIcon[i], 0);
        }

        for (int i = 0; i < size; i++) {
            if(TTTV2_Board.buttons[i].getText() != "") {
                count++;
            }
            if(count == size) {
                noWindraw();
            }
        }
        count = 0;

    }

    public static void checkHoriz(int start) {
        for (int k = 1; k<col_row+1;k++) {
            for(int i = (k-1)*col_row, j = i+1;  j < k*col_row && i < k*col_row; i++, j++) {
                //System.out.println("Current b1: " + buttons[i].getText() + " Current b2: " + buttons[j].getText() + " char: " + pIcon[z]);
                if(TTTV2_Board.buttons[i].getText() == TTTV2_Board.buttons[j].getText() && (TTTV2_Board.buttons[i].getText() != "" && TTTV2_Board.buttons[j].getText() != "")) {
                    pairH.put(TTTV2_Board.buttons[j].getText(), pairH.get(TTTV2_Board.buttons[j].getText())+1);
                    for (Map.Entry <String, Integer> entry: pairH.entrySet()) {
                        if (entry.getValue() == Player.winCon-1) {
                            System.out.println("H");
                            Won(entry.getKey());
                            return;
                            }
                        }
                    //System.out.println("\n Matching " + seq);
                }

                }
            for (int i = 0; i < Player.playercount; i++) {
                pairH.put(pIcon[i], 0);
            }
        }
    }


    public static void checkVert(int start) {
        System.out.println("V " + pairV);
        for (int i = start, j = i+col_row; i<size-1 && j < size; i++, j++) {
            // System.out.println("Current b1: " + TTTV2.buttons[i].getText() + " Current b2: " + TTTV2.buttons[j].getText());
            if(TTTV2_Board.buttons[i].getText() == TTTV2_Board.buttons[j].getText() && (TTTV2_Board.buttons[i].getText() != "" && TTTV2_Board.buttons[j].getText() != "")) {
                pairV.put(TTTV2_Board.buttons[j].getText(), pairV.get(TTTV2_Board.buttons[j].getText())+1);
                // TTTV2.buttons[i].setText(TTTV2.buttons[j].getText()+" ");
                for (Map.Entry <String, Integer> entry: pairV.entrySet()) {
                    if (entry.getValue() == Player.winCon-1) {
                        System.out.println("V");
                        Won(entry.getKey());
                        return;
                    }
                }
                checkVert(j);
                // System.out.println("\n Matching " + seq);
            }

        }
        for (int i = 0; i < Player.playercount; i++) {
            pairV.put(pIcon[i], 0);
        }
    }

    public static void checkDiag(int start) {
        System.out.println("DL " + pairDL);
        System.out.println("DR " + pairDR);
        for (int i = start, j = i+col_row+1; i<size-1 && j < size; i++, j++) {
            int k = i+col_row-1;
            if (k >= col_row) {
                if((TTTV2_Board.buttons[i].getText() == TTTV2_Board.buttons[k].getText() && (TTTV2_Board.buttons[i].getText() != "" && TTTV2_Board.buttons[k].getText() != ""))) {
                    pairDL.put(TTTV2_Board.buttons[k].getText(), pairDL.get(TTTV2_Board.buttons[k].getText())+1);
                    //TTTV2.buttons[i].setText(TTTV2.buttons[k].getText()+" ");
                    for (Map.Entry <String, Integer> entry: pairDL.entrySet()) {
                        if (entry.getValue() == Player.winCon-1) {
                            System.out.println("DL");
                            Won(entry.getKey());
                            return;
                        }
                    }
                    checkDiag(k);
                    //System.out.println("\n Matching " + seq);
                }

            }
            if((TTTV2_Board.buttons[i].getText() == TTTV2_Board.buttons[j].getText() && (TTTV2_Board.buttons[i].getText() != "" && TTTV2_Board.buttons[j].getText() != ""))) {
                pairDR.put(TTTV2_Board.buttons[j].getText(), pairDR.get(TTTV2_Board.buttons[j].getText())+1);
                // TTTV2.buttons[i].setText(TTTV2.buttons[j].getText()+" ");
                for (Map.Entry <String, Integer> entry: pairDR.entrySet()) {
                    if (entry.getValue() == Player.winCon-1) {
                        System.out.println("DR");
                        Won(entry.getKey());
                        return;
                    }
                }
                checkDiag(j);
                // System.out.println("\n Matching " + seq);
            }


        }
        for (int i = 0; i < Player.playercount; i++) {
            pairDR.put(pIcon[i], 0);
            pairDL.put(pIcon[i], 0);
        }
    }

    public static void noWindraw() {
    
        for (int j = 0; j < size; j++) {
            TTTV2_Board.buttons[j].setBackground(Color.GRAY);
            TTTV2_Board.buttons[j].setEnabled(false);
        }
        TTTV2_Board.txt.setText("DRAW");
        Prompt p = new Prompt();
        
        //dispose();
        
    }
    public static void Won(String winner) {
        for (int i = 0; i < size; i++) {
            if (winner == TTTV2_Board.buttons[i].getText()) {
                TTTV2_Board.buttons[i].setBackground(Color.GREEN);
            }
            TTTV2_Board.buttons[i].setEnabled(false);
        }
        TTTV2_Board.txt.setText(winner + " Player wins");
        Prompt p = new Prompt();
        
        //dispose();
    }

}
