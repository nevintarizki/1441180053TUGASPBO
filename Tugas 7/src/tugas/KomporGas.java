package tugas;

/**
 * Created by Nevinta on 11/06/2015.
 */
public class KomporGas {
    private String bentukKompor;
    private String ukuranKompor;
    private String beratKompor;
    private String merk;

    public KomporGas(){

    }

    public KomporGas(String bentukKompor, String ukuranKompor, String beratKompor) {
        this.bentukKompor = bentukKompor;
        this.ukuranKompor = ukuranKompor;
        this.beratKompor = beratKompor;
    }

    public KomporGas(String bentukKompor, String ukuranKompor, String beratKompor, String merk) {
        this.bentukKompor = bentukKompor;
        this.ukuranKompor = ukuranKompor;
        this.beratKompor = beratKompor;
        this.merk = merk;
    }

    public String getBentukKompor() {
        return bentukKompor;
    }

    public void setBentukKompor(String bentukKompor) {
        this.bentukKompor = bentukKompor;
    }

    public String getUkuranKompor() {
        return ukuranKompor;
    }

    public void setUkuranKompor(String ukuranKompor) {
        this.ukuranKompor = ukuranKompor;
    }

    public String getBeratKompor() {
        return beratKompor;
    }

    public void setBeratKompor(String beratKompor) {
        this.beratKompor = beratKompor;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    @Override
    public String toString() {
        return "KomporGas{" +
                "bentukKompor='" + bentukKompor + '\'' +
                ", ukuranKompor='" + ukuranKompor + '\'' +
                ", beratKompor='" + beratKompor + '\'' +
                ", merk='" + merk + '\'' +
                '}';
    }
}
