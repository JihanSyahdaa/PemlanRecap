package POLIMORFISME;

// public class KueJadi extends Kue {
//     private double jumlah;

//     public KueJadi(String nama, double harga, double jumlah) {
//         super(nama, harga);
//         this.jumlah = jumlah;
//     }

//     public double getJumlah() {
//         return jumlah;
//     }    

//     @Override
//     public double hitungHarga() {
//         return harga * jumlah * 2;
//     }
// }

class KueJadi extends Kue {
    private int jumlah;

    public KueJadi(String nama, double harga, int jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    @Override
    public double hitungHarga() {
        return getHarga() * jumlah * 2;
    }

    public int getJumlah() {
        return jumlah;
    }

    @Override
    public String toString() {
        return super.toString() + ",\tJumlah: " + jumlah + ",\tJenis Kue: Kue Jadi";
    }
}
