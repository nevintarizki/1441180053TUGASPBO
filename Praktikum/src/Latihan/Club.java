package Latihan;

/**
 * Created by Nevinta on 29/06/2015.
 */
public class Club {
    private String namaClub;

    public String getNamaClub() {
        return namaClub;
    }

    public void setNamaClub(String namaClub) {
        this.namaClub = namaClub;
    }

    @Override
    public String toString() {
        return "Club{" +
                "namaClub='" + namaClub + '\'' +
                '}';
    }

    public Club(String namaClub) {
        this.namaClub = namaClub;



    }
}
