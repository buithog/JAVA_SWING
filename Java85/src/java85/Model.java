/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java85;

/**
 *
 * @author fpt
 */
public class Model {
    private String vanban,tukhoa,ketqua;

    public Model() {
        this.vanban="";
        this.tukhoa = "";
        this.ketqua="";
    }

    public String getVanban() {
        return vanban;
    }

    public void setVanban(String vanban) {
        this.vanban = vanban;
    }

    public String getTukhoa() {
        return tukhoa;
    }

    public void setTukhoa(String tukhoa) {
        this.tukhoa = tukhoa;
    }

    public String getKetqua() {
        return ketqua;
    }

    public void setKetqua(String ketqua) {
        this.ketqua = ketqua;
    }
    public  void timkiem(){
        int dem = 0,index = 0;
        while(true){
            int i= this.vanban.indexOf(this.tukhoa,index);
            if(i == -1) break;
            else {dem++;
               index = i+1;
            }
            
        }
        this.ketqua ="Ket qua : " +  dem;
    }
}
