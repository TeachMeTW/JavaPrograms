package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Prompt extends JFrame {
    JPanel p = new JPanel();
    JLabel l = new JLabel("Replay?");
    Prompt() {
        setSize(200,200);
        JButton y = new JButton("Yes");
        JButton n = new JButton("No");

        p.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        p.setLayout(new GridLayout(0,1));
        p.add(y);
        p.add(n);
        p.add(l);
        

        setVisible(true);
        setLocationRelativeTo(null);
        y.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Menu m = new Menu();
                
            }
        });
        n.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        add(p, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
