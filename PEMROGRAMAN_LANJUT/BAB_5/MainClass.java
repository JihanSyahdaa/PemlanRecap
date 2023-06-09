package INHERITANCE;

import java.time.LocalDate;

public class MainClass {
    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("                Manusiaa                   ");
        System.out.println("-------------------------------------------");
            Manusiaa manusia1 = new Manusiaa("Peter", true, "1234567890", true);
            System.out.println(manusia1.toString());

            Manusiaa manusia2 = new Manusiaa("Natasha", false, "0987654321", true);
            System.out.println(manusia2.toString());

            Manusiaa manusia3 = new Manusiaa("Tony", true, "1357902468", false);
            System.out.println(manusia3.toString());

            //System.out.println("======================================================================================");
        System.out.println("===========================================");
        System.out.println("             MahasiswaFILKOM               ");
        System.out.println("-------------------------------------------");
            MahasiswaFILKOM mahasiswa1 = new MahasiswaFILKOM("Jihan Syahda", false, "2345678990", false, "225150407111026", 2.3);
            System.out.println(mahasiswa1.toString());

            MahasiswaFILKOM mahasiswa2 = new MahasiswaFILKOM("Jihan Syahda", false, "2345678990", false, "225150407111026", 3.4);
            System.out.println(mahasiswa2.toString());

            MahasiswaFILKOM mahasiswa3 = new MahasiswaFILKOM("Jihan Syahda", false, "2345678990", false, "225150407111026", 4.0);
            System.out.println(mahasiswa3.toString());

        System.out.println("===========================================");
        System.out.println("                 Pekerja                   ");
        System.out.println("-------------------------------------------");
            Pekerja pekerja1 = new Pekerja("Bucky", true, "0987654321", true, 5000, LocalDate.of(2021, 1, 1), 2 );
            System.out.println(pekerja1.toString());

            Pekerja pekerja2 = new Pekerja("Kate", false, "9087654321", false, 7000, LocalDate.of(2014, 2, 2), 0 );
            System.out.println(pekerja2.toString());

            Pekerja pekerja3 = new Pekerja("Clint", true, "8087654321", true, 9000, LocalDate.of(2003, 3, 3), 10 );
            System.out.println(pekerja3.toString());

        System.out.println("===========================================");
        System.out.println("                 Managerr                  ");
        System.out.println("-------------------------------------------");
            Managerr manager1 = new Managerr("Bruce", true, "1234567890", true, 7500, LocalDate.of(2008, 1, 1), 1, "HRD");
            System.out.println(manager1.toString());

            Managerr manager2 = new Managerr("Gamora", false, "3214567890", false, 7500, LocalDate.of(2008, 1, 1), 3, "Marketing");
            System.out.println(manager2.toString());
    }    
}
