package Bai_3;

public class SinhVien {
    private String name;
    private int age;
    private String id;
    private int stt;

    public SinhVien() {
    }

    public SinhVien(String name, int age, String id, int stt) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.stt = stt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age + " " + this.id + " " + this.stt;
    }
}
