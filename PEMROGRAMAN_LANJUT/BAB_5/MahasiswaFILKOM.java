package INHERITANCE;

public class MahasiswaFILKOM extends Manusiaa {
    private String nim;
    private double ipk;
    
    public MahasiswaFILKOM(String nama, boolean jenisKelamin, String nik, boolean menikah, String nim, double ipk) {
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public String getNim() {
        return nim;
    }
    
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    
    public double getIpk() {
        return ipk;
    }
    
    public String getStatus() {
        String status = "";
        String angkatan = nim.substring(0, 2);
        String prodiStr = "";
        
        switch (nim.charAt(6)) {
            case '2':
                prodiStr = "Teknik Informatika";
                break;
            case '3':
                prodiStr = "Teknik Komputer";
                break;
            case '4':
                prodiStr = "Sistem Informasi";
                break;
            case '6':
                prodiStr = "Pendidikan Teknologi Informasi";
                break;
            case '7':
                prodiStr = "Teknologi Informasi";
                break;
            default:
                break;
        }
        
        status = prodiStr + ", " + "20" + angkatan;
        return status;
    }

    public double getBeasiswa() {
        double beasiswa = 0;
        if (ipk >= 3.0 && ipk < 3.5) {
            beasiswa = 50;
        } else if (ipk >= 3.5 && ipk <= 4.0) {
            beasiswa = 75;
        }
        return beasiswa;
    }

    @Override
    public double getPendapatan(){
        return super.getPendapatan() + getBeasiswa();
    }
    
    public String toString() {
        return super.toString() + "NIM\t\t: " + nim + "\n" +
            "IPK\t\t: " + ipk + "\n" +
            "Status\t\t: " + getStatus() + "\n";
    }
}

