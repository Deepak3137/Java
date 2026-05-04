import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedReader;

public class bufferReaderAndScanner {
  public static void main(String[] args) throws Exception {
    // buffer reader and scanner are used to read the input from the user. the
    // difference between buffer reader and scanner is that buffer reader is faster
    // than scanner but it does not have the functionality to parse the input. on
    // the other hand, scanner is slower than buffer reader but it has the
    // functionality to parse the input.

    // buffer reader is a class in java.io package that is used to read the input
    // from the user. it is a wrapper class around the input stream reader class.
    // it provides a method called readLine() that reads a line of text from the
    // user and returns it as a string.

    // InputStreamReader isr = new InputStreamReader(System.in);
    // BufferedReader br = new BufferedReader(isr);
    // System.out.println("Enter your name: ");
    // String name = br.readLine();
    // System.out.println("Hello, " + name);

    // br.close(); // it is important to close the buffer reader after use to free the resources.

    // scanner is a class in java.util package that is used to read the input from
    // the user. it provides various methods to read different types of input such
    // as nextInt(), nextDouble(), nextLine(), etc.

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age: ");
    int age = sc.nextInt();
    System.out.println("Your age is: " + age);
  }
}