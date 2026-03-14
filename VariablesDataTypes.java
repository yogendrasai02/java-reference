public class VariablesDataTypes {
  public static void main(String[] args) {
    // NUMBERS
    // int: 4 bytes
    int num = 10;

    // long: 8 bytes
    long capital = 10_00_00_000l;

    // short: 2 bytes
    short profit = -100;

    System.out.println(num + " " + capital + " " + profit);

    // DECIMALS
    float f = 2.3f;
    double interestRate = 9.252134;
    System.out.println(f + " " + interestRate);  
    
    // CHARACTER
    char ch = 'A';
    System.out.println(ch);

    // BOOLS
    boolean b = false;
    System.out.println(b);

    // STRING
    String name = "Mario Luigi";
    System.out.println(name);

    // TYPE CASTING
    byte bVar = 127;
    int a = 250;
    // bVar = a; // lossy, ERROR
    bVar = (byte) a; // explicit lossy type casting
    System.out.println(bVar); // -6 => compiler does "mod 256" (size of byte)

    float fVar = 5.1234f;
    int x = (int) fVar; // 5 (decimals are cut off)
    System.out.println(x);

    byte b1 = 10, b2 = 50;
    int res = b1 * b2;
    System.out.println(res); // 500 => type promotion (500 is out of range of byte, but promoted to int)
  }
}
