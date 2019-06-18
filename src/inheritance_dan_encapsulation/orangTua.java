/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance_dan_encapsulation;

/**
 *
 * @author asus
 */
public class orangTua {
    private String nama = "Orang Tua";
    private String alamat = "Sentul";

    public String getNama() {
        return nama;
    }
   
    private String getNamaPrivate(){
        return nama;
    }
   
    protected String getAlamat(){
        return alamat;
    }
}
