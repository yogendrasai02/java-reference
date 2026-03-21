class A {
  public A() {
    System.out.println("Default Constructor of A");
  }

  public A(int x) {
    System.out.println("Parameterized Constructor of A: " + x);
  }
}

class B extends A {
  public B() {
    this(100);
    System.out.println("Default Constructor of B");
  }

  public B(int y) {
    super(y + 200);
    System.out.println("Parameterized Constructor of B: " + y);
  }
}

public class SuperThis {
  public static void main(String[] args) {
    B obj = new B(10);
    B obj2 = new B();
  }
}
