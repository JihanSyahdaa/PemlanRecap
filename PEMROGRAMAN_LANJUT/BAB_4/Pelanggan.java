package ENCAPSULATION;

// // class Pelanggan untuk menyimpan data pelanggan
// private static class Pelanggan {
//     private String nomorPelanggan;
//     private String nama;
//     private String pin;
//     private double saldo;
//     private int failedAuthAttempts;

//     public Pelanggan(String nomorPelanggan, String nama, double saldo) {
//         this.nomorPelanggan = nomorPelanggan;
//         this.nama = nama;
//         this.saldo = saldo;
//         this.pin = "1234"; // default PIN
//         this.failedAuthAttempts = 0;
//     }

//     public String getNomorPelanggan() {
//         return nomorPelanggan;
//     }

//     public String getNama() {
//         return nama;
//     }

//     public double getSaldo() {
//         return saldo;
//     }

//     public void tambahSaldo(double jumlah) {
//         saldo += jumlah;
//     }

//     public void kurangSaldo(double jumlah) {
//         saldo -= jumlah;
//     }

//     public boolean checkPIN(String pin) {
//         return this.pin.equals(pin);
//     }

//     public void increaseFailedAuthAttempts() {
//         failedAuthAttempts++;
//     }

//     public void resetFailedAuthAttempts() {
//         failedAuthAttempts = 0;
//     }

//     public int getFailedAuthAttempts() {
//         return failedAuthAttempts;
//     }

//     public String toString() {
//         return "Pelanggan " + nomorPelanggan + " - " + nama + " (saldo: " + saldo + ")";
//     }
// }
//============================= BAWAH INI JUGA FIX ===========
// class Pelanggan {
//     private int saldo;
//     private final int nomorPelanggan;
//     private final String nama;
//     private final int jenisRekening;
//     private int kesalahanAutentikasi;

//     public Pelanggan(int saldo, int nomorPelanggan, String nama) {
//         this.saldo = saldo;
//         this.nomorPelanggan = nomorPelanggan;
//         this.nama = nama;
//         this.jenisRekening = Integer.parseInt(String.valueOf(nomorPelanggan).substring(0, 2));
//     }
    
//     public int getSaldo() {
//         return saldo;
//     }
    
//     public int getNomorPelanggan() {
//         return nomorPelanggan;
//     }
    
//     public String getNama() {
//         return nama;
//     }
    
//     public int getJenisRekening() {
//         return jenisRekening;
//     }
    
//     public boolean autentikasi(int pin, int nomorPelanggan) {
//         if (this.nomorPelanggan == nomorPelanggan && pin == 123456) {
//             kesalahanAutentikasi = 0;
//             return true;
//         } else {
//             kesalahanAutentikasi++;
//             if (kesalahanAutentikasi >= 3) {
//                 System.out.println("Akun Anda telah diblokir.");
//                 saldo = 0;
//             }
//             return false;
//         }
//     }
    
//     private void updateSaldo(int jumlah) {
//         saldo += jumlah;
//     }
    
//     private int cashback(int jumlah) {
//         if (jumlah > 1000000) {
//             switch (jenisRekening) {
//                 case 38:
//                     return (int) (jumlah * 0.05);
//                 case 56:
//                     int cashback = (int) (jumlah * 0.02);
//                     if (jumlah > 1000000) {
//                         cashback += (int) (jumlah * 0.07);
//                     }
//                     return cashback;
//                 case 74:
//                     cashback = (int) (jumlah * 0.05);
//                     if (jumlah > 1000000) {
//                         cashback += (int) (jumlah * 0.10);
//                     }
//                     return cashback;
//             }
//         }
//         return 0;
//     }
    
//     public void pembelian(int jumlah, int pin, int nomorPelanggan) {
//         if (autentikasi(pin, nomorPelanggan)) {
//             int cashback = cashback(jumlah);
//             //if (saldo - (jumlah - cashback) < 10000) {
//             if (saldo < 10000) {
//                 System.out.println("Transaksi pembelian gagal. Saldo tidak mencukupi.");
//             } else {
//                 updateSaldo(cashback - jumlah);
//                 System.out.println("Transaksi pembelian berhasil. Cashback: " + cashback);
//             }
//         } else {
//             System.out.println("Transaksi pembelian gagal. PIN atau nomor pelanggan salah.");
//         }
//     }
    
//     // public void topUp(int jumlah, int pin, int nomorPelanggan) {
//     //     if (autentikasi(pin, nomorPelanggan)) {
//     //         updateSaldo(jumlah);
//     //         System.out.println("Transaksi top up berhasil.");
//     //     } else {
//     //         System.out.println("Transaksi top up gagal. PIN atau nomor pelanggan salah.");
//     //     }
//     // } 

