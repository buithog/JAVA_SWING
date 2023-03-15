package baitapbuoi5;

public class Sinhvien implements Comparable<Sinhvien>{
    private String name;
    private int age;
    public Sinhvien(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    @Override
    public String toString(){
        return this.name +" " +  this.age;
    }
    @Override
    public int compareTo(Sinhvien a){
        return this.getName().compareTo(a.getName());
    }
}
