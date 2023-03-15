package Bai_1;

import java.util.Scanner;

public class Executive extends Employee{
    private double bonus;

    public Executive() {
    }

    public Executive(String name, String address, String phone, String socialSecurityNumber, double payRate, double bonus) {
        super(name, address, phone, socialSecurityNumber, payRate);
        this.bonus = bonus;
    }

    public void awardBonus(double execBonus){
        Scanner sc = new Scanner (System.in);
        execBonus = sc.nextDouble();
    }

    public double pay(){
        return super.payRate + this.bonus;
    }
}
