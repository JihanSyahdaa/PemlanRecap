package INHERITANCE;

import java.time.LocalDate;

public class Pekerja extends Manusiaa {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getGaji() {
        return gaji;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public int getLamaBekerja() {
        int tahunSekarang = LocalDate.now().getYear();
        int tahunMasuk = this.tahunMasuk.getYear();
        return tahunSekarang - tahunMasuk;
    }

    public double getBonus() {
        double bonus = 0;
        int lamaBekerja = getLamaBekerja();
        if (lamaBekerja >= 10) {
            bonus = 0.1 * gaji;
        } else if (lamaBekerja >= 5) {
            bonus = 0.05 * gaji;
        }
        return bonus;
    }

    @Override
    public double getPendapatan() {
        double pendapatan = super.getPendapatan();
        pendapatan += gaji;
        pendapatan += getBonus();
        pendapatan += jumlahAnak * 0.1 * gaji;
        return pendapatan;
    }

    @Override
    public String toString() {
        return super.toString() + "Gaji\t\t: $" + String.format("%.1f", gaji) + "\n" +
            "Tahun Masuk\t: " + tahunMasuk + "\n" +
            "Jumlah Anak\t: " + jumlahAnak + "\n" ;
    }
}

