class A {
  // this method wants to delegate exception handling to its consumer
  public void foo() throws ClassNotFoundException {
    Class.forName("JohnCena");
  }

  // again delegate to the consumer
  public void foobar() throws ClassNotFoundException {
    this.foo();
  }
}

class B {
  // delegate again
  public void test() throws ClassNotFoundException {
    A obj = new A();
    obj.foo();
  }
}

public class ThrowsKeyword {
  public static void main(String[] args) {
    try {
      A obj1 = new A();
      obj1.foobar();
    } catch (ClassNotFoundException cnfException) {
      System.out.println("ClassNotFoundException");
    } catch (Exception e) {
      System.out.println("Exception");
    }
  }
}
