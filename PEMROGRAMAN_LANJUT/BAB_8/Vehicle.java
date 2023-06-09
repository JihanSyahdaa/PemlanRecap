package ABSTRACTCLASS;

public abstract class Vehicle {
    protected String name;
    protected int year;
    protected double rpm;
  
    public Vehicle(String name, int year, double rpm) {
      this.name = name;
      this.year = year;
      this.rpm = rpm;
    }
  
    public abstract void run();
}
