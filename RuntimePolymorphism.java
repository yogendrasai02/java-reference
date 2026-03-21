class A {
  public void foo() {
    System.out.println("fooA");
  }
}

class B extends A {
  public void foo() {
    System.out.println("fooB");
  }
}

class C extends A {
  public void foo() {
    System.out.println("fooC");
  }
}


public class RuntimePolymorphism {
  public static void main(String[] args) {

    A obj = new A();
    obj.foo();
    
    // dynamic method dispatch / runtime polymorphism
    obj = new B();
    obj.foo();

    obj = new C();
    obj.foo();
  }
}
