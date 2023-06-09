// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;
import java.util.Scanner;

class Buah {
    String nama;
    int stok;

    public Buah(String nama, int stok) {
        this.nama = nama;
        this.stok = stok;
    }
}

class Manusia {
    String nama;
    int jumlahBeli;

    public Manusia(String nama, int jumlahBeli) {
        this.nama = nama;
        this.jumlahBeli = jumlahBeli;
    }

    public void beliBuah(Buah buah) {
        if (buah.stok >= this.jumlahBeli) {
            System.out.println("Berhasil checkout buah");
            buah.stok -= this.jumlahBeli;
            System.out.println("Sisa buah = " + buah.stok);
        } else {
            System.out.println("Gagal checkout buah");
        }
    }
}


public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaBuah = sc.nextLine();
        int jumlahStok = sc.nextInt();
        int jumlahBeli = sc.nextInt();
        
        if (jumlahStok == 0 || jumlahBeli == 0){
            System.out.println("NA");
        }else{
            Buah buah = new Buah(namaBuah, jumlahStok);
            Manusia pembeli = new Manusia("Pak Tejo", jumlahBeli);

        pembeli.beliBuah(buah);
        }
    }
}