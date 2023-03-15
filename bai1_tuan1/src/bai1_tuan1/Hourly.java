/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1_tuan1;

/**
 *
 * @author fpt
 */
public class Hourly extends Employee{
     private int hw;

    public Hourly(String name, String address, String phone, String id, double payRate,int hw) {
        super(name, address, phone, id, payRate);
        this.hw =hw;
    }
    
    
    public void addH(int h){
        this.hw =h;
    }


    @Override
    public double pay() {
        return payRate*hw;
    }

    
    @Override
    public String toString(){
        return "Tên " +this.name +" Địa chỉ :"+this.address+" Sđt "+this.phone+" Lương "+this.payRate+" Giờ Làm "+this.hw;
    }
}
