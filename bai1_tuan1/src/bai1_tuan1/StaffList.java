/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1_tuan1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fpt
 */
public class StaffList {
    private List<Staffmember> l;
    private double n;

    public StaffList() {
        this.l = new ArrayList<>();
        this.n=0;
        Volumteer v =  new Volumteer("Bui Van Thong", "Bac Giang", "012345678");
        this.l.add(v);
        Executive e = new Executive("Bui Van Thong", "Bac Giang", "012345678", "123141414124", 100000, 200);
        this.l.add(e);
        Hourly h = new  Hourly("Bui Van Thong", "Bac Giang", "012345678", "123141414124", 1100, 2);
        this.l.add(h);
    }
    public void daypay(){
        for(Staffmember x : l) {
            this.n+= x.pay();
        }
        System.out.println("Tong luong: " + this.n );
    }
    public void xem(){
        for(Staffmember x: l){
            System.out.println(x);
        }
    }
}
