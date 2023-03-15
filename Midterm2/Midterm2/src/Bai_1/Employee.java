package Bai_1;

public class Employee extends StaffMember{
    protected String socialSecurityNumber;
    protected double payRate;

    public Employee() {
    }

    public Employee(String name, String address, String phone, String socialSecurityNumber, double payRate) {
        super(name, address, phone);
        this.socialSecurityNumber = socialSecurityNumber;
        this.payRate = payRate;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.socialSecurityNumber + " " + this.payRate;
    }

    public double pay(){
        return this.payRate;
    }
}
