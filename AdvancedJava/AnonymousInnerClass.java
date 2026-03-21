class A {
  public void foo() {
    System.out.println("fooA");
  }
}

public class AnonymousInnerClass {
  public static void main(String[] args) {
    A a = new A() {
      public void foo() {
        System.out.println("fooFinal");
      }
    };
    a.foo();
  }
}
