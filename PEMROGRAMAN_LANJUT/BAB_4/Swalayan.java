package ENCAPSULATION;

//FIXXXXXXXXXXXXXX CUYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY
// class Swalayan {
//     private final String nama;
//     private final Pelanggan[] pelanggan;

//     public Swalayan(String nama) {
//         this.nama = nama;
//         this.pelanggan = new Pelanggan[3];
//         this.pelanggan[0] = new Pelanggan(10000000, 380000000, "Louis Prtridge");
//         this.pelanggan[1] = new Pelanggan(20000000, 560000000, "Tom Holland");
//         this.pelanggan[2] = new Pelanggan(30000000, 740000000, "Chris Evans");
//     }
    
//     public Pelanggan cariPelanggan(int nomorPelanggan) {
//         for (Pelanggan p : pelanggan) {
//             if (p.getNomorPelanggan() == nomorPelanggan) {
//                 return p;
//             }
//         }
//         return null;
//     }
    
//     public void transaksiPembelian(int nomorPelanggan, int pin, int jumlah) {
//         Pelanggan p = cariPelanggan(nomorPelanggan);
//         if (p != null) {
//             p.pembelian(jumlah, pin, nomorPelanggan);
//         } else {
//             System.out.println("Nomor pelanggan tidak ditemukan.");
//         }
//     }
    
//     public void transaksiTopUp(int nomorPelanggan, int pin, int jumlah) {
//         Pelanggan p = cariPelanggan(nomorPelanggan);
//         if (p != null) {
//             p.topUp(jumlah, pin, nomorPelanggan);
//         } else {
//             System.out.println("Nomor pelanggan tidak ditemukan.");
//         }
//     }
// }    
