/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java87;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author fpt
 */
public class view extends JFrame{
    private Model  m ;
    private JPanel JPmouse;
    private JLabel JL_x;
    private JLabel JL_y;
    private JLabel JL_count;
    private JLabel JL_countvalue;
    private JLabel JL_checkin;
    private JLabel JL_checkin_value;
    private JLabel JL_vitri;

    public view() {
        this.m = new Model();
        this.innit();
        
    }

    private void innit() {
        
        controler ac = new controler(this);
        
         JPmouse = new JPanel();
         JPmouse.addMouseListener(ac);
         JPmouse.addMouseMotionListener(ac);
        JPmouse.setBackground(Color.CYAN);
        
        
        
        JPanel JP_kq = new JPanel(new GridLayout());
        JP_kq.setLayout(new GridLayout(3, 3));
        
        
         JL_vitri = new JLabel();
         JL_vitri.addMouseListener(ac);
         JL_x = new JLabel("x=");
         JL_x.addMouseListener(ac);
         JL_y = new JLabel("y=");
         JL_y.addMouseListener(ac);
         JL_count = new JLabel("number of  click");
         JL_countvalue = new JLabel("click ");
         JL_checkin = new JLabel("mouse is in component");
         JL_checkin_value = new JLabel();
        JP_kq.add(JL_vitri);
        JP_kq.add(JL_x);
        JP_kq.add(JL_y);
        JP_kq.add(JL_count);
        JP_kq.add(JL_countvalue);
        JP_kq.add(JL_checkin);
        JP_kq.add(JL_checkin_value);
     
        this.setLayout(new BorderLayout());
        this.add(JPmouse,BorderLayout.CENTER);
        this.add(JP_kq,BorderLayout.SOUTH);
        
        this.setTitle("mouse listener");
        this.setSize(300, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     public void click(){
        this.m.click();
        this.JL_countvalue.setText(this.m.getCount()+" ");
    }
    public void divao(){
        this.m.divao();
        this.JL_checkin_value.setText(this.m.getChekin());
    }
    public void exit(){
        this.m.exit();
        this.JL_checkin_value.setText(this.m.getChekin());
    }

    void update(int x, int y) {
       m.setX(x);
       m.setY(y);
       JL_x.setText(m.getX()+" ");
       JL_y.setText(m.getY()+" ");
            
// throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
