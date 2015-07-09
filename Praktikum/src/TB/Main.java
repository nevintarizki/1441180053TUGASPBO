package TB;

import java.util.ArrayList;
/**
 * Created by Nevinta on 30/06/2015.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Liga> daftarLiga= new ArrayList<Liga>();

        Liga Inggris = new Liga("Inggris");
        Divisi divisi1 = new Divisi("Premier League");
        Divisi divisi2 = new Divisi("One League");
        Klub klub1 = new Klub("Chelsea");
        Klub klub2 = new Klub("Manchaster United");
        Klub klub3 = new Klub("Manchaster City");
        Klub klub4 = new Klub ("Arsenal");
        Klub klub5 = new Klub ("Tottenham Hotspur");

        daftarLiga.add(Inggris);

        Inggris.setDaftarDivisi(divisi1);
        Inggris.setDaftarDivisi(divisi2);
        divisi1.setDaftarKlubDivisi(klub1);
        divisi1.setDaftarKlubDivisi(klub2);
        divisi1.setDaftarKlubDivisi(klub5);
        divisi2.setDaftarKlubDivisi(klub3);
        divisi2.setDaftarKlubDivisi(klub4);


        // 1
        System.out.println("Soal Nomor 1");
        System.out.println("Daftar Divisi pada Liga Inggris adalah :");
        System.out.println(Inggris.getDaftarDivisi());
        System.out.println("");

        // 2
        System.out.println("Soal Nomor 2");
        System.out.println("Daftar Klub pada semua Divisi adalah :");
        Inggris.getDaftarKlub();
        System.out.println("");

        // 3
        System.out.println("Soal Nomor 3");
        System.out.println("Daftar klub pada divisi Premier League adalah :" + Inggris.getDaftarKlubDivisi("Premier League"));

        // 4
        System.out.println("Soal Nomor 4");
        System.out.println(Inggris.getNamaKlub("Manchaster City"));
        System.out.println("");

        // 5
        System.out.println("Soal Nomor 5");
        System.out.println(klub1.getNamaLiga(daftarLiga,"Arsenal"));




    }


}


