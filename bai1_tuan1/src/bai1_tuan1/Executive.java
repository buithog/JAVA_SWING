/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1_tuan1;

/**
 *
 * @author fpt
 */
public class Executive extends Employee{
       private double Bonus;
    public Executive(String name, String address, String phone, String id, double payRate,double bonus) {
        super(name, address, phone, id, payRate);
        this.Bonus = bonus;
    }



    public void awardBonus(double Bonus) {
        this.Bonus = Bonus;
    }

 

    @Override
    public double pay() {
        return payRate+Bonus;
    }

    @Override
        public String toString(){
            return "Tên " +this.name +" Địa chỉ :"+this.address+" Sđt "+this.phone+" Lương "+this.payRate+" thuong "+this.Bonus;
        }
    
    }
