class A {
  public int divide() throws ArithmeticException
  {
    return 10 / 0;
  }
}

public class duckingException {
  public static void main(String[] args) {

    // ducking exception is a technique in which we declare the exception in the
    // method signature using the throws keyword. it is used to indicate that the
    // method may throw an exception. it is used to avoid handling the exception in
    // the method and instead, it is handled by the caller of the method.
    A obj = new A();
    try {
      obj.divide();
    } catch (ArithmeticException e) {
      System.out.println("Cannot divide by zero");
    }
  }
}