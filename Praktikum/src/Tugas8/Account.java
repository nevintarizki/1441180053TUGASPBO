package Tugas8;

/**
 * Created by Nevinta on 17/06/2015.
 */
public class Account {

    private Double saldo;

    public Account(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void tarik(double tarik){
        this.saldo = saldo - tarik;
    }

    public void setor(double setor){
        this.saldo = saldo + setor;
    }

    @Override
    public String toString() {
        return "Account{" +
                "saldo=" + saldo +
                '}';
    }
}
