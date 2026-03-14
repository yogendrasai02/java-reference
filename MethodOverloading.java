import java.math.BigInteger;

class Calculator {
  
  // number of paramters
  public int add(int a, int b) {
    return a + b;
  }
  public int add(int a, int b, int c) {
    return a + b + c;
  }

  // type of parameters
  public double add(double a, double b) {
    return a + b;
  }

  public String add(String a, String b) {
    BigInteger bigIntegerA = new BigInteger(a);
    BigInteger bigIntegerB = new BigInteger(b);
    BigInteger sum = bigIntegerA.add(bigIntegerB);
    return sum.toString();
  }

  // order of parameters
  public double add(int a, double b) {
    return (double) a + b;
  }

  public double add(double a, int b) {
    return a + (double) b;
  }
}

public class MethodOverloading {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();

    // number of parameters
    System.out.println(calculator.add(10, 20));
    System.out.println(calculator.add(10, 20, 30));

    // type of parameters
    System.out.println(calculator.add(10, 20));
    System.out.println(calculator.add(1.23, 2.34));
    System.out.println(calculator.add("9223372036854775808", "1000000000000000000"));

    // order of parameters
    System.out.println(calculator.add(10, 15.23));
    System.out.println(calculator.add(15.34, 10));
  }
}
