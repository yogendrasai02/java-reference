abstract class Vehicle {
  abstract public void start();

  public void playMusic() {
    System.out.println("Vehicle playing music");
  }
}

abstract class Car extends Vehicle {
  // could not implement abstract method? class becomes abstract
  public void refillFuel() {
    System.out.println("Car refilling fuel");
  }
}

class Tiago extends Car {
  // implement the abstract method
  public void start() {
    System.out.println("Tiago starting");
  }

  public void playMusic() {
    System.out.println("Tiago playing music");
  }
}

public class AbstractKeyword {
  public static void main(String[] args) {
    // dynamic method dispatch (runtime polymorphism)
    Vehicle v = new Tiago();
    v.start();
  }
}
