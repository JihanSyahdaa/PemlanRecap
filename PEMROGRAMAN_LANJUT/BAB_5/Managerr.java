package INHERITANCE;

import java.time.LocalDate;

public class Managerr extends Pekerja {
    private String departemen;

    public Managerr(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak, String departemen) {
        super(nama, jenisKelamin, nik, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    @Override
    public double getBonus() {
        double bonus = super.getBonus();
        bonus += 0.1 * getGaji(); 
        return bonus;
    }

    @Override
    public double getPendapatan() {
        double pendapatan = super.getPendapatan();
        pendapatan += 0.1 * getGaji(); 
        return pendapatan;
    }

    @Override
    public String toString() {
        return super.toString() + "Departemen\t: " + departemen + "\n";
    }
}


