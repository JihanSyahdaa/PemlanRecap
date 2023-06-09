package PRAKTIKUM;

import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

class Perpus {

    private String kategori;
    private String penulis;
    private String judul;
    private String bahasa;
    private String penerbitan;
    private String edisi;
    private int halaman;
    private String[] penulisbanyak;
    private String sinopsis;
    private int jumlahKata;
    private double presentaseKesamaan;


    public Perpus(){

    }

    public Perpus(String nKategori, String nPenulis, String nJudul, String nBahasa, String nPenerbitan, String nEdisi, String nHalaman, String nSinopsis) {
    }

    public String[] getpenulisbanyak() {
        return penulisbanyak;
    }

    public void setPenulisbanyak(String[] s) {
        this.penulisbanyak = s;
    }

    public void setKategori(String s) {
        kategori = s;
    }

    public void setPenulis(String s) {
        penulis = s;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setJudul(String s) {
        judul = s;
    }

    public String getJudul() {
        return judul;
    }

    public void setPenerbitan(String s) {
        penerbitan = s;
    }

    public void setEdisi(String i) {
        edisi = i;
    }

    public void setHalaman(int i) {
        halaman = i;
    }

    public void setBahasa(String s) {
        bahasa = s;
    }

    public void setSinopsis(String s){
        sinopsis = s;
        hitungjumlahkata();
    }

    public void hitungjumlahkata(){
        String kata = sinopsis;
        int hitung = 0;

        for(int x = 0; x<kata.length(); x++){
            if(kata.charAt(x) == ' '){
                hitung++;
            }
        }

        if(hitung>0){
            hitung = hitung + 1;
        }

        jumlahKata = hitung;
    }

    public double cekTingkatKesamaan(Perpus n) {
        double jumlahKesamaan = 0;
        double totalAttributes = 9;
    
        if (this.kategori.equals(n.kategori)) {
            jumlahKesamaan++;
        }
        if (this.penulis.equals(n.penulis)) {
            jumlahKesamaan++;
        }
        if (Arrays.equals(this.penulisbanyak, n.penulisbanyak)) {
            jumlahKesamaan++;
        }
        if (this.judul.equals(n.judul)) {
            jumlahKesamaan++;
        }
        if (this.bahasa.equals(n.bahasa)) {
            jumlahKesamaan++;
        }
        if (this.penerbitan.equals(n.penerbitan)) {
            jumlahKesamaan++;
        }
        if (this.edisi.equals(n.edisi)) {
            jumlahKesamaan++;
        }
        if (this.halaman == n.halaman) {
            jumlahKesamaan++;
        }
        if (this.sinopsis.equals(n.sinopsis) && this.sinopsis != null) {
            jumlahKesamaan++;
        }
    
        presentaseKesamaan = jumlahKesamaan / totalAttributes * 100;
        displayPresentaseTingkatKesamaan(n);
        return presentaseKesamaan;
        
    }
    
    public void displayMessage() {
        System.out.println(judul);
        System.out.println("Informasi Buku: ");
        System.out.println("Kategori : " + kategori);
        if (this.penulisbanyak == null) {
            System.out.println("Penulis : " + penulis);
        } else {
            System.out.println("Penulis : " + Arrays.toString(penulisbanyak).replace("[", "").replace("]", ""));
        }
        System.out.println("Penerbitan : " + penerbitan);
        System.out.println("Edisi : " + edisi);
        System.out.println("Jumlah Halaman : " + halaman);
        System.out.println("Bahasa : " + bahasa);
        if(jumlahKata>=10){
            System.out.println("Sinopsis : " + sinopsis);
        }
    }

    public void displayPresentaseTingkatKesamaan(Perpus n){
        System.out.printf("Tingkat Kesamaan dengan buku lain adalah %.1f%%\n", presentaseKesamaan);
    }

    public void bacaFile(String pathfile){
        try{
            File filee = new File(pathfile);
            Scanner io = new Scanner(filee);
            String isi = io.nextLine();

            String[] isifile =  isi.split("; ");

            this.judul = isifile[0];
            this.penulis = isifile[1];
            io.close();

        }catch(FileNotFoundException exception){
            System.out.println("File not found: " + exception.getMessage());
        }
    }
    
    public void simpanFile(String namaFile) {
        try {
            File file = new File(namaFile);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(judul + "; " + penulis);
            bw.newLine();

            bw.close();
            fw.close();
            System.out.println("Data berhasil disimpan ke dalam file " + namaFile);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan file.");
            e.printStackTrace();
        }
    }

    public double hitungRoyalti(double harga) {
        double royalti = 0.1 * harga;
        System.out.printf("Royalti yang diterima adalah Rp %.2f.\n", royalti);
        return royalti;
    }

    public double hitungRoyalti(double harga, double persen) {
        double royalti = persen / 100 * harga;
        System.out.printf("Royalti yang diterima adalah Rp %.2f.\n", royalti);
        return royalti;
    }
}