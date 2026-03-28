import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
  public static void main(String[] args) throws IOException {

    // option 1: use finally block
    // InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    // BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    // try {
    // System.out.println("Enter input string:");
    // String input = bufferedReader.readLine();
    // System.out.println("Input String = " + input);
    // } finally {
    // bufferedReader.close();
    // }

    // try with resources
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      System.out.println("Enter input string:");
      String input = br.readLine();
      System.out.println("Input String = " + input);
    }

    // NOTE: System.in is shared and single use resource in java
    // Once close, it can't be reopened or reused

  }
}
