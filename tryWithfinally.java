public class tryWithfinally {
  public static void main(String[] args) {
    // try with finally is a technique in which we use the finally block to execute
    // the code that must be executed regardless of whether an exception is thrown
    // or not. it is used to ensure that the code in the finally block is executed
    // even if an exception is thrown in the try block. the syntax for try with
    // finally is as follows:
    try {
      int result = 10 / 0; // this will throw ArithmeticException
      System.out.println("The result is: " + result);
    } catch (ArithmeticException e) {
      System.out.println("Cannot divide by zero");
    } finally {
      System.out.println("This block will always be executed");
    }

    System.out.println("Program continues after handling exceptions");
  }
}