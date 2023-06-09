package PENGAYAANDUA;

import java.util.ArrayList;
import java.util.List;

public class Anggota {
    private String nama;
    private String nomorAnggota;
    private List<Buku> riwayatPeminjaman;

    public Anggota(String nama, String nomorAnggota) {
        this.nama = nama;
        this.nomorAnggota = nomorAnggota;
        this.riwayatPeminjaman = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorAnggota() {
        return nomorAnggota;
    }

    public void setNomorAnggota(String nomorAnggota) {
        this.nomorAnggota = nomorAnggota;
    }

    public List<Buku> getRiwayatPeminjaman() {
        return riwayatPeminjaman;
    }

    public void pinjamBuku(Buku buku) {
        riwayatPeminjaman.add(buku);
        buku.setDipinjam(true);
    }

    public void kembalikanBuku(Buku buku) {
        riwayatPeminjaman.remove(buku);
        buku.setDipinjam(false);
    }
}