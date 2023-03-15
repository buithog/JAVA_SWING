/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author fpt
 */
public class file {
        File f ;

    public file(File f) {
               this.f = new File("C:\\Users\\fpt\\OneDrive\\Máy tính\\test.txt") ; 
    }
    public String moFile(){
        String res="";
        try{
            FileOutputStream fos = new FileOutputStream(this.f);
          //  ObjectOutputStream dos = new ObjectOutputStream(fos);
            FileInputStream fis = new FileInputStream(this.f);
//            ObjectInputStream ois = new ObjectInputStream(fis);
            FileWriter fw = new FileWriter(this.f);
            FileReader fr = new FileReader(this.f);
            BufferedReader br = new BufferedReader(fr);
            String line;
            
            while((line = br.readLine()) != null){
                res+= line+" ";
            }
            fis.close();
//            ois.close();
//            dos.close();
            fos.close();
//            fw.write("Anh Thong Dep Trai vcl ");
            //dos.writeDouble(3.4);
        //    dos.close();
            fw.close();
          fr.close();
            br.close();
            
        }
        catch (IOException e){
            System.out.println("loi ghi file");
        }
           return res;
    }
        public void luuFile(String s){
        try{
            FileOutputStream fos = new FileOutputStream(this.f);
          //  ObjectOutputStream dos = new ObjectOutputStream(fos);
            FileInputStream fis = new FileInputStream(this.f);
//            ObjectInputStream ois = new ObjectInputStream(fis);
            FileWriter fw = new FileWriter(this.f);
            FileReader fr = new FileReader(this.f);
            BufferedReader br = new BufferedReader(fr);
           // String line = sc.;
//            while((line = br.readLine()) != null){
//                System.out.println(line);
//            }
            fis.close();
//            ois.close();
//            dos.close();
            fos.close();
           fw.write(s);
            //dos.writeDouble(3.4);
        //    dos.close();
            fw.close();
          fr.close();
            br.close();
        }
        catch (IOException e){
            System.out.println("loi ghi file");
        }
    } 
    } 
  
