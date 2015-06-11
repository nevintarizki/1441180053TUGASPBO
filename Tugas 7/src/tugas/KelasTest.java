package tugas;

/**
 * Created by Nevinta on 11/06/2015.
 */
public class KelasTest {
    public static void main(String[] args) {
        Elpiji satu = new Elpiji("3kg","Campuran","Hijau","Kecil");
        Elpiji dua = new Elpiji("12kg","Propana","Biru","Besar");

        KomporGas oke = new KomporGas("2 tungku","sedang","2kg","quantum");
        System.out.println(oke.getMerk());
    }
}
