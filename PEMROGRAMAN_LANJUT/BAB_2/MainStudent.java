package PRAKTIKUM;

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




    
    
