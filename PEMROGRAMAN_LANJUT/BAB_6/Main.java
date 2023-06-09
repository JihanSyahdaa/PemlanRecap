package ARRAYLISTT;

public class Main {
    public static void main(String[] args) {
  
      DataMahasiswa.tambahMahasiswa(new Mahasiswa("Denar Abidin", "Pendidikan Teknologi Informasi", false));
      DataMahasiswa.tambahMahasiswa(new Mahasiswa("Grenda Jamaludin", "Ilmu Komputer", true));

      // Lakukan modifikasi data tambah mahasiswa ...
      Mahasiswa mahasiswa3 = new Mahasiswa("Kevin Sanjaya", "Teknik Informatika", false);
      DataMahasiswa.tambahMahasiswa(mahasiswa3);
      Mahasiswa mahasiswa4 = new Mahasiswa("Marcus Gideon", "Sistem Informasi", true);
      DataMahasiswa.tambahMahasiswa(mahasiswa4);
      Mahasiswa mahasiswa5 = new Mahasiswa("Jonathan Christie", "Teknologi Informasi", false);
      DataMahasiswa.tambahMahasiswa(mahasiswa5);
      Mahasiswa mahasiswa6 = new Mahasiswa("Hendra Setiawan", "Pendidikan Teknologi Informasi", true);
      DataMahasiswa.tambahMahasiswa(mahasiswa6);
      Mahasiswa mahasiswa7 = new Mahasiswa("Fajar Alfian", "Teknik Komputer", false);
      DataMahasiswa.tambahMahasiswa(mahasiswa7);

      // Method tampilSemuaData
      DataMahasiswa.tampilSemuaData();
  
      // Method cariMahasiswa (jika data ada)
      System.out.println("=============== Mencari Data Mahasiswa ===============");
      DataMahasiswa.cariMahasiswa("Kevin Sanjaya");
      DataMahasiswa.cariMahasiswa("Jonathan Christie");
      DataMahasiswa.cariMahasiswa("Hendra Setiawan");
      DataMahasiswa.cariMahasiswa("Fajar Alfian");
      System.out.println();
  
      // Method cariMahasiswa (jika data tidak ada)
      DataMahasiswa.cariMahasiswa("Rian Ardianto");
      DataMahasiswa.cariMahasiswa("Muhammad Ahsan");
      DataMahasiswa.cariMahasiswa("Daniel Marthin");
      DataMahasiswa.cariMahasiswa("Syabda Perkasa");
      System.out.println();
  
      // Method tampilMahasiswa (sebelum diupdate)
      System.out.println("========== Data Mahasiswa Sebelum di Update ==========");
      DataMahasiswa.tampilMahasiswa(mahasiswa7);
      System.out.println();
  
      // Method tampilMahasiswa (setelah diupdate)
      System.out.println("========== Data Mahasiswa Setelah di Update ==========");
      Mahasiswa mahasiswa8 = new Mahasiswa("Leo Carnando", "Magister Teknik Komputer", true);
      DataMahasiswa.updateMahasiswa(mahasiswa7, mahasiswa8);
      DataMahasiswa.tampilMahasiswa(mahasiswa7);

    }
  }
