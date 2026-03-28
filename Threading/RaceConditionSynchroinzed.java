class Counter {
  int count1;
  int count2;

  public void increment1() {
    count1++;
  }

  public synchronized void increment2() {
    count2++;
  }

  public int getCount1() {
    return count1;
  }

  public int getCount2() {
    return count2;
  }
}

public class RaceConditionSynchroinzed {
  public static void main(String[] args) {
    Counter c = new Counter();
    Runnable a = () -> {
      for (int i = 0; i < 5000; i++) {
        c.increment1();
        c.increment2();
      }
    };
    Runnable b = () -> {
      for (int i = 0; i < 5000; i++) {
        c.increment1();
        c.increment2();
      }
    };

    Thread t1 = new Thread(a);
    Thread t2 = new Thread(b);

    t1.start();
    t2.start();

    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      System.out.println("InterruptionException");
    }

    System.out.println("count1 value = " + c.getCount1());
    System.out.println("count2 value = " + c.getCount2()); // will always be 10000
  }
}
