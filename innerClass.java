class A {
  public void display() {
    System.out.println("Hello World");
  }

  class B {
    public void show() {
      System.out.println("Welcome to Java");
    }
  }
}

public class innerClass {
  public static void main(String[] args) {
    A obj = new A();
    obj.display(); // Hello World

    A.B inner = obj.new B();
    inner.show(); // Welcome to Java

    // if we want to create an object of inner class without creating an object of
    // outer class, then we can make the inner class static.
    // in that case, we can create an object of inner class without creating an
    // object of outer class.
    // A.B inner2 = new A.B();
    // inner2.show(); // Welcome to Java
  }
}