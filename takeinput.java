import java.util.Scanner;

public class takeinput {
  public static void main(String[] args) {
    // taking input from the user in java is done using the scanner class. the
    // scanner class is part of the java.util package. it is used to read input
    // from the user. it provides various methods to read different types of input
    // such as nextInt(), nextDouble(), nextLine(), etc.

    // example
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = sc.nextLine();
    System.out.println("Hello, " + name + "!");
  }
}