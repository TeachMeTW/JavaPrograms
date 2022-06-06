package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu{
    private JLabel backgroundLabel;
    private JFrame frame = new JFrame("Tic Tac Toe");
    private JPanel background;
    private JButton playButton;
    private JButton instructionButton;

    public Menu() {
        initBackground();
        initButtons();
        
    }

    public void initBackground() {
        ImageIcon icon = new ImageIcon("TicTacToe/toe.png");
        backgroundLabel = new JLabel();
        backgroundLabel.setIcon(icon);
        
        background = new JPanel();
        background.setOpaque(false);
        background.setBackground(Color.green);
        background.setBounds(-10,0,1280,800);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(1280,750);
        frame.setResizable(false);
        frame.setVisible(true);
        background.add(backgroundLabel);
        frame.add(background);
        frame.setLocationRelativeTo(null);
        
        
    }

    public void initButtons() {
        playButton = new JButton("Play");
        instructionButton = new JButton("Info");

        playButton.setBounds(590,500,100,50);
        playButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == playButton) {
                    frame.dispose();
                    Player p = new Player();
                }
            }
        });



        instructionButton.setBounds(590,560,100,50);
        
        instructionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == instructionButton) {
                    Info infoPage = new Info();
                }
            }
        });


        frame.add(playButton);
        frame.add(instructionButton);
    }

}
