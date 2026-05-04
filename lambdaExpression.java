@FunctionalInterface
interface A {
  void myMethod();
  // public abstract void myMethod(); this is also correct since all the methods
  // in the interface are abstract and public by default.
}

public class lambdaExpression {
  public static void main(String[] args) {
    // lambda expression is a feature of java 8 which allows us to write the code in
    // a more concise and readable way. it is a way to represent a functional
    // interface using an expression. a functional interface is an interface which
    // contains only one abstract method. the syntax for lambda expression is as
    // follows:
    // (parameters) -> expression
    // or
    // (parameters) -> { statements; }

    // original code without lambda expression
    // A r = new A() {
    // public void myMethod() {
    // System.out.println("Hello from anonymous class");
    // }
    // };
    // r.myMethod(); // Hello from anonymous class

    // example of lambda expression
    A r = () -> System.out.println("Hello from lambda expression");
    r.myMethod(); // Hello from lambda expression
    // in the above code, we have created a lambda expression which implements the
    // A interface. the A interface contains only one abstract method
    // which is myMethod(). so we can use the lambda expression to implement the
    // myMethod()
    // method of the A interface.
  }
}