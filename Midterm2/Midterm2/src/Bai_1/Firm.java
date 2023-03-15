package Bai_1;

import java.util.*;

public class Firm {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList <StaffMember> list = new ArrayList<>();
        Volunteer volunteer = new Volunteer("Nguyen Van A", "Ha Noi", "0364568951");
        Employee employee = new Employee("Nguyen Van B", "Hai Duong", "091465675", "1000000", 10);
        Executive executive = new Executive("Nguyen Van C", "Nam Dinh", "0397984123", "1202452", 10, 10);
        Hourly hourly = new Hourly("Nguyen Van D", "Ha Nam", "097841256", "1456201", 10, 8);
        list.add(volunteer);
        list.add(employee);
        list.add(executive);
        list.add(hourly);
        Staff x = new Staff(list);
        System.out.println(employee.pay());
        System.out.println(executive.pay());
        System.out.println(volunteer.pay());
        System.out.println(hourly.pay());
        x.payday();
    }
}
