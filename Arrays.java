import java.util.Scanner;

// class to demonstrate array of objects
class Student {
  String rollNumber;

  public Student(String rollNumber) {
    this.rollNumber = rollNumber;
  }

  public void printRollNumber() {
    System.out.println("Roll Number = " + this.rollNumber);
  }
}

public class Arrays {
  public static void main(String[] args) {
    // declaration: array size has to be pre defined
    int numbers[] = {10, 20, 15, 25, 35, 30};
    char vowels[] = {'a', 'b', 'd', 'c', 'f', 'e'};

    System.out.println(numbers[0]); // 10
    System.out.println(numbers[1]); // 20
    System.out.println(numbers[2]); // 15
    System.out.println(numbers[3]); // 25
    System.out.println(numbers[4]); // 35
    System.out.println(numbers[5]); // 30

    // .length method -> size of array (number of elements)
    System.out.println(numbers.length);
    System.out.println(vowels.length);

    // declaring an array with user defined size
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array: ");
    int sz = sc.nextInt();
    int arr[] = new int[sz];
    // capturing each element as input
    for(int i = 0; i < sz; i++) {
      System.out.print("Enter element at index " + i + ": ");
      arr[i] = sc.nextInt();
    }
    // enhanced for loop to print each element
    System.out.println("Array elements:");
    for(int num: arr) {
      System.out.println(num);
    }

    // 2D array (multi dimensional array)
    int mat[][] = {
      {10, 5, 20},
      {20, 15, 25},
      {30, 40, 50}
    };
    System.out.println(mat.length);
    System.out.println(mat[0].length);
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 3; j++) {
        System.out.print(mat[i][j] + " ");
      }
      System.out.println("");
    }

    int mat1[][] = new int[2][3];
    for(int i = 0; i < 2; i++) {
      for(int j = 0; j < 3; j++) {
        System.out.print("Enter value at i = " + i + " j = " + j + ": ");
        mat1[i][j] = sc.nextInt();
      }
    }

    System.out.println("mat1[][] elements:");
    for(int i = 0; i < 2; i++) {
      for(int j = 0; j < 3; j++) {
        System.out.print(mat1[i][j] + " ");
      }
      System.out.println("");
    }

    // jagged arrays: each array size is different
    int grid[][] = {
      {10, 20},
      {100},
      {500, 200, 1000}
    };

    System.out.println("Jagged array:");
    for(int i = 0; i < grid.length; i++) {
      int rowLen = grid[i].length;
      for(int j = 0; j < rowLen; j++) {
        System.out.print(grid[i][j] + " ");
      }
      System.out.println("");
    }

    sc.close();
  
    // array of objects
    Student students[] = new Student[3]; // declare an array of 3 objects
    students[0] = new Student("roll1");
    students[1] = new Student("roll2");
    students[2] = new Student("roll3");
    for(Student s: students) {
      s.printRollNumber();
    }
    for(int i = 0; i < 3; i++) {
      students[i].printRollNumber();
    }
  }
}
