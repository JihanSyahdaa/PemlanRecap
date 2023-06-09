package POLIMORFISME;

// public class KuePesanan extends Kue {
//     private double berat;

//     public KuePesanan(String nama, double harga, double berat) {
//         super(nama, harga);
//         this.berat = berat;
//     }

//     public double getBerat() {
//         return berat;
//     }    

//     @Override
//     public double hitungHarga() {
//         return harga * berat;
//     }
// }

class KuePesanan extends Kue {
    private double berat;

    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }

    @Override
    public double hitungHarga() {
        return getHarga() * berat;
    }

    public double getBerat() {
        return berat;
    }

    @Override
    public String toString() {
        return super.toString() + ",\tBerat: " + berat + ",\tJenis Kue: Kue Pesanan";
    }
}
