class A {
  public void foo() {
    System.out.println("fooA");
  }

  class B {
    public void foobar() {
      System.out.println("foobarB");
    }
  }

  static class C {
    public void hello() {
      System.out.println("helloC");
    }
  }
}

public class InnerClass {
  public static void main(String[] args) {
    A a = new A();
    a.foo();

    // create an instance of a non-static inner class
    // you need an object of the outer class
    A.B b = a.new B();
    b.foobar();

    // create an instance of the static inner class
    // you dont need the object of the outer class
    A.C c = new A.C();
    c.hello();
  }
}
