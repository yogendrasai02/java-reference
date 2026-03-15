class Mobile {
  private String brand;
  private int price;

  // static variables => shared by all the objects of this class
  private static String type;
  private static boolean isAvailable;

  static {
    System.out.println("Static block called first, before any constructors");
    System.out.println("Static block is called during class loading only, only once");
    Mobile.isAvailable = true;
  }

  public Mobile(String brand, int price, String type) {
    System.out.println("Constructor called");
    this.brand = brand;
    this.price = price;
    Mobile.type = type;
  }

  public void showSpecs() {
    System.out.println("Brand: %s | Price: %s | Type: %s | Is Available: %s".formatted(brand, price, type, isAvailable));
  }

  // static method: has access to only class static variables
  public static void showSalesAvailability() {
    System.out.println("Available: " + isAvailable);
  }
}

public class StaticKeyword {
  public static void main(String[] args) {
    Mobile m1 = new Mobile("Apple", 100, "SmartPhone");
    Mobile m2 = new Mobile("Nokia", 25, "Basic");
    Mobile m3 = new Mobile("Alien", 200, "Phone");
    m1.showSpecs(); // Type: Phone (since its static i.e, a shared variable)
    m2.showSpecs(); // Type: Phone
    m3.showSpecs(); // Type: Phone
    Mobile.showSalesAvailability();
  }
}
