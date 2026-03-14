public class Operators {
  public static void main(String[] args) {
    int a = 10, b = 5;
    
    // arithmetic operators
    System.out.println(a + b); // 50
    System.out.println(a - b); // 5
    int c = a * b;
    System.out.println(c); // 50
    System.out.println(a / b); // 2
    System.out.println(a % b); // 0
    System.out.println(97 % 7); // 1 (91 is the nearest multiple, 6 is the remainder)

    // pre & post increment operators (similarly pre & post decrement)
    int d = ++a; // pre increment => a is incremented and then assigned to d. a was 10, becomes 11, then assigned to d
    System.out.println(d); // 11

    d = a++; // d gets 11, then a gets incr to 12
    System.out.println(d); // 11
    System.out.println(a); // 12

    int e = --a; // a becomes 11 (from 12), then e gets 11
    System.out.println(a);
    System.out.println(e);

    e = a--; // e gets 11 (which is current value of a), then a becomes 10
    System.out.println(a); // 10
    System.out.println(e); // 11

    a += 100; // shorthand assignment

    // relational operators
    int x = 100, y = 50;
    boolean b1 = x > y;
    System.out.println(b1); // true
    System.out.println(x < y); // false
    System.out.println(x >= y); // true
    System.out.println(x <= y); // false
    System.out.println(x == y); // false
    System.out.println(x != y); // true

    // logical operators
    boolean b2 = (100 >= 120) && (100 < 120);
    System.out.println(b2); // false
    b2 = (100 >= 50) && (100 >= 70);
    System.out.println(b2); // true
    System.out.println((a < b) || (a <= 100));
  }
}
