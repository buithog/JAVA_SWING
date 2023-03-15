package baitapbuoi5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class QLSV implements Menu {
    public static List<Sinhvien> a = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    QLSV() {
    }
    public static void main(String[] args) {
        QLSV qlsv = new QLSV();
        while (true) {
            System.out.println("----- menu-----");
            System.out.println("1.themSV");
            System.out.println("6.thoat");
            System.out.println("lua chon");
            int n = Integer.valueOf(sc.nextLine());
            if(n == 1) qlsv.themSV();
            if(n == 2) qlsv.xemSV();
            if(n==3) qlsv.sapxeptheotenSV();
        }
    }

    @Override
    public void themSV() {
        String ten = sc.nextLine();
        int tuoi = Integer.valueOf(sc.nextLine());
        a.add( new Sinhvien(ten, tuoi));
    }

    @Override
    public void xemSV() {
        for (Sinhvien x : a) {
            System.out.println(x);
        }
    }

    @Override
    public void sapxeptheotenSV() {
        // TODO-generated method stub
        Collections.sort(a);

    }

    @Override
    public void sapxeptheptuoiSV() {
        // TODO Auto-generated method stub

    }

    @Override
    public void thoat() {
        // TODO Auto-generated method stub
        System.exit(0);
    }

    @Override
    public void xoaSV() {
        // TODO Auto-generated method stub

    }
}
