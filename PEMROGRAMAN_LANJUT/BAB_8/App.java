package ABSTRACTCLASS;

public class App {
    public static void main(String[] args) {
      Owner arsyad = new Owner("Arsyad");
      Car toyota = new Car(arsyad, "Toyota GR Yaris", 2022, 6500.0);
      toyota.run();
      System.out.println("                                                              ");
  
      Owner ardhan = new Owner("Ardhan");
      Car jeep = new Car(ardhan, "Jeep Wrangler", 1972, 6000.0);
      jeep.run();
      System.out.println("                                                              ");
  
      Owner budhi = new Owner("Budhi");
      Car mazda = new Car(budhi, "Mazda RX 87", 1967, 10500.0);
      mazda.run();
      System.out.println("                                                              ");
  
      Owner galuh = new Owner("Galuh");
      Car mercedes = new Car(galuh, "Mercedes Benz 220", 1958, 5500.0);
      mercedes.run();
      System.out.println("                                                              ");
    }
  }
