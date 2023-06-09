package POLIMORFISME;

public class MainKue {
    public static void main(String[] args) {
        Kue[] dataKue = new Kue[20];

        //20 objek kue dengan berbagai jenis kue
        dataKue[0] = new KuePesanan("Tiramisu", 5000, 0.5);
        dataKue[1] = new KueJadi("Croissant", 10000, 5);
        dataKue[2] = new KuePesanan("Cheesecake", 2000, 0.3);
        dataKue[3] = new KueJadi("Pavlova", 15000, 2);
        dataKue[4] = new KuePesanan("Black forest", 4000, 0.25);
        dataKue[5] = new KueJadi("Churros", 12000, 3);
        dataKue[6] = new KuePesanan("Brownies", 15000, 1);
        dataKue[7] = new KueJadi("Macaron", 5000, 10);
        dataKue[8] = new KuePesanan("Butter Cake", 1000, 0.1);
        dataKue[9] = new KueJadi("Poffertjes", 20000, 1);
        dataKue[10] = new KuePesanan("Pizza", 3000, 0.2);
        dataKue[11] = new KueJadi("Mochi", 8000, 4);
        dataKue[12] = new KuePesanan("Chiffon Cake", 5000, 0.4);
        dataKue[13] = new KueJadi("Tortilla", 6000, 8);
        dataKue[14] = new KuePesanan("Bingsu", 2000, 0.3);
        dataKue[15] = new KueJadi("Dorayaki", 10000, 2);
        dataKue[16] = new KuePesanan("Apple Pie", 5000, 0.2);
        dataKue[17] = new KueJadi("Hotteok", 8000, 6);
        dataKue[18] = new KuePesanan("Eclair", 3000, 0.3);
        dataKue[19] = new KueJadi("Burger", 7000, 4);
    
        // Tampilkan semua kue dan jenis kuenya
        System.out.println("=====================================================");
        System.out.println("                   DATA KUE & JENIS                  ");
        System.out.println("=====================================================");
        for (int i = 0; i < dataKue.length; i++) {
            System.out.println((i + 1) + ". " + dataKue[i].toString());
        }
        System.out.println("                                                     ");

        // Hitung total harga dari semua jenis kue
        double totalHarga = 0;
        for (int i = 0; i < dataKue.length; i++) {
            totalHarga += dataKue[i].hitungHarga();
        }
        System.out.println("=====================================================");
        System.out.println("                     TOTAL HARGA                     ");
        System.out.println("=====================================================");
        System.out.println("                                                     ");
        System.out.println("Total Harga: " + totalHarga);
        System.out.println("                                                     ");
    
        // Hitung total harga dan total berat dari KuePesanan
        double totalHargaPesanan = 0;
        double totalBerat = 0;
        for (int i = 0; i < dataKue.length; i++) {
            if (dataKue[i] instanceof KuePesanan) {
                totalHargaPesanan += dataKue[i].hitungHarga();
                totalBerat += ((KuePesanan) dataKue[i]).getBerat();
            }
        }
        System.out.println("=====================================================");
        System.out.println("                     KUE PESANAN                     ");
        System.out.println("=====================================================");
        System.out.println("Total Harga Kue Pesanan: " + totalHargaPesanan);
        System.out.println("Total Berat Kue Pesanan: " + totalBerat);
        System.out.println("                                                     ");
    
        // Hitung total harga dan total jumlah dari KueJadi
        double totalHargaJadi = 0;
        int totalJumlah = 0;
        for (int i = 0; i < dataKue.length; i++) {
            if (dataKue[i] instanceof KueJadi) {
                totalHargaJadi += dataKue[i].hitungHarga();
                totalJumlah += ((KueJadi) dataKue[i]).getJumlah();
            }
        }
        System.out.println("=====================================================");
        System.out.println("                        KUE JADI                     ");
        System.out.println("=====================================================");
        System.out.println("Total Harga Kue Jadi: " + totalHargaJadi);
        System.out.println("Total Jumlah Kue Jadi: " + totalJumlah);
        System.out.println("                                                     ");
    
        // Cari kue dengan harga terbesar
        double hargaTerbesar = 0;
        Kue kueHargaTerbesar = null;
        for (int i = 0; i < dataKue.length; i++) {
            if (dataKue[i].getHarga() > hargaTerbesar) {
                hargaTerbesar = dataKue[i].getHarga();
                kueHargaTerbesar = dataKue[i];
            }
        }
        System.out.println("=====================================================");
        System.out.println("                  HARGA KUE TERBESAR                 ");
        System.out.println("=====================================================");
        System.out.println("Kue dengan harga terbesar:");
        System.out.println(kueHargaTerbesar.toString());
        System.out.println("                                                     ");
    }
}

