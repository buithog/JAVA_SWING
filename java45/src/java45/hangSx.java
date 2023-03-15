/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java45;

/**
 *
 * @author fpt
 */
public class hangSx {
    public String hang, tennuoc;

    public hangSx(String hang, String tennuoc) {
        this.hang = hang;
        this.tennuoc = tennuoc;
    }

    public String getHang() {
        return hang;
    }

    public String getTennuoc() {
        return tennuoc;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public void setTennuoc(String tennuoc) {
        this.tennuoc = tennuoc;
    }

    @Override
    public String toString() {
        return  hang + " " + tennuoc ;
    }
    
}
