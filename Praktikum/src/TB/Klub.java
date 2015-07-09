package TB;

import java.util.ArrayList;
/**
 * Created by Nevinta on 30/06/2015.
 */
public class Klub {
    private String namaKlub;

    public Klub(String namaKlub) {

        this.namaKlub = namaKlub;
    }

    public String getNamaKlub() {

        return namaKlub;
    }

    public void setNamaKlub(String namaKlub) {

        this.namaKlub = namaKlub;
    }

    public String getNamaLiga(ArrayList<Liga> daftarLiga,String klub){
        String namaliga="Silahkan coba lagi!!";

        // Soal 5
        for(int d=0;d<daftarLiga.size();d++){
            Liga liga = daftarLiga.get(d);
            if(liga.getNamaKlub(klub).equals(namaliga)){
            }else{
                namaliga = "Klub "+klub+" berada pada liga "+liga.getNamaLiga();
            }
        }

        return namaliga;
    }
}

