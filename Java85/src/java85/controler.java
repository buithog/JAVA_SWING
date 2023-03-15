/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java85;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author fpt
 */
public class controler implements ActionListener{
    view v ;

    public controler(view v) {
        this.v = v;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if(src.equals("Tim kiem")){
            v.timkiem();
        }
//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
