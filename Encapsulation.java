class Person {
  private String name;
  private int age;
  private String aadharNumber;

  public Person(String name, int age, String aadharNumber) {
    this.name = name;
    this.age = age;
    this.aadharNumber = aadharNumber;
  }

  // getters & setters
  public String getAadharNumber() {
    // masks all but the last 4 characters
    int maskLength = this.aadharNumber.length() - 4;
    return "X".repeat(maskLength) + this.aadharNumber.substring(maskLength);
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

}

public class Encapsulation {
  public static void main(String[] args) {
    Person p = new Person("Ram", 20, "ABCDEFFHIJ");
    System.out.println(p.getAadharNumber());
    System.out.println(p.getAge());
    p.setName("Raghav");
    System.out.println(p.getName());
  }  
}
