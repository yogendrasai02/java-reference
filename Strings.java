public class Strings {
  public static void main(String[] args) {
    String name = "Mario";
    System.out.println(name);

    // .length() method
    System.out.println(name.length());

    // 0 based indexing
    System.out.println(name.charAt(0));
    System.out.println(name.charAt(1));

    // iteration: convert to character array
    for(char c: name.toCharArray()) {
      System.out.println(c);
    }

    // identityHashCode() -> provides a value that uniquely identifies the object instance in the current JVM execution
    System.out.println(System.identityHashCode(name)); // assume 500

    // String constant pool in the heap
    String name2 = "Mario";
    System.out.println(System.identityHashCode(name2)); // will be same as 500

    String a = "Hello";
    System.out.println(System.identityHashCode(a)); // assume 1000
    a = a + " World";
    System.out.println(System.identityHashCode(a)); // will be different that 1000 (say 2000)
    a = "Mario";
    System.out.println(System.identityHashCode(a)); // same as 500

    // StringBuffer
    StringBuffer sb = new StringBuffer();
    System.out.println(sb.capacity()); // 16

    sb = new StringBuffer("Mario");
    System.out.println(sb.capacity()); // 21 --> 5 (mario) + 16 (default buffer)
    // methods are similar to that of String, additional methods can be found
    System.out.println(System.identityHashCode(sb)); // assume 3000
    sb.setCharAt(0, 'L');
    System.out.println(System.identityHashCode(sb)); // will be 3000 (MUTABLE string)

    // StringBuffer is thread safe while StringBuilder is not thread safe
  }
}
