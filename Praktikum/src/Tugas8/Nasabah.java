package Tugas8;

/**
 * Created by Nevinta on 17/06/2015.
 */
public class Nasabah {

    private String namaNasabah;
    private Account rekening;

    public Nasabah(String namaNasabah) {
        this.namaNasabah = namaNasabah;
    }

    public Nasabah(String namaNasabah, Account rekening) {
        this.namaNasabah = namaNasabah;
        this.rekening = rekening;
    }

    public String getNamaNasabah() {
        return namaNasabah;
    }

    public void setNamaNasabah(String namaNasabah) {
        this.namaNasabah = namaNasabah;
    }

    public Account getRekening() {
        return rekening;
    }

    public void setRekening(Account rekening) {
        this.rekening = rekening;
    }

    @Override
    public String toString() {
        return "Nasabah{" +
                "namaNasabah='" + namaNasabah + '\'' +
                ", rekening=" + rekening +
                '}';
    }
}
