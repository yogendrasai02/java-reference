public class Loops {
  public static void main(String[] args) {
    // for loop
    for(int i = 0; i < 5; i++) {
      System.out.println("For loop iteration #: " + i);
    }

    // while loop
    int count = 1;
    while(count <= 4) {
      System.out.println("While loop iteration #:" + count);
      count++;
    }

    // do-while loop (exit controlled)
    count = 100;
    do {
      System.out.println("Do while, Count Variable = " + count);
      count++;
    } while (count <= 100);
  }
}
