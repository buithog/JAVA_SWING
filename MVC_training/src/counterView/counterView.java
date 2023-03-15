/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package counterView;

import counterListener.counterListener;
import counterView.counterModel;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author fpt
 */
public class counterView extends JFrame{
    private counterModel ctm;
    private JButton jb1 = new JButton();
    private JButton jb2 = new JButton();
    private JButton jb3 ;
    private JLabel jl1 = new JLabel();


    public counterView(counterModel ctm) {
        this.ctm = new counterModel(0);
        this.innit();
        this.setVisible(true);
    }

    public counterView() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void innit() {
        
        ActionListener ac = new counterListener(this);
        
        this.setTitle("Couter View");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jb1 = new JButton("UP");
        jb1.addActionListener(ac);
        jb2=new JButton("DOWN");
        jb2.addActionListener(ac);
        jb3 = new JButton("reset");
        jb3.addActionListener(ac);
        jl1 = new JLabel(this.ctm.getValue()+"",JLabel.CENTER);
        JPanel jp1 = new JPanel(new BorderLayout());
        jp1.add(jb1,BorderLayout.WEST);
        jp1.add(jb2,BorderLayout.EAST);
        jp1.add(jb3,BorderLayout.SOUTH);
        jp1.add(jl1,BorderLayout.CENTER);
        this.setLayout(new BorderLayout());
        this.add(jp1,BorderLayout.CENTER);
              
    }
    public void tang(){
        this.ctm.tang();
        this.jl1.setText(this.ctm.getValue()+"");
    }
     public void giam(){
        this.ctm.giam();
        this.jl1.setText(this.ctm.getValue()+"");
    }
     public void reset(){
        this.ctm.lamMoi();
        this.jl1.setText(this.ctm.getValue()+"");
    }
//    public static void main(String[] args) {
//        counterView ctv = new counterView(new counterModel(0));
//    }
}
