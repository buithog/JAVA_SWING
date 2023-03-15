/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1_tuan1;

/**
 *
 * @author fpt
 */
public class Employee extends Staffmember{
    protected String id;
    protected double payRate;

    public Employee( String name, String address, String phone, String id, double payRate) {
        super(name, address, phone);
        this.id = id;
        this.payRate = payRate;
    }
    
    @Override
    public double pay() {
        return this.payRate;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public String toString(){
       return "Tên " +this.name +" Địa chỉ :"+this.address+" Sđt "+this.phone+" Lương "+this.payRate;
    }
}
