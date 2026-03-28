// functional interface (has only one method)
@FunctionalInterface
interface A {
  void show();
}

// functional interface with a method which needs input + gives an output
interface B {
  String foobar(int a, String b);
}

public class LambdaExpressions {
  public static void main(String[] args) {
    // instantiating using an anonymous inner class
    A a1 = new A() {
      @Override
      public void show() {
        System.out.println("show()");
      }
    };
    a1.show();

    // same as above, using lambda expression
    A a2 = () -> {
      System.out.println("show()");
    };
    a2.show();
    // single statement => no need of {}
    A a3 = () -> System.out.println("show()");
    a3.show();

    // interface B with anonymous inner class
    B b1 = new B() {
      @Override
      public String foobar(int x, String y) {
        System.out.println("foobar() with x = " + x + "; y = " + y);
        return "foobar!";
      }
    };
    System.out.println(b1.foobar(145, "john cena"));

    // lambda expression with input params + return value
    B b2 = (x, y) -> {
      System.out.println("foobar() with x = " + x + "; y = " + y);
      return "foobar again!";
    };
    System.out.println(b2.foobar(200, "you cant see me"));
  }
}
