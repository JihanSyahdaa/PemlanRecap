package POLIMORFISME;

// public abstract class Kue {
//     protected String nama;
//     protected double harga;

//     public Kue(String nama, double harga) {
//         this.nama = nama;
//         this.harga = harga;
//     }

//     public abstract double hitungHarga();

//     @Override
//     public String toString() {
//         return nama + " - Rp " + harga;
//     }
// }
// ==========
abstract class Kue {
    private String nama;
    private double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public abstract double hitungHarga();

    @Override
    public String toString() {
        return "\tNama Kue: " + nama + ",\tHarga: " + harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }
}

