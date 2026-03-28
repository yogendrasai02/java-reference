// class A {
//   public void foo() {
//     for (int i = 0; i < 5; i++) {
//       System.out.println("A, i = " + i);
//     }
//   }
// }

// class B {
//   public void foo() {
//     for (int i = 0; i < 5; i++) {
//       System.out.println("B, i = " + i);
//     }
//   }
// }

class A extends Thread {

  @Override
  public void run() {
    for (int i = 0; i < 50; i++) {
      System.out.println("A, i = " + i);
    }
  }
}

class B extends Thread {

  @Override
  public void run() {
    for (int i = 0; i < 50; i++) {
      System.out.println("B, i = " + i);
    }
  }
}

public class ThreadsSimpleDemo {
  public static void main(String[] args) {
    // done in sequence
    // A a = new A();
    // B b = new B();
    // a.foo();
    // b.foo();

    A a = new A();
    B b = new B();
    // in multiple threads
    a.start();
    b.start();
  }
}
