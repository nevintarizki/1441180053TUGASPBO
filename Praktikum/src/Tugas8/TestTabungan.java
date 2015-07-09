package Tugas8;

/**
 * Created by Nevinta on 17/06/2015.
 */
public class TestTabungan {

    public static void main(String[] args) {

        Account a = new Account(1000000.00);
        Nasabah b = new Nasabah("Nevinta",a);
        System.out.println(b.toString());
        b.setRekening(a);
        System.out.println(b.toString());

        System.out.println(b.toString());

        //tarik
        a.tarik(10000.00);
        //saldo
        System.out.println("Anda melakukan penarikan sebesar Rp 1500000.00");
        System.out.println("Saldo Anda Rp " + a.getSaldo());
        //setor
        a.setor(5000000.00);
        //saldo
        System.out.println("Saldo Anda Rp " + a.getSaldo());
    }
}
