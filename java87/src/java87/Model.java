/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java87;

/**
 *
 * @author fpt
 */
public class Model {
    private int x,y,count;
    private String chekin;

    public Model() {
        this.x = 0;
        this.y=0;
        this.count =0;
        this.chekin = "no";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getChekin() {
        return chekin;
    }

    public void setChekin(String chekin) {
        this.chekin = chekin;
    }
    public void click(){
        this.count++;
    }
    public void divao(){
        this.chekin = "Yes";
    }
    public void exit(){
        this.chekin = "NO ";
    }
}
