package INHERITANCE;

public class Manusiaa {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;
    
    public Manusiaa(String nama, boolean jenisKelamin, String nik, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    
    public boolean getJenisKelamin() {
        return jenisKelamin;
    }
    
    public void setNik(String nik) {
        this.nik = nik;
    }
    
    public String getNik() {
        return nik;
    }
    
    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }
    
    public boolean getMenikah() {
        return menikah;
    }
    
    public double getTunjangan() {
        double tunjangan = 0;
        if (menikah) {
            tunjangan = jenisKelamin ? 25 : 20;
        } else {
            tunjangan = 15;
        }
        return tunjangan;
    }
    
    public double getPendapatan() {
        double pendapatan = 0;
        pendapatan += getTunjangan();
        return pendapatan;
    }
    
    public String toString() {
        String jenisKelaminStr = jenisKelamin ? "Laki-laki" : "Perempuan";
        String statusMenikahStr = menikah ? "Sudah Menikah" : "Belum Menikah";
        return "Nama\t\t: " + nama + "\n" + 
            "NIK\t\t: " + nik + "\n" +
            "Jenis Kelamin\t: " + jenisKelaminStr + "\n" +
            "Status Menikah\t: " + statusMenikahStr + "\n" +
            "Pendapatan\t: $" + String.format("%.1f", getPendapatan()) + "\n";
    }
}

