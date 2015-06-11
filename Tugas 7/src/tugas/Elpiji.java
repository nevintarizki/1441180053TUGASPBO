package tugas;

/**
 * Created by Nevinta on 11/06/2015.
 */
public class Elpiji {
    private String beratTabung;
    private String jenisTabung;
    private String warnaTabung;
    private String ukuranTabung;

    public Elpiji(){

    }

    public Elpiji(String beratTabung, String jenisTabung) {
        this.beratTabung = beratTabung;
        this.jenisTabung = jenisTabung;
    }

    public Elpiji(String beratTabung, String jenisTabung, String warnaTabung, String ukuranTabung) {
        this.beratTabung = beratTabung;
        this.jenisTabung = jenisTabung;
        this.warnaTabung = warnaTabung;
        this.ukuranTabung = ukuranTabung;
    }

    public String getBeratTabung() {
        return beratTabung;
    }

    public void setBeratTabung(String beratTabung) {
        this.beratTabung = beratTabung;
    }

    public String getJenisTabung() {
        return jenisTabung;
    }

    public void setJenisTabung(String jenisTabung) {
        this.jenisTabung = jenisTabung;
    }

    public String getWarnaTabung() {
        return warnaTabung;
    }

    public void setWarnaTabung(String warnaTabung) {
        this.warnaTabung = warnaTabung;
    }

    public String getUkuranTabung() {
        return ukuranTabung;
    }

    public void setUkuranTabung(String ukuranTabung) {
        this.ukuranTabung = ukuranTabung;
    }

    @Override
    public String toString() {
        return "Elpiji{" +
                "beratTabung='" + beratTabung + '\'' +
                ", jenisTabung='" + jenisTabung + '\'' +
                ", warnaTabung='" + warnaTabung + '\'' +
                ", ukuranTabung='" + ukuranTabung + '\'' +
                '}';
    }
}
