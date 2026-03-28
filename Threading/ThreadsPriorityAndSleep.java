class A extends Thread {

  @Override
  public void run() {
    for (int i = 0; i < 500; i++) {
      System.out.println("A, i = " + i);
      // sleep for sometime
      try {
        Thread.sleep(4); // play around with different values
      } catch (InterruptedException interruptedException) {
        System.out.println("InterruptedException: " + interruptedException.getMessage());
        System.out.println(interruptedException);
      }
    }
  }
}

class B extends Thread {

  @Override
  public void run() {
    for (int i = 0; i < 500; i++) {
      System.out.println("B, i = " + i);
      // sleep for sometime
      try {
        Thread.sleep(1); // play around with different values
      } catch (InterruptedException interruptedException) {
        System.out.println("InterruptedException: " + interruptedException.getMessage());
        System.out.println(interruptedException);
      }
    }
  }
}

public class ThreadsPriorityAndSleep {
  public static void main(String[] args) {
    A a = new A();
    B b = new B();

    // get the priority: 5 is default
    System.out.println(a.getPriority());
    System.out.println(a.getName());
    System.out.println(b.getPriority());
    System.out.println(b.getName());

    // set the priority: making a suggestion to the thread scheduler
    b.setPriority(Thread.MAX_PRIORITY);

    a.start();
    b.start();
  }
}
