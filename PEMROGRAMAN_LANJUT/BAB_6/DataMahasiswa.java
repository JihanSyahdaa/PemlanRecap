package ARRAYLISTT;

import java.util.ArrayList;

class DataMahasiswa {

  private static ArrayList<Mahasiswa> mhs = new ArrayList<>();
  private static Mahasiswa mahasiswa1 = new Mahasiswa();

    public static ArrayList<Mahasiswa> tambahMahasiswa(Mahasiswa mahasiswa){
        mhs.add(mahasiswa);
        return mhs;
    }

    public static void tampilSemuaData() {
        int n = mhs.size();
        for (int i = 0; i < n; i++) {
            Mahasiswa m = mhs.get(i);
            System.out.println("==========" + " Tampilan Data Mahasiswa " + (i+1) + " Filkom UB " + "==========");
            System.out.println("Nama Mahasiswa\t: " + m.getNama());
            System.out.println("Jurusan\t\t: " + m.getJurusan());
            System.out.println("Status\t\t: " + (m.getStatus() ? "Menikah" : "Lajang"));
            System.out.println();
        }
    }

    public static Mahasiswa cariMahasiswa(String nama) {
        int n = mhs.size();
        for (int i = 0; i < n; i++) {
            Mahasiswa m = mhs.get(i);
            if (m.getNama().equalsIgnoreCase(nama)) {
                System.out.println("Data mahasiswa atas nama " + nama + " ditemukan");
                return mahasiswa1;
            }
        }
    
        System.out.println("Data mahasiswa atas nama " + nama + " tidak ditemukan");
        return null;
    }
    
    public static void tampilMahasiswa(Mahasiswa mahasiswa) {
        System.out.println("Nama Mahasiswa\t: " + mahasiswa.getNama());
        System.out.println("Jurusan\t\t: " + mahasiswa.getJurusan());
        System.out.println("Status\t\t: " + (mahasiswa.getStatus() ? "Menikah" : "Lajang"));
    }

    public static void updateMahasiswa(Mahasiswa m1, Mahasiswa m2) {
        m1.setNama(m2.getNama());
        m1.setJurusan(m2.getJurusan());
        m1.setStatus(m2.getStatus());
    }
}
