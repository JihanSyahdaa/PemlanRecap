package POLIMORFISME;

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
