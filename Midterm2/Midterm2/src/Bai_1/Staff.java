package Bai_1;

import java.util.ArrayList;

public class Staff {
    private ArrayList<StaffMember> staffList;

    public Staff(ArrayList<StaffMember> staffList) {
        this.staffList = staffList;
    }

    public void payday(){
        double ans = 0;
        for (StaffMember x : staffList){
            ans += x.pay();
        }
        System.out.println(ans);
    }
}
