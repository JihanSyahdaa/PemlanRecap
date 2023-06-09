package PRAKTIKUM;

// public class MainStudent {
//     public static void main(String[] args) {
//     Student anna = new Student();
//     anna.setName("Anna");
//     anna.setAddress("Malang");
//     anna.setAge(20);
//     anna.setMath(100);
//     anna.setScience(89);
//     anna.setEnglish(80);
//     anna.displayMessage();
    
//      //menggunakan constructor lain
//      System.out.println("===================");
//      Student chris = new Student("Chris", "Kediri", 21);
//      chris.setMath(70);
//      chris.setScience(60);
//      chris.setEnglish(90);
//      chris.displayMessage();
    
//      //siswa denagan nama chris dirubah informasi alamat dan     umurnya melalui method
//      System.out.println("===================");
//      chris.setAddress("Surabaya");
//      chris.setAge(22);
//      chris.displayMessage();

//      Student louis = new Student(90, 70, 50);
//      louis.setName("louis");
//      louis.setAddress("Jakarta");
//      louis.setAge(25);
//      louis.displayMessage();

//      Student peter = new Student(90, 70, 50);
//      peter.setName("peter");
//      peter.setAddress("Bogor");
//      peter.setAge(23);
//      peter.displayMessage();

//      }
     
//     }

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah siswa: ");
        int numStudents = input.nextInt();
        input.nextLine();
        
        Student[] students = new Student[numStudents];
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Siswa " + (i+1));
            System.out.print("Masukkan nama\t: ");
            String name = input.nextLine();
            System.out.print("Masukkan alamat\t: ");
            String address = input.nextLine();
            System.out.print("Masukkan umur\t: ");
            int age = input.nextInt();
            input.nextLine();
            
            System.out.print("Masukkan nilai matematika \t: ");
            int math = input.nextInt();
            input.nextLine();
            System.out.print("Masukkan nilai sains\t\t: ");
            int science = input.nextInt();
            input.nextLine();
            System.out.print("Masukkan nilai bahasa Inggris\t: ");
            int english = input.nextInt();
            input.nextLine();
            
            Student student = new Student();
            student.setName(name);
            student.setAddress(address);
            student.setAge(age);
            student.setMath(math);
            student.setScience(science);
            student.setEnglish(english);
            
            students[i] = student;
        }
        
        for (int i = 0; i < numStudents; i++) {
            students[i].displayMessage();
        }

        Student.jumlahObjek();
        
        input.close();
    }
}




    
    
