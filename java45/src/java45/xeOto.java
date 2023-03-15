/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java45;

/**
 *
 * @author fpt
 */
public class xeOto extends phuongtiendichuyen{
    private String loainhienlieu;

    public xeOto(String loainhienlieu, String loaiphuongtien, hangSx hangsx) {
        super(loaiphuongtien, hangsx);
        this.loainhienlieu = loainhienlieu;
    }


    

    public String getLoainhienlieu() {
        return loainhienlieu;
    }

    public void setLoainhienlieu(String loainhienlieu) {
        this.loainhienlieu = loainhienlieu;
    }

    public String getLoaiphuongtien() {
        return loaiphuongtien;
    }

    public void setLoaiphuongtien(String loaiphuongtien) {
        this.loaiphuongtien = loaiphuongtien;
    }

    @Override
    public String toString() {
        return this.loaiphuongtien+ " "+this.loainhienlieu+" "+this.hangsx;
// throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String vantoc() {
        return "100km/h";
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
