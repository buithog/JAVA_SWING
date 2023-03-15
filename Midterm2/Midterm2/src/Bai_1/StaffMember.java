package Bai_1;

public abstract class StaffMember {
    protected String name;
    protected String address;
    protected String phone;

    public StaffMember() {
    }

    public StaffMember(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return this.name + " " + this.address + " " + this.phone;
    }

    public abstract double pay();
}
