/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java45;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author fpt
 */
public class Java45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List  <phuongtiendichuyen> l = new ArrayList<>();
        int t = Integer.valueOf(sc.nextLine());
        while(t-->0){
            String name =sc.nextLine();
            if(name.equals("oto")){
               String x ="xang";
               String hang = sc.nextLine();
               String nuoc = sc.nextLine();
               phuongtiendichuyen a1 = new xeOto(x, name, new hangSx(hang, nuoc));
                l.add(a1);
            }
            if(name.equals("xe dap")){
               String x ="hai cang";
               String hang = sc.nextLine();
               String nuoc = sc.nextLine();
               phuongtiendichuyen a2 = new xedap( name, new hangSx(hang, nuoc));
                l.add(a2);
            } 
            if(name.equals("may bay")){
               String x ="oi doi oi luon";
               String hang = sc.nextLine();
               String nuoc = sc.nextLine();
               phuongtiendichuyen a3 = new maybay(x, name, new hangSx(hang, nuoc));
                l.add(a3);
                }    
            }
        for(phuongtiendichuyen x : l) {
            System.out.println(x+" "+x.vantoc());
        }
        }
   }
    

