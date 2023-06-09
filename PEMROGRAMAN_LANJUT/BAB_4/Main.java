package ENCAPSULATION;

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // buat objek customer
//         CustomerAccount customer = new CustomerAccount("1234567890", "John Doe", "38");

//         // tampilkan informasi awal customer
//         System.out.println("Informasi Pelanggan:");
//         System.out.println("Nama: " + customer.getName());
//         System.out.println("Nomor Pelanggan: " + customer.getCustomerNumber());
//         System.out.println("Jenis Pelanggan: " + customer.getAccountType());
//         System.out.println("Saldo: " + customer.getBalance());

//         // minta input PIN
//         System.out.print("Masukkan PIN: ");
//         String pin = scanner.nextLine();

//         // autentikasi pelanggan
//         if (customer.authenticate(pin)) {
//             // jika autentikasi berhasil, minta input nominal pembelian
//             System.out.print("Masukkan nominal pembelian: ");
//             int double = Integer.parseInt(scanner.nextLine());

//             // lakukan pembelian
//             if (customer.beli(double, customer.getCustomerNumber())) {
//                 System.out.println("Pembelian berhasil!");
//                 System.out.println("Saldo: " + customer.getBalance());
//             } else {
//                 System.out.println("Pembelian gagal! Saldo tidak mencukupi.");
//                 System.out.println("Saldo: " + customer.getBalance());
//             }
//         } else {
//             // jika autentikasi gagal
//             System.out.println("Autentikasi gagal! PIN salah.");
//         }

//         // coba autentikasi dengan PIN yang salah
//         for (int i = 0; i < 3; i++) {
//             System.out.print("Masukkan PIN: ");
//             pin = scanner.nextLine();

//             if (!customer.authenticate(pin)) {
//                 System.out.println("Autentikasi gagal! PIN salah.");
//             } else {
//                 System.out.println("Autentikasi berhasil!");
//                 break;
//             }

//             if (i == 2) {
//                 // jika autentikasi gagal 3 kali, blokir akun
//                 customer.blockAccount();
//                 System.out.println("Akun diblokir!");
//             }
//         }

//         scanner.close();
//     }
// }


//=================================================================================================================
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // buat objek customer
//         CustomerAccount customer = new CustomerAccount("1234567890", "John Doe", "38");

//         // tampilkan informasi awal customer
//         System.out.println("Informasi Pelanggan:");
//         System.out.println("Nama: " + customer.getNama());
//         System.out.println("Nomor Pelanggan: " + customer.getNomorPelanggan());
//         System.out.println("Saldo: " + customer.getSaldo());

//         // minta input PIN
//         System.out.print("Masukkan PIN: ");
//         String pin = scanner.nextLine();

//         // autentikasi pelanggan
//         if (customer.authenticate(pin)) {
//             // jika autentikasi berhasil, minta input nominal pembelian
//             System.out.print("Masukkan nominal pembelian: ");
//             double nominal = Double.parseDouble(scanner.nextLine());

//             // lakukan pembelian
//             customer.beli(nominal, customer.getNomorPelanggan());

//             // tampilkan informasi saldo terbaru
//             System.out.println("Saldo terbaru: " + customer.getSaldo());
//         } else {
//             // jika autentikasi gagal
//             System.out.println("Autentikasi gagal! PIN salah.");
//         }

//         // coba autentikasi dengan PIN yang salah
//         for (int i = 0; i < 3; i++) {
//             System.out.print("Masukkan PIN: ");
//             pin = scanner.nextLine();

//             if (!customer.authenticate(pin)) {
//                 System.out.println("Autentikasi gagal! PIN salah.");
//             } else {
//                 System.out.println("Autentikasi berhasil!");
//                 break;
//             }

//             if (i == 2) {
//                 // jika autentikasi gagal 3 kali, blokir akun
//                 customer.blockAccount();
//                 System.out.println("Akun diblokir!");
//             }
//         }

//         scanner.close();
//     }
// }

//=====================================
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // buat objek customer
//         CustomerAccount customer = new CustomerAccount("1234567890", "John Doe", "38");

//         // tampilkan informasi awal customer
//         System.out.println("Informasi Pelanggan:");
//         System.out.println("Nama: " + customer.getNama());
//         System.out.println("Nomor Pelanggan: " + customer.getNomorPelanggan());
//         System.out.println("Saldo: " + customer.getSaldo());

//         // minta input PIN
//         System.out.print("Masukkan PIN: ");
//         String pin = scanner.nextLine();

//         // autentikasi pelanggan
//         if (customer.authenticate(pin)) {
//             // jika autentikasi berhasil, minta input nominal pembelian
//             System.out.print("Masukkan nominal pembelian: ");
//             double amount = Double.parseDouble(scanner.nextLine());

//             // lakukan pembelian
//             customer.beli(amount, customer.getNomorPelanggan());
//             if (!customer.isBeliSuccess()) {
//                 System.out.println("Pembelian gagal! Saldo tidak mencukupi.");
//             } else {
//                 System.out.println("Pembelian berhasil!");
//             }
//             System.out.println("Saldo: " + customer.getSaldo());
//         } else {
//             // jika autentikasi gagal
//             System.out.println("Autentikasi gagal! PIN salah.");
//         }

//         // coba autentikasi dengan PIN yang salah
//         for (int i = 0; i < 3; i++) {
//             System.out.print("Masukkan PIN: ");
//             pin = scanner.nextLine();

//             if (!customer.authenticate(pin)) {
//                 System.out.println("Autentikasi gagal! PIN salah.");
//             } else {
//                 System.out.println("Autentikasi berhasil!");
//                 break;
//             }

