/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1_tuan1;

/**
 *
 * @author fpt
 */
public class Volumteer extends Staffmember{
    public Volumteer(String name, String address, String phone) {
        super(name, address, phone);
    }

    @Override
    public double pay() {  
        return 0;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public String toString(){
        return "Tên " +this.name +" Địa chỉ :"+this.address+" Sđt "+this.phone+" Lương 0";
    }
}
