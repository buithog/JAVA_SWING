/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author fpt
 */
public class monHoc implements Serializable{
    private String maMonhoc,tenmonhoc;
    private double diem;
    private int soTinchi;

    public monHoc() {
        this.diem=0;
        this.maMonhoc="";
        this.soTinchi=0;
        this.tenmonhoc="";
    }

    public monHoc(String maMonhoc, String tenmonhoc,  int soTinchi,double diem) {
        this.maMonhoc = maMonhoc;
        this.tenmonhoc = tenmonhoc;
        this.soTinchi = soTinchi;
        this.diem = diem;
    }

    public String getMaMonhoc() {
        return maMonhoc;
    }

    public void setMaMonhoc(String maMonhoc) {
        this.maMonhoc = maMonhoc;
    }

    public String getTenmonhoc() {
        return tenmonhoc;
    }

    public void setTenmonhoc(String tenmonhoc) {
        this.tenmonhoc = tenmonhoc;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public int getSoTinchi() {
        return soTinchi;
    }

    public void setSoTinchi(int soTinchi) {
        this.soTinchi = soTinchi;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.maMonhoc);
        hash = 29 * hash + Objects.hashCode(this.tenmonhoc);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.diem) ^ (Double.doubleToLongBits(this.diem) >>> 32));
        hash = 29 * hash + this.soTinchi;
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
        final monHoc other = (monHoc) obj;
        return true;
    }
    
    
    
    
}
