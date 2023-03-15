/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fpt
 */
public class ds_diemSV {
    List<diemSV> list_diemSV = new ArrayList<>();;

    public ds_diemSV(List<diemSV> list_diemSV) {
        this.list_diemSV = list_diemSV ;
    }

    public ds_diemSV() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void addbangSV(diemSV a){
        list_diemSV.add(a);
    }
    public void xoabangSV(diemSV a){
        list_diemSV.remove(a);
    }
    public void xoabangtheoma(String a){
        for(diemSV x: list_diemSV){
            if(x.getMaSV().equals(a)) list_diemSV.remove(x);
            
        }
    }
    public void capnhatSV(diemSV a){
        list_diemSV.remove(a);
        list_diemSV.add(a);
    }
    public diemSV timtheoma(String maSV){
        for(diemSV x: list_diemSV){
            if(x.getMaSV().equals(maSV)) return x;
        }
        return null;
    }
    public void themdiemSV(String id,monHoc x){
        for(diemSV u : list_diemSV){
            if(u.getMaSV().equals(id)) {
                u.addMonhoc(x);
                break;
            }
        } 
        
    }

    public double updateGPA(String string) {
        
        diemSV update = timtheoma(string);
        return update.getGPA();
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
