package inheritance_dan_encapsulation;

/**
 *
 * @author asus
 */
public class anak extends orangTua {
     public String getNamaPublic(){
         return super.getNama();
     }
    // INI AKAN ERROR KETIKA DIJALANKAN KARENA DI CLASS JAVA ORANGTUA getNamaPrivate methodnya Private     
    // public String getNamaPrivate(){
    //         return super.getNamaPrivate();
    // }


     @Override
     public String getAlamat(){
         return super.getAlamat();
     }

    
    public static void main(String args[]) {
        anak g = new anak();
        System.out.println("dari method public : " + g.getNamaPublic());
        System.out.println("dari method protected : " + g.getAlamat());

    }
}
