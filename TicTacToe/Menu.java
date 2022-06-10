package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu{

    // Window components + button
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

        // set background for window
        ImageIcon icon = new ImageIcon("TicTacToe/toe.png");
        backgroundLabel = new JLabel();
        backgroundLabel.setIcon(icon);
        
        background = new JPanel();
        background.setOpaque(false);
        background.setBackground(Color.green);
        background.setBounds(-10,0,1280,800);

        // set window properties
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

        // create instruction and play button
        playButton = new JButton("Play");
        instructionButton = new JButton("Info");

        // set play button position
        playButton.setBounds(590,500,100,50);

        // set what happens when button is pressed
        playButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == playButton) {
                    // close current and open the player information window
                    frame.dispose();
                    Player p = new Player();
                }
            }
        });


        // set instruction position
        instructionButton.setBounds(590,560,100,50);
        
        // set what happens when button is pressed
        instructionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == instructionButton) {
                    // open the info panel
                    Info infoPage = new Info();
                }
            }
        });

        frame.add(playButton);
        frame.add(instructionButton);
    }

}
