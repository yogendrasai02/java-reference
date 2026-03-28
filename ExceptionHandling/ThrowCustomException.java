class MyException extends Exception {
  public MyException(String message) {
    super(message);
  }
}

public class ThrowCustomException {
  public static void main(String[] args) {
    try {
      int x = 10;
      if (x < 50) {
        throw new MyException("Demonstrating custom exception");
      }
    } catch (MyException myException) {
      System.out.println("Custom exception:");
      System.out.println(myException);
      myException.printStackTrace();
    }
  }
}