//             if (i == 2) {
//                 // jika autentikasi gagal 3 kali, blokir akun
//                 customer.block();
//                 System.out.println("Akun diblokir!");
//             }
//         }

//         scanner.close();
//     }
// }

//=============================================

// public class Main {
//     public static void main(String[] args) {
//         CustomerAccount customer1 = new CustomerAccount("3876543210", "John Doe", 100000, 1234, "38");
//         customer1.purchase(50000, 1234, "3876543210");
//         customer1.topUp(20000, 1234, "3876543210");
//     }

// }

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Membuat objek Customer
//         Customer customer = new Customer(1000000, "387654321", "John Doe", 1234);

//         // Menu utama
//         int choice;
//         do {
//             System.out.println("=== SISTEM TRANSAKSI SWALAYAN ===");
//             System.out.println("1. Beli barang");
//             System.out.println("2. Top up saldo");
//             System.out.println("3. Cek saldo");
//             System.out.println("0. Keluar");
//             System.out.print("Pilihan: ");
//             choice = scanner.nextInt();

//             switch (choice) {
//                 case 1:
//                     beliBarang(customer);
//                     break;
//                 case 2:
//                     topUpSaldo(customer);
//                     break;
//                 case 3:
//                     cekSaldo(customer);
//                     break;
//                 case 0:
//                     System.out.println("Terima kasih.");
//                     break;
//                 default:
//                     System.out.println("Pilihan tidak valid.");
//                     break;
//             }
//         } while (choice != 0);

//         scanner.close();
//     }

//     private static void beliBarang(Customer customer) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Nomor pelanggan: ");
//         String nomorPelanggan = scanner.nextLine();

//         System.out.print("PIN: ");
//         int pin = scanner.nextInt();

//         System.out.print("Total pembelian: ");
//         double totalPembelian = scanner.nextDouble();

//         boolean isSuccess = customer.beli(totalPembelian, nomorPelanggan, pin);
//         if (isSuccess) {
//             System.out.println("Pembelian berhasil.");
//         } else {
//             System.out.println("Pembelian gagal.");
//         }

//         scanner.close();
//     }

//     private static void topUpSaldo(Customer customer) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Nomor pelanggan: ");
//         String nomorPelanggan = scanner.nextLine();

//         System.out.print("PIN: ");
//         int pin = scanner.nextInt();

//         System.out.print("Jumlah top up: ");
//         double jumlahTopUp = scanner.nextDouble();

//         boolean isSuccess = customer.topUp(jumlahTopUp, nomorPelanggan, pin);
//         if (isSuccess) {
//             System.out.println("Top up berhasil.");
//         } else {
//             System.out.println("Top up gagal.");
//         }

//         scanner.close();
//     }

//     private static void cekSaldo(Customer customer) {
//         System.out.println("Saldo: " + customer.getSaldo());
//     }
// }
//================= bawah ini FIXXX ======================
// public class Main {
//     public static void main(String[] args) {
//         Swalayan swalayan = new Swalayan("Swalayan Tiny");
//         //transaksi dengan pelanggan silver
//         System.out.println("-------------------");
//         System.out.println("PELANGGAN SILVER");
//         System.out.println("-------------------");
//         Pelanggan p = swalayan.cariPelanggan(380000000);
//         System.out.println("Nama\t\t: " + p.getNama());
//         System.out.println("Jenis rekening\t: " + p.getJenisRekening());
//         System.out.println("Saldo awal\t: " + p.getSaldo());
//         System.out.println("                                            ");
//         swalayan.transaksiPembelian(380000000, 123456, 900000);
//         swalayan.transaksiPembelian(380000000, 123456, 1200000);
//         swalayan.transaksiTopUp(380000000, 123456, 500000);
//         System.out.println("                                            ");
//         System.out.println("Saldo akhir\t: " + p.getSaldo());
//         System.out.println("===============================================================");
//         System.out.println("-------------------");
    
//         //transaksi dengan pelanggan gold
//         System.out.println("PELANGGAN GOLD");
//         System.out.println("-------------------");
//         p = swalayan.cariPelanggan(560000000);
//         System.out.println("Nama\t\t: " + p.getNama());
//         System.out.println("Jenis rekening\t: " + p.getJenisRekening());
//         System.out.println("Saldo awal\t: " + p.getSaldo());
//         System.out.println("                                            ");
//         swalayan.transaksiPembelian(560000000, 12345, 900000);
//         swalayan.transaksiPembelian(560000000, 12345, 1200000);
//         swalayan.transaksiTopUp(560000000, 12345, 500000);
//         System.out.println("                                            ");
//         System.out.println("Saldo akhir\t: " + p.getSaldo());
//         System.out.println("===============================================================");
//         System.out.println("-------------------");
    
//         // transaksi dengan pelanggan platinum
//         System.out.println("PELANGGAN PLATINUM");
//         System.out.println("-------------------");
//         p = swalayan.cariPelanggan(740000000);
//         System.out.println("Nama\t\t: " + p.getNama());
//         System.out.println("Jenis rekening\t: " + p.getJenisRekening());
//         System.out.println("Saldo awal\t: " + p.getSaldo());
//         System.out.println("                                            ");
//         swalayan.transaksiPembelian(740000000, 123456, 900000);
//         swalayan.transaksiPembelian(740000000, 123456, 1200000);
//         swalayan.transaksiTopUp(740000000, 123456, 500000);
//         System.out.println("                                            ");
//         System.out.println("Saldo akhir\t: " + p.getSaldo());
//     }
// } 
// COBA COBA

   
    
