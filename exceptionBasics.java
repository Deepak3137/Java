public class exceptionBasics {
  public static void main(String[] args) {
    // exception is an event that occurs during the execution of a program that
    // disrupts the normal flow of the program. it is an object which is thrown at
    // runtime. it is a subclass of the Throwable class. it is used to handle
    // errors and other exceptional events in a program.

    // there are two types of exceptions in java: checked exceptions and unchecked
    // exceptions. checked exceptions are the exceptions that are checked at compile
    // time. unchecked exceptions are the exceptions that are not checked at compile
    // time.

    // we can handle exceptions using try-catch block. the syntax for try-catch
    // block
    // is as follows:
    // try {
    // // code that may throw an exception
    // } catch (ExceptionType e) {
    // // code to handle the exception
    // }

    try {
      int result = 10 / 0; // this will throw ArithmeticException
      System.out.println("The result is: " + result);
    } catch (ArithmeticException e) {
      System.out.println("Cannot divide by zero");
    }
  }
}