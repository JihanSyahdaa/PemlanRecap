package ENCAPSULATION;

public class Main {
    public static void main(String[] args) {
        Swalayan swalayan = new Swalayan("Swalayan Tiny");
        //transaksi dengan pelanggan silver
        System.out.println("-------------------");
        System.out.println("PELANGGAN SILVER");
        System.out.println("-------------------");
        Pelanggan p = swalayan.cariPelanggan(380000000);
        System.out.println("Nama\t\t: " + p.getNama());
        System.out.println("Jenis rekening\t: " + p.getJenisRekening());
        System.out.println("Saldo awal\t: " + p.getSaldo());
        System.out.println("                                            ");
        swalayan.transaksiPembelian(380000000, 123456, 900000);
        swalayan.transaksiPembelian(380000000, 123456, 1200000);
        swalayan.transaksiTopUp(380000000, 123456, 500000);
        System.out.println("                                            ");
        System.out.println("Saldo akhir\t: " + p.getSaldo());
        System.out.println("===============================================================");
        System.out.println("-------------------");
   
        //transaksi dengan pelanggan gold
        System.out.println("PELANGGAN GOLD");
        System.out.println("-------------------");
        p = swalayan.cariPelanggan(560000000);
        System.out.println("Nama\t\t: " + p.getNama());
        System.out.println("Jenis rekening\t: " + p.getJenisRekening());
        System.out.println("Saldo awal\t: " + p.getSaldo());
        System.out.println("                                            ");
        swalayan.transaksiPembelian(560000000, 12345, 900000);
        swalayan.transaksiPembelian(560000000, 12345, 1200000);
        swalayan.transaksiTopUp(560000000, 12345, 500000);
        System.out.println("                                            ");
        System.out.println("Saldo akhir\t: " + p.getSaldo());
        System.out.println("===============================================================");
        System.out.println("-------------------");
   
        // transaksi dengan pelanggan platinum
        System.out.println("PELANGGAN PLATINUM");
        System.out.println("-------------------");
        p = swalayan.cariPelanggan(740000000);
        System.out.println("Nama\t\t: " + p.getNama());
        System.out.println("Jenis rekening\t: " + p.getJenisRekening());
        System.out.println("Saldo awal\t: " + p.getSaldo());
        System.out.println("                                            ");
        swalayan.transaksiPembelian(740000000, 123456, 900000);
        swalayan.transaksiPembelian(740000000, 123456, 1200000);
        swalayan.transaksiTopUp(740000000, 123456, 500000);
        System.out.println("                                            ");
        System.out.println("Saldo akhir\t: " + p.getSaldo());
    }
}

   
    
