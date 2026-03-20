package inheritance;

public class InheritanceDemo {
  public static void main(String[] args) {
    Calculator calc = new Calculator();
    System.out.println(calc.add(10, 20));
    System.out.println(calc.sub(20, 14));

    AdvancedCalculator advCalc = new AdvancedCalculator();
    System.out.println(advCalc.mult(10, 20));
    System.out.println(advCalc.div(20, 10));
    // with inheritance
    System.out.println(advCalc.add(200, 1));
    System.out.println(advCalc.sub(201, 123));
  }
}
