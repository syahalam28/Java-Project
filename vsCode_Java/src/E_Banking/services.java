package E_Banking;

public class services {
    private double saldo;

    public services(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void cekSaldo(){
        System.out.println("Sisa Saldo Anda Rp. "+ getSaldo());
    }

    public double tarikTunai(double dana){
        if (getSaldo() < dana) {
            System.out.println("Mohon Maaf Uang Anda Tidak Mencukupi");
        }
        else {
            dana -= getSaldo();
            System.out.println("Transaksi Berhasil");
            System.out.println("Rp. "+dana);
        }
        return dana;
    }

  


}
