class A {
  public void foo() {
    System.out.println("foo() of A");
  }

  public void foobar() {
    System.out.println("foobar() of A");
  }
}

class B extends A {
  public void foo() {
    // super.foo();
    System.out.println("foo() of B");
  }
}

public class MethodOverriding {
  public static void main(String[] args) {
    B obj = new B();
    obj.foo();
    obj.foobar();
  }
}
