package Bai_1;

public class Hourly extends Employee{
    private int hoursWorked;

    public Hourly(String name, String address, String phone, String socialSecurityNumber, double payRate, int hoursWorked) {
        super(name, address, phone, socialSecurityNumber, payRate);
        this.hoursWorked = hoursWorked;
    }

    public void addHours (int moreHours){
        System.out.println(this.hoursWorked);
    }

    public double pay(){
        return super.payRate * this.hoursWorked;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.hoursWorked;
    }
}
