package PENGAYAANDUA;

public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();

        // Menambahkan buku ke perpustakaan
        Buku buku1 = new Buku("Algoritma Pemrograman", "Rendy", 2020);
        Buku buku2 = new Buku("Sistem Jaringan Komputer", "Rihana", 2021);
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        // Menambahkan anggota perpustakaan
        Anggota anggota1 = new Anggota("Rendy", "A001");
        Anggota anggota2 = new Anggota("Rihana", "A002");
        perpustakaan.tambahAnggota(anggota1);
        perpustakaan.tambahAnggota(anggota2);

        // Melakukan peminjaman dan pengembalian buku
        perpustakaan.pinjamBuku(buku1, anggota1);
        perpustakaan.pinjamBuku(buku2, anggota2);
        perpustakaan.pinjamBuku(buku2, anggota1); // Peminjaman buku yang sedang dipinjam
        perpustakaan.kembalikanBuku(buku1, anggota1);
        perpustakaan.kembalikanBuku(buku1, anggota2); // Pengembalian buku yang tidak dipinjam oleh anggota tersebut
    }
}

