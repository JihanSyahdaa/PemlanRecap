package ABSTRACTCLASS;

public class Car extends Vehicle {
    private Owner owner;
  
    public Car(Owner owner, String name, int year, double rpm) {
      super(name, year, rpm);
      this.owner = owner;
    }
  
    public void run() {
      System.out.println("Car name\t: " + this.name);
      System.out.println("Car owner\t: " + this.owner.getName());
      System.out.println("Output year\t: " + this.year);
      System.out.println("RPM\t\t: " + this.rpm);
    }
  }
