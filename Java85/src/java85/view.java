/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java85;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author fpt
 */
public class view extends JFrame{
    private Model m ;
    private JTextArea jt1;
    private JTextField jtf;
    private JLabel jl3;

    public view() {
        this.m = new Model();
        this.innit();
    }

    private void innit() {
        controler ac = new controler(this);
        
        this.setTitle("Tim kiem");
        this.setSize(800, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Font font = new Font("Courier New", Font.BOLD,20);
        JLabel jl1 = new JLabel("Van ban");
        jl1.setForeground(Color.red);
        jl1.setFont(font);
        
         jt1 = new JTextArea(100,100);
        jt1.setFont(font);
        
        JLabel jl2 = new JLabel("Tu Khoa");
        jl2.setFont(font);
        
          jtf = new JTextField();
        jtf.setFont(font);
        
        JPanel jp1 =  new JPanel(new GridLayout(4,1));
        jp1.add(jl1);
        jp1.add(jt1);
        jp1.add(jl2);
        jp1.add(jtf);
        
        // hien thi kq
        JPanel jp2 = new JPanel(new BorderLayout());
        
         jl3 = new JLabel();
        
        JButton jb1= new JButton("Tim kiem");
        jb1.addActionListener(ac);
        jp2.add(jl3,BorderLayout.WEST);
        jp2.add(jb1,BorderLayout.EAST);
        
        
        this.setLayout(new BorderLayout());
        this.add(jp1,BorderLayout.CENTER);
        this.add(jp2,BorderLayout.SOUTH);
        this.setVisible(true);
    }

    void timkiem() {
        this.m.setVanban(jt1.getText());
        this.m.setTukhoa(jtf.getText());
        this.m.timkiem();
        this.jl3.setText(this.m.getKetqua());
//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
