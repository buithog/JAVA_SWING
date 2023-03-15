/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java45;

/**
 *
 * @author fpt
 */
public class maybay  extends phuongtiendichuyen{
    private String loainhienlieu;

    public maybay(String loainhienlieu, String loaiphuongtien, hangSx hangsx) {
        super(loaiphuongtien, hangsx);
        this.loainhienlieu = loainhienlieu;
    }

    @Override
    public String toString() {
        return  this.loaiphuongtien+  " "+this.loainhienlieu+" " +this.hangsx;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String vantoc() {
        return "10000km/h";
        // return "1throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

  
    
}
