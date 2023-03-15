/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author fpt
 */
public class diemSV implements Serializable{
    private List<monHoc> list_Monhoc= new ArrayList<>();
    private SinhVien a ;
    public diemSV(SinhVien a){
        this.a=a;
        this.list_Monhoc = list_Monhoc;
                
    }

    public diemSV() {
         this.list_Monhoc=new ArrayList<>();
         this.a=new SinhVien();
    }

    public SinhVien getA() {
        return a;
    }

    
    
    
    
    
    
    public void tinhGPA(){
        int tongTinchi = 0;
        double tongdiem = 0;
        a.setGPA(0);
        for(monHoc x:list_Monhoc){
            tongTinchi += x.getSoTinchi();
            tongdiem += x.getDiem()*x.getSoTinchi();
        }
        a.setGPA((tongdiem/tongTinchi)*4/10);
        tongTinchi=0;tongdiem=0;
    }
    public void addMonhoc(monHoc b){
        this.list_Monhoc.add(b);
        this.tinhGPA();
    }
    
    public void suatheomamon(String mamon,double diem,monHoc b,int tc){
        int ok = 0;
        for(monHoc x: this.getList_Monhoc()){
            if(x.getMaMonhoc().equals(mamon)) {
                
                x.setDiem(diem);
               
                x.setSoTinchi(tc);
                ok=1;
            }
            tinhGPA();
            break;
        }
        if(ok == 0 ) addMonhoc(b);
    }
    public boolean timmamon(String mamon){
        for(monHoc x : this.getList_Monhoc()){
            if(x.getMaMonhoc().equals(mamon)) return true;
        }
        return false;
    }
    public void xoatheomaMonhoc(String mamon){
        for(monHoc x: this.list_Monhoc){
            if(x.getMaMonhoc().equals(mamon)){
                list_Monhoc.remove(x);
                this.tinhGPA();
                break;
            }
        }
    }
    
    
    
    
    
    
    
    public List<monHoc> getList_Monhoc() {
        return list_Monhoc;
    }

    public void setList_Monhoc(List<monHoc> list_Monhoc) {
        this.list_Monhoc = list_Monhoc;
    }

    public String getMaSV() {
        return a.maSV;
    }

    public void setMaSV(String maSV) {
        a.setMaSV(maSV);
    }

    public String getTenSV() {
        return a.getTenSV();
    }

    public void setTenSV(String tenSV) {
        a.setTenSV(tenSV);
    }

    public String getNgaySinh() {
        return a.getNgaySinh();
    }

    public void setNgaySinh(String ngaySinh) {
        a.setNgaySinh(ngaySinh);
    }

    public String getDiachiSV() {
        return a.getDiachiSV();
    }

    public void setDiachiSV(String diachiSV) {
        a.setDiachiSV(diachiSV);
    }

    public String getGioitinhSV() {
        return a.getGioitinhSV();
    }

    public void setGioitinhSV(String gioitinhSV) {
        a.setGioitinhSV(gioitinhSV);
    }

    public double getGPA() {
        return a.getGPA();
    }  
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.list_Monhoc);
        hash = 29 * hash + Objects.hashCode(this.a);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final diemSV other = (diemSV) obj;
        return true;
    }
   
}
