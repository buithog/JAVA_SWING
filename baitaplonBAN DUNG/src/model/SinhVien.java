/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author fpt
 */
public class SinhVien implements Serializable{
    protected String maSV,tenSV,ngaySinh,diachiSV,gioitinhSV;
    protected double GPA;

    public SinhVien() {
        this.GPA=0;
        this.diachiSV="";
        this.gioitinhSV="";
        this.ngaySinh="";
        this.tenSV="";
    }

    public SinhVien(String maSV, String tenSV, String ngaySinh, String diachiSV, String gioitinhSV) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.ngaySinh = ngaySinh;
        this.diachiSV = diachiSV;
        this.gioitinhSV = gioitinhSV;
        this.GPA = 0;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiachiSV() {
        return diachiSV;
    }

    public void setDiachiSV(String diachiSV) {
        this.diachiSV = diachiSV;
    }

    public String getGioitinhSV() {
        return gioitinhSV;
    }

    public void setGioitinhSV(String gioitinhSV) {
        this.gioitinhSV = gioitinhSV;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    @Override
    public String toString(){
        return this.maSV+" "+this.tenSV+" "+this.ngaySinh+" "+this.diachiSV+" "+this.gioitinhSV+" "+this.GPA;
    }
}
