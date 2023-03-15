/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import Model.Data;
import Action.action;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
/**
 *
 * @author fpt
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class view extends JFrame{
    private Data dt ;
    private JLabel jl_text;

    public view(Data dt) {
        this.dt = dt;
        this.innit();
        this.setVisible(true);
    }
    public void innit(){
        
        ActionListener ac = new action(this);
        
        this.setTitle("last Buton");
        this.setSize(400, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        JPanel jp_so = new JPanel();
        jp_so.setLayout(new GridLayout(2,2));
        Font font = new Font("Arial",Font.BOLD,30);
        JButton jb1 = new JButton("1");
        jb1.setForeground(Color.red);
        jb1.setFont(font);
        jb1.addActionListener(ac);
        JButton jb2 = new JButton("2");
        jb2.setForeground(Color.CYAN);
        jb2.setFont(font);
        jb2.addActionListener(ac);
        JButton jb3 = new JButton("3");
        jb3.setForeground(Color.GREEN);
        jb3.setFont(font);
        jb3.addActionListener(ac);
        JButton jb4 = new JButton("4");
        jb4.setForeground(Color.yellow);
        jb4.setFont(font);
        jb4.addActionListener(ac);
        jp_so.add(jb1);
        jp_so.add(jb2);
        jp_so.add(jb3);
        jp_so.add(jb4);
        
        
        
        JPanel jp_text = new JPanel();
         jl_text = new JLabel("hien so");
        jl_text.setFont(font);
        jp_text.add(jl_text);
        this.setLayout(new BorderLayout());
        
        this.add(jp_so,BorderLayout.NORTH);
        this.add(jp_text,BorderLayout.SOUTH);
    }
    public void update(String s){
        jl_text.setText("LAST BUTON" + s );
    }
}
