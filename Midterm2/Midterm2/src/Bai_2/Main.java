package Bai_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    JRadioButton red;
    JRadioButton yellow;
    JRadioButton black;
    JRadioButton orange;
    JRadioButton green;
    ButtonGroup btg;
    JPanel jPanel;
    JLabel jLabel;
    JButton jb1;
    JButton jb2;
    JPanel jpnFooter;

    int x1 = 280, y1 = 100;
    public Main(){
        JFrame f = new JFrame();
        f.setTitle("My Application");
        f.setSize(800, 450);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setBackground(Color.GRAY);
        Container c = f.getContentPane();

        red = new JRadioButton("Red");
        red.setBounds(10, 10, 80, 40);
        red.setFont(new Font("Arial", Font.BOLD, 14));
        yellow = new JRadioButton("Yellow");
        yellow.setBounds(100, 10, 80, 40);
        yellow.setFont(new Font("Arial", Font.BOLD, 14));
        black = new JRadioButton("Black");
        black.setBounds(190, 10, 80, 40);
        black.setFont(new Font("Arial", Font.BOLD, 14));
        orange = new JRadioButton("Orange");
        orange.setBounds(280, 10, 80, 40);
        orange.setFont(new Font("Arial", Font.BOLD, 14));
        green = new JRadioButton("Green");
        green.setBounds(370, 10, 80 ,40);
        green.setFont(new Font("Arial", Font.BOLD, 14));

        btg = new ButtonGroup();
        btg.add(red);
        btg.add(yellow);
        btg.add(black);
        btg.add(orange);
        btg.add(green);

        f.add(red);
        f.add(yellow);
        f.add(black);
        f.add(orange);
        f.add(green);

        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res = e.getActionCommand();
                if (res.equals("Red")) jLabel.setForeground(Color.RED);
            }
        });

        yellow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res = e.getActionCommand();
                if (res.equals("Yellow")) jLabel.setForeground(Color.YELLOW);
            }
        });

        black.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res = e.getActionCommand();
                if (res.equals("Black")) jLabel.setForeground(Color.BLACK);
            }
        });

        orange.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res = e.getActionCommand();
                if (res.equals("Orange")) jLabel.setForeground(Color.ORANGE);
            }
        });

        green.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res = e.getActionCommand();
                if (res.equals("Green")) jLabel.setForeground(Color.GREEN);
            }
        });

        jPanel = new JPanel();
        jPanel.setBounds(10, 60, 760, 260);
        jPanel.setLayout(null);
        jLabel = new JLabel("Programming is fun!");
        jLabel.setFont(new Font("Arial", Font.BOLD, 20));
        jLabel.setBounds(x1, y1, 200, 50);
        jPanel.add(jLabel);
        f.add(jPanel);
        jPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        jb1 = new JButton("<=");
        jb2 = new JButton(">=");

        jb1.setBounds(320, 350, 50, 30);
        jb1.setBackground(Color.green);
        jb2.setBounds(400, 350, 50, 30);
        jb2.setBackground(Color.green);

        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res = e.getActionCommand();
                if (res.equals("<=") && x1 >= 10){
                    x1 -= 5;
                    jLabel.setBounds(x1, y1, 200, 50);
                }
            }
        });

        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res = e.getActionCommand();
                if (res.equals(">=") && x1 <= 550){
                    x1 += 5;
                    jLabel.setBounds(x1, y1, 200, 50);
                }
            }
        });

        f.add(jb1);
        f.add(jb2);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
