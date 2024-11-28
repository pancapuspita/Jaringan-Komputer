package Tugas;

public class PengambilanUang {
    private int proteksi;
    protected int saldo;

    public PengambilanUang(int saldo) {
        this.saldo = saldo;
        this.proteksi = 0;
    }

    public PengambilanUang(int saldo, int proteksi) {
        this.saldo = saldo;
        this.proteksi = proteksi;
    }

    public int getSaldo() {
        return saldo;
    }

    public boolean ambilUang(int jumlah) {
        if (jumlah <= (saldo - proteksi)) {
            saldo -= jumlah;
            return true;
        } else {
            return false;
        }
    }
}

class Tabungan extends PengambilanUang {
    public Tabungan(int saldo, int proteksi) {
        super(saldo, proteksi);
    }
}