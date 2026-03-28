import java.util.Scanner;

public class ExceptionHandling {
  public static int takeNumberInput(Scanner scanner, String message) {
    System.out.print(message);
    return scanner.nextInt();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // RuntimeException -> ArithmeticExpression
    try {
      int a = takeNumberInput(sc, "Enter a: ");
      int b = takeNumberInput(sc, "Enter b (enter 0 to demonstrate exception): ");
      int res = a / b;
      System.out.println("Result: " + res);
    } catch (Exception e) {
      System.out.println("Caught exception: " + e);
      System.out.println("Exception Message: " + e.getMessage());
      System.out.println("Exception Stack Trace:");
      e.printStackTrace();
    }

    // ArrayIndexOutOfBoundsException
    try {
      int[] arr = new int[4];
      System.out.println(arr[10]);
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      System.out.println("ArrayIndexOutOfBounds Exception: " + arrayIndexOutOfBoundsException);
    } finally {
      System.out.println("Finally block");
    }

    sc.close();
  }
}
