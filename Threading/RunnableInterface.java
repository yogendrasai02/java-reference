class A implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 50; i++) {
      System.out.println("A, i = " + i);
    }
  }
}

class B implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 50; i++) {
      System.out.println("B, i = " + i);
    }
  }
}

public class RunnableInterface {
  public static void main(String[] args) {
    A a = new A();
    B b = new B();
    Thread ta = new Thread(a);
    Thread tb = new Thread(b);
    ta.start();
    tb.start();

    System.out.println("----------"); // wont make a difference lol, there are 4 threads in this main() method

    // alternatively, instead of classes A, B; you can use lambda expressions
    // because Runnable is a functional interface
    Runnable c = () -> {
      for (int i = 0; i < 20; i++) {
        System.out.println("C, i = " + i);
      }
    };
    Runnable d = () -> {
      for (int i = 0; i < 20; i++) {
        System.out.println("D, i = " + i);
      }
    };
    Thread tc = new Thread(c);
    Thread td = new Thread(d);
    tc.start();
    td.start();
  }
}
