/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java45;

/**
 *
 * @author fpt
 */
public abstract class phuongtiendichuyen {
    protected String loaiphuongtien;
    protected hangSx hangsx;

    public phuongtiendichuyen(String loaiphuongtien,hangSx hangsx) {
        this.loaiphuongtien = loaiphuongtien;
        this.hangsx= hangsx;
    }

    public String getLoaiphuongtien() {
        return loaiphuongtien;
    }

    public void setLoaiphuongtien(String loaiphuongtien) {
        this.loaiphuongtien = loaiphuongtien;
    }
    public abstract String vantoc();
    @Override
    public String toString() {
        return  loaiphuongtien + " " + hangsx ;
    }
    
}
