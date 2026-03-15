class CreditCard {
  private int rewardPoints;
  private int balance;
  private String tieUpCompany;

  // default constructor
  public CreditCard() {
    System.out.println("Default constructor called");
    this.rewardPoints = 1000;
    this.balance = 3_00_000;
    this.tieUpCompany = "NONE";
  }

  // parameterised constructor
  public CreditCard(int rewardPoints, int balance, String tieUpCompany) {
    System.out.println("Initialising CreditCard with reward points: %s, balance: %s, with company tie up: %s".formatted(rewardPoints, balance, tieUpCompany));
    this.rewardPoints = rewardPoints;
    this.balance = balance;
    this.tieUpCompany = tieUpCompany;
  }

  // constructor overloading
  public CreditCard(int rewardPoints, int balance) {
    System.out.println("Initialising CreditCard with reward points: %s, balance: %s".formatted(rewardPoints, balance));
    this.rewardPoints = rewardPoints;
    this.balance = balance;
    this.tieUpCompany = "NONE";
  }

  public CreditCard(int balance) {
    System.out.println("Initialising CreditCard with balance: " + balance);
    this.balance = balance;
    this.rewardPoints = 0;
    this.tieUpCompany = "NONE";
  }

  // getters and setters
  // ......

  public String toString() {
    return "[Credit Card] Balance: %s | Reward Points: %s | Tie up company: %s".formatted(this.balance, this.rewardPoints, this.tieUpCompany);
  }
}

public class Constructors {
  public static void main(String[] args) {
    CreditCard c1 = new CreditCard();
    CreditCard c2 = new CreditCard(500, 5_00_000);
    CreditCard c3 = new CreditCard(1000, 10_00_000, "Telsa");
    // ....
    System.out.println(c1.toString());
    System.out.println(c2.toString());
    System.out.println(c3.toString());
  }
}
