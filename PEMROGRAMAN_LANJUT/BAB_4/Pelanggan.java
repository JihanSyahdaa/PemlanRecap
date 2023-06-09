package ENCAPSULATION;

class Pelanggan {
    private int saldo;
    private final int nomorPelanggan;
    private final String nama;
    private final int jenisRekening;
    private int kesalahanAutentikasi;


    public Pelanggan(int saldo, int nomorPelanggan, String nama) {
        this.saldo = saldo;
        this.nomorPelanggan = nomorPelanggan;
        this.nama = nama;
        this.jenisRekening = Integer.parseInt(String.valueOf(nomorPelanggan).substring(0, 2));
    }
   
    public int getSaldo() {
        return saldo;
    }
   
    public int getNomorPelanggan() {
        return nomorPelanggan;
    }
   
    public String getNama() {
        return nama;
    }
   
    public int getJenisRekening() {
        return jenisRekening;
    }
   
    public boolean autentikasi(int pin, int nomorPelanggan) {
        if (this.nomorPelanggan == nomorPelanggan && pin == 123456) {
            kesalahanAutentikasi = 0;
            return true;
        } else {
            kesalahanAutentikasi++;
            if (kesalahanAutentikasi >= 3) {
                System.out.println("Akun Anda telah diblokir.");
                saldo = 0;
            }
            return false;
        }
    }
   
    private void updateSaldo(int jumlah) {
        saldo += jumlah;
    }
   
    private int cashback(int jumlah) {
        if (jumlah > 1000000) {
            switch (jenisRekening) {
                case 38:
                    return (int) (jumlah * 0.05);
                case 56:
                    int cashback = (int) (jumlah * 0.02);
                    if (jumlah > 1000000) {
                        cashback += (int) (jumlah * 0.07);
                    }
                    return cashback;
                case 74:
                    cashback = (int) (jumlah * 0.05);
                    if (jumlah > 1000000) {
                        cashback += (int) (jumlah * 0.10);
                    }
                    return cashback;
            }
        }
        return 0;
    }
   
    public void pembelian(int jumlah, int pin, int nomorPelanggan) {
        if (autentikasi(pin, nomorPelanggan)) {
            int cashback = cashback(jumlah);
            if (saldo < 10000) {
                System.out.println("Transaksi pembelian gagal. Saldo tidak mencukupi.");
            } else {
                updateSaldo(cashback - jumlah);
                System.out.println("Transaksi pembelian berhasil. Cashback: " + cashback);
            }
        } else {
            System.out.println("Transaksi pembelian gagal. PIN atau nomor pelanggan salah.");
        }
    }


    public void topUp(int jumlah, int pin, int nomorPelanggan) {
        if (autentikasi(pin, nomorPelanggan)) {
            if (saldo < 10000) {
                System.out.println("Transaksi pembelian gagal. Saldo tidak mencukupi.");
            } else {
                updateSaldo(jumlah);
                System.out.println("Transaksi top up berhasil.");  
            }
        } else {
            System.out.println("Transaksi top up gagal. PIN atau nomor pelanggan salah.");
        }
    }
}  

