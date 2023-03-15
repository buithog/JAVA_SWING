/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1_tuan1;

/**
 *
 * @author fpt
 */
public abstract class Staffmember {
    protected String  name, address,phone;

    public Staffmember(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    public abstract double pay ();
    
    @Override
    public String toString(){
        return "Tên " +this.name +" Địa chỉ :"+this.address+" Sđt "+this.phone;
    }
            
}
