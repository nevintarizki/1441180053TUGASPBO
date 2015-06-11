package tes;

/**
 * Created by Nevinta on 11/06/2015.
 */
public class Buku {
    private String namaBuku;
    private Double hargaBuku;
    private String penerbitBuku;
    private Penulis createdBy;

    public Buku() {
    }

    public Buku(String namaBuku, Double hargaBuku) {
        this.namaBuku = namaBuku;
        this.hargaBuku = hargaBuku;
    }

    public Buku(String namaBuku, Double hargaBuku, String penerbiBuku, Penulis createdBy) {
        this.namaBuku = namaBuku;
        this.hargaBuku = hargaBuku;
        this.penerbitBuku = penerbiBuku;
        this.createdBy = createdBy;
    }

    public String getNamaBuku() {
        return namaBuku;
    }

    public void setNamaBuku(String namaBuku) {
        this.namaBuku = namaBuku;
    }

    public Double getHargaBuku() {
        return hargaBuku;
    }

    public void setHargaBuku(Double hargaBuku) {
        this.hargaBuku = hargaBuku;
    }

    public String getPenerbiBuku() {
        return penerbitBuku;
    }

    public void setPenerbiBuku(String penerbiBuku) {
        this.penerbitBuku = penerbiBuku;
    }

    public Penulis getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Penulis createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public String toString() {
        return "Buku{" +
                "namaBuku='" + namaBuku + '\'' +
                ", hargaBuku=" + hargaBuku +
                ", penerbiBuku='" + penerbitBuku + '\'' +
                ", createdBy=" + createdBy +
                '}';
    }
}
