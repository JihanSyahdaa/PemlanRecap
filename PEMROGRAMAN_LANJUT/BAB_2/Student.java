package PRAKTIKUM;

public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int count;
    
    public Student(){
        name = "";
        address = "";
        age = 0;
        count++;
    }
    
    public Student(String n, String a, int ag){
        name = n;
        address = a;
        age = ag;
        count++;
    }

    public Student(double math, double english, double science){
        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;
        count++;
    }

    public static void jumlahObjek() {
        System.out.println("Jumlah objek yang dibuat: " + count);
    }
    
    public void setName(String n){
        name = n;
    }
    
    public void setAddress(String a){
        address = a;
    }
    
    public void setAge(int ag){
        age = ag;
    }
    
    public void setMath(double math){
        mathGrade = math;
    }
    
    public void setEnglish(double english){
        englishGrade = english;
    }
    
    public void setScience(double science){
        scienceGrade = science;
    }
    
    private double getAverage(){
        average = (mathGrade+scienceGrade+englishGrade)/3;
        return average;
    }

    public boolean statusAkhir() {
        return getAverage() >= 61;
    }
    
    public void displayMessage(){
        System.out.println("Siswa dengan nama "+name);
        System.out.println("beramalat di "+address);
        System.out.println("berumur "+age);
        System.out.println("mempunyai nilai rata rata "+getAverage());
        System.out.println("Status: " + (statusAkhir() ? "Lulus" : "Remidi"));
    }
}







