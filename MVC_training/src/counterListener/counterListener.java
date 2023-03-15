/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package counterListener;

import counterView.counterView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author fpt
 */
public class counterListener implements ActionListener{
    counterView ctv ;

    public counterListener(counterView ctv) {
        this.ctv = ctv;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String src =  e.getActionCommand();
        System.out.println("ban da nhan nut: "+src);
        if(src.equals("UP")) {
            this.ctv.tang();
        }
        if(src.equals("DOWN")){
            this.ctv.giam();
        }
        if(src.equals("reset")){ 
            this.ctv.reset();
            }
        }
//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
