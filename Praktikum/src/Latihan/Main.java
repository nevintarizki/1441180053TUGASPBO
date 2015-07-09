package Latihan;

/**
 * Created by Nevinta on 24/06/2015.
 */
public class Main {
    public static void main(String[] args) {
        Liga italy = new Liga("Italy");
        Divisi serieA = new Divisi("Serie A");
        Divisi serieB = new Divisi("Serie B");
        Club coba = new Club("LOL");


        italy.setDaftarDivisi(serieA);
        italy.setDaftarDivisi(serieB);

        System.out.println(italy.toString());



    }
}
