@FunctionalInterface
interface A {

  int add(int a, int b);
  // in the above code, we have declared a functional interface A which contains
  // only one abstract method add which takes two integer arguments and returns an
  // integer value. since the add method is the only abstract method in the
  // interface A, we can use a lambda expression to provide the implementation of
  // the add method. the lambda expression will take two integer arguments and
  // return the sum of the two integer arguments. the syntax for lambda expression
  // is as follows:
  // (parameters) -> expression
  // or
  // (parameters) -> { statements; }
}

public class lambdaExpressionWithReturnStatement {
  public static void main(String[] args) {
    A a = (x, y) -> {
      return x + y;
    };
    // or
    // A a = (x, y) -> x + y;
    // in the above code, we have created a lambda expression which implements the
    // A interface. the A interface contains only one abstract method which is
    // add().
    // so we can use the lambda expression to implement the add() method of the A
    // interface. in the lambda expression, we have used the return statement to
    // return the sum of the two integer arguments.

    int result = a.add(10, 20);
    System.out.println("The sum of 10 and 20 is: " + result); // The sum of 10 and 20 is: 30
  }
}