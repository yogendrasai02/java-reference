import java.util.Scanner;

public class ConditionalStmts {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your age:");
    int age = sc.nextInt();

    // if else
    if(age >= 18) {
      System.out.println("Adult");
    } else {
      System.out.println("Not adult");
    }

    System.out.print("Enter your marks:");
    int marks = sc.nextInt();

    // else-if ladder
    if(marks >= 90) {
      System.out.println("A grade");
    } else if(marks >= 70) {
      System.out.println("B grade");
    } else if(marks >= 50) {
      System.out.println("C grade");
    } else {
      System.out.println("Fail");
    }

    System.out.print("Enter day number (1-7):");
    int dayNumber = sc.nextInt();
    // switch
    switch (dayNumber) {
      case 1: 
        System.out.println("Sunday");
        break;
      case 2:
        System.out.println("Monday");
        break;
      case 3: 
        System.out.println("Tuesday");
        break;
      case 4:
        System.out.println("Wednesday");
        break;
      case 5: 
        System.out.println("Thursday");
        break;
      case 6:
        System.out.println("Friday");
        break;
      case 7:
        System.out.println("Saturday");
        break;
      default:
        System.out.println("Invalid day number");
        break;
    }

    sc.close();
  }
}
