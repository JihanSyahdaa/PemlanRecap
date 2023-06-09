package PENGAYAANDUA;

import java.util.ArrayList;
import java.util.List;

public class Perpustakaan implements Peminjaman {
    private List<Buku> koleksiBuku;
    private List<Anggota> daftarAnggota;

    public Perpustakaan() {
        this.koleksiBuku = new ArrayList<>();
        this.daftarAnggota = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        koleksiBuku.add(buku);
    }

    public void tambahAnggota(Anggota anggota) {
        daftarAnggota.add(anggota);
    }

    public List<Buku> getKoleksiBuku() {
        return koleksiBuku;
    }

    public List<Anggota> getDaftarAnggota() {
        return daftarAnggota;
    }

    @Override
    public void pinjamBuku(Buku buku, Anggota anggota) {
        if (!buku.isDipinjam()) {
            anggota.pinjamBuku(buku);
            System.out.println("Buku '" + buku.getJudul() + "' berhasil dipinjam oleh " + anggota.getNama());
        } else {
            System.out.println("Buku '" + buku.getJudul() + "' sedang dipinjam oleh anggota lain.");
        }
    }

    @Override
    public void kembalikanBuku(Buku buku, Anggota anggota) {
        if (buku.isDipinjam()) {
            if (anggota.getRiwayatPeminjaman().contains(buku)) {
                anggota.kembalikanBuku(buku);
                System.out.println("Buku '" + buku.getJudul() + "' berhasil dikembalikan oleh " + anggota.getNama());
            } else {
                System.out.println("Buku '" + buku.getJudul() + "' tidak sedang dipinjam oleh anggota tersebut.");
            }
        } else {
            System.out.println("Buku '" + buku.getJudul() + "' tidak sedang dipinjam oleh anggota tersebut.");
        }
    }
}



