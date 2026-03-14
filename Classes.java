class BankAccount {
  // fields (properties)
  private String userId;
  private int balance;

  // constructor
  public BankAccount(String userId, int balance) {
    // this = reference to the current object
    this.userId = userId;
    this.balance = balance;
  }

  // methods (actions)
  public void printBalance() {
    System.out.println("Balance for user " + userId + " = Rs " + this.balance);
  }

  public void deposit(int amount) {
    this.balance += amount;
    System.out.println("Deposited Rs " + amount + " . New balance = " + this.balance);
  }
}

public class Classes {
  public static void main(String[] args) {
    // instantiation (object creation)
    BankAccount b1 = new BankAccount("user1", 0);
    BankAccount b2 = new BankAccount("user2", 100);

    b1.printBalance();
    b1.deposit(20);
    b1.printBalance();

    b2.printBalance();
  }
}
