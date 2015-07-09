package TB;

import java.util.ArrayList;
/**
 * Created by Nevinta on 30/06/2015.
 */
public class Liga {
    private String namaLiga;
    private String[] daftarklub;
    ArrayList<Divisi> DaftarDivisi = new ArrayList<Divisi>();
    public static ArrayList<Liga> daftarLiga = new ArrayList<Liga>();

    public Liga(String namaLiga) {
        this.namaLiga = namaLiga;
    }

    public String getNamaLiga() {

        return namaLiga;
    }

    public void setNamaLiga(String namaLiga) {

        this.namaLiga = namaLiga;
    }

    public ArrayList<Divisi> getDaftarDivisi() {
        return DaftarDivisi;
    }

    public void setDaftarDivisi(Divisi divisi) {

        DaftarDivisi.add(divisi);

    }

    public static ArrayList<Liga> getDaftarLiga() {
        return daftarLiga;
    }

    public static void setDaftarLiga(ArrayList<Liga> daftarLiga) {
        Liga.daftarLiga = daftarLiga;
    }

    //Soal 2
    public void getDaftarKlub() {
        for(int d=0;d<DaftarDivisi.size();d++){
            Divisi divisi = DaftarDivisi.get(d);
            System.out.println(divisi.getDaftarKlubDivisi());
        }

    }

    //Soal 3
    public String getDaftarKlubDivisi(String namadivisi){
        String klub = "Silahkan coba lagi!!";
        for(int d=0;d<DaftarDivisi.size();d++){
            Divisi divisi = DaftarDivisi.get(d);
            if(divisi.getNamaDivisi().equals(namadivisi)){
                klub="\n";
                ArrayList<String> listklub = divisi.getDaftarKlubDivisi();
                for(int e=0;e<listklub.size();e++){
                    klub = klub + listklub.get(e) +"\n";
                }
            }
        }
        return klub;
    }

    //Soal 4
    public String getNamaKlub(String klub){
        String namadivisi="Silahkan coba lagi!!";

        // looping untuk mengambil data tiap divisi
        for(int d=0;d<DaftarDivisi.size();d++){
            Divisi divisi = DaftarDivisi.get(d);

            // arraylist sementara untuk menampung data klub
            ArrayList<String> daftarklub = divisi.getDaftarKlubDivisi();

            // pengulangan untuk mengambil data tiap klub
            for(int e=0;e<daftarklub.size();e++){

                //variabel nama klub
                String namaklub = daftarklub.get(e);

                // mengecek nama klub
                if(klub.equals(namaklub)){

                    namadivisi = "Klub "+klub+" berada dalam Divisi "+divisi.getNamaDivisi();
                }
            }
        }
        return namadivisi;
    }



    @Override
    public String toString() {
        return "Liga{" +
                "namaLiga='" + namaLiga + '\'' +
                ", DaftarDivisi=" + DaftarDivisi +
                '}';
    }
}