//     public void topUp(int jumlah, int pin, int nomorPelanggan) {
//         if (autentikasi(pin, nomorPelanggan)) {
//             // updateSaldo(jumlah);
//             if (saldo < 10000) {
//                 System.out.println("Transaksi pembelian gagal. Saldo tidak mencukupi.");
//             } else {
//                 updateSaldo(jumlah);
//                 System.out.println("Transaksi top up berhasil.");   
//             }
//         } else {
//             System.out.println("Transaksi top up gagal. PIN atau nomor pelanggan salah.");
//         }
//     }

// }    
//========================
// public class Pelanggan {
//     private String nomorPelanggan;
//     private String nama;
//     private int saldo;
//     private int jenisPelanggan; // 38 = silver, 56 = gold, 74 = platinum
//     private int kesalahanAutentikasi;
//     private boolean diblokir;
//     private final int MIN_SALDO = 10000;

//     public Pelanggan(String nomorPelanggan, String nama, int saldo) {
//         this.nomorPelanggan = nomorPelanggan;
//         this.nama = nama;
//         this.saldo = saldo;
//         this.jenisPelanggan = Integer.parseInt(nomorPelanggan.substring(0,2));
//         this.kesalahanAutentikasi = 0;
//         this.diblokir = false;
//     }

//     public String getNomorPelanggan() {
//         return nomorPelanggan;
//     }

//     public String getNama() {
//         return nama;
//     }

//     public int getSaldo() {
//         return saldo;
//     }

//     public boolean isDiblokir() {
//         return diblokir;
//     }

//     // private boolean isAutentikasiBenar(String nomorPelanggan, String PIN) {
//     //     // implementasi autentikasi, return true jika benar, false jika salah
//     // }

//     private boolean isAutentikasiBenar(String nomorPelanggan, String PIN) {
//         // cek nomor pelanggan dan PIN di database pelanggan, return true jika benar, false jika salah
//         // contoh implementasi sederhana menggunakan nomor pelanggan dan PIN tertentu
//         if (nomorPelanggan.equals("3800000001") && PIN.equals("123456")) {
//             return true;
//         } else if (nomorPelanggan.equals("5600000002") && PIN.equals("234567")) {
//             return true;
//         } else if (nomorPelanggan.equals("7400000003") && PIN.equals("345678")) {
//             return true;
//         } else {
//             return false;
//         }
//     }
    

//     public boolean beli(int jumlah) {
//         if (diblokir) {
//             System.out.println("Akun anda diblokir. Silahkan hubungi customer service.");
//             return false;
//         }

//         if (saldo < jumlah) {
//             System.out.println("Transaksi gagal. Saldo tidak mencukupi.");
//             return false;
//         }

//         saldo -= jumlah;

//         int cashback = 0;
//         if (jumlah > 1000000) {
//             switch (jenisPelanggan) {
//                 case 38:
//                     cashback = (int) (jumlah * 0.05);
//                     break;
//                 case 56:
//                     cashback = (int) (jumlah * 0.07);
//                     break;
//                 case 74:
//                     cashback = (int) (jumlah * 0.1);
//                     break;
//                 default:
//                     cashback = (int) (jumlah * 0.02);
//                     saldo += cashback;
//                     break;
//             }
//         }

//         saldo += cashback;

//         if (saldo < MIN_SALDO) {
//             System.out.println("Transaksi berhasil, namun saldo anda kurang dari batas minimal. Silahkan segera melakukan top up.");
//         } else {
//             System.out.println("Transaksi berhasil. Cashback sebesar Rp" + cashback + " telah ditambahkan ke saldo.");
//         }

//         return true;
//     }

//     public boolean topUp(int jumlah) {
//         if (diblokir) {
//             System.out.println("Akun anda diblokir. Silahkan hubungi customer service.");
//             return false;
//         }

//         saldo += jumlah;

//         if (saldo < MIN_SALDO) {
//             System.out.println("Top up berhasil, namun saldo anda kurang dari batas minimal.");
//         } else {
//             System.out.println("Top up berhasil.");
//         }

//         return true;
//     }

//     public boolean autentikasi(String nomorPelanggan, String PIN) {
//         if (isAutentikasiBenar(nomorPelanggan, PIN)) {
//             kesalahanAutentikasi = 0;
//             return true;
//         } else {
//             kesalahanAutentikasi++;
//             if (kesalahanAutentikasi == 3) {
//                 System.out.println("Anda telah melakukan 3x kesalahan autentikasi. Akun anda akan diblokir.");
//                 diblokir = true;
//             } else {
//                 System.out.println("Nomor pelanggan atau PIN salah. Silahkan coba lagi.");
//                 }
//             return false;
//         }
//     }
// }